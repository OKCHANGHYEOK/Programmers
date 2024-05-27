import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        int sum = 0;
        for(int i = 0; i < works.length; i++) {
            sum += works[i];
        }
        
        if(sum <= n) {
            return 0;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(n, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < works.length; i++) {
            pq.add(works[i]);
        }

        while(n != 0) {
            int max = pq.poll();
            max--;
            pq.add(max);
            n--;
        }

        while(!pq.isEmpty()) {
            answer += (long) Math.pow(pq.poll(), 2);
        }

        return answer;
    }
}
