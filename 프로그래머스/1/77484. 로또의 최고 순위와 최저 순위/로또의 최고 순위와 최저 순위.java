import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
		Arrays.sort(lottos);
		Arrays.sort(win_nums);
        
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		for(int i = 6; i >= 2; i--) {
			hs.add(i);
		}
		
		
		int count = 0;
		int zero = 0;
		for(int i = 0 ; i < lottos.length; i++) {
			if(lottos[i] == 0) zero++;
		}
		
		for(int i = 0; i < win_nums.length; i++) {
			for(int j = 0; j < lottos.length; j++) {
				if(win_nums[i] == lottos[j]) {
					count++;
					break;
				}
			}
		}
		
		
		
		Iterator<Integer> iter = hs.iterator();
		int index = 1;
		while(iter.hasNext()) {
			int ball = iter.next();
			if(ball == count) answer[1] = index;
			if(ball == count + zero) answer[0] = index;
			index++;
		}
		
        if(answer[0] == 0) answer[0] = 6;
		if(answer[1] == 0) answer[1] = 6;
		
        return answer;
    }
}