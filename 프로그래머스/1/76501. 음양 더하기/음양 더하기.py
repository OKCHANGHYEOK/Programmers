def solution(absolutes, signs):
    total = 0

    for i in range(0, len(absolutes)):
        total += absolutes[i] if signs[i] == True else -absolutes[i]

    return total    
