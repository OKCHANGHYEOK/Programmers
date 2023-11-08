class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[][] morse = {
            {".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", 
            "-.--", "--.."}, {
                "a", "b", "c", "d", "e", "f", "g",
                "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t", "u",
                "v", "w", "x", "y", "z"
            }
        };
        
        String[] words = letter.split(" ");
        
        for(String word : words) {
            for(int i = 0; i < morse[0].length; i++) {
                if(word.equals(morse[0][i])) {
                    answer += morse[1][i];
                }
            }
        }
        
        return answer;
    }
}