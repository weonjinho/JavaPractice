package _for_02;

public class mission_02 {

	public static void main(String[] args) {
//		2. 1부터 100까지 숫자중에서 홀수의 총합을 구하시오.
		
//		초기값: 1
//		조건식: i<=100
//		증감식: i++
		
//		코드블록
//		조건식: 
//		시나리오1: 조건이 1개인 경우 참과 거짓으로 코드 분리.
//		조건식:
//		i가 홀수 인지 판단. ---> i%2==1;
//		sum+i한 값을 sum변수에 대입.
//		반복문의 조건식이 거짓일때 상황 i=101;
		int sum = 0;
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		System.out.println("홀수의 총합: "+sum);
		
		
	}

}
