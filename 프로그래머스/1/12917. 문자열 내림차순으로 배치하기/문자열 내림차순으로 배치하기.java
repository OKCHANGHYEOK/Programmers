import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    char tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        answer = new String(arr);
        
        return answer;
    }
}