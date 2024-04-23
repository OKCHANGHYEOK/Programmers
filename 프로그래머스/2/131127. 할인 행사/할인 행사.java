import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        
        for(int i = 0; i < want.length; i++) {
        	hm.put(want[i], number[i]);
        }
        
        
        int day = 0;
        while(true) {
        	int count = 0;
        	LinkedHashMap<String, Integer> tmp = new LinkedHashMap<>();
        	for(int i = day; i < day + 10; i++) {
        		if(!tmp.keySet().contains(discount[i])) {
        			tmp.put(discount[i], 1);
        		}
        		else {
        			tmp.put(discount[i], tmp.get(discount[i]) + 1);
        		}
        	}
        	
        	for(String key : tmp.keySet()) {
        		if(hm.get(key) != null && hm.get(key) <= tmp.get(key)) count++;
        	}
        	
        	
        	if(count == hm.size()) answer++;
        	
        	day++;
        	
        	if(discount.length - day < 10) break;
        } 
        
        return answer;
    }
}