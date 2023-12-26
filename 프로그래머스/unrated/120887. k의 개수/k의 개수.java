import java.util.Arrays;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        String[] arr = new String[j - i + 1];
        int index = 0;
        
        for(; i <= j; i++) {
            arr[index] = String.valueOf(i);
            index++;
        }
        
        for(String s : arr) {
            for(int l = 0; l < s.length(); l++) {
                if(s.substring(l, l+1).equals(String.valueOf(k))) answer++;
            }
        }
        
        return answer;
    }
}