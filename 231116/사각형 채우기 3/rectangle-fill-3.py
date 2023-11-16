n=int(input())
memo=[-1 for _ in range(1001)]

def calculate_stair(n):
    if memo[n]!=-1:
        return memo[n]
    else:
        memo[n] = calculate_stair(n-1)*2+calculate_stair(n-2)*4

    return memo[n]

memo[1]=2
memo[2]=7
print(calculate_stair(n)%10007)