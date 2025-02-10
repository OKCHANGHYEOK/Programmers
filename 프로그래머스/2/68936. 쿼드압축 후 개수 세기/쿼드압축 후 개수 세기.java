import java.util.Arrays;

public class Solution {
    int[] answer = {0, 0};

    public int[] solution(int[][] arr) {

        GetResult(arr);

        return answer;
    }

    private void GetResult(int[][] arr) {
        int num = CheckQuad(arr);
        if (num >= 0) {
            answer[num]++;
            return;
        }

        int size = arr.length;

        GetResult(copyArray(arr, 0, 0));
        GetResult(copyArray(arr, 0 , size / 2));
        GetResult(copyArray(arr, size / 2 , size / 2));
        GetResult(copyArray(arr, size / 2 , 0));

    }

    private int[][] copyArray(int[][] arr, int x, int y) {
        int size = arr.length / 2;
        int[][] newArr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                newArr[i][j] = arr[i + x][j + y];
            }
        }

        return newArr;
    }

    private int CheckQuad(int[][] arr) {
        int num = arr[0][0];
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(num != arr[i][j]) {
                    return -1;
                }
            }
        }

        return num;
    }
}

