import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        LinkedList<Integer> list = new LinkedList<>();

        for (String operation : operations) {
            String[] tokens = operation.split(" ");
            String op = tokens[0];
            int num = Integer.parseInt(tokens[1]);
            if(op.equals("I")) {
                list.add(num);
                list.sort(null);
            }
            else {
                if(list.isEmpty()) continue;

                if(num == 1) {
                    list.removeLast();
                }
                else {
                    list.removeFirst();
                }
            }
        }

        if(!list.isEmpty()) {
            answer[0] = list.peekLast();
            answer[1] = list.peek();
        }


        return answer;
    }
}