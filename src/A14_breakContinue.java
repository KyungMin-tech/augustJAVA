import java.util.Scanner;

public class A14_breakContinue {
	
	public static void main(String[] args) {
		
		// break, continue
		//	- 반복문 내부에서만 사용할 수 있다 (break는 switch에서도 쓴다)
		//	- break : 속해 있는 반복문을 바로 탈출한다
		//	- continue : 속해 있는 반목문을 1회 스킵한다 (다음번 반복으로 넘어간다)
		
		for (int i = 0; i < 10; ++i) {
			// i값이 짝수 일 때 continue;
			if (i % 2 == 0)
				continue;
			
			System.out.print(i + " ");
			
			if (i == 7)
				break;
		}
		System.out.println();
		
		
		// # for 문의 무한루프
		//	- 조건을 적지 않으면 true로 간주한다
		Scanner sc = new Scanner(System.in);
		int num = 0;
		for (;;) {
			System.out.print("77을 입력해야 탈출할 수 있습니다> ");
			num = sc.nextInt();
			
			if (num == 77)
				break;
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
