N = int(input())
arr = list(map(int, input().split()))

dp = [-1 for _ in range(N)]
dp[0] = 1

for i in range(1, N):
    for j in range(i):
        if arr[j] < arr[i]:
            dp[i] = max(dp[j] + 1, dp[i])

ans = 0
for i in range(N):
    ans = max(ans, dp[i])

print(ans)