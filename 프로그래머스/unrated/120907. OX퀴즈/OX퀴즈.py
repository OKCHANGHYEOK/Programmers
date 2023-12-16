def solution(quiz):
    answer = []
    
    list = []
    for x in quiz:
        list.append(x.split())
    
    left = 0
    for x in list:
        right = int(x[4])
        if(x[1] == "+"):
            left = int(x[0]) + int(x[2])
        else:
            if(x[2][0:1] == "-"):
                left = int(x[0]) + abs(int(x[2]))
            else:
                left = int(x[0]) - int(x[2])
        if(left == right):
            answer.append("O")
        else:
            answer.append("X")
        
    return answer