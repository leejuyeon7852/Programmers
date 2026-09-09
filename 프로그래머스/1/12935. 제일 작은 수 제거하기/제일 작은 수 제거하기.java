import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int min = arr[0];
        int minIndex = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        
        for(int num: arr){
            if(num != min) list.add(num);
        }
        
        int[] answer = new int[list.size()];
        if(arr.length == 1){
            return new int[]{-1};
        }
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        
        
        return answer;
    }
}