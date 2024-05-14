import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        s = s.substring(1, s.length() - 1);
        s = s.substring(1, s.length() - 1);
        String[] arr = s.split("\\}\\,\\{");
        Arrays.sort(arr, (a, b) -> a.length() - b.length());
        answer = new int[arr.length];
        HashSet<String> hs = new HashSet<String>();
        for(int i = 0; i < arr.length; i++) {
        	String[] tmp = arr[i].split(",");
        	for(int j = 0; j < tmp.length; j++) {
        		if(!hs.contains(tmp[j])) {
        			answer[i] = Integer.valueOf(tmp[j]);
        			hs.add(tmp[j]);
        			break;
        		}
        	}
        }
        
        return answer;
    }
}