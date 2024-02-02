def solution(keyinput, board):
    answer = [0, 0]
    
    garo_max = int(board[0] / 2)
    sero_max = int(board[1] / 2)
    


    for move in keyinput:
        if(move == "left"):
            if(answer[0] - 1 >= -garo_max):answer[0] -= 1
        if(move == "right"):
            if(answer[0] + 1 <= garo_max):answer[0] += 1
        if(move == "up"):
            if(answer[1] + 1 <= sero_max):answer[1] += 1
        if(move == "down"):
            if(answer[1] -1 >= -sero_max):answer[1] -= 1

    
    return answer