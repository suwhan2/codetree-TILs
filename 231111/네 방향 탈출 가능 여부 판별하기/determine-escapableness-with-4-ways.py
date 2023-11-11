# dx,dy 상하좌우
# bfs사용해보기
# bfs에는 인자없이 queue사용
# import deque하기
# 마지막 도착지 visited를 답으로 하면 된다.
# 2차원 vistied 0으로 초기화하기
from collections import deque

n, m = tuple(map(int, input().split()))
grid = [
    list(map(int, input().split()))
    for _ in range(n)
]

visited = [
    [0 for _ in range(m)]
    for _ in range(n)
]
q = deque()


def in_range(x, y):
    return 0 <= x and x < n and 0 <= y and y < m


def can_go(x, y):
    if not in_range(x, y):
        return False
    if visited[x][y] == 1 or grid[x][y] == 0:
        return False
    return True

def push(x,y):
    visited[x][y]=1
    q.append((x,y))

def bfs():
    dxs, dys = [1, 0, -1, 0], [0, 1, 0, -1]

    while q:
        x, y = q.popleft()
        for dx, dy in zip(dxs, dys):
            nx, ny = x + dx, y + dy
            if can_go(nx,ny):
                push(nx,ny)

push(0,0)
bfs()
print(visited[n-1][m-1])