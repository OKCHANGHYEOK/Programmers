def solution(players, callings):
    answer = []
    
    player_dict = {}
    rank_dict = {}
    
    for i in range(len(players)):
        player_dict[players[i]] = i
        rank_dict[i] = players[i]
    
    for i in range(len(callings)):
        currentRank = player_dict.get(callings[i])
        player = rank_dict[currentRank]
        
        front = rank_dict[currentRank - 1]
        
        player_dict[player] = currentRank - 1
        player_dict[front] = currentRank
        
        rank_dict[currentRank - 1] = player
        rank_dict[currentRank] = front
        
    for i in range(len(players)):
        answer.append(rank_dict[i]) 
        
    
    return answer