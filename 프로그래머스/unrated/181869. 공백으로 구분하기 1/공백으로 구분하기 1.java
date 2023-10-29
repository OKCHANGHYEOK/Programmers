class Solution {
    public String[] solution(String my_string) {
        int size = 1;
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) == ' ') {
               size++; 
            }
        }
        String[] answer = new String[size];
        System.out.println(answer.length);
        
        return answer;
    }
}