import java.util.HashMap;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
       
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++) {
        	HashMap<String, Integer> hs = new HashMap<String, Integer>();
        	hs.put("aya", 0);
        	hs.put("ye", 0);
        	hs.put("woo", 0);
        	hs.put("ma", 0);
       
        	
        	String s = babbling[i];
        	for(int j = 0; j < words.length; j++) {
            	if(s.contains(words[j])) {
            		babbling[i] = babbling[i].replaceFirst(words[j], "");
            		Integer count = hs.get(words[j]) + 1;
            		hs.put(words[j], count);
            	}
        	}
        	
        	int count1 = hs.get("aya");
        	int count2 = hs.get("ye");
        	int count3 = hs.get("woo");
        	int count4 = hs.get("ma");
        	boolean isOne = count1 <= 1 && count2 <= 1 && count3 <= 1 && count4 <= 1;
        	if(babbling[i].equals("") && isOne) answer++;
        }

        
        return answer;
    }
}