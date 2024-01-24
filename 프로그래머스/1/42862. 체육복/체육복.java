import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++) {
        	arr[i] = 1;
        }
        //System.out.println(Arrays.toString(arr));
        for(int i = 0; i < reserve.length; i++) {
        	arr[reserve[i] - 1]++;
        }
        //System.out.println(Arrays.toString(arr));
        for(int i = 0; i < lost.length; i++) {
        	arr[lost[i] - 1]--;
        }
        //System.out.println(Arrays.toString(arr));
        

        System.out.println("start");
        for(int i = 0; i < arr.length; i++) {
            //System.out.println(Arrays.toString(arr));
        	//try { 
                //if(arr[lost[i]] == 0 && arr[lost[i] + 1] >= 2) {
                
                //if(arr[lost[i]]	== 0 && arr[lost[i] - 1] >= 2) {
                if(i > 0 && arr[i] >= 2 && arr[i - 1] == 0 ) {
        			arr[i]--;
        			arr[i - 1]++;
        		}
                if(i != arr.length - 1 && arr[i] >= 2 && arr[i + 1] == 0) {
        			arr[i]--;
        			arr[i + 1]++;
        		}
        	//} catch (ArrayIndexOutOfBoundsException e) {}

        }
        
       
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] > 0) answer++;
        }
        
        return answer;
    }
}