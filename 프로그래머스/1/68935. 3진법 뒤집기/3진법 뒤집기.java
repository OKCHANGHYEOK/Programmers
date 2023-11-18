import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(n >= 3) {
            list.add(n % 3);
            n /= 3;
        }
        list.add(n);
        
        int k = list.size();
        for(int i = 0; i < list.size(); i++) {
            answer += (int)(Math.pow(3, k - 1)) * list.get(i);
            k--;
        }
        
        return answer;
    }
}