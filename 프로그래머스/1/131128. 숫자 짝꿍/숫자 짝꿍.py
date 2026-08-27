from collections import Counter

def solution(x, y):
    
    count_x = Counter(x)
    # print(count_x)
    count_y = Counter(y)
    # print(count_y)
    
    digits = []  

    for d in "0123456789":
        n = min(count_x[d], count_y[d])
        digits.extend([d] * n)
    
    if len(digits) == 0:
        return '-1'
    if all(d == '0' for d in digits):
        return "0" 
    else:
        digits.sort(reverse=True)
        digits = ''.join(digits)
        return digits
        

