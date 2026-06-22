def solution(name, yearning, photo):
    answer = []

    dict_score = dict(zip(name, yearning))

    for arr in photo:
        items = [dict_score[x] for x in arr if x in name]
        
        if items != []:
            answer.append(sum(items))
        else:
            answer.append(0)    

    return answer