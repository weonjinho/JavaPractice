package _for_02;

public class mission_01 {

	public static void main(String[] args) {
//		1. 100부터 999까지의 숫자중에서 홀수만 출력하시오.
		
//		반복문
//		초가값: 100
//		조건식: i<=999
//		증감식: i++
		
//		코드블록
//		조건식: i가 홀수.
//		코드블록속 조건이 참일때.
//		i값 출력.
		
		
		for(int i=100;i<=999;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
	}

}
