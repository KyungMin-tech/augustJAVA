package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D06_countFruits {

	// ���� ����Ʈ�� �̿��� �� ������ �� �� �ִ����� ����ϰ� �ִ� Map�� �����غ�����

	static List<String> fruits = new ArrayList<>();

	static {
		fruits.add("���");
		fruits.add("���");
		fruits.add("���");
		fruits.add("���");
		fruits.add("�ٳ���");
		fruits.add("�ٳ���");
		fruits.add("�ٳ���");
		fruits.add("����");
		fruits.add("����");
		fruits.add("����");
		fruits.add("����");
		fruits.add("������");

	}

	public static void main(String[] args) {

		Map<String, Integer> fruit_count = new HashMap<>();

		for (String fruit : fruits) {

			// ������ ó�� �߰��� ���� �˾Ƴ� �� �ִ�
			if (!fruit_count.containsKey(fruit)) {
				// ����Ʈ���� ó�� ������ �����̶�� �ʿ� ���� ����ϰ� ������ 1�� �ʱ�ȭ�Ѵ�
				fruit_count.put(fruit, 1);
			} else {
				// �̹� �߰��Ǿ��ִ� ������ �ʿ� ��ϵ� ������ 1������Ų��
				int count = fruit_count.get(fruit);
				fruit_count.put(fruit, count + 1);
			}
		}

		System.out.println(fruit_count);
	}

}
