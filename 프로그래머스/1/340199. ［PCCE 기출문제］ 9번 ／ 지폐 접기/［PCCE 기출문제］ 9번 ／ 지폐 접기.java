class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        while (true) {
            int min1 = Math.min(wallet[0], wallet[1]);
            int min2 = Math.min(bill[0], bill[1]);
            int max1 = Math.max(wallet[0], wallet[1]);
            int max2 = Math.max(bill[0], bill[1]);
            
            if (min1 >= min2 && max1 >= max2) {
                break;
            }

            if(bill[0] > bill[1]) {
                bill[0] /= 2;
            }
            else {
                bill[1] /= 2;
            }

            answer++;
        }

        return answer;
    }
}