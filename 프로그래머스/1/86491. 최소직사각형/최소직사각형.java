import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][1] > sizes[i][0]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        
        int max_h = Integer.MIN_VALUE;
        int max_w = Integer.MIN_VALUE;
        
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] > max_w) max_w = sizes[i][0];
            if(sizes[i][1] > max_h) max_h = sizes[i][1];
        }
        
        answer = max_h * max_w;
        
        return answer;
    }
}