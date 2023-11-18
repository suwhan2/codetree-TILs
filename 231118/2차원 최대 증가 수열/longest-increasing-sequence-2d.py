n,m =tuple(map(int,input().split()))

grid=[
    list(map(int,input().split()))
    for _ in range(n)
]
dp=[
    [-1 for _ in range(m)]
    for _ in range(n)
]

dp[0][0]=1
for i in range(n):
    for j in range(m):
        for k in range(i):
            for l in range(j):
                if dp[k][l]==-1:
                    continue
                if grid[i][j]>grid[k][l]:
                    dp[i][j] = max(dp[k][l]+1,dp[i][j])

ans=-1

for i in range(n):
    for j in range(m):
        if ans < dp[i][j]:
            ans = dp[i][j]
print(ans)