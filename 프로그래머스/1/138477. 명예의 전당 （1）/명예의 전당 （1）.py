def solution(k, score):
    answer = []

    stack = []

    for sitem in score:
        if len(stack) < k:
            stack.append(sitem)
        else:
            if sitem > stack[-1]:
                stack.pop()
                stack.append(sitem)    

        stack.sort(reverse=True)   

        answer.append(stack[-1]) 

    return answer
