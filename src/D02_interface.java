
public class D02_interface {

	// 인터페이스
	// - 내부에 선언한 모든 변수는 public final static변수가 된다
	// - 내부에 정의한 모든 메서드는 public abstract 메서드가 된다
	// - abstract class와 비슷한 역할을 하고, 여러개 구현할 수 있다
	// (JAVA에서 클래스 상속은 여러개 받을 수 없다는 단점을 보완한다)

	public static void main(String[] args) {

		// 철수는 그냥철수고 좀비쿠키는 쿠키지만
		// 둘의 공통저인 Runner클래스로 업캐스팅 될 수 있다
		Chulsu chulsu = new Chulsu();
		myobj.cookie.Cookie cookie = new ZombieCookie();

		// 인터페이스를 통해 완전히 다른 객체도 공통의 성질로 묶일 수 있다
		Runner runner01 = (Runner) chulsu;
		Runner runner02 = (Runner) cookie;

		runner01.run();
		runner02.run();
		
		cookie.levelUp();
		cookie.levelUp();
		cookie.levelUp();
		cookie.levelUp();

		// Runner타입이 되었던 좀비맛 쿠키를 다시 Cookie타입으로 타입캐스팅하여 사용
		((myobj.cookie.Cookie) runner02).special();

	}

}

// interface 는 abstract class를 여러개 구현하고 싶을 때 사용한다
// (상속받은 클래스에 여러가지 특성을 부여하기 위해 사용한다)
interface Swimmer {
	// interface 내부에 선언된 모든 메서드는 public abstrcat가 된다 (생략 가능)
	public abstract void swim();
}

interface Runner {
	void run();
}

interface Fighter {
	void fight();
}

interface Jumper {
	void jump();
}

// abstract class로는 철수가 수영도 하고 달리기도 하고 격투기도 하게 만들 수가 없다
// 이런 단점을 보완하기 ㅇ위해 인터페이스를 이용한다

// interface를 상속받을때는 extends대신에 implements를 이용한다
class Chulsu implements Swimmer, Runner, Fighter {
	@Override
	public void swim() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		System.out.println("철수는 철수의 속도로 달린다.");

	}

}

// 클래스 상속과 인터페이스 구현을 모두 사용할 때는 extends를 먼저 사용하고
// 그 후 implements를 나열한다
class ZombieCookie extends myobj.cookie.Cookie implements Runner, Jumper {

	@Override
	public void jump() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		System.out.println("좀비맛 쿠키는 " + speed + "로 달립니다.");
	}

	@Override
	public void special() {
		System.out.printf("좀비맛 쿠키는" + level + " 번 부활 할 수 있습니다. ");

	}

}
