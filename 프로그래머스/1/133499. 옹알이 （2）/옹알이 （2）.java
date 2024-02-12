import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] speak = {"aya", "ye", "woo", "ma"};
        ArrayList<String> speakList = new ArrayList<>(Arrays.asList(speak));
        
        String[] patterns = {"ayaaya", "yeye", "woowoo", "mama"};
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i = 0; i < babbling.length; i++) {
        	boolean hasContinue = false;
        	for(String s : patterns) {
        		if(babbling[i].contains(s)) {
        			hasContinue = true;
        			break;
        		}
        	}
        	if(!hasContinue) {
        		String s = "";
        		for(int j = 0; j < babbling[i].length(); j++) {
        			s += babbling[i].charAt(j);
        			if(speakList.contains(s)) {
        				s = "";
        			}
        		}
        		list.add(s);
        	} 
        }
        
        for(int i = 0; i < list.size(); i++) {
        	if("".equals(list.get(i))) answer++;
        }
        
        return answer;
    }
}