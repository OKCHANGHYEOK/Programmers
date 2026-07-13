import math

def solution(number, limit, power):
    answer = 0

    for i in range(1, number + 1):
        count = 0

        for j in range(1, math.isqrt(i) + 1):
            if i % j == 0:
                count += 1 if i // j == j else 2

            if count > limit:
                count = power
                break  

        answer += count        

    return answer