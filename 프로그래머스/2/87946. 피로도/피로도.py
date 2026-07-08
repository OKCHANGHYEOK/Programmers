from itertools import permutations

def solution(k, dungeons):
    explore_comb = list(permutations(dungeons))
    arr_cnt = []    

    for comb in explore_comb:
        fatigue = k
        cnt = 0

        for dungeon in comb:
            if explore_dungeon(fatigue, dungeon[0], dungeon[1]) != -1:
                cnt += 1
                fatigue -= dungeon[1]

        arr_cnt.append(cnt)

        if max(arr_cnt) == len(dungeons):
            break

    return max(arr_cnt)

def explore_dungeon(remain_fatigue : int, min_fatigue : int, use_fatigue : int):
    if remain_fatigue < min_fatigue:
        return -1
    
    return remain_fatigue - use_fatigue