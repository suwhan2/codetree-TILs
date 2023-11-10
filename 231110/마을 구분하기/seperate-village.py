n= int(input())
grid=[
    list(map(int,input().split()))
    for _ in range(n)
]

result=list()

def in_range(x,y):
    return 0<=x and x<n and 0<=y and y<n

def can_go(x,y):
    if not in_range(x,y):
        return False

    if grid[x][y]==0:
        return False
    return True

def dfs(x,y):
    global count
    dxs,dys=[1,0,-1,0],[0,1,0,-1]

    for dx,dy in zip(dxs,dys):
        nx,ny = x+dx,y+dy
        if can_go(nx,ny):
            grid[nx][ny]=0
            count+=1
            dfs(nx,ny)


for i in range(n):
    for j in range(n):
        if grid[i][j]==1:
            count=1
            grid[i][j]=0
            dfs(i,j)
            result.append(count)

result.sort()
print(len(result))
for i in result:
    print(i)