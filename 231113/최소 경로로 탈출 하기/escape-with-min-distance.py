from collections import deque

n, m = tuple(map(int, input().split()))

grid = [
    list(map(int, input().split()))
    for _ in range(n)
]

# bfs
# distance 배열에 거리 적기
# visited 배열에 방문 여부 적기
# in_range(), can_go(), push()
# bfs 후에 끝자리 distance 출력하기

q = deque()
visited = [
    [False for _ in range(m)]
    for _ in range(n)
]

distance = [
    [0 for _ in range(m)]
    for _ in range(n)
]


def in_range(x, y):
    return 0 <= x and x < n and 0 <= y and y < m


def can_go(x, y):
    if not in_range(x, y):
        return False
    if visited[x][y] or grid[x][y] == 0:
        return False
    return True


def push(x, y, s):
    visited[x][y] = True
    distance[x][y] = s
    q.append((x, y))


def bfs():
    dxs, dys = [1, 0, -1, 0], [0, 1, 0, -1]
    while q:
        x, y = q.popleft()
        for dx, dy in zip(dxs, dys):
            nx, ny = x + dx, y + dy
            if can_go(nx, ny):
                push(nx, ny, distance[x][y] + 1)


# 메인
push(0, 0, 0)
bfs()
if not visited[n-1][m-1]:
    print(-1)
else:
    print(distance[n-1][m-1])