package _for_02;

public class mission_08 {

	public static void main(String[] args) {
//		변수, 연산자, 조건문, 반복문을 생각하면 해결 할 수 있습니다. 
//		9.  String test = "abcdeabce";
//	    for(int i=0; i < 9; i ++){
//		char aaa = test.charAt(i);
//		sysout(aaa);
//	    }
//	    위 코드를 분석하여 a문자열에 a가 몇개 있는지 구하는 프로그램을 작성하세요.
		String test = "abcdeabce";
		int cnt=0;
		for(int i=0;i<test.length();i++) {
			char text = test.charAt(i);
			if(text=='a') {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
