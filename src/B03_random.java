
import java.util.Random;

public class B03_random {

	public static void main(String[] args) {

		// # �ڹٿ��� ������ �� �����ϱ�

		// 1. Math.random() : 0 <= x < 1�� ���� �Ҽ��� �����Ѵ� (double)
		for (int i = 0; i < 10; ++i)
			System.out.println(i + "��° ���� �� : " + Math.random());

		// Math.random()���� ���ϴ� ������ ���� �����ϱ�
		// (1) ���ϴ� ������ ������ ���Ѵ�
		// (2) ���ϴ� ���� �� ���� ���� ���� ���Ѵ�
		// (3) int�� Ÿ��ĳ�����ؼ� �Ҽ��� �Ʒ��� �����Ѵ�

		// ex: 30 ~ 50 ������ ���� ���� �����ϱ�
		// (1) 0 * 21 <= x < 1 * 21 => 0 <= x < 21
		// (2) 0 + 30 <= x < 21 + 30 => 30 <= x < 51
		// (3) (int) 30.0 <= x < (int) 50.999999...
		// => 30 <= x < 51�� ����

		for (int i = 0; i < 50; ++i)
			System.out.println((int) (Math.random() * 21 + 30));

		// 2. java.util.Random Ŭ����
		Random ran = new Random();

		// ran.nextInt(bound) : 0 <= x < bound������ ���� ������ �����Ѵ�
		for (int i = 0; i < 10; ++i)
			System.out.println("ran.nextInt(10) : " + ran.nextInt(10));

		// ���ϴ� ������ ������ ���ڷ� �����ϰ�
		// ���ϴ� ���� �� ���� ���� ���ڸ� ���� ������ ������ ������ �� �ִ�

		// ex: 77 ~ 88
		for (int i = 0; i < 10; ++i)
			System.out.println("77 ~ 88 : " + (ran.nextInt(12) + 77));
	}

}