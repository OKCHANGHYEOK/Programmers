import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        // X의 각 문자별 개수를 담을 Map
        LinkedHashMap<String, Integer> xhm = new LinkedHashMap<>();
        // Y의 각 문자별 개수를 담을 Map
        LinkedHashMap<String, Integer> yhm = new LinkedHashMap<>();
        
        char[] xArr = X.toCharArray();
        char[] yArr = Y.toCharArray();
        
        Arrays.sort(xArr);
        Arrays.sort(yArr);
        
        
        for(int i = 0; i < xArr.length; i++) {
        	String s = String.valueOf(xArr[i]);
        	if(!xhm.keySet().contains(s)) {
        		xhm.put(s, 1);
        	}
        	else {
        		xhm.put(s, xhm.get(s) + 1);
        	}
        }
        
        for(int i = 0; i < yArr.length; i++) {
        	String s = String.valueOf(yArr[i]);
        	if(!yhm.keySet().contains(s)) {
        		yhm.put(s, 1);
        	}
        	else {
        		yhm.put(s, yhm.get(s) + 1);
        	}
        }
        
        
        
        LinkedHashMap<String, Integer> small = xhm.size() > yhm.size() ? yhm : xhm;
        LinkedHashMap<String, Integer> big = xhm.size() > yhm.size() ? xhm : yhm;
        
        
        for(String key : small.keySet()) {
        	if(big.keySet().contains(key)) {
        		int count = small.get(key) > big.get(key) ? big.get(key) : small.get(key);
        		for(int i = 0; i < count; i++) {
        			sb.append(key);
        		}
        	}
        }
        
        if(sb.toString().equals("")) {
        	return "-1";
        }
        
        if(sb.toString().matches("0+")) {
        	return "0";
        }
        
        answer = sb.reverse().toString();
        
        return answer;
    }
}
