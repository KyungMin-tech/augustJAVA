
public class A02_variable {

	// 변수
	// - 데이터를 미리 담아놓을 수 있는 공간
	// - 값을 꺼내서 사용할 수도 있고, 값을 바꿀 수도 있다

	public static void main(String[] args) {

		// a라는 변수에 데이터 10을 담아놓고 나중에 사용하겠다
		int a = 10;

		// 일반인들이 알고있는 =의 의미 : 왼쪽값과 오른쪽 값이 같다
		// 프로그래머들에게 =의 의미 : 왼쪽의 변수에 오른쪽의 값을 넣어라 (대입)

		System.out.println(a);
		System.out.println(a + a + a);
		System.out.println(a * 99);

		// 데이터를 담을 수 있는 공간인 b를 만들어 놓고 나중에 사용하겠다
		int b;

		// 만들어저 있는 공간에 데이터를 담음
		b = 99;

		// 문자열 + 정수의 결과는 문자열과 정수를 이어붙인 문자열이 된다
		System.out.println("변수 b에 들어 있는 값 : " + b);
		System.out.println("ABC" + 1234);
		System.out.println("10" + 10);
		System.out.println("192." + "168." + "0.8");

		// JAVA에서 변수는 반드시 선언한 뒤에 사용해야 한다

		// # 변수의 선언
		// - 변수타입 변수이름;
		// - int는 정수값만 들어갈 수 있는 변수 타입이다

		// '정수 타입의 값만 들어갈 수 있는 변수 number를 앞으로 사용하겠다'
		int number;

		// # 변수를 선언하는 여러가지 방법

		// 1. 기본적인 선언
		int num1;

		// 2. 같은 타입을 여러개 선언
		int x, y, z;

		// 값을 한번도 대입하지 않은 변수는 사용할 수 없다
		// 변수를 선언한 뒤 맨 처음 값을 대입하는 것을 '초기화(initialize)'라고 부른다

		x = 5;
		y = 7;
		z = 10;
		
		System.out.println("x : " + x + "\ny : " + y + "\nz : " + z);

		// 3. 선언과 동시에 값을 대입
		int cash = 5000;

		// 4. 여러개 선언과 동시에 대입
		int width = 50, height = 100;

		System.out.println("너비 :" + width + "cm, 높이" + height + "cm");
		System.out.println("현재 가진 돈 :" + cash + "$");

	}

}
