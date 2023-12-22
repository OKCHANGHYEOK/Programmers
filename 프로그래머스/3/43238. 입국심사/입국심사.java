import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long min_time = 0;
        Arrays.sort(times);
        long a = times[times.length - 1];
        long b = n;
        long max_time = a * b;
        	
        while(min_time <= max_time) {
            long mid_time = (min_time + max_time) / 2;
        	long count = 0;
        	
        	
        	for(int time : times) {
        		long per = mid_time / time;
        		count += per;
        	}
        	
        	if(count >= n) {
        		answer = mid_time;
        		max_time = mid_time - 1;
        	}
        	else {
        		min_time = mid_time + 1;
        	}
        	
        }
        

        
        return answer;
    }
}

