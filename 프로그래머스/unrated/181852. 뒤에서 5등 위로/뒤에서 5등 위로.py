def solution(num_list):
    answer = []
    
    num_list.sort()
    
    for i in range(len(num_list)):
        if(i == 5): 
            break
        num_list.pop(0)
    
    answer = num_list
    
    return answer