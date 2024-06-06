import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((o1, o2) -> o1 - o2);

        for(int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }

        while(pq.peek() != null && pq.peek() < K) {
            int n1 = pq.poll();
            if(pq.isEmpty()) break;
            int n2 = pq.poll();
            int food = n1 + n2 * 2;
            pq.add(food);
            answer++;
        }

        if(pq.isEmpty()) answer = -1;

        return answer;
    }
}
