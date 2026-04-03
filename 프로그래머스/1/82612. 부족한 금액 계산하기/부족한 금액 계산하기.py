def solution(price, money, count):
    curr = 0

    while curr <= count:
        money -= price * curr
        curr += 1

    return 0 if money >= 0 else abs(money)