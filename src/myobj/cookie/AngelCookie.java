package myobj.cookie;

// abstract class�� ��ӹ����� abstract method�� �ݵ�� �����ؾ� �Ѵ�
// (Ȥ�� �� Ŭ������ abstract�� ���� �� �ִ�)
public class AngelCookie extends Cookie {

	public AngelCookie() {
		super("õ��� ��Ű");
	}
	
	@Override
	public void special() {
		System.out.printf("%dĭ ������ ������ ������ϴ�.\n", level);
	}

}
