import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
    
        
        for(int i = 0; i < tangerine.length; i++) {
            int tmp = tangerine[i];
            if(i == 0) {
                hm.put(tmp, 1);
            }
            else {
                if(!hm.keySet().contains(tmp)) {
                    hm.put(tmp, 1);
                }
                else {
                    hm.put(tmp, hm.get(tmp) + 1);
                }
            }
        }
        
        int[] arr = new int[hm.size()];
        int count = 0;
        for(Integer key : hm.keySet()) {
            arr[count] = hm.get(key);
            count++;
        }
        
        Arrays.sort(arr);
        int num = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            num += arr[i];
            answer++;
            if(num >= k) {
                break;
            }
        }
        
        return answer;
    }
}