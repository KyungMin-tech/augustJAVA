package myobj.cookie;

// abstract class : �߻� �޼��带 �����ϰ� �ִ� Ŭ����
abstract public class Cookie {

	private String name;
	protected int level;
	
	// public : �ٸ� ��Ű������ ���� ����
	// final : ���߿� ���� �Ұ���
	// static : ��� ��Ű���� ������
	// int  : ����
	public final static int speed = 10;
	
	public Cookie() {
		name = "��Ű�� �̸��� ���� ��";
	}
	
	protected Cookie(String name) {
		this.name = name;
		this.level = 1;
	}
	
	public void levelUp() {
		++level;
	}
	
	// ������ �� �������̵� �ؼ� ���ǵ� ���� ������ �� �ʿ䰡 ����
	// �̷� �޼��带 abstract �޼���� �����д� 	
	// abstract �޼���� ��ӹ��� �ڽ� Ŭ�������� �������̵带 ���� ������ �����ϴ� 
	// abstract �޼��尡 ���Ե� Ŭ������ �ݵ�� abstract class���� �Ѵ�
	abstract public void special();
	
	public String getName() {
		return this.name;
	}
}







