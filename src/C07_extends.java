
import myobj.person.*;

public class C07_extends {

	// Ŭ���� ���
	// - �̸� ����� ���� Ŭ������ �״�� �����޾Ƽ� ����ϴ� ��
	// - ������ִ� Ŭ������ �θ� Ŭ���� �Ǵ� super class��� �θ���
	// - ��ӹ޴� Ŭ������ �ڽ� Ŭ���� �Ǵ� sub class��� �θ���
	// - �ڽ� Ŭ������ �θ� Ŭ������ ���� ��� ����� �״�� �����޴´�
	// - �ڽ� Ŭ������ �������� ����� ������� �����ؼ� �� �� �ִ� (�������̵�, Override)
	// - �ڽ� Ŭ������ �θ𿡰� ���� ����� ������� �߰��ؼ� �� �� �ִ�
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 20);
		Person p2 = new Person("��ö��", 25);

		p1.introduce();
		p2.introduce();

		// Police�� introduce()�� �������� ������ �θ��� ����� �״�� ����ϰ� �ִ�
		// �θ� Ŭ������ �����Ѵ� ������ �޼��带 �״�� ����ϰ� �ִ�
		Police p3 = new Police("�����", 28);
		p3.introduce();
		
		p1.attack();
		p2.attack();
		p3.attack();
		
		p3.arrest("�谭��");
		
		Programmer p4 = new Programmer("���ڹ�", 32);
		p4.introduce();
		
		p4.attack();
		p4.programming("java");
		
		FireFighter p5 = new FireFighter("��ҹ�", 47);
		p5.introduce();
		
		p5.attack();
		p5.fireRepress("�� �ǹ�");
		

	}

}
