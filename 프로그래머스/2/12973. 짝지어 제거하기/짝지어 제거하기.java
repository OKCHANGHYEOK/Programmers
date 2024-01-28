import java.util.Stack;

class Solution {
	public int solution(String s) {
		int answer = 0;

		Stack<Character> st = new Stack<>();
		char[] arr = s.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			if(st.size() >= 1 && arr[i] == st.lastElement()) {
				st.pop();
				continue;
			}
			st.add(arr[i]);
		}
		
		if(st.size() == 0) answer = 1; 

		return answer;
	}
}
