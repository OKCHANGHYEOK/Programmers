class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        
        int[] noSearch = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < noSearch.length; j++) {
                if(noSearch[j] == numbers[i]) {
                    answer -= noSearch[j];
                }
            }
        }
        
        
        return answer;
    }
}