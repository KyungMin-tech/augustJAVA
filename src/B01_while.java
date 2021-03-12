import java.util.Scanner;

public class B01_while {
	
	public static void main(String[] args) {
		
		// while
		//	- for문과 사용법이 약간 다른 반복문
		//	- 초기값과 증가값의 위치가 정해져 있지 않다
		//	- 증가값의 위치에 따라 반복문의 결과가 달라질 수 있다
		
		
		// # 가장 기본적인 형태의 while문
		int i =0;
		
		while (i < 10) { /* 괄호 안의 조건이 참일때 계속 실행, ()안에 ++i는 잘 쓰지 않는다 */ 
			System.out.println("Hello while! " + i);
			++i;
		}
		
		
		// # for문도 while과 똑같이 쓸 수 있지만 보기에 지저분하다
		i = 0;
		for (; i++ < 10; ) {
			System.out.println("Hello for! " + i);
		}
		
		
		// # while문과 continue를 사용시 무한루프에 빠지지 않도록 
		//	주의 해야한다	
		
		// ex> continue를 이용해 짝수만 출력해보고 싶은 경우
		i = 0;
		while (i++ < 100) { /* 증가 위치가 달라지면 컨틴뉴가 무한루프 돌수도 있다, 컨틴뉴 영향을 받지 않는 ()로 */
			if (i % 2 == 1)
				continue;
			
			System.out.println("짝수 : " + i);
			// ++i; // 이곳에 증가값이 위치하면
					// continue때문에 무한루프에 빠지게 된다
		}
		
		// # while문의 무한루프
		i = 0;
		while(true) {
			System.out.println(i += 5000);
			
			if (i == 50000) // 무한루프일때 빠져나올게 필요
				break;
		}
		
		// # while문의 조건에 대입연산자 이용하기
		Scanner sc = new Scanner(System.in);
		String word = null;
		
//		System.out.println("단어를 입력해주세요! ");
//		while(!(word = sc.nextLine()).equals("exit")) {
//			System.out.println("입력한 단어 : " + word);
//		}
			
//		while (true) {
//			word = sc.nextLine();
//			System.out.println("단어를 입력해주세요! ");
//			
//			if (word.equals("exit"))
//				break;
//			else
//				System.out.println("입력한 단어 : " + word);			
			
		
		// while문으로 사용하게끔 설계된 클래스/ 메서드들이 있다
		//	- hasNext, next, hasNextElement.. 등의
		//	   이름을 가진 다음 값을 찾는 메서드를 사용한다
		//	- 다음값이 있으면 다음 값을 하나씩 꺼내는 방식으로 사용한다
		//	- 대표적인 예로는 스캐너가 있다
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("숫자를 여러개 입력해보세요! ");
		
		
		// hasNextInt() 
		//	- 대기열(버퍼)의 다음값이 숫자이면 true
		//	- 대기열에 아무것도 존재하지 않으면 입력을 기다린다
		while (sc2.hasNextInt()) {
			System.out.println("다음 숫자가 있으면 nextInt()로 하나씩 꺼낸다" + sc2.nextInt());
		}
		System.out.println("반복문을 탈출했습니다!");
		System.out.println("남아있는 대기열 모두 출력 : " + sc2.nextLine());
		
	}
	

}
