n= int(input())
memo=[-1 for _ in range(n+1)]
def pibo(n):
    if memo[n]!= -1:
        return memo[n]
    if n<=2:
        memo[n]=1
    else:
        memo[n]=pibo(n-1)+pibo(n-2)

    return memo[n]

print(pibo(n))