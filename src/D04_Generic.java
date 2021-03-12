import java.util.ArrayList;
import myobj.cookie.*;

public class D04_Generic {

	// ���׸� (Generic)
	// - ������ Ÿ���� Ŭ���� ������ �� �̸� ���ϴ� ���� �ƴ϶�
	// 	�ν��Ͻ� ������ ���α׷��Ӱ� ������ �� �ֵ��� �����ϴ� ��
	// - �ν��Ͻ� ������ Ŭ���� ���� <Type>�� ���� ���׸� Ÿ���� ������ �� �ִ�

	public static void main(String[] args) {
		Minsu<Pen> minsu01 = new Minsu<>(new Pen());
		Minsu<Ruler> minsu02 = new Minsu<>(new Ruler());
		Minsu<Pencil> minsu03 = new Minsu<>(new Pencil());

		// ArrayList�� �ش� ����Ʈ���� ����� Ÿ���� �� ������ ������ �� �ִ�
		// (������ ������ ObjectŸ�� ����Ʈ�� �����ȴ�)

		// StringŸ�Ը� �߰��� ���ִ� ArrayList
		ArrayList<String> snacks = new ArrayList<>();

		snacks.add("����Ĩ");
		snacks.add("��������");
		snacks.add("����");
		snacks.add("���׶��");

		System.out.println(snacks);

		// Cookie�� �߰��� �� �ִ� ArrayList
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

		// �� ���׸��� <>���� ������ Ÿ�Ը� ����� �� �ִ� (�빮�ڷ� �����ϴ� Ÿ��)�� ����� �� �ִ�
		// (int, byte, chort, char, ...���� ����� �� ����)

		// ������ �߰��� �� �ִ� ArrayList�� �����غ���
		// - �⺻�� Ÿ�Ե��� ������ ������ ����ؾ� �Ѵ�(Wrapper Class)
		// - Integar : intŸ���� ������ ����
		// - Character : CharŸ���� ������ ����
		// - Double : Double
		// - SHort : Short
		// - ...
		ArrayList<Integer> scores = new ArrayList<>();

		scores.add(99);
		scores.add(88);

		// # ��� �⺻Ÿ�Ե��� ��ü���������� ����� �� �ִ� ������ ������ �����Ѵ�
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

// <T> : Ŭ���� ���� �ܰ迡�� �������� ���� Ÿ���� ����
// 		T�� �ƹ��ܾ ����ص� �ǰ�, �ν��Ͻ� ������
// 		�ش� ���׸��� ���� ��� �ڸ��� Ÿ���� �����ϰ� �ȴ�
// 		���� ���׸��� ������ ������ �ش� �ڸ��� ��� ObjectŸ������ �����ȴ�
class Minsu<T> {
	T use;

	public Minsu(T use) {
		this.use = use;
		System.out.println("�μ���" + use + "�� ������Դϴ�.");

	}
}