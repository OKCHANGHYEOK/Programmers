import java.util.Stack;

class Solution {
    boolean solution(String s) {
    	
    	Stack<Character> st = new Stack<>();
    	
    	char[] ch = s.toCharArray();
    	
    	for(int i = 0; i < ch.length; i++) {
    		if(st.size() >= 1 && st.peek() == '(' && ch[i] == ')') {
    			st.pop();
    			continue;
    		}
    		st.add(ch[i]);
    	}
    	
    	return st.isEmpty();
    }
 
}