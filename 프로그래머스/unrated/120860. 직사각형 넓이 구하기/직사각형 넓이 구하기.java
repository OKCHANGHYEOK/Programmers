import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int garo = 0;
        int sero = 0;
        
        Arrays.sort(dots, (dot1, dot2) -> dot1[0] - dot2[0]);
        
        garo = dots[2][0] - dots[0][0];
        sero = dots[1][1] - dots[0][1];
        
        
        answer = garo * sero;
        
        return answer;
    }
}