class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        int coupon = chicken;
        
        while(coupon >= 10) {
            int namuji = coupon % 10;
            answer += coupon / 10;
            coupon /= 10;
            coupon += namuji;
        }


        return answer;
    }
}