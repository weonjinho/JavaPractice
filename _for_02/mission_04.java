package _for_02;

public class mission_04 {

	public static void main(String[] args) {
//		4. 배열에서 배열의 값이 짝수인 것만 출력하시오.
//		  int[] arr = {45,23,25,64,3,24,48}
		
//		arr 배열의 길이는 7이며, 타입은 정수타입니다.
//		arr 배열의 index는 0~6까지 있다.
		
//		반복문
//		초기값: 0
//		조건식: i<=6
//		증감식: i++
		
//		코드블록
//		조건식:시나리오:조건이 1개인 경우 참과 거짓으로 코드 분리.
//		조건이 참인 조건: arr[1]%2==0;
//		조건이 참일 경우 실행문: arr[i]출력.
		
		int[] arr = {45,23,25,64,3,24,48};
		for(int i=0;i<=6;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
