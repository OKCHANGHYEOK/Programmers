def solution(people, limit):
    answer = 0

    _sorted = sorted(people)

    left, right = 0, len(_sorted) - 1

    while left <= right:
        if _sorted[left] + _sorted[right] <= limit:
            left += 1
            right -= 1
        else:
            right -= 1

        answer += 1

    return answer