package _for_01;

public class mission_14 {

	public static void main(String[] args) {
//		심화문제10:
//		987654321이라는 숫자가 있다.. 변수2개와 for문 한개로
//		모든 자릿수를 더한 합을 구하시오.. 9+8+7+6+5+4+3+2+1 = 합
//		합만 출력하면 됩니다.
//		main메서드 안의 라인수를 최소화 하여서 작성하세요. 최소 라인수로 작성하라는 의미입니다. 
		
//		[포인트]
//		1. 변수2개, for문1개 만 사용.
//		2. 합만 출력한다.
//		3. 라인수를 최소화한다.
		
//		[시도]
//		"987654321"는 숫자이다, 타입은 int입니다.
		
//		System.out.println((a/100000000));
//		System.out.println((a/10000000)%10);
//		System.out.println((a/1000000)%10);
//		System.out.println((a/100000)%10);
//		System.out.println((a/10000)%10);
//		System.out.println((a/1000)%10);
//		System.out.println((a/100)%10);
//		System.out.println((a/10)%10);
//		System.out.println((a/1)%10);
//		int a = 987654321;
//		int sum=0;
//		for(int i=100000000;i>=1;i/=10) {
//			if(i==100000000) {
////				System.out.println((a/100000000));
//				sum+=(a/i)%10;
//			}else {
////				System.out.println((a/i)%10);
//				sum+=(a/i)%10;
//			}
//		}
//		System.out.println(sum);
//		
		
		
//		[결과]
		int sum=0;
		for(int a = 987654321;a>=1;a/=10) {
			sum+=(a)%10;
		}
		System.out.println("총합: "+sum);
		
		
//		[주의 포인트]
//		"9+8+7+6+5+4+3+2+1" 한 결과랑 "1+2+3+4+5+6+7+8+9"한 결과는 같다!
//		그러면 "987654321"라는 숫자의 마지막 숫자를 분리한 뒤 마지막 숫자를 제거하면 될것같다.
//		"%"연산자를 사용하면 마지막 숫자 부터 분리할 수 있고,
//		"/"연산자로 마지막 숫자를 제거할수 있다.
//		for문는 초기값 --> 조건식 --> 코드블록 --> 증감식 순서로 실행된다.
//		그레서 "/"연산자를 증감식에 사용하면 될것같다.
//		초기값: 987654321;
//		조건식: a>=1;
//		증감식: a/10
//		코드블록
//		a%10한 결과를 출력.
//		이러면 1~9의 숫자가 나온다.
//		합은 같기에 정수 타입에 변수sum을 하나 선언해서 sum에다 (a%10)한 값을 누적하면 총합이 나온다.
		
//		[테스트 코드]
//		int b = 987654321;
//		System.out.println(b%10);
//		System.out.println(b/10);
		
		
		
		
		
		
		
		
		
		
	}

}
