import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        int count = 0;
        
        for(int i = 0; i < d.length; i++) {
            sum += d[i];
            count++;
        }
        
        if(sum == budget) {
            answer = count;
            return answer;
        }
        
        count = 0;
        sum = 0;
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++) {
            try {
                if(sum + d[i] <= budget) {
                sum += d[i];
                count++;
                }
            } catch(Exception e) {}

        }
        answer = count;
        
        return answer;
    }
}