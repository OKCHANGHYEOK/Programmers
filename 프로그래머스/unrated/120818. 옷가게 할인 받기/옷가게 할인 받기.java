class Solution {
    public int solution(int price) {
        int answer = 0;
        double discount = 1;
        if(price < 100000) {}
        else if(price >= 100000 && price < 300000) {
            discount = 0.95;
        }
        else if(price >= 300000 && price < 500000) {
            discount = 0.9;
        }
        else discount = 0.8;
        answer = (int)(price * discount);
        return answer;
    }
}