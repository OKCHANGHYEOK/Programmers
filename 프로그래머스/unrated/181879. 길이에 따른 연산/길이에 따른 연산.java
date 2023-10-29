class Solution {
    public int solution(int[] num_list) {
        boolean isOver11 = num_list.length >= 11;
        int answer = isOver11 ? 0 : 1;
        
        for(int i = 0; i < num_list.length; i++) {
            if(isOver11) {
                answer += num_list[i];
            }
            else {
                answer *= num_list[i];
            }
        }
        
        return answer;
    }
}