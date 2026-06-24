import math

def solution(n,a,b):
    answer = 1

    round_a = math.ceil(a / 2)
    round_b = math.ceil(b / 2)

    while round_a != round_b:
        round_a = math.ceil(round_a / 2)
        round_b = math.ceil(round_b / 2)

        answer += 1

    return answer
