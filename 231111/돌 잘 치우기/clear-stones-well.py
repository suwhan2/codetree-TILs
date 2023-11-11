# 치울 돌을 순열로 정하기
# 정해지면 적용시키고 k개의 점에서 최대 갈  수있는 곳 표시하기 겹치면 x
# in_range, can_go,push,bfs,visited
# 순열 -> 재귀?
# 1이 있는 부분의 위치정보를 list에 넣고 m개 뽑기

from collections import deque

n, k, m = tuple(map(int, input().split()))
grid = [
    list(map(int, input().split()))
    for _ in range(n)
]
visited = [
    [False for _ in range(n)]
    for _ in range(n)
]
q = deque()
stone = list()

for i in range(n):
    for j in range(n):
        if grid[i][j] == 1:
            stone.append((i, j))


def reset(arr):
    global count

    count = 0

    for i in range(m):
        x, y = arr[i]
        grid[x][y] = 1

    for i in range(n):
        for j in range(n):
            visited[i][j] = False

    push(r - 1, c - 1)


def in_range(x, y):
    return 0 <= x and x < n and 0 <= y and y < n


def can_go(x, y):
    if not in_range(x, y):
        return False
    if visited[x][y] or grid[x][y] == 1:
        return False
    return True


def push(x, y):
    global count
    if not visited[x][y]:
        visited[x][y] = True
        count += 1
    q.append((x, y))


def remove_stone(arr):
    for i in range(0, m):
        x, y = arr[i]
        grid[x][y] = 0


max_count = 0
picked_stone = list()

def bfs():
    dxs, dys = [1, 0, -1, 0], [0, 1, 0, -1]

    while q:
        x, y = q.popleft()
        for dx, dy in zip(dxs, dys):
            nx, ny = x + dx, y + dy
            if can_go(nx, ny):
                push(nx, ny)
def pick_stone(cnt):
    global max_count

    if cnt == m:
        remove_stone(picked_stone)
        bfs()
        max_count = max(count, max_count)
        reset(picked_stone)
        return

    for i in range(0, len(stone)):
        if stone[i] in picked_stone:
            continue
        picked_stone.append(stone[i])
        pick_stone(cnt + 1)
        picked_stone.pop()
    return


count = 0
for _ in range(k):
    r, c = tuple(map(int, input().split()))
    push(r - 1, c - 1)

pick_stone(0)

print(max_count)