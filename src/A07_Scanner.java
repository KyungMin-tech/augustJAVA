// Scanner를 사용할 때는 import가 필요하다
import java.util.Scanner;

// JAVA에서 다른 패키지의 클래스를 사용하기 위해서는 import가 필요하다
//	- import 패키지명. 클래스명;
// import quiz.A05_information;

// JAVA에서 다른 패키지의 클래스를 사용하기 위해서는 import가 필요하다
//	- import 패키지명.클래스명;
// import quiz.A05_information;

public class A07_Scanner {
	
	public static void main(String[] args) {		
			
		// A05_printQuiz.main(null);
		
		// Scanner 
		//	- 외부에서 프로그램으로 입력을 받을때 사용하는 클래스
		
		// 1. 사용할 스캐너를 생성 
		//	 (콘솔로 입력을 받을 때는 System.in 생성자 매개변수로 전달한다)
		Scanner sc = new Scanner(System.in);
		
		// 2. 사용자에게 안내문을 출력해준다
		System.out.print("input int type only > ");
		// System.out.print("input double type only > ");
		
		// 3. 원하는 타입의 입력을 기다린다 
		// (sc.nextInt()에서 사용자의 입력을 기다리기 위해 프로그램을 멈춘다)
		int num = sc. nextInt();
		// double db1 = sc.nextDouble();
		// float flt = sc.nextFloat();
		// short srt = sc.nextShort();
		// String str = sc.nextLine(); // 줄 전체를 문자열로 읽어들인다		
		
		
		// 4. 받은 값을 마음대로 사용한다
		System.out.println("입력받은 값은 ' " + num +" '입니다.");
		System.out.println("입력받은 값의 일의 자리 숫자는  " + num % 10 +"입니다.");
		System.out.println("입력받은 값의 십의 자리 숫자는 " + num %100 +"입니다.");
	}

}
