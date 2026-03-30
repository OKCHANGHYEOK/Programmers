def solution(num):
    if num == 1:
        return 0

    return collatzation(num, 0)

def collatzation(num, count):
    if num == 1:
        return count
    
    if count == 500:
        return -1
    
    if num % 2 == 0:
        num = int(num / 2)
    else:
        num *= 3
        num += 1

    return collatzation(num, count + 1)