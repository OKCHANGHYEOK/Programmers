class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        // 1. 통분 과정
        int denom = denom1 * denom2;    // 통분한 분모값
        int numer_tmp1 = numer1 * denom / denom1; // 통분한 분자값1
        int numer_tmp2 = numer2 * denom / denom2; // 통분한 분자값2
        int numer_add = numer_tmp1 + numer_tmp2; // 통분된 분자값 끼리 더한다
        
        // 2. 분모 둘 중에 어느 쪽이 더 작은지를 구하기 위한 과정
        int min; // 분모 둘 중에 어느 쪽이 더 작은지를 구하기 위한 변수
        if(denom1 < denom2) min = denom1; // 분모1이 분모2 보다 작으면 작은쪽은 분모1
        else min = denom2; // 아니라면 작은쪽은 분모2
    

        // 3. 분모 둘 중 어느 하나가 다른 분모의 약수인지를 확인하는 과정
        boolean check = ((denom1 % denom2 == 0) || // 분모1이 분모2로 나누어 떨어지거나 
                         denom2 % denom1 == 0);    // 분모2가 분모1로 나누어 떨어지는지를 체크
        if(check) numer_add /= min; // 통분한 분자값 끼리 더한 값을 작은 쪽의 분모로 나눈다
        if(check) denom /= min; // 분모값도 작은 쪽의 분모로 나눈다
        
        // 4. 기약분수를 만들기 위한 반복문
        for(int i = 1000; i > 1; i--) {      
            if(numer_add % i == 0 && denom % i == 0) { // 분자,분모를 동시에 나누어 떨어지게 하는 i가 있다면
                                                       // 즉, 기약분수가 아니라면
                numer_add /= i; 
                denom /= i;
                // 분자문모를 i로 나눈다(기약분수로 만든다)
            }
        }
        
        answer[0] = numer_add; // 배열의 0번 인덱스에 분자를 대입한다
        answer[1] = denom;     // 배열의 1번 인덱스에 분모를 대입한다
        
        
        return answer;
    }
}