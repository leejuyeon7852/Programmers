def solution(k, m, score):
    score.sort(reverse=True)
    
    total = 0
    for i in range(0, len(score), m):
        group = score[i:i+m]
        if len(group) == m:
            total += (min(group)*m)
    
    return total