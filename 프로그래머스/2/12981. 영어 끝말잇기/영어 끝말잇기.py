def solution(n, words):
    answer = [0,0]

    used : list[str] = [words[0]]

    seq, turn = 1, 1

    for word in words[1:]:
        seq = seq + 1 if seq < n else 1
        turn = turn + 1 if seq == 1 else turn
        
        if word in used or word.startswith(used[-1][-1]) == False:
            answer[0] = seq
            answer[1] = turn
            break

        used.append(word)

    return answer