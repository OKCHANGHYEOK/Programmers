import java.util.Arrays;

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        int[] arr = new int[numbers.length * k];
        
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i % numbers.length == 0) index = 0;
            arr[i] = numbers[index];
            index++;
        }
        
        answer = arr[(k - 1) * 2];
        
        return answer;
    }
}