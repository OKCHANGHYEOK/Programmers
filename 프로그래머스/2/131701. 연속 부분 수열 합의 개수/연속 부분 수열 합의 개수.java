import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        HashSet<Integer> hs = new HashSet<Integer>();
        int len = elements.length;
        for(int i = 0; i < len; i++) {
        	int sum = 0;
        	for(int j = 0; j < len; j++) {
        		sum += elements[(i + j) % len];
        		hs.add(sum);
        	}
        }
        
        answer = hs.size();
        
        return answer;
    }
}
