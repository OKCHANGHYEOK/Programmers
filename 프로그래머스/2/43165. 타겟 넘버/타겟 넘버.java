class Solution {
    int count = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return count;
    }

    private void dfs(int[] numbers, int target, int index, int sum) {
        if (index != numbers.length) {
            dfs(numbers, target, index + 1, sum + numbers[index]);
            dfs(numbers, target, index + 1, sum - numbers[index]);
        }
        else if (sum == target) {
            count++;
        }
    }
}