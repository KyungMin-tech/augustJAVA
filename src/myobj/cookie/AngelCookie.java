package myobj.cookie;

// abstract class를 상속받으면 abstract method를 반드시 구현해야 한다
// (혹은 이 클래스도 abstract로 만들 수 있다)
public class AngelCookie extends Cookie {

	public AngelCookie() {
		super("천사맛 쿠키");
	}
	
	@Override
	public void special() {
		System.out.printf("%d칸 영역의 젤리를 끌어당깁니다.\n", level);
	}

}
