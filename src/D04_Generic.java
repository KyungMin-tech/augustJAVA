import java.util.ArrayList;
import myobj.cookie.*;

public class D04_Generic {

	// 제네릭 (Generic)
	// - 데이터 타입을 클래스 설계할 때 미리 정하는 것이 아니라
	// 	인스턴스 생성시 프로그래머가 선택할 수 있도록 정의하는 것
	// - 인스턴스 생성시 클래스 옆에 <Type>을 통해 제네릭 타입을 결정할 수 있다

	public static void main(String[] args) {
		Minsu<Pen> minsu01 = new Minsu<>(new Pen());
		Minsu<Ruler> minsu02 = new Minsu<>(new Ruler());
		Minsu<Pencil> minsu03 = new Minsu<>(new Pencil());

		// ArrayList도 해당 리스트에서 사용할 타입을 한 가지로 결정할 수 있다
		// (정하지 않으면 Object타입 리스트도 생성된다)

		// String타입만 추가할 수있는 ArrayList
		ArrayList<String> snacks = new ArrayList<>();

		snacks.add("초코칩");
		snacks.add("초코파이");
		snacks.add("몽쉘");
		snacks.add("누네띠네");

		System.out.println(snacks);

		// Cookie만 추가할 수 있는 ArrayList
		ArrayList<Cookie> cookies = new ArrayList<>();

		cookies.add(new ZombieCookie());
		cookies.add(new BraveCookie());
		cookies.add(new AngelCookie());

		System.out.println(cookies);

		cookies.get(0).special();

		cookies.get(2).levelUp();
		cookies.get(2).levelUp();
		cookies.get(2).levelUp();
		cookies.get(2).levelUp();

		cookies.get(2).special();

		// ※ 제네릭의 <>에는 참조형 타입만 사용할 수 있다 (대문자로 시작하는 타입)만 사용할 수 있다
		// (int, byte, chort, char, ...등은 사용할 수 없다)

		// 정수만 추가할 수 있는 ArrayList를 생성해보자
		// - 기본형 타입들의 참조형 버전을 사용해야 한다(Wrapper Class)
		// - Integar : int타입의 참조형 버전
		// - Character : Char타입의 차조형 버전
		// - Double : Double
		// - SHort : Short
		// - ...
		ArrayList<Integer> scores = new ArrayList<>();

		scores.add(99);
		scores.add(88);

		// # 모든 기본타입들은 객체지향적으로 사용할 수 있는 참조형 버전이 존재한다
		int a = 10;
		Integer b = new Integer(10);

		System.out.println(a);
		System.out.println(b);

	}

}

class Ruler {
}

class Pen {
}

class Pencil {
}

// <T> : 클래스 설계 단계에서 정해지지 않은 타입을 선언
// 		T는 아무단어나 사요해도 되고, 인스턴스 생성시
// 		해당 제네릭이 사용된 모든 자리의 타입을 결정하게 된다
// 		만얃 제네릭을 정하지 않으면 해당 자리는 모두 Object타입으로 결정된다
class Minsu<T> {
	T use;

	public Minsu(T use) {
		this.use = use;
		System.out.println("민수는" + use + "를 사용중입니다.");

	}
}