class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int n = x;
        while(n > 0){
            int digit = n % 10;
            n /= 10;
            sum += digit;
        }
        if(x % sum == 0){
            return true;
        }else{
            return false;
        }
        
    }
}