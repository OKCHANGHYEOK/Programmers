import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = {};

        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        ArrayList<String> numberList = new ArrayList<>(Arrays.asList(numbers));

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < files.length; i++) {
            map.put(files[i], i);
        }

        Comparator<String> comparator = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                StringBuilder head1 = new StringBuilder();
                StringBuilder head2 = new StringBuilder();
                StringBuilder number1 = new StringBuilder();
                StringBuilder number2 = new StringBuilder();
                for (int i = 0; i < o1.length(); i++) {
                    if (!numberList.contains(o1.charAt(i) + "")) {
                        head1.append(o1.charAt(i));
                    } else {
                        String tmp = o1.substring(head1.length());
                        while (!tmp.isEmpty() && numberList.contains(tmp.charAt(0) + "")) {
                            number1.append(tmp.charAt(0));
                            tmp = tmp.substring(1);
                        }
                        break;
                    }
                }

                for (int i = 0; i < o2.length(); i++) {
                    if (!numberList.contains(o2.charAt(i) + "")) {
                        head2.append(o2.charAt(i));
                    } else {
                        String tmp = o2.substring(head2.length());
                        while (!tmp.isEmpty() && numberList.contains(tmp.charAt(0) + "")) {
                            number2.append(tmp.charAt(0));
                            tmp = tmp.substring(1);
                        }
                        break;
                    }
                }

                String h1 = head1.toString().toLowerCase();
                String h2 = head2.toString().toLowerCase();

                int n1 = Integer.parseInt(number1.toString());
                int n2 = Integer.parseInt(number2.toString());


                if (h1.equals(h2) && n1 == n2) {
                    int index1 = map.get(o1);
                    int index2 = map.get(o2);

                    return index1 - index2;
                }

                if (h1.equals(h2)) {
                    return n1 - n2;
                }

                if (!h1.equals(h2)) {
                    return h1.compareTo(h2);
                }

                return o1.compareTo(o2);
            }
        };

        Arrays.sort(files, comparator);

        answer = files;

        return answer;
    }
}
