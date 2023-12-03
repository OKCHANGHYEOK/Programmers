class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
    
        while(n % a == 0) { // n이 a로 나누어떨어지는 동안 반복
            answer += n / a;
            n /= a;
        }
        
        // 더이상 나누어떨어지지 않게 되었으므로
        int max = n - n % a; // 나누어 떨어지는만큼의 병의 개수를 저장해두고
        int namuji = n - max; // 남는 병의 개수를 저장해둔다
        
        while(max % a == 0) {
            answer += max / a;
            max /= a;
        }
        
        int last = max + namuji;
        
        System.out.println(last);
        
        return answer;
    }
}