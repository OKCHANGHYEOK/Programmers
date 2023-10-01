class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i < 8; i++) {
            int tmp = n % 10;
            n /= 10;
            answer += tmp;
        }
        return answer;
    }
}