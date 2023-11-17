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
    for i in range(n-1,-1,-1):
        dp[0][i] = grid[0][i] + sum
        sum+=grid[0][i]

    sum = 0
    for i in range(n):
        dp[i][n-1]=grid[i][n-1]+sum
        sum+=grid[i][n-1]


initializing()

for i in range(1,n):
    for j in range(n-2,-1,-1):
        dp[i][j] = min(dp[i-1][j]+grid[i][j],dp[i][j+1]+grid[i][j])
print(dp[n-1][0])