import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        int[] tmp = new int[m];
        int index = 0;
        for(int i = score.length - 1; i >= 0; i--) {
            tmp[index] = score[i];
            index++;
            if(index >= m && index % m == 0) {
                int min = Integer.MAX_VALUE;
                for(int j = 0; j < tmp.length; j++) {
                    if(min > tmp[j]) min = tmp[j];
                }
                answer += min * m;
                tmp = new int[m];
                index = 0;
            }

        }
        
        
        
        return answer;
    }
}