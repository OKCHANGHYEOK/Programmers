class Solution {
    public String[] solution(String my_string) {
        int size = 1;
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) == ' ') {
               size++; 
            }
        }
        String[] answer = new String[size];
        
        if(my_string.contains(" ") == false) {
            answer[0] = my_string;
        }
        else {
            int k = 0;
            int IsEmpty = 0;
            for(int i = 0; i < my_string.length(); i++) {
                if(my_string.charAt(i) == ' ') {
                    answer[k] = my_string.substring(IsEmpty, i);
                    answer[k] = answer[k].replace(" ", "");
                    IsEmpty = i;
                    k++;
                }
            }
            
            if(k < my_string.length()) {
                answer[k] = my_string.substring(IsEmpty, my_string.length());
                answer[k] = answer[k].replace(" ", "");
            }
        }
        
        return answer;
    }
}