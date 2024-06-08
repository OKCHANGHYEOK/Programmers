import java.util.*;

class Solution {
    public int solution(int[] topping) {
        Integer[] list = Arrays.stream(topping).boxed().toArray(Integer[]::new);
        LinkedList<Integer> q1 = new LinkedList<>(Arrays.asList(list));
        LinkedList<Integer> q2 = new LinkedList<>();
        return getCount(q1, q2);
    }

    private int getCount(LinkedList<Integer> q1, LinkedList<Integer> q2) {
        int count = 0;

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for(Integer i : q1) {
            if(map1.containsKey(i)) {
                map1.put(i, map1.get(i) + 1);
            }
            else {
                map1.put(i, 1);
            };
        }


        while(!q1.isEmpty()) {
            int last = q1.pop();
            q2.add(last);

            if(map1.containsKey(last)) {
                map1.put(last, map1.get(last) - 1);
                if(map1.get(last) == 0) {
                    map1.remove(last);
                }
            }

            if(!map2.containsKey(last)) {
                map2.put(last, 1);
            }

            if(map1.keySet().size() == map2.keySet().size()) {
                count++;
            }
        }

        return count;
    }
}