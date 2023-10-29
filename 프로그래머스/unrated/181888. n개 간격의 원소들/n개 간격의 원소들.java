class Solution {
    public int[] solution(int[] num_list, int n) {
        int size;
        int len = num_list.length;
        size = (len % n == 0) ? len / n : len / n + 1;
        int[] answer = new int[size];
        
        int k = 0;
        for(int i = 0; i < len; i+=n) {
            answer[k] = num_list[i];
            k++;
        }
        
        return answer;
    }
}