
public class A01_Escape {
	// # Escape 문자
	//  - 특수한 기능을 가진 문자
	//  - 앞에 \(역슬래시)가 바로 뒤의 문자와 합쳐져 특수한 기능을 한다
	//  - 두 문자를 합쳐서 하나의 문자로 인식한다
	
	//main()함수에 오타가 있으면 가장 최근에 실행했던 main()을 실행한다
	public static void main(String[] args) {
		
		// \n : 줄바꿈의 기능을 가진 특수 문자
		System.out.println("안\n녕\n하세요, 반갑습니다.");
		
		// \t : Tab키의 기능을 가진 특수 문자
		System.out.println("안\t녕\t하세요, 반갑습니다.\n");
		
		// ※ Tab키는 텍스트의 줄을 간단히 맞출 때 유용하다
		System.out.println("이름\t가격 \t평점");
		System.out.println("국대\t8,000\t4.5");
		System.out.println("엽떡\t9,000\t4.3");
		
		// \\ : 그냥 역슬래시를 출력하고 싶을때 사용한다
		// ex> C:\Users\Admin\My games\를 출력하고 싶은 경우
		System.out.println("C:\\Users\\Admin\\My games\\");
		
		// \" : 그냥 큰 따옴표를 출력하고 싶은 경우에 쓴다
		// \' : 그냥 작은 따옴표를 출력하고 싶은 경우에 사용한다
		System.out.println("철수는 \"피자\"를 먹고 싶다");
		System.out.println("철수는 \'피자\'를 먹고 싶다");
		System.out.println("철수는 '피자'를 먹고 싶다");
		System.out.println('\'');
	}

}
