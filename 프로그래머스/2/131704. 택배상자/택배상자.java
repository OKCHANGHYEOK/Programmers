import java.util.*;

class Solution {
  public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> support = new Stack<>();
        int box = 1;
        
        for (int target : order) {
            while (box <= order.length && (support.isEmpty() || support.peek() != target)) {
                support.push(box++);
            }

            if (!support.isEmpty() && support.peek() == target) {
                support.pop();
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
}