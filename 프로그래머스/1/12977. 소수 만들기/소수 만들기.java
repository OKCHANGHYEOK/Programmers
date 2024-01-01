import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int sum = 0;
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
        	for(int j = i + 1; j < nums.length; j++) {
        		for(int k = j + 1; k < nums.length; k++) {
        			sum = nums[i] + nums[k] + nums[j];
                	list.add(sum);
        		}
        	}

        }
        
        
        for(int i = 0; i < list.size(); i++) {
        	int count = 0;
        	for(int j = 1; j <= list.get(i); j++) {
        		if(list.get(i) % j == 0) count++;
        	}
        	if(count == 2) answer++;
        }

        return answer;
    }
}
