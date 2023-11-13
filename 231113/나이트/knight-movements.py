# dxs,dys 설정 8개
# bfs
# 최솟값 비교
# in_range, can_go,push
# visited
from collections import deque

n=int(input())
r1,c1,r2,c2 = tuple(map(int,input().split()))

q=deque()
visited=[
    [False for _ in range(n)]
    for _ in range(n)
]

step=[
    [0 for _ in range(n)]
    for _ in range(n)
]

def in_range(x,y):
    return 0<=x and x<n and 0<=y and y<n

def can_go(x,y):
    if not in_range(x,y):
        return False
    if visited[x][y]:
        return False
    return True

def push(x,y,s):
    visited[x][y]=True
    step[x][y]=s
    q.append((x,y))

def bfs():
    dxs,dys=[-2,-1,1,2,2,1,-1,-2],[1,2,2,1,-1,-2,-2,-1]

    while q:
        x,y = q.popleft()
        for dx,dy in zip(dxs,dys):
            nx,ny = x+dx, y+dy
            if can_go(nx,ny):
                push(nx,ny,step[x][y]+1)

push(r1-1,c1-1,0)
bfs()
if not visited[r2-1][c2-1]:
    print(-1)
else:
    print(step[r2-1][c2-1])