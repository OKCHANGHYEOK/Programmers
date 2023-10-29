class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int allMul = 1;
        int allSum = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            allMul *= num_list[i];
            allSum += num_list[i];
        }
        
        if(allSum * allSum > allMul) {
            answer = 1;
        }
        return answer;
    }
}