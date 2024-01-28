import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        
        for(int i = 0; i < n; i++) {
            String s = "";
            int num = arr1[i] | arr2[i];
            s += Integer.toBinaryString(num);
            
            while(s.length() < n) {
                s = "0" + s;
            }
            
            s = s.replace("1", "#");
            s = s.replace("0", " ");
            answer[i] = s;
        }
    
        
        return answer;
    }
}