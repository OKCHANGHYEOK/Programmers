
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] keys = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Integer[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for(int i = 0; i < keys.length; i++) {
            if(s.contains(keys[i])) {
                s = s.replace(keys[i], String.valueOf(values[i]));
            }
        }
        
        answer = Integer.valueOf(s);
        
        return answer;
    }
}