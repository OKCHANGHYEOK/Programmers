import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        // 기본 시간
        int baseTime = fees[0];

        // 기본 요금
        int baseFee = fees[1];

        // 단위 시간
        int unitTime = fees[2];

        // 단위 시간당 요금
        int unitFee = fees[3];

        HashMap<String, String> map = new HashMap<>();
        HashMap<String, Integer> totalTimes = new HashMap<>();

        for(int i = 0; i < records.length; i++){
            String[] record = records[i].split(" ");

            if(record[2].equals("IN")) {
                map.put(record[1], record[0]);
            }
            else {
                String carNum = record[1];
                int totalTime = hourToMinute(map.get(record[1]), record[0]);

                if(!totalTimes.containsKey(carNum)) {
                    totalTimes.put(carNum, totalTime);
                }
                else {
                    totalTimes.put(carNum, totalTimes.get(carNum) + totalTime);
                }

                map.remove(record[1]);
            }
        }

            for(String carNum : map.keySet()) {
                String inTime = map.get(carNum);
                String outTime = "23:59";
                int totalTime = hourToMinute(inTime, outTime);

                if(!totalTimes.containsKey(carNum)) {
                    totalTimes.put(carNum, totalTime);
                }
                else {
                    totalTimes.put(carNum, totalTime + totalTimes.get(carNum));
                }
                
            }


        PriorityQueue<String[]> pq = new PriorityQueue<String[]>(Comparator.comparing(a -> a[0]));

        for(String carNum : totalTimes.keySet()) {
            String totalFee = String.valueOf(getTotalFee(baseTime, baseFee, unitTime, unitFee, totalTimes.get(carNum)));
            pq.add(new String[]{carNum, totalFee});
        }

        int[] answer = new int[pq.size()];
        int index = 0;
        while(!pq.isEmpty()) {
            answer[index] = Integer.parseInt(pq.poll()[1]);
            index++;
        }

        return answer;
    }

    private int hourToMinute(String inTime, String outTime) {
        int[] t1 = Arrays.stream(inTime.split(":")).mapToInt(Integer::parseInt).toArray();
        int[] t2 = Arrays.stream(outTime.split(":")).mapToInt(Integer::parseInt).toArray();

        int min1 = t1[0] * 60 + t1[1];
        int min2 = t2[0] * 60 + t2[1];

        return min2 - min1;
    }

    private int getTotalFee(int baseTime, int baseFee, int unitTime, int unitFee, int totalTime) {
        if(totalTime <= baseTime) {
            return baseFee;
        }
        int result = 0;
        double overTime = (totalTime - baseTime) / (double) unitTime;
        overTime = Math.ceil(overTime);
        result = (int) (baseFee + overTime * unitFee);
        return result;
    }
}
