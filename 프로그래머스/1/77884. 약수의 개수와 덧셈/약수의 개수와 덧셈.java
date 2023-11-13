class Solution {
    public int solution(int left, int right) {
        int answer = 0;
   
        
        for(int i = left; i <= right; i++) { // left에서 시작해서 right까지 반복
            int count = 0; // 약수의 개수를 체크할 변수
            
            for(int j = 1; j <= i; j++) { // j는 1부터 i까지 1씩 증가하면서 약수를 체크할 반복
                if(i % j == 0) { // i가 j로 나누어 떨어지면
                    count++; // 카운트 1증가
                }
            }
            
            if(count % 2 == 0) { // 약수의 개수가 짝수이면
                answer += i;    // 더하고
            }
            else {  // 아니면
                answer -= i;    // 뺀다
            }
        }
        
        return answer;
    }
}