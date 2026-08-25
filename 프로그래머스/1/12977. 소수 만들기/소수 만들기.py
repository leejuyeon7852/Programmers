from itertools import combinations

def isPrime(num):
    if num <= 1:
        return False
    
    for i in range(2, num):
        if num % i == 0:
            return False
    return True

            

def solution(nums):
    nums.sort()
    
    count = 0
            
    for combo in combinations(nums, 3):
        total = sum(combo)
        if isPrime(total):
            count += 1
        
    return count