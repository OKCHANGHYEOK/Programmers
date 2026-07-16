from collections import Counter

def solution(topping):
    answer = 0

    cake_cheolsu : list = topping[-1:]
    dict_cheolsu = dict(Counter(cake_cheolsu))
    
    cake_brother : list  = topping[:-1]
    dict_brother = dict(Counter(cake_brother))

    for _ in range(1, len(topping)):
        current_piece = cake_brother.pop()

        dict_brother[current_piece] -= 1

        if not current_piece in dict_cheolsu:
            dict_cheolsu[current_piece] = 1                

        if dict_brother[current_piece] == 0:
            dict_brother.pop(current_piece)    

        if len(dict_cheolsu) == len(dict_brother):
            answer += 1

    return answer