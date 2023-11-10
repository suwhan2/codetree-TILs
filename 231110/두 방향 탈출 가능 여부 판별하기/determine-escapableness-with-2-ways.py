n, m = tuple(map(int, input().split()))

grid = [
    list(map(int, input().split()))
    for _ in range(n)
]

visited = [
    [0 for _ in range(m)]
    for _ in range(n)
]

def is_finish(x,y):
    global ans
    if x==n-1 and y==m-1:
        ans =1
def in_range(x, y):
    return 0<=x and x < n and 0 <= y and y < m


def can_go(x, y):
    if not in_range(x,y):
        return False
    if visited[x][y] or grid[x][y] == 0:
        return False
    return True

def dfs(x, y):
    dxs, dys = [0, 1], [1, 0]

    for dx, dy in zip(dxs, dys):
        nx, ny = x + dx, y + dy
        is_finish(nx,ny)

        if can_go(nx, ny):
            visited[nx][ny] = 1
            dfs(nx, ny)

ans = 0
visited[0][0]=1
dfs(0, 0)

print(ans)