import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            answer = answer * 10 + (arr[i] - '0');
        }
        
        return answer;
    }
}