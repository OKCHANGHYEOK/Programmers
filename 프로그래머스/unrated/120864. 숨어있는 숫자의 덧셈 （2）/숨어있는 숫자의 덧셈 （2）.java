class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String str = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            boolean somunja = ch >= 'a' && ch <= 'z' ? true : false;
            boolean daemunja = ch >= 'A' && ch <= 'Z' ? true : false;
            if(somunja || daemunja) str += " ";
            else str += String.valueOf(ch);
        }
        
        while(str.contains("  ")) {
            str = str.replace("  ", " ");
        }
        
        String[] arr = str.split(" ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("") != true) answer += Integer.valueOf(arr[i]);
        }
        
        return answer;
    }
}