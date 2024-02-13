import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
		int[] answer;
    
        // progresses 배열을 list로 변환
		List<Integer> list = Arrays.asList(Arrays.stream(progresses).boxed().toArray(Integer[]::new));
		
		// 현재 진행중인 작업상황을 LinkedList 로 선언
        LinkedList<Integer> desk = new LinkedList<>(new ArrayList<>(list));
        
		// 배포된 날짜를 저장할 배열
        int[] dayList = new int[progresses.length];
        
		// 현재 진행된 날짜수를 담당할 변수
        int day = 0;
        
        // 인덱스를 보정할 변수
        int count = 0;
        
		// 작업 데스크가 비어있지 않은 동안(모든 작업이 끝날때까지) 반복
        while (!desk.isEmpty()) {
			for(int i = 0; i < desk.size(); i++) {  // 각 프로그램의 진척도에 각 프로그램의 작업 속도를 더한다
				int progress = desk.get(i);
				progress += speeds[i + count];
				desk.set(i, progress);
			}
			day++; // 각 프로그램의 작업이 완료되었으므로 날짜수 1증가
			while (desk.size() != 0 && desk.get(0) >= 100) { // 현재 맨 앞에 있는 작업부터 확인하면서 작업이 완료되었다면
				desk.poll();       // 작업을 종료하고 작업 데스크에서 제거한다
				dayList[count] = day;  // 배포 리스트에 현재 날짜수를 추가한다
				count++;
			}
		}
		
        // 각 배포일별로 배포된 프로그램의 개수를 저장할 Map
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
		
        // dayList에 저장된 배포일을 기준으로 이전에 저장된 동일한 배포일의 key값이 없다면 key와 value를 새로 저장
        // 이전에 저장된 동일한 배포일의 key값이 있다면 해당 key의 value를 가져온 다음 1증가 시키고 해당 키에 다시 저장
		for(int i = 0; i < dayList.length; i++) {
			if(!hm.keySet().contains(dayList[i])) hm.put(dayList[i], 1);
			else hm.put(dayList[i], hm.get(dayList[i]) + 1);
		}
		
		answer = new int[hm.size()];
		
		int index = 0;
		for(Integer dist : hm.keySet()) {
			answer[index] = hm.get(dist);
			index++;
		}
		
		return answer;
	}
}