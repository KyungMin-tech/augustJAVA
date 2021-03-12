package myobj.cookie;

public class PirateCookie extends Cookie {

	public PirateCookie() {
		super("해적 쿠키");
	}
	
	@Override
	public void special() {
		System.out.printf("%d번 부활할 수 있습니다.\n", level);
	}
	
}
