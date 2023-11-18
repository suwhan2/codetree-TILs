n= int(input())

dp = [0 for _ in range(n+1)]
arr=[1,2,5]

dp[0]=1
for i in range(1,n+1):
    sum1=0
    for j in arr:
        if i>=j:
            sum1 +=dp[i-j]
    dp[i] = sum1

print(dp[n])