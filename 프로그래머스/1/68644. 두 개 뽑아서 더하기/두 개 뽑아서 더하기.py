def solution(numbers):
    answer = []

    seen = set()

    for i in range(0, len(numbers)):
        for j in range(i + 1, len(numbers)):
           num = numbers[i] + numbers[j]
           seen.add(num)

    answer = sorted(list(seen))

    return answer