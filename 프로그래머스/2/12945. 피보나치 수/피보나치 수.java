import java.util.ArrayList;

class Solution {
    public long solution(int n) {
        
        ArrayList<Long> fibonacci = new ArrayList<Long>();
        fibonacci.add(Long.valueOf(0));
        fibonacci.add(Long.valueOf(1));
        
        while(fibonacci.size() != n + 1) {
        	long n1 = fibonacci.get(fibonacci.size() - 1);
        	long n2 = fibonacci.get(fibonacci.size() - 2);
        	fibonacci.add((n1 + n2) % 1234567);
        }
        
        
        
        return fibonacci.get(fibonacci.size() - 1);
    }
}