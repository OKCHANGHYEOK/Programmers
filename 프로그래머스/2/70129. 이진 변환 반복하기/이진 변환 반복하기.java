class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
    
        
        while(!s.equals("1")) {
        	StringBuilder sb = new StringBuilder();
        	for(int i = 0; i < s.length(); i++) {
        		String tmp = s.substring(i, i + 1);
        		if(tmp.equals("1")) {
        			sb.append(tmp);
        		}
        		else {
        			answer[1]++;
        		}
        	}
        	s = sb.substring(0, sb.length());
        	s = Integer.toBinaryString(s.length());
        	answer[0]++;
        }
        
        
        return answer;
    }
}