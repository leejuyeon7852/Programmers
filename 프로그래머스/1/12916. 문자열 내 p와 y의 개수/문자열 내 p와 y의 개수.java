class Solution {
    boolean solution(String s) {

        int countY = 0;
        int countP = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'y' || c == 'Y') countY++;
            if(c == 'p' || c == 'P') countP++;
        }
        
        if(countY == countP) {
            return true;
        } else{
            return false;
        }

    }
}