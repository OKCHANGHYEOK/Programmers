class Solution {
    public String[] solution(String my_str, int n) {
        int size = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[size];
        
        int k = 0;
        for(int i = 0; i < answer.length; i++) {
            if((i + 1) * n <= my_str.length()) {
                answer[k] = my_str.substring(i * n, (i + 1) * n);
            }
            else {
                answer[k] = my_str.substring(i * n, my_str.length());
            }
            k++;
        }
        
        
        
        return answer;
    }
}