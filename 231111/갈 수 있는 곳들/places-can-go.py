#겹치면 노카운트
# 따라서 간곳은 1로 바꿔버리면서 카운트해버리자
# bfs
#in_range, can_go,push,bfs
from collections import deque
n, k = tuple(map(int,input().split()))
grid=[
    list(map(int,input().split()))
    for _ in range(n)
]
visited=[
    [0 for _ in range(n)]
    for _ in range(n)
]
q= deque()
def in_range(x,y):
    return  0<=x and x<n and 0<=y and y<n

def can_go(x,y):
    if not in_range(x,y):
        return False
    if visited[x][y]==1 or grid[x][y]==1:
        return False
    return True

def push(x,y):
    global count

    if visited[x][y]==0:
        visited[x][y]=1
        count+=1
    q.append((x,y))

def bfs():
    dxs,dys=[1,0,-1,0],[0,1,0,-1]

    while q:
        x,y = q.popleft()
        for dx,dy in zip(dxs,dys):
            nx,ny = x+dx, y+dy
            if can_go(nx,ny):
                push(nx,ny)

count=0
for _ in range(k):
    r,c=tuple(map(int,input().split()))
    push(r-1,c-1)
bfs()

print(count)