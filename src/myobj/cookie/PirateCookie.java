package myobj.cookie;

public class PirateCookie extends Cookie {

	public PirateCookie() {
		super("���� ��Ű");
	}
	
	@Override
	public void special() {
		System.out.printf("%d�� ��Ȱ�� �� �ֽ��ϴ�.\n", level);
	}
	
}
