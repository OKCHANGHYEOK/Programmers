class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int diff1 = common[1] - common[0];
        double diff2 = common[1] / (double) common[0];
        
        String type = "";
        
        if(diff1 + common[1] == common[2]) type = "dc";
        if(diff2 * common[1] == common[2]) type = "db";
        
        if(type.equals("dc")) answer = common[common.length - 1] + diff1;
        else answer = common[common.length - 1] * (int)diff2;
        
        
        return answer;
    }
}
