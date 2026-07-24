from collections import deque

def solution(priorities, location):
    answer = 0

    dict_priorities = {chr(65 + x) : priorities[x] for x in range(0, len(priorities))}    

    queue = deque(dict_priorities.items())

    while queue:
        key, value = queue.popleft()

        if queue and max([item[1] for item in queue]) > value:
            queue.append((key, value))
        else:
            answer += 1

            if ord(key) == 65 + location:
                break

    return answer