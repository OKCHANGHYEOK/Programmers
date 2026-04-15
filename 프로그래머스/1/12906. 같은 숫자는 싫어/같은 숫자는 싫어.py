def solution(arr):
    answer = []

    oldNum = -1

    for num in arr:
        if num != oldNum:
            oldNum = num
            answer.append(num)
        else:
            continue     

    return answer