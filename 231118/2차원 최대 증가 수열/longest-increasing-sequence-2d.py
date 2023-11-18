n,m =tuple(map(int,input().split()))

grid=[
    list(map(int,input().split()))
    for _ in range(n)
]
dp=[
    [-1 for _ in range(m)]
    for _ in range(n)
]
def initialize():
    for i in range(m):
        dp[0][i]=0
    for i in range(n):
        dp[i][0]=0

initialize()
dp[0][0]=1
for i in range(1,n):
    for j in range(1,m):
        for k in range(i):
            for l in range(j):
                if dp[k][l]==-1:
                    continue
                if grid[i][j]>grid[k][l]:
                    dp[i][j] = max(dp[k][l]+1,dp[i][j])

ans=0
for i in range(n):
    for j in range(m):
        if ans < dp[i][j]:
            ans = dp[i][j]
print(ans)