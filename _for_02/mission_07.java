package _for_02;

public class mission_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		8. int[] arr = {45,23,25,64,3,24,48}
//		   짝수는 모두 몇개인가요?
		
		int[] arr = {45,23,25,64,3,24,48};
		
		//번수: 짝수의 갯수를 저장하는 변수.
		
		//초기값:0
		//조건식:i<7
		//증감식:i++
		
		int cnt = 0;
		for(int i=0;i<7;i++) {
			if(arr[i]%2==0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
