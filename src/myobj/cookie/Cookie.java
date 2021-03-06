package myobj.cookie;

// abstract class : 추상 메서드를 포함하고 있는 클래스
abstract public class Cookie {

	private String name;
	protected int level;
	
	// public : 다른 패키지에서 접근 가능
	// final : 나중에 수정 불가능
	// static : 모든 쿠키에서 동일함
	// int  : 정수
	public final static int speed = 10;
	
	public Cookie() {
		name = "쿠키의 이름을 적는 곳";
	}
	
	protected Cookie(String name) {
		this.name = name;
		this.level = 1;
	}
	
	public void levelUp() {
		++level;
	}
	
	// 어차피 다 오버라이드 해서 쓸건데 굳이 구현을 할 필요가 없다
	// 이런 메서드를 abstract 메서드로 만들어둔다 	
	// abstract 메서드는 상속받은 자식 클래스에서 오버라이드를 통해 구현이 가능하다 
	// abstract 메서드가 포함된 클래스는 반드시 abstract class여야 한다
	abstract public void special();
	
	public String getName() {
		return this.name;
	}
}








