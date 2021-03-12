
public class A10_if {
	
	public static void main(String[] args) {
		
		// if문
		// 	- ()안의 조건이 true일 때 {}안의 내용을 실행한다
		//	- ()안의 조건이 false일 때 {}안의 내용을 무시한다
		
		// else if문
		//	- 위의 if문이 실행되지 않았다면 if문 처럼 검색한다
		//	- else if는 여러개 중첩해서 사용할 수 있다
		
		// else문 
		//	- 위의 if, else if가 모두 아니라면 {}안의 내용을 무조건 실행한다
		//	- else문이 있는 조건문은 반드시 한번은 실행된다
		
		int num = 9;
		
		if (num > 1000) {
			System.out.println("num이 1000보다 클 때만 나오는 메세지");
		} else if (num > 100) {
			System.out.println("num이 100보다 클 때만 나오는 메세지");
		} else if (num > 10) {
			System.out.println("num이 10보다 클 때만 나오는 메세지");
		} else {
			System.out.println("위의 조건을 모두 만족하지 못했습니다");
		}
		
//		char ch = '깍';
//		
//		if(ch >= 'a' && ch <= 'z') {
//			System.out.println("ch에 들어있는 값이 소문자입니다!");
//		} else if (ch >= 'A' && ch <= 'Z') {
//			System.out.println("ch에 들어있는 값이 대문자입니다!");
//		} else if (ch >= '가' && ch <= '다') {
//			System.out.println("ch에 ㄱ ~ ㄴ으로 시작하는 글자입니다");
//		}
//		
//		System.out.println("'가'의 코드 값 : " + (int)'가');
//		System.out.println("'다'의 코드 값 : " + (int)'다');
		// ctrl + / : 전체 주석
		// ctrl + shift + / : 여러주석
	
	}

}
