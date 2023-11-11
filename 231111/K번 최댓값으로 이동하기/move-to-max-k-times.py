# k번 이동 but 갈곳없으면 stop
# 매번 갈수 있는 곳들중 가장 큰값으로 이동
# 여러개일 경우 비교하는 함수
# 탐색 bfs
# in_range, can_go, push
# 탐색중 가장 큰값찾기
from collections import deque

n, k = tuple(map(int, input().split()))
grid = [
    list(map(int, input().split()))
    for _ in range(n)
]
r, c = tuple(map(int, input().split()))
r=r-1
c=c-1
visited = [
    [False for _ in range(n)]
    for _ in range(n)
]
q = deque()


def reset_visited():
    for i in range(n):
        for j in range(n):
            visited[i][j] = False


def in_range(x, y):
    return 0 <= x and x < n and 0 <= y and y < n


def can_go(x, y, curr):
    if not in_range(x, y):
        return False
    if visited[x][y] or grid[x][y] >= curr:
        return False
    return True


def compare_position_of_same_numbers(x1,y1,x2,y2):
    global r,c

    if x1>x2:
        r= x2
        c= y2
    elif x1==x2:
        if y1>y2:
            r= x2
            c = y2
        if y1<y2:
            r=x1
            c=y1
    else:
        r=x1
        c=y1
def push(x, y):
    global max_number
    global r, c

    visited[x][y] = True
    if max_number < grid[x][y]:
        max_number = grid[x][y]
        r = x
        c = y
    if max_number == grid[x][y]:
        compare_position_of_same_numbers(r,c,x,y)
    q.append((x, y))

def bfs(curr_num):
    dxs, dys = [1, 0, -1, 0], [0, 1, 0, -1]

    while q:
        x, y = q.popleft()
        for dx, dy in zip(dxs, dys):
            nx, ny = x + dx, y + dy
            if can_go(nx, ny, curr_num):
                push(nx, ny)

for _ in range(k):
    max_number = 0
    q.append((r,c))
    bfs(grid[r][c])
    reset_visited()

print(r+1,c+1,end=" ")