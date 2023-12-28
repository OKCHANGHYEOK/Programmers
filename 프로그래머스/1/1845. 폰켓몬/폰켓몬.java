import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int select = nums.length / 2;
        
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
        	hs.add(nums[i]);
        }
        
        int type = hs.size();
        
        if(select < type) answer = select;
        else answer = type;
        
        return answer;
    }
}
