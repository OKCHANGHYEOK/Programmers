import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "";

		Queue<String> q1 = new LinkedList<>(Arrays.asList(cards1));
		Queue<String> q2 = new LinkedList<>(Arrays.asList(cards2));
		Queue<String> gq = new LinkedList<>(Arrays.asList(goal));
		
		for(int i = 0; i < goal.length; i++) {
			if(gq.peek().equals(q1.peek())) {
				q1.poll();
				gq.poll();
			}
			else if(gq.peek().equals(q2.peek())) {
				q2.poll();
				gq.poll();
			}
		}
		
		if(gq.isEmpty()) answer = "Yes";
		else answer = "No";
		
		return answer;
	}


}