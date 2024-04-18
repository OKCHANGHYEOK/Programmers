import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        

        for(int i = 0; i < s.length(); i++) {
        	Stack<Character> st = new Stack<>();
            for(int j = 0; j < s.length(); j++) {
                if(j + i >= s.length()) {
                	st.add(s.charAt(j + i - s.length()));
                }
                else st.add(s.charAt(j + i));
                
                
                if(st.size() >= 2 && ((st.get(st.size() - 2) - st.peek() == -1) || (st.get(st.size() - 2) - st.peek() == -2))) {
                	st.pop();
                	st.pop();
                }
            }
            
            if(st.isEmpty()) answer++;
        }
        
        return answer;
    }
}
