package _for_01;

public class mission_06 {

	public static void main(String[] args) {
//		심화문제2:
//		1부터 100까지 숫자 중 홀수는 홀수끼리 더한 값을 짝수는 짝수끼리 더한 값을 각각출력하시오.
		
//		<분석>
		
//		정수타입의 변수 sumOdd, sumEven 선언.
		
//		초기값: 1
//		조건식: 100까지(i<=100)		[주의] "...까지"는 "="도 포함되 있다.
//		증감식: i를 1씩 증가.
		
//		코드블록
//		조건문
//		조건문 시나리오: 조건이 여러개 있고, 이중 하나를 선택하는 경우.
//		i가 홀수일때 실행할 코드블록: sumOdd+=i;
//		i가 짝수일때 실행할 코드블록: sumEven+=i;
		
//		sumOdd, sumEven 각각 출력.
		
		int sumOdd=0;
		int sumEven=0;
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				sumOdd+=i;
			}else if(i%2==0) {
				sumEven+=i;
			}
		}
		System.out.println(sumOdd);
		System.out.println(sumEven);
	}

}
