
import java.util.Random;

public class B03_random {

	public static void main(String[] args) {

		// # 자바에서 무작위 값 생성하기

		// 1. Math.random() : 0 <= x < 1인 랜덤 소수를 생성한다 (double)
		for (int i = 0; i < 10; ++i)
			System.out.println(i + "번째 랜덤 값 : " + Math.random());

		// Math.random()으로 원하는 범위의 정수 생성하기
		// (1) 원하는 숫자의 개수를 곱한다
		// (2) 원하는 숫자 중 가장 작은 수를 더한다
		// (3) int로 타입캐스팅해서 소수점 아래를 삭제한다

		// ex: 30 ~ 50 사이의 랜덤 정수 생성하기
		// (1) 0 * 21 <= x < 1 * 21 => 0 <= x < 21
		// (2) 0 + 30 <= x < 21 + 30 => 30 <= x < 51
		// (3) (int) 30.0 <= x < (int) 50.999999...
		// => 30 <= x < 51의 정수

		for (int i = 0; i < 50; ++i)
			System.out.println((int) (Math.random() * 21 + 30));

		// 2. java.util.Random 클래스
		Random ran = new Random();

		// ran.nextInt(bound) : 0 <= x < bound범위의 랜덤 정수를 생성한다
		for (int i = 0; i < 10; ++i)
			System.out.println("ran.nextInt(10) : " + ran.nextInt(10));

		// 원하는 숫자의 개수를 인자로 전달하고
		// 원하는 숫자 중 가장 작은 숫자를 더해 무작위 정수를 생성할 수 있다

		// ex: 77 ~ 88
		for (int i = 0; i < 10; ++i)
			System.out.println("77 ~ 88 : " + (ran.nextInt(12) + 77));
	}

}
