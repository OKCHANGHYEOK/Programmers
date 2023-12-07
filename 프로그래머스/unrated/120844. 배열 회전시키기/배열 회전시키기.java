import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if(direction.equals("right")) {
            for(int i = 0; i < numbers.length; i++) {
                if(i == numbers.length - 1) break;
                answer[i + 1] = numbers[i];
            }
            answer[0] = numbers[numbers.length - 1];
        }
        else {
            int k = 0;
            for(int i = 1; i < numbers.length; i++) {
                answer[k] = numbers[i];
                k++;
            }
            answer[numbers.length - 1] = numbers[0];
        }
        
        
        
        return answer;
    }
}