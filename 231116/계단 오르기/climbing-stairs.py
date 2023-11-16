# 5까지 가는 방법은 3까지 가는 방법 + 2까지 가는 방법이다.
# = f(5) = f(3) + f(2)
# f(n) = f(n-2) + f(n-3)

#f(2) =1, f(3) =1

n=int(input())
memo=[-1 for _ in range(n+1)]

def calculate_stair(n):
    if memo[n]!=-1:
        return memo[n]
    if n<=3:
        memo[n]=1
    else:
        memo[n] = calculate_stair(n-3) + calculate_stair(n-2)

    return memo[n]

memo[1]=0
print(calculate_stair(n))