import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int element: arr){
            if(element % divisor == 0){
                list.add(element);
            }
        }
        list.sort(null);
        
        int[] answer = new int[list.size()];
        if(list.size() == 0){
            return new int[]{-1};
        }else {
            for(int i = 0; i < list.size(); i++){
                answer[i] = list.get(i);
            }
        }
        
        return answer;
    }
}