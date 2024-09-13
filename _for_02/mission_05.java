package _for_02;

public class mission_05 {

	public static void main(String[] args) {
//		6.배열에서 배열의 값이 홀수 인 곳의 인덱스만 출력하시오.
//		  int[] arr = {45,23,25,64,3,24,48}
		
		int[] arr = {45,23,25,64,3,24,48};
//		arr 배열의 길이는 7이며, 타입은 정수타입이다.
//		arr 배열은 1차원배열이다.
		
//		반복문
//		초기값: 0
//		조건식: i<=6
//		증감식: i++
		
//		코드블록
//		arr[i]의 값의 홀수 인지를 판단.
//		조건이 참이면 i값 출력.
		for(int i=0;i<7;i++) {
			if(arr[i]%2==1) {
				System.out.println(i);
			}
		}
	}

}
