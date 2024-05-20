import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        getList(str1, list1);
        getList(str2, list2);

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        getMap(list1, map1);
        getMap(list2, map2);

        int union = 0;
        int intersection = 0;

        for(String key1 : map1.keySet()) {
            if(map2.containsKey(key1)) {
                union += map1.get(key1) > map2.get(key1) ? map1.get(key1) : map2.get(key1);
                intersection += map1.get(key1) > map2.get(key1) ?  map2.get(key1) : map1.get(key1);
            }
            else {
                union += map1.get(key1);
            }
        }

        for(String key2 : map2.keySet()) {
            if(!map1.containsKey(key2)) {
                union += map2.get(key2);
            }
        }
        if(intersection == 0 && union == 0) {
            return 65536;
        }
        answer = (int)((double)intersection * 65536 / union);
        return answer;
    }

    private void getMap(ArrayList<String> list, HashMap<String, Integer> map) {
        for(String s : list) {
            if(!map.containsKey(s)) {
                map.put(s, 1);
            }
            else {
                map.put(s, map.get(s) + 1);
            }
        }
    }

    private void getList(String str, ArrayList<String> list) {
        String regex = ".*[\\s\\d\\W_].*";
        for(int i = 0; i < str.length() - 1; i++) {
            String tmp = str.substring(i, i + 2);
            if(!tmp.matches(regex)) {
                list.add(tmp);
            }
        }
    }
}