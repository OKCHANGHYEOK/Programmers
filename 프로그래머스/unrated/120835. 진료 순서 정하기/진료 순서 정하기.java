import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        int[] org = new int[emergency.length];
        for(int i = 0; i < emergency.length; i++) {
            org[i] = emergency[i];
        }
        Arrays.sort(emergency); // 오름차순 정렬
        int[] rev = new int[emergency.length]; // 내림차순으로 정렬
        int k = 0;
        for(int i = emergency.length - 1; i >= 0; i--) {
            rev[k] = emergency[i];
            k++;
        }
        
        for(int i = 0; i < org.length; i++) {
            for(int j = 0; j < rev.length; j++) {
                if(org[i] == rev[j]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
 
        
        return answer;
    }
}