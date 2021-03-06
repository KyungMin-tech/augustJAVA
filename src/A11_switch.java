import java.util.Scanner;

public class A11_switch {

	public static void main(String[] args) {

		// switch-case문
		// - ()안의 연산 결과에 따라 해당하는 case를 실행한다
		// - if문으로 완벽하게 대체할 수 있다

		Scanner sc = new Scanner(System.in);

		System.out.print("1. 실행\n2. 종료\n3. 복사\n4. 저장\n> ");
		int select = sc.nextInt();

		// ()안의 값에 따라 해당하는 case문을 실행한다.
		// ※ break를 사용하지 않으면 break를 만날 때 까지 밑에 있는 모든 case를 실행한다.
		switch (select) {
		case 1:
			System.out.println("사용자가 실행을 선택했습니다.");
			// break;
		case 2:
			System.out.println("사용자가 종료를 선택했습니다.");
			// break;
		case 3:
			System.out.println("사용자가 복사를 선택했습니다.");
			break;
		case 4:
			System.out.println("사용자가 저장을 선택했습니다.");
			break;
		default:
			// 해당하는 case가 존재하지 않는 경우 default를 실행한다
			System.out.println("잘못 선택하셨습니다.");
			break;
		}

		// switch-case문에는 다양한 타입을 사용할 수 있다
		String cmd = new String("bye");

//		if (cmd.equals("hello"))
//			System.out.println("안녕하세요~");
//		else if (cmd.equals("bye"))
//			System.out.println("안녕히가세요~");

		// switch는 알아서 해당 객체의 equals를 호출해 비교한다
		switch (cmd) {
		case "hello":
			System.out.println("안녕하세요~");
			break;
		case "bye":
			System.out.println("안녕히가세요~");
			break;
		}
	}

}



