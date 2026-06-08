from collections import Counter

def solution(k, tangerine):
    answer = 0

    classified = dict(Counter(tangerine))
    arrCount = sorted(classified.values(), reverse=True)

    for count in arrCount:
        k -= count
        answer += 1

        if k <= 0:
            break

    return answer