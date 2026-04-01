def solution(arr):
    answer = []

    minValue = min(arr)

    for num in arr:
        if num == minValue : continue
        answer.append(num)

    return [-1] if len(answer) == 0 else answer