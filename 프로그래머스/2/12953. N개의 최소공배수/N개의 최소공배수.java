import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        
        Arrays.sort(arr);
        for(int i = arr[0] == 1 ? 1 : 2; i <= 100000000; i++) {
            int count = 0;
            for(int j = 0; j < arr.length; j++) {
                if(i % arr[j] == 0) count++;
            }
            if(count == arr.length) {
                answer = i;
                break;
            } 
        }
        
        return answer;
    }
}