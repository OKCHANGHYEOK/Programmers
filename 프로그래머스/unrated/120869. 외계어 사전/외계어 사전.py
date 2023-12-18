def solution(spell, dic):
    answer = 0
    
    count = 0
    
    for x in dic:
        count = 0
        for i in range(0, len(spell)):
            if(spell[i] in x):
                count += 1
        if(count == len(spell)):
            answer = 1
            break
        else:
            answer = 2    

    
    return answer