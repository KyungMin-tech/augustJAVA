
public class D02_interface {

	// �������̽�
	// - ���ο� ������ ��� ������ public final static������ �ȴ�
	// - ���ο� ������ ��� �޼���� public abstract �޼��尡 �ȴ�
	// - abstract class�� ����� ������ �ϰ�, ������ ������ �� �ִ�
	// (JAVA���� Ŭ���� ����� ������ ���� �� ���ٴ� ������ �����Ѵ�)

	public static void main(String[] args) {

		// ö���� �׳�ö���� ������Ű�� ��Ű����
		// ���� �������� RunnerŬ������ ��ĳ���� �� �� �ִ�
		Chulsu chulsu = new Chulsu();
		myobj.cookie.Cookie cookie = new ZombieCookie();

		// �������̽��� ���� ������ �ٸ� ��ü�� ������ ������ ���� �� �ִ�
		Runner runner01 = (Runner) chulsu;
		Runner runner02 = (Runner) cookie;

		runner01.run();
		runner02.run();
		
		cookie.levelUp();
		cookie.levelUp();
		cookie.levelUp();
		cookie.levelUp();

		// RunnerŸ���� �Ǿ��� ����� ��Ű�� �ٽ� CookieŸ������ Ÿ��ĳ�����Ͽ� ���
		((myobj.cookie.Cookie) runner02).special();

	}

}

// interface �� abstract class�� ������ �����ϰ� ���� �� ����Ѵ�
// (��ӹ��� Ŭ������ �������� Ư���� �ο��ϱ� ���� ����Ѵ�)
interface Swimmer {
	// interface ���ο� ����� ��� �޼���� public abstrcat�� �ȴ� (���� ����)
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

// abstract class�δ� ö���� ������ �ϰ� �޸��⵵ �ϰ� �����⵵ �ϰ� ���� ���� ����
// �̷� ������ �����ϱ� ������ �������̽��� �̿��Ѵ�

// interface�� ��ӹ������� extends��ſ� implements�� �̿��Ѵ�
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
		System.out.println("ö���� ö���� �ӵ��� �޸���.");

	}

}

// Ŭ���� ��Ӱ� �������̽� ������ ��� ����� ���� extends�� ���� ����ϰ�
// �� �� implements�� �����Ѵ�
class ZombieCookie extends myobj.cookie.Cookie implements Runner, Jumper {

	@Override
	public void jump() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		System.out.println("����� ��Ű�� " + speed + "�� �޸��ϴ�.");
	}

	@Override
	public void special() {
		System.out.printf("����� ��Ű��" + level + " �� ��Ȱ �� �� �ֽ��ϴ�. ");

	}

}
