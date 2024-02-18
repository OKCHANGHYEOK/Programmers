class Solution {
    public boolean solution(String s) {
        boolean answer;
        
        int len = s.length();
        
        if(is4or6(len) && onlyNum(s)) {
            answer = true;
        }
        else {
            answer = false;
        }
        
        return answer;
    }
    
    boolean is4or6(int len) {
        return (len == 4 || len == 6) ? true : false;
    }
    
    boolean onlyNum(String s) {
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch > '9' || ch < '0') {
                return false;
            }
        }
        return true;
    }
}