class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int sum = 0;
        for(int i = 0; i < sides.length; i++) {
            if(max < sides[i]) max = sides[i];
            else sum += sides[i];
        }
        if (max < sum) answer = 1;
        else answer = 2;
        
        return answer;
    }
}