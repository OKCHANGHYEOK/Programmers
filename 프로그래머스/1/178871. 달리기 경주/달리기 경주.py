def solution(players, callings):
    answer = []
    
    player_dict = {} # 전체 플레이어의 이름과 그 선수의 현재 순위가 기록될 딕셔너리
    rank_dict = {}   # 전체 순위와 각 순위에 현재 어떤 플레이어가 있는지 기록될 딕셔너리
    
    for i in range(len(players)): # players의 크기만큼 반복을 돌린다
        player_dict[players[i]] = i # player_dict는 키 값은 선수 이름, 밸류는 현재 순위가 저장된다
        rank_dict[i] = players[i] # rank_dict는 키 값은 순위, 밸류는 해당 순위에 있는 선수 이름이 저장된다
    
    for i in range(len(callings)): # callings의 크기만큼 반복을 돌린다
        currentRank = player_dict.get(callings[i]) # 추월한 선수의 현재 순위를 가져온다 
        player = rank_dict[currentRank] # 추월한 선수의 이름을 가져온다
        
        front = rank_dict[currentRank - 1] # 추월한 선수의 앞에 있는 선수의 이름을 가져온다
        
        player_dict[player] = currentRank - 1 # 추월한 선수의 현재 순위를 1등 올린다
        player_dict[front] = currentRank # 추월당한 선수의 현재 순위를 추월한 선수의 원래 순위와 바꾼다
        
        rank_dict[currentRank - 1] = player # 추월한 선수가 있는 순위에 그 선수의 이름을 넣는다
        rank_dict[currentRank] = front  # 추월당한 선수가 있는 순위에 그 선수의 이름을 넣는다
        
    for i in range(len(players)):   # players의 크기만큼 반복을 돌려서
        answer.append(rank_dict[i]) # answer에 최종 순위가 기록된 rank_dict에서 각 순위에 해당하는 선수 이름을 가져온다
        
    
    return answer