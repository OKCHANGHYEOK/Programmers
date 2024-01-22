class Solution {
    public String solution(String s) {
        String answer = "";

        s = s.toLowerCase();
        
        int index = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	String word = s.substring(i, i + 1);
        	if(!word.equals(" ")) {
        		if(index == 0) {
        			char first = word.charAt(0);
        			boolean isFirstNum = first >= '0' && first <= '9';
        			if(!isFirstNum) word = word.toUpperCase();
        		}
        		answer += word;
        		index++;
         	}
        	else {
        		answer += " ";
        		index = 0;
        	}
        }
       
        return answer;
    }
}