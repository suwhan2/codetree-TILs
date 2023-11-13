# dxs,dys 상하좌우
# bfs
# 거리를 적으면서 가다가 3을 만나면 그 거리를 정답 배열에 저장
# 2인 부분마다 bfs 실행
# in_range, can_go,push, reset_visited, reset_step
# visited, step
# result
import sys
from collections import deque

n, h, m =tuple(map(int,input().split()))

grid=[
    list(map(int,input().split()))
    for _ in range(n)
]

q=deque()
visited=[
    [False for _ in range(n)]
    for _ in range(n)
]
step=[
    [0 for _ in range(n)]
    for _ in range(n)
]
result=[
    [0 for _ in range(n)]
    for _ in range(n)
]

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



def reset():
    for i in range(n):
        for j in range(n):
            visited[i][j]=False
            step[i][j]=0
            q.clear()

def bfs():
    dxs,dys=[1,0,-1,0],[0,1,0,-1]
    while q:
        x,y = q.popleft()
        for dx,dy in zip(dxs,dys):
            nx,ny = x+dx, y+dy
            if can_go(nx,ny):
                if grid[nx][ny]==3:
                    return step[x][y]+1
                push(nx,ny,step[x][y]+1)
    return -1

#main

for i in range(n):
    for j in range(n):
        if grid[i][j]==2:
            push(i,j,0)
            num = bfs()
            result[i][j]=num
            reset()

for i in range(n):
    for j in range(n):
        print(result[i][j], end=" ")
    print()