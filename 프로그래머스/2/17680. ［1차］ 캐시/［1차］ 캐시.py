def solution(cacheSize, cities):
    if cacheSize == 0:
        return len(cities) * 5

    answer = 0

    cache = []

    for city in cities:
        cityName = city.upper()
        is_incache = cityName in cache

        answer += 1 if is_incache else 5

        if len(cache) == cacheSize:
            if is_incache:
                del cache[cache.index(cityName)]
            else:
                del cache[0]    

        cache.append(cityName)

    return answer