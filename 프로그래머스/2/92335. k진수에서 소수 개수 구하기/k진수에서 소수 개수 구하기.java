class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String s = Integer.toString(n, k);
        String[] arr = s.split("0");
        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].equals("")) {
                long num = Long.parseLong(arr[i]);
                if(isPrimeNumber(num)) answer++;
            }
        }
        return answer;
    }

    private boolean isPrimeNumber(long n) {
        if(n == 1) {
            return false;
        }
        else if(n == 2) {
            return true;
        }
        else if(n % 2 == 0) {
            return false;
        }
        else {
            for(int i = 3; i <= Math.sqrt(n); i += 2) {
                if(n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
