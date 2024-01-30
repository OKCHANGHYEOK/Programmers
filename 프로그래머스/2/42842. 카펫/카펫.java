import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int all = brown + yellow;
        
        // 모든 약수
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 1; i <= all; i++) {
        	if(all % i != 0) continue;
        	list.add(i);
        }
        

        int min = list.get(0);
        int max = list.get(list.size() - 1);
        
        LOOP : for(int i = min; i <= max; i++) {
        	for(int j = min; j <= i; j++) {
        		if(all % i == 0 && all % j == 0 && i >= j && (i * 2) + (j * 2) - 4 == brown) {
        			answer[0] = i;
        			answer[1] = j;
        			break LOOP;
        		}
        	}
        }
        
        
        return answer;
    }
}
