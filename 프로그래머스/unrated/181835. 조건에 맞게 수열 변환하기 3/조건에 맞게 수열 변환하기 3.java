class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            if(k % 2 == 0) {
                arr[i] += k;
            }
            else {
                arr[i] *= k;
            }
        }
        answer = arr;
        
        return answer;
    }
}