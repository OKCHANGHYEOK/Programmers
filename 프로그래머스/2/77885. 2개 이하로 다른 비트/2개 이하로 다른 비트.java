class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                answer[i] = numbers[i] + 1;
            }
            else {
                String bit = Long.toBinaryString(numbers[i]);
                bit = "0".repeat(64 - bit.length()) + bit;
                char[] bits = bit.toCharArray();
                for(int j = bits.length - 1; j >= 0; j--) {
                    if(j >= 1 && bits[j] == '0' && bits[j + 1] == '1') {
                        bits[j] = '1';
                        bits[j + 1] = '0';
                        break;
                    }
                }
                String result = new String(bits);
                answer[i] = Long.parseLong(result, 2);
            }
        }

        return answer;
    }
}