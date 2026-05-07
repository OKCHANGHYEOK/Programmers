import itertools

def solution(s):
    answer = ''
    
    temp_str = ''
    
    for i, word in enumerate(s):
        temp_str += word 

        if word == ' ' or i == len(s) - 1:
            if temp_str != '':
                answer += GetStrangeWord(temp_str)    
                temp_str = ''   
            
    return answer

def GetStrangeWord(s : str):
    return "".join(itertools.starmap(transform, enumerate(s)))
    
def transform(i, char):
    return char.upper() if i % 2 == 0 else char.lower()