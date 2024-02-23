import java.util.ArrayList;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = null;
        
        int sum = 0;
        for(int i = -100; i <= 100; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            if(sum != 0) sum = 0;
            for(int j = i; j <= i + num - 1; j++) {
                sum += j;
                list.add(j);
            }
            if(sum == total) {
                answer = list.stream().mapToInt(Integer::intValue).toArray();
                break;
            }
        }
        
        
        return answer;
    }
}