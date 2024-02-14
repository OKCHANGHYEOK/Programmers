class Solution {
    public int solution(String s) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        
        int count1 = 0;
        int count2 = 0;
        String first = "";
        
        for(int i = 0; i < s.length(); i++) {
        	if(sb.length() == 0) {
        		count1++;
        		first = String.valueOf(s.charAt(i));
        	}
        	if(sb.length() >= 1 && String.valueOf(s.charAt(i)).equals(first)) count1++;
        	else if(sb.length() >= 1 && (String.valueOf(s.charAt(i)).equals(first)) == false) count2++;
        	sb.append(s.charAt(i));
        	if(count1 == count2) {
        		answer++;
        		count1 = 0;
        		count2 = 0;
        		sb = new StringBuilder();
        	}
        }

        
        if(count1 != count2) answer++;
        
        
        return answer;
    }
}
