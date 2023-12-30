import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashSet<String> type = new HashSet<>();
        
        // 옷 종류
        for(int i = 0; i < clothes.length; i++) {
        	type.add(clothes[i][1]);
        }
        
        // 각 옷 종류별로 몇 개의 옷을 가지고 있는가?
        HashMap<String, Integer> hm = new HashMap<>();
        for(String s : type) {
        	hm.put(s, 0);
        }
        
        for(int i = 0; i < clothes.length; i++) {
        	for(String s : hm.keySet()) {
        		if(clothes[i][1].equals(s)) {
        			int count = hm.get(s);
        			hm.put(s, ++count);
        			
        		}
        	}
        }
        
        for(String s : hm.keySet()) {
            answer *= hm.get(s) + 1;
        }
        
        answer--;
        
        return answer;
    }
}
