package myobj.cookie;

public class BraveCookie extends Cookie {

	public BraveCookie() {
		super("용감한 쿠키");
	}
	
	@Override
	public void special() {
		System.out.println("용감함\n");
	}
}
