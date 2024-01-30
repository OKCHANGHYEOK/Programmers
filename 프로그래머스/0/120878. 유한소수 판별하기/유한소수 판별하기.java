class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        /* 기약분수 만들기 */
        for(int i = 1000; i >= 2; i--) {
            if(a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }
        
        int tmp = b;
        while(tmp % 2 == 0) {
            tmp /= 2;
        }
        
        while(tmp % 5 == 0) {
            tmp /= 5;
        }
        
        /* 분모의 소인수가 2와 5만 존재하는지 확인 또는 a/b가 정수인지 확인 */
        if(tmp == 1 || a % b == 0) answer = 1;
        else answer = 2;
        
        return answer;
    }
}