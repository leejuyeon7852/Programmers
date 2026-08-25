import java.util.Scanner;
import java.util.Stack;

class Solution {
    boolean solution(String str) {
        Stack<Character> s = new Stack<>(); 
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(')
                s.push('(');
            else {
                if(s.empty()) {
                    return false;
                }
                s.pop();
            }
        }

        if(s.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}