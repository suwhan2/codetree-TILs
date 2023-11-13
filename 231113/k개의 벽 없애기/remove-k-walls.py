# bfs
# backtracking
# 매번 거리 비교
# in_range, can_go, push, reset
# visited, step
# min_distacne

from collections import deque
n, k = tuple(map(int,input().split()))
grid=[
    list(map(int,input().split()))
    for _ in range(n)
]
r1,c1 = tuple(map(int,input().split()))
r2,c2 = tuple(map(int,input().split()))


q=deque()
visited=[
    [False for _ in range(n)]
    for _ in range(n)
]

step=[
    [0 for _ in range(n)]
    for _ in range(n)
]
min_distance=2*n

def in_range(x,y):
    return 0<=x and x<n and 0<=y and y<n

def can_go(x,y):
    if not in_range(x,y):
        return False
    if visited[x][y] or grid[x][y]==1:
        return False
    return True

def push(x,y,s):
    visited[x][y]=True
    step[x][y]=s
    q.append((x,y))

def reset(arr):
    for i in range(n):
        for j in range(n):
            visited[i][j]=False
            step[i][j]=0

    for i in arr:
        x,y=i
        grid[x][y]=1

    q.clear()

def bfs():
    dxs,dys=[1,0,-1,0],[0,1,0,-1]
    while q:
        x,y = q.popleft()
        for dx,dy in zip(dxs,dys):
            nx,ny = x+dx, y+dy
            if can_go(nx,ny):
                push(nx,ny,step[x][y]+1)

def remove_wall(arr):
    for i in arr:
        x,y=i
        grid[x][y]=0

walls=list()
removed_wall=list()

def pick_wall(cnt):
    global min_distance

    if cnt==k:
        remove_wall(removed_wall)
        push(r1-1,c1-1,0)
        bfs()
        if visited[r2-1][c2-1]:
            num=step[r2-1][c2-1]
            min_distance = min(min_distance,num)
        reset(removed_wall)
        return

    for i in walls:
        if i in removed_wall:
            continue
        removed_wall.append(i)
        pick_wall(cnt+1)
        removed_wall.pop()
    return

#main

for i in range(n):
    for j in range(n):
        if grid[i][j]==1:
            walls.append((i,j))

pick_wall(0)


if min_distance==2*n:
    print(-1)
else:
    print(min_distance)