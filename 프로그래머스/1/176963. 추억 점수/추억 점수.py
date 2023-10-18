def solution(name, yearning, photo):
    answer = []
    
    score_dict = {}
    totalScore = 0
    
    for i in range(len(name)):   
        score_dict[name[i]] = yearning[i]        
    
    for i in range(len(photo)):
        totalScore = 0
        for j in range(len(photo[i])):
            score = score_dict.get(photo[i][j])
            if(score != None):
                totalScore += score       
        answer.append(totalScore)
    
    
    return answer