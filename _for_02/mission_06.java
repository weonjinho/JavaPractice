package _for_02;

public class mission_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		7. int[] arr = {45,23,25,64,3,24,48}
//		   배열의 값을 모두 더한 총합을 구하시오.
		int[] arr = {45,23,25,64,3,24,48};
		
		//선언문(변수와 자료형) 변수명:arr, 자료형은 1차원배열
		//변수: 값을 저장하는 기억공간.
		//배열의 인덱스 번호는0~6;
		//배열의 길이는 7.
		
//		배열을 순회하며,값의 총합을 구해야한다.
//		반복문을 시용해서 순회.
//		반복문
//		초기값:0
//		조건식:i<7
//		증감식:i++
		
		int sum = 0;
		for(int i=0;i<7;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
