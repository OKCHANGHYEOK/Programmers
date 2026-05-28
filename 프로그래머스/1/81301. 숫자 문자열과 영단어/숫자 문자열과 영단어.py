import re

def solution(s: str):
    arrMap = {
        'zero':'0', 'one':'1', 'two':'2', 'three':'3', 'four':'4',
        'five':'5', 'six':'6', 'seven':'7', 'eight':'8', 'nine':'9'
    }

    target = '|'.join(arrMap.keys())

    answer = re.sub(rf'{target}', lambda m: arrMap[m.group()], s)

    return int(answer) # 숫자로 반환할 경우