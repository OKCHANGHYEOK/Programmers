import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);
        
        for(int i = 0; i < phone_book.length; i++) {
        	try {
               	if(phone_book[i + 1].startsWith(phone_book[i])) {
            		answer = false;
            		break;
            	}
        	} catch(Exception e) {}
 
        }
        

        
        return answer;
    }
}