def solution(n):
    answer = 0
    list = []
    for i in range(1, n):
        if(n % i == 0):
            list.append(i)
    for i in list:
        num = i * i
        if(num == n):
            answer = 1
            break
        else:
            answer = 2
    
    return answer