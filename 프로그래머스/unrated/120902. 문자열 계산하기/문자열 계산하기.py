def solution(my_string):
    answer = 0
    
    list = my_string.split()
    answer = int(list[0])
    for i in range(2, len(list), 2):
        if(list[i - 1] == "+"):
            answer += int(list[i])
        else:
            answer -= int(list[i])
    
    return answer