
public class B07_function2 {
	
	// 함수의 리턴(return)
	//	- 함수 실행의 결과를 함수를 호출한 곳에 돌려주는 것 
	//	- 함수 이름 앞에 리턴 결과의 타입을 적어야 한다
	//	- 리턴 타입이 void인 함수는 리턴을  하지 않는다는 뜻이다
	
	// ※ 한국식 나이를 화면에 출력해주는 함수 (리턴값이 없음)
	public static void printKoreanAge (int thisYear, int birthYear) {
		System.out.printf("한국식 나이 : %d세\n", thisYear - birthYear + 1);			
	}
	
	// ※ 이 함수를 호출하면 한국 나이를 계산한뒤 돌려주는 함수 (리턴타입 int)
	public static int getKoreanAge (int thisYear, int birthYear) {
		int age = thisYear - birthYear + 1;
		
		// return
		//	- 리턴을 만나면 함수를 즉시 종료한다.
		//	- 함수를 종료하면서 이 함수를 호출한 곳에 원하느 값을 반환한다.
		//	- 변환할 값의 타입이 함수명 앞에 적은 리턴 타입과 반드시 일치해야한다.
		return age;
	}
	
	// 연습문제1. 알파벳을 전달하면 대문자는 소문자로 소문자는 대문자로 변환하여
	//			리턴해준는 함수를 만들고 결과를 테스트 해보세요
	public static String chageCase (String text) {
		// 결과를 저장할 문자열을 미리 생성해두고 변환값을 누적 시켜가는 방식
		String result = "";
		
		for (int i = 0; i < text.length(); ++i) {
			
			char ch = text.charAt(i);
			
			if (ch >= 'a' && ch <= 'z')
				result += (char)(ch - 32);
			else if (ch >= 'A' && ch <= 'Z')
				result += (char)(ch + 32);
			else
				result += ch;
		}
		return result;

	}
	
	// 연습문제2. 전달한 숫자가 3의 배수이면 true를 변환, 아닌면 false를 변환하는 함수
	public static boolean checkDivBy3 (int num) {
		// 리턴타입이 boolean인 함수는 베교연산의 결과를 리턴하면 편하다
		return num % 3 == 0;
	}
	
	// 연습문제3. 전달한 문자가 알파벳이면 true를 변환, 아니면 false를 변환하는 함수
	public static boolean checkAlpha (char ch) {		
		return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
	}
	
	// 연습문제4. 숫자를 한 개 전달하면 "짝수입니다" 또는 "홀수입니다"를 변환하는 함수
	public static String checkEvenOdd(int num) {
		return num % 2 == 0 ? "짝수입니다" : "홀수입니다";
	}
	
	
	
	public static void main(String[] args) {		
		// 리턴 타입이 있는 함수는 값을 받아서 사용해야 한다
		int age = getKoreanAge(2020, 2010);
		
		// 리턴 타입이 void인 함수는 아무런 값을 변환하지 않는다
		// age = printKoreanAge(2020, 2020);
		
		System.out.println("함수 실행 결과 : "  + age);
	}

}
