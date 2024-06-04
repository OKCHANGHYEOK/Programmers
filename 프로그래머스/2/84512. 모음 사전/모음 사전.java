class Solution {
    String[] elements = {"A", "E", "I", "O", "U"};
    String curr = "";
    int index = 0;
    public int solution(String word) {
        int answer = 0;
        answer = Integer.parseInt(dfs(word, ""));
        return answer;
    }

    private String dfs(String target, String curr) {
        if(curr.equals(target)) {
            return String.valueOf(index);
        }

        if(curr.length() < 5) {
            for(String str : elements) {
                index++;
                String result = dfs(target, curr + str);
                if(!result.equals("-1")) {
                    return result;
                }
            }
        }

        return "-1";
    }
}