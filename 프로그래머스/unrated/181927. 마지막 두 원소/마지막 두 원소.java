class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        int lastBefore = num_list[num_list.length - 2];
        int last = num_list[num_list.length - 1];
        
        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        if(last > lastBefore) {
            answer[answer.length - 1] = last - lastBefore;
        }
        else {
            answer[answer.length - 1] = last * 2;
        }
        
        return answer;
    }
}