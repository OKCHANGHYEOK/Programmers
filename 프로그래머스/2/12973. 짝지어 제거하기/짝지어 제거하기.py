def solution(s : str):
    stack = []

    for word in s:
        stack.append(word) 

        if len(stack) > 1 and stack[-1] == stack[-2]:
            stack.pop()
            stack.pop()
            
    return 1 if stack == [] else 0 