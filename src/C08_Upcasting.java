
import myobj.person.*;

public class C08_Upcasting {
	
	// ��ĳ����
	//	- �ڽ� Ÿ���� �ν��Ͻ��� �θ� Ÿ������ ��ȯ�ϴ� ��
	//	- �ڽ�Ÿ���� �θ�Ÿ���� ��� ���� �̹� �˰� �ֱ� ������ 
	//	  ��ĳ������ ������ Ÿ���ɽ����� ��� �� �� �ִ�
	public static void main(String[] args) {
		
		Police police01 = new Police("������", 30);
		
		// 1. �θ�Ÿ�� ������ �ڽ�Ÿ�� �ν��Ͻ��� ������ �� �ִ�.
		Person person01 = police01;
		Person person02 = (Person) police01;
		Person person03 = new Police ("�̰��", 40);
		
		double d2 = 10;
		double d = (double) 10;
		// �� ������ ���游�� ĳ�������� �����غ��� �� �ް�����
		
		
		// 2. ��ĳ���õ� �ν��Ͻ��� �ڽ� Ÿ���̴� ������ ����� �ؾ������
		//	- �ڽ� Ÿ�Կ��� �����ϴ� �޼��带 ����� �� ���� �ȴ�
		//	- �ڽ�Ÿ�Կ��� �������̵� �ߴ� ����� �״�� ����� �� �ִ� (�߿�)
		person01.introduce();
		
		// attack()�� Police Ŭ������ attack()�� �״�� ����ϰ� �ִ�
		person01.attack();
		
		// 3. ��ĳ������ �� ����ϸ�
		//	���� �ҽ��� ��� �ڽ�Ŭ������ �������̵�� ����� ����� �� �ִ�
		
		// PersonŬ������ ��ӹ��� ��� Ŭ������ attack()�� ������ �ִ� ���� Ȯ���� �� �ִ�
		Person[] person = { 
				new Police("�̼���",20),
				new Person("ȫ�浿", 10),
				new Police("�����",20),
				new Police("�ڼ���",20),
				new Police("�ּ���",20),
			
		};
		
		for (int i = 0; i < person.length; ++i) {
			
			// ��� ������ �ϳ��� �ҽ��� ������ ������ attack()�� ����Ѵ�
			person[i].attack();
		}
		
		// �θ�Ÿ���� �Ű������� �����ϸ� ��� �ڽ� Ÿ���� ���ڷ� ������ �� �ְ� �ȴ�
		attack(new Person("ȫ�浿", 123));
		attack(new Police("�ΰ��", 123));
		attack(new FireFighter("�̼ҹ�", 123));
		attack(new Programmer("���ڹ�", 123));
	}	
	
	public static void attack(Person p) {
		// ��ĳ���� �Ǿ����� �������̵�� �޼���� �ڽ��� �޼��带 �����Ѵ�
		p.attack();
	}
// ��ĳ������ ���ٸ� ��ӹ��� Ŭ���� ���� ��ŭ �޼��尡 �ʿ��ϴ�

}
