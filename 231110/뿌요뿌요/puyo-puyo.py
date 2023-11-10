n =int(input())
blcok = [
    list(map(int,input().split()))
    for _ in range(n)
]
visited=[
    [0 for _ in range(n)]
    for _ in range(n)
]
def in_range(x,y):
    return 0<=x and x<n and 0<=y and y<n

def can_go(x,y,cur_num):
    if not in_range(x,y):
        return False

    if blcok[x][y]!=cur_num or visited[x][y]==1:
        return False
    return True

def dfs(x,y):
    global count

    dxs,dys=[1,0,-1,0],[0,1,0,-1]

    for dx,dy in zip(dxs,dys):
        nx,ny = x+dx, y+dy
        if can_go(nx,ny,blcok[x][y]):
            visited[nx][ny]=1
            count+=1
            dfs(nx,ny)

max_count=0
bombed_count=0
for i in range(n):
    for j in range(n):
        if visited[i][j]==0:
            count=0
            dfs(i,j)
            if count>3:
                bombed_count+=1
            max_count=max(max_count,count)

print(bombed_count,max_count, end=" ")