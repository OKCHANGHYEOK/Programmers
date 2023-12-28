import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(int N, int[] stages) {
    	Arrays.sort(stages);
    	int size = stages[stages.length - 1] > N ? N : stages[stages.length - 1];
        int[] answer = new int[size];
        
        // 각 스테이지별로 도전한 사람 수와 성공한 사람 수가 담긴 배열을 저장하는 HashMap
        HashMap<Integer, Integer[]> hm = new HashMap<>();
        for(int i = 1; i <= answer.length; i++) {
           hm.put(i, new Integer[]{0, 0});
        }
        
        for(int i = 0; i < stages.length; i++) {
           for(int key : hm.keySet()) {
              if(stages[i] > key) {
                 Integer[] count = hm.get(key);
                 count[0]++;
                 count[1]++;
                 hm.put(key, count);
              }
              if(stages[i] == key) {
                 Integer[] count = hm.get(key);
                 count[0]++;
              }
           }
        }
        
        
        // 각 스테이지의 실패율 구하기
        double[][] failure = new double[answer.length][3];
        for(int i = 0; i < N; i++) {
           for(int key : hm.keySet()) {
              if(key - 1 == i) {
                 failure[i][0] = i + 1;
                 failure[i][1] = hm.get(key)[1];
                 failure[i][2] = hm.get(key)[0];
                 break;
              }
           }
        }
        
        Arrays.sort(failure, 
        		(a1, a2) ->
        		(int)((a1[1] * a2[2]) - (a2[1] * a1[2]))
        		);
        
        for(int i = 0; i < failure.length; i++) {
        	answer[i] = (int)failure[i][0];
        }

        
        return answer;
    }
}
