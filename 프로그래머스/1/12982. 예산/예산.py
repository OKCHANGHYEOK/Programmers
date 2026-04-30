def solution(d, budget):
    answer = 0

    list.sort(d)

    for num in d:
        if budget - num >= 0:
            budget -= num
            answer += 1
        else:
            break    

    return answer