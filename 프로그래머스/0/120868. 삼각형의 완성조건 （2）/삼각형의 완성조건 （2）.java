import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        
        answer = 2 * sides[0] - 1;
        
        return answer;
    }
}