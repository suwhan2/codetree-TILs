# 합이 되나 안되냐
# 중복x
# dp[i] 정의 - 합i를 부분 수열로 만들수 있는지 없는지
# 점화식 - dp[i-arr[j]]이 True면 True
# 초기조건 dp[0] = true
# 조건 i>=arr[j]

n,m = tuple(map(int,input().split()))
arr = list(map(int,input().split()))
dp=[False for _ in range(m+1)]
dp[0] = True

for i in range(n):
    for j in range(m,-1,-1):
        if j>=arr[i]:
            if not dp[j-arr[i]]:
                continue
            dp[j] = dp[j-arr[i]]

# print(dp)
if dp[m]:
    print("Yes")
if not dp[m]:
    print("No")