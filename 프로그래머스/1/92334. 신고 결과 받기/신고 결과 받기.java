import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // 신고 리스트(중복 제거)
        HashSet<String> tmp = new HashSet<String>();
        for(int i = 0; i < report.length; i++) {
        	tmp.add(report[i]);
        }
        
        
        HashSet<String[]> hs = new HashSet<String[]>();
        for(String s : tmp) {
        	hs.add(s.split(" "));
        }
       
        // 각 유저별 신고 당한 횟수 초기 설정
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(int i = 0; i < id_list.length; i++) {
        	hm.put(id_list[i], 0);
        }
        

        for(String[] arr : hs) {
        	for(String key : hm.keySet()) {
        		if(arr[1].equals(key)) {
        			int count = hm.get(key) + 1;
        			hm.put(key, count);
        			break;
        		}
        	}
        }
        

        
        
        
        for(int i = 0; i < id_list.length; i++) {
        	for(String[] arr : hs) {
        		if(id_list[i].equals(arr[0]) && hm.get(arr[1]) >= k) {
                    answer[i]++;
        		}
        	}
        }
        

        return answer;
    }
}
