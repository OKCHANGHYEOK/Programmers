import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        // 두 수가 같다면 배열을 그 수로 채우고 종료
        if(n == m) {
            answer[0] = n;
            answer[1] = n;
            return answer;
        }
        
        // 두 수 중에 어느 것이 더 큰 수인지를 비교
        int small = n > m ? m : n;
        int big = n > m ? n : m;
        
        // 최대공약수 구하기
        for(int i = 1; i <= small; i++) {
            if(big % i == 0 && small % i == 0) {
                answer[0] = i;
            }
        }
        
        // 최소공배수 구하기
        if(big % small == 0) {
            answer[1] = big;
        }
        else {
            answer[1] = big * small / answer[0];
        }

        
        

        return answer;
    }
}