package _for_02;

public class mission_10 {

	public static void main(String[] args) {
//		10. 범인 숫자 구하기.. 
//		  범인은 100부터 999까지 숫자중에 여러명이다. 
//		  범인의 특징은 숫자의 각자릿수를 더한 값이 짝수이다.  범인의 숫자를 모두 찾으시오.
		
//		초기값:100
//		조건식:i<=999
//		증감식:i++
		
		int add=0;
		for(int i=100;i<=999;i++) {
			add=(i/100)+((i/10)%10)+(i%10);
			if(add%2==0) {
				System.out.println(i);
			}
		}
		
		
	}

}
