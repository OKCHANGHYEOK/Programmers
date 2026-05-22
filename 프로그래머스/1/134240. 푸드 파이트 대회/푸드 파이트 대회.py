def solution(food):
    answer = ''

    foodNum = 1

    for i in range(1, len(food)):
        answer += (str(foodNum) * int(food[i] / 2))
        foodNum += 1
    
    answer += '0'    
    answer += answer[-2::-1]

    return answer