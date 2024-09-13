package _for_02;

public class mission_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		10.  int[] arr = {45,23,25,64,3,24,48} 
//		   배열에서 가장 큰 값과 가장 큰 값이 있는 인덱스를 출력하시오.
		
//		배열속 최대값을 구하는 문제이다.
		int[] arr = {45,23,25,64,3,24,48};
		int max = 0;
		int min = 1000;
		//배열 길이는 7.
		//반복문
		//초기값: 0
		//조건식: i<7
		//증감식: i++
		
		for(int i=0;i<7;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		
		
//		[주의]
		//1.배열속 최대값 찾는 법.
//		작은값으로 max변수를 초기화 한다,
//		만약 max<arr[i]면, max변수속 값을 arr[i]값으로 갱신한다. 
		
		//2.배열속 최소값 찾는 법.
//		큰 숫자를 min변수에 초기화 한다,
//		만약 min>arr[i]면, min변수속 값을 arr[i]값으로 갱신한다.
		
	}

}
