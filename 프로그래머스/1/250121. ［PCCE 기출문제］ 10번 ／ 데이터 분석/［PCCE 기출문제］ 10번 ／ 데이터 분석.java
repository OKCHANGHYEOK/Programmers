import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        ArrayList<int[]> list = new ArrayList<int[]>();

        String[] type = {"code", "date", "maximum", "remain"};
        int target = 0;
        int sort = 0;
        for(int i = 0; i < 4; i++) {
            if(ext.equals(type[i])) {
                target = i;
            }
            if(sort_by.equals(type[i])) {
                sort = i;
            }
        }

        for (int i = 0; i < data.length; i++) {
            int value = data[i][target];
            if(value <= val_ext) {
                list.add(data[i]);
            }
        }


        int finalSort = sort;
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int value1 = o1[finalSort];
                int value2 = o2[finalSort];
                return value1 - value2;
            }
        });

        answer = list.toArray(new int[list.size()][]);

        return answer;
    }
}
