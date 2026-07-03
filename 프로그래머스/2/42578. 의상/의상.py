from itertools import combinations
from math import prod
from collections import Counter

def solution(clothes):
    return prod([x + 1 for x in Counter(row[1] for row in clothes).values()]) - 1 