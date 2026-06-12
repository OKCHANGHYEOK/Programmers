def solution(cards1, cards2, goal : list[str]):
    # 카드 배열을 순회하기 위한 인덱스
    pointer1, pointer2 = 0, 0
    # 바라보고 있는 goal 의 인덱스
    current = 0

    # 반복 종료를 제어하기 위한 플래그
    isMatchCard = False

    while current < len(goal):
        isMatchCard = False

        if pointer1 < len(cards1) and cards1[pointer1] == goal[current]:
            pointer1 += 1
            current += 1
            isMatchCard = True
                            
        if pointer2 < len(cards2) and cards2[pointer2] == goal[current]:
            pointer2 += 1
            current += 1
            isMatchCard = True
        
        if isMatchCard == False:
            break

    return "Yes" if len(goal) == current else "No"