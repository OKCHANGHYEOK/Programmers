def solution(n):
    answer = ''

    for i in range(0, n):
        answer += "수" if i % 2 == 0 else "박"

    return answer