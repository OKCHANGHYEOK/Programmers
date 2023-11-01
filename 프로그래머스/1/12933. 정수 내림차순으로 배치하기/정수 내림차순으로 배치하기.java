import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;

        long[] arr = new long[(String.valueOf(n)).length()];
        
        int k = 0;
        while(n != 0) {
            arr[k] = n % 10;
            n /= 10;
            k++;
        }
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    long tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        String result = "";
        for(int i = 0; i < arr.length; i++) {
            result += String.valueOf(arr[i]);
        }
        
        answer = Long.valueOf(result);
        
        return answer;
    }
}