import java.util.HashMap;
import java.util.Map;

public class D06_HashMap {
	// Map
	// - (key: value, key: value)
	// - Key/Value�� �� ��Ʈ�� �̷�� �ڷᱸ��
	// - �ٸ� ��� Ȥ�� ���� ���Ͽ��� Key/Value ���·� �̷���� �����͸� ���� ��
	// - Java������ MapŸ���� �̿��� �ްԵȴ�
	// - ���� ã�� �� �ε��� ��� Key�� �̿��Ѵ�
	// - Key�� �ߺ��� ������� �ʴ´�(����Key�� ���� �߰��ϸ� �����)
	// - Map�� �÷����� �ƴϴ�

	public static void main(String[] args) {
		// Map�� Key�� Value�� ���׸��� ��� �����ؼ� ����Ѵ�
		Map<String, Object> info = new HashMap<>();

		// Map.put(k, v) : Ű�� ���� �߰��Ѵ�
		info.put("�̸�", "ȫ�浿");
		info.put("����", 30);
		info.put("�����ڻ�", 500000000000L);
		info.put("���", new String[] { "��ȭ", "����", "����", "���" });

		System.out.println(info);

		// Map.get(key) : Ű�� ���� ������
		String[] hobbies = (String[]) info.get("���");
		System.out.println(hobbies[2]);

		// Map.keySet() : �ش� Map�� ��� Ű�� ������ �ִ� Set�� ��ȯ�Ѵ�

		System.out.println(info.keySet());

		// Ű���� �̿��� ��� �����Ϳ� ������ �� �ִ�
		for (String key : info.keySet())
			System.out.println(key + ": " + info.get(key));
		
		// Map.contains(key) : �ɿ� �ش� Ű�� �����ϴ� ���θ� ��ȯ�Ѵ�
		System.out.println(info.containsKey("�����ڻ�"));
		System.out.println(info.containsKey("�����ε���"));
		
		// Map.containsValue(value) : �ɿ� �ش� ���� �����ϴ� ���θ� ��ȯ�Ѵ�
		System.out.println(info.containsValue("30"));
		System.out.println(info.containsValue(30));		
		
	}

}
