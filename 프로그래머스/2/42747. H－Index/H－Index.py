def solution(citations):
    answer = 0

    list.sort(citations, reverse=True)

    for i in range(0, len(citations)):
        if citations[i] >= i + 1:
            answer = i + 1

    return answer