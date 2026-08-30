import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n > 0){
            answer += (n % 10); // 123 % 10 = 3, 3을 더한다 
            n /= 10; // 123이면 12
        }

        return answer;
    }
}