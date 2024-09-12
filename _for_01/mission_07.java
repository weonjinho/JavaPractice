package _for_01;

public class mission_07 {

	public static void main(String[] args) {
//		심화문제3:
//		3. 1부터 100까지 숫자 중 홀수는 모두 몇개인가?
		
//		<분석>
		
//		홀수의 갯수를 count 하는 정수타입 변수 cnt선언.
		
//		초기값:1
//		조건식:i<=100
//		증감식:i++
		
//		조건문 시나리오: 조건이 1개인 경우 참과 거짓으로 코드 분리.
//		이 문제에서는 참을 경우만 고려한다.
//		조건식:i%2==1
//		참일경우 실행할 코드:cnt++;
		
//		반복문에 조건이 거짓일 경우 반복문 종료, cnt결과 출력.
		
		int cnt=0;
		for(int i=0;i<=100;i++) {
			if(i%2==1) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
		
		
		
		
	}

}
