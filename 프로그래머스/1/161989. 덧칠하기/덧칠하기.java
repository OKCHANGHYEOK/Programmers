import java.util.ArrayList;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < n; i++) {
        	list.add(1);
        }
        
        for(int i = 0; i < section.length; i++) {
        	list.set(section[i] - 1, 0);
        }
        
        while(list.contains(0)) {
        	int index = list.indexOf(0);
        	try {        		
        		for(int i = index; i < index + m; i++) {
        			list.set(i, 1);
        		}
        	} catch(IndexOutOfBoundsException e) {}
        	answer++;
        }
        
        return answer;
    }
}