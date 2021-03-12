

public class B06_function {
	
	// 변수 (variable)
	//	- 값을 미리 저장해두고 원할때마다 꺼내 쓰는 것
	
	// 함수 (function)
	//	- 기능을 미리 정의해 두고 나중에 원할때마다 가져가 사용하는 것
	//	- 변수와 여러 명령어들의 이름을 붙여 놓고 그것을 하나의 기능으로 정의 하는 것
	//	- 나중에 재사용하게 될 기능을 미리 만들어둠으로써 작업의 효율을 높일 수 있다
	
	// # 함수 오버로드	
	//	- JAVA에서는 똑같은 이름의 함수를 여러개 사용할 수 있다
	//	- 매개변수의 개수 혹은 타입이 다르면 구분이 가능하기 때문에
	//	- 같은 이름을 사용해도 문제가 발생하지 않는다
	public static void printRabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >♡");	
	}
	
	// 함수에서 인자를 전달받는 변수를 매개변수라고 부른다
	public static void printRabbit(String message) {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >♡");	
		System.out.println("Rabbit : " + message);
	}
	public static void printRabbit(String message, String item) {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.printf("(  >%s\n", item);	
		System.out.println("Rabbit : " + message);		
	}
	
	// 이미 매개변수 1개에 String을 사용하는 오버로딩이 존재하므로 사용할 수 없다
//	public static void printRabbit(String item) {
//		System.out.println(" /)/)");
//		System.out.println("(  ..)");
//		System.out.printf("(  >%s\n", item);			
//	}
	
	// 연습문제 : 올해와 태어난 해를 매개변수로 넘기면
	//			한국식 나이를 출력해주는 함수를 만들어 보세요
	public static void printKoreanAge (int thisYear, int birthYear) {
		System.out.printf("한국식 나이 : %d세\n", thisYear - birthYear + 1);			
	}
	
	// 연습문제2 : 숫자 하나를 매개변수를 전달하면 
	//			해당 숫자의 해에 2월이 하루 더 있는지 
	//			판별해주는 함수를 만들고 실행 해보세요
	public static void printLeapYear (int leapYear) {
		if (leapYear % 400 == 0 || 
				(leapYear % 4 == 0 && leapYear % 100 != 0)) {
			System.out.printf("%d년은 윤년입니다\n", leapYear);			
		} else {
			System.out.printf("%d년은 윤년이 아닙니다\n", leapYear);			
		}
	}
	
	public static void main(String[] args) {
		String str = "I'm your father";
		
		// 함수를 사용하기 위해함수에 전달하는 값을 인자라고 부른다
		printRabbit(str);
		printRabbit("I like 브로콜리", "♧");
		
		// built-in function : 언어를 만든 사람들이 만들어 놓은 함수
		// System.out.println("Hello, world!");
		
		printKoreanAge(2020,1993);
		printKoreanAge(2021,1990);
		printKoreanAge(2030,1980);
		
		printLeapYear(2020);
		printLeapYear(2021);		
		
	}

}
