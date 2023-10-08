class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int size = numbers.length * (numbers.length - 1);
        int k = 0;
        int[] m_result = new int[size];
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(i != j) {
                    m_result[k] = numbers[i] * numbers[j];
                    k++;
                }
            }
        }
        int max = m_result[0];
        for(int i = 0; i < m_result.length; i++) {
            if(max < m_result[i]) max = m_result[i];
        }
        answer = max;
        return answer;
    }
}