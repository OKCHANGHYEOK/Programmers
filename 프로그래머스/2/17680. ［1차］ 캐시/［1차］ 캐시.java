import java.util.ArrayList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if(cacheSize == 0) {
        	return cities.length * 5;
        }
              
        ArrayList<String> cacheList = new ArrayList<String>();
        
        for(int i = 0; i < cities.length; i++) {
        	String s = cities[i].toLowerCase();
        	
        	if(!cacheList.contains(s)) {
        		if(cacheList.size() == cacheSize) cacheList.remove(0); 
        		cacheList.add(s);
        		answer += 5;
        	}
        	else {
        		int index = cacheList.indexOf(s);
        		cacheList.remove(index);
        		cacheList.add(s);
        		answer += 1;
        	}
        }
        
        return answer;
    }
}