package _for_01;

public class mission_10 {

	public static void main(String[] args) {
//		심화문제6:
//		6. 범인을 찾아라. 0부터 100까지 숫자중 하나이다. 0부터 1 2 3 순서대로 합한 값을
//		누적한다. 합한 값이 44를 넘어가게 하는 숫자 한개가 범인이다.
//		범인 숫자 한 개를 출력하시오.. (단, break사용하지 않는다)
		
//		초기값: 0
//		조건식: 100까지 (i<=100)
//		증감식: i++
		
//		코드블록
//		i의 누적하면서 합산한 값을 저장할 정수변수를 sum선언.
//		조건식
//		시나리오: 조건이 1개인 경우 참과 거짓으로 코드 분리.
//		조건식: sum>44
//		코드블록
//		i를 출력.
		int sum=0;
		for(int i=0;i<100;i++) {
			sum+=i;
			if(sum>44) {
				System.out.println(i);
				System.out.println("sum: "+sum);
				i=101;
			}
		}
		
//		[중요 포인트]
//		조건에 부합한 값을 한개만 출력할때 조건식을 어떻게 지정할 것인가?
//		조건문에 특성을 생각할것!
//		"조건문은 조건식이 참일때만 실행된다."
//		i<100가 거짓인 상황 ---> i=101;
		
		
		
		
	}

}
