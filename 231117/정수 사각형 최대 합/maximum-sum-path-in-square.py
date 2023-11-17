n = int(input())
grid = [
    list(map(int,input().split()))
    for _ in range(n)
]

dp=[
    [0 for _ in range(n)]
    for _ in range(n)
]

def initializing():
    sum=0
    for i in range(n):
        dp[i][0] = grid[i][0] + sum
        sum+=grid[i][0]

    sum = 0
    for i in range(n):
        dp[0][i]=grid[0][i]+sum
        sum+=grid[0][i]

def find_max():
    ans=0
    for i in range(n):
        ans=max(ans,dp[n-1][i])

    return ans

initializing()

for i in range(1,n):
    for j in range(1,n):
        dp[i][j] = max(dp[i-1][j]+grid[i][j],dp[i][j-1]+grid[i][j])
ans = find_max()
print(ans)