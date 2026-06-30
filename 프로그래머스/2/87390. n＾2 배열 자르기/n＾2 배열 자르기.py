def solution(n, left, right):
    answer = []

    for i in range(left, right + 1):
        num = 1

        # n 을 기준으로 칸을 나눴을 때의 인덱스
        row = i // n 
        col = i % n

        if row > col:
            num += i // n
        else:
            num = col + 1

        answer.append(num)    

    return answer
