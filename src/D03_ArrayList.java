import java.util.ArrayList;

// Ctrl + Shift + o

public class D03_ArrayList {
	
	// JAVA Collections
	//	- �ڹٿ��� �⺻������ �����ϴ� �ڷᱸ�� �������̽�
	//	- Collections �������̽��� ������ Ŭ�����δ� List�� Set�� �ִ�
	//	�� �������̽��� ��Ӻ��ٴ� �����̶�� ǥ���� ���� ����Ѵ�
	
	// # ArrayList
	//	- ũ�Ⱑ �ڵ����� �����Ǵ� �迭�� ������ Ŭ����
	//	- �迭�� �ٸ��� ũ�Ⱑ ���������� �ʰ� ���̰� �þ�ų� �پ�� �� �ִ�
	//	- �迭�� ������ �����̱� ������ ���������� �����Ϳ� ������ �� ���� �����ϴ�
	
	public static void main(String[] args) {
		// java.util ��Ű���� ����ִ�
		ArrayList list = new ArrayList();
		
		// ArrayList.add(item) : ���ϴ� �����͸� ����Ʈ�� �� �ڿ� �߰��Ѵ�
		list.add("ȫ�浿");
		list.add("�Ӳ���");
		list.add("���߻�");
		list.add("��⽾");
		
		System.out.println(list);
		
		// ArrayList.add(index, item) : ���ϴ� ��ġ�� �����͸� �߰��Ѵ�
		list.add(0, "�Ǿտ� �߰�");
		list.add(3, "�߰��� �߰�");
		
		System.out.println(list);
		
		// �⺻������ ��� Ÿ���� �����͸� �߰� �� �� �ִ�
		list.add(99.999);
		list.add('A');
		list.add(100);
		
		System.out.println(list);
		
		// # Object Ÿ��
		//	- ��� Ÿ���� �θ�
		//	- JAVA�� ��� Ÿ���� ObjectŬ������ �ڽ��̰�
		//	- ���Ÿ���� ObjectŸ������ ��ĳ���� �� �� �ִ�
		
		// �� ���� ���� Ŭ������ Object�� �ڽ��̱� ������ list�� �߰��� �����ϴ�
		list.add(new myobj.cookie.BraveCookie());
		list.add(new myobj.person.Police("�����", 30));
		
		System.out.println(list);
		
		// ArrayList.get(index) : ���ϴ� �������� �ϳ� ������
		// ArrayList.size() : ���� ����Ʈ�� ũ�⸦ ��ȯ�Ѵ�
		//					   �ε����� Size -1������ �����Ѵ�
		for (int i = 0; i < list.size(); ++i)
			System.out.printf("get(%d)" + list.get(i) + "\n", i);
		
		// ArrayList.remove(item) : �ش� �����͸� �����Ѵ�, �����ȴ� ���� ������
		// ArrayList.remove(index) : �ش� ��° �����͸� �����Ѵ�
		System.out.println("0��° �����͸� �����ϸ鼭 ���ÿ� ����Ѵ� : " + list.remove(0));
		
		System.out.println("���� ���� ���� : " + list.remove("ȫ�浿"));
		System.out.println("���� ���� ���� : " + list.remove("��浿"));
		
		// list�� ����� �����ʹ� ObjectŸ������ ��ĳ���õ� �����̱� ������ 
		// ������ ����Ҷ��� �ٿ�ĳ������ �ʿ��ϴ�
		
		// # index�� �ڿ��� ���� �����Ҷ��� ���̸� ���� �����ϸ� ����
		Object obj1 = list.get(list.size() - 1);
		Object obj2 = list.get(list.size() - 2);
		
		
		// # ����Ʈ�� ����ִ� �����͸� �ٽ� ����� �� �ٿ� ĳ������ �ؾ��Ѵ� (������)
		((myobj.person.Police)obj1).introduce();
		((myobj.cookie.Cookie)obj2).special();
		
		
		// # ����Ʈ�� �ݺ���
		for (int i = 0; i < list.size(); ++i) {
			System.out.println("index : " + list.get(i));
		}
		
		// �� ����Ʈ�ε� �迭�� ���������� forEach�� ����� �� �ִ�
		for (Object item : list) {
			
			// �ݺ����� �Բ� ����� ���� �ش� �ν����������� ������ �� �ٿ�ĳ������ �ʿ� (������) 
			if (item instanceof myobj.person.Police) {
				((myobj.person.Police) item).arrest("�����");
			}
			System.out.println("forEach " + item);
		}
		
	}

}