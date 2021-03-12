
public class C02_Constructor {
	
	// Ŭ������ ������ (Constructor)
	//	- Ŭ������ �̸��� �Ȱ��� �̸��� �Լ�
	// 	- new�� �Բ� �����ڸ� ȣ���ϸ� �ν��Ͻ��� �����ȴ�
	//	- �����ڸ� �������� ���� Ŭ������ �⺻ �����ڸ� �ڵ����� �������ش�
	//	  �� �⺻ ������ - �Ű������� �ƹ��͵� �������� �ʾƵ� �Ǵ� ������
	
	public static void main(String[] args) {
		// ������ Ŭ������ �����ڸ� ���� �������� �ʱ� ������ 
		// �⺻ �����ڰ� �����Ѵ�
		Orange orange01 = new Orange();
		
		System.out.println("��ݸ� ������ �������� �絵  : " + orange01.sweet);
		System.out.println("��ݸ� ������ �������� ����  : " + orange01.color);
		
		orange01.sweet = 9;
		orange01.color = "��������";
		

		System.out.println("���� ���� ä�� �������� �絵  : " + orange01.sweet);
		System.out.println("���� ���� ä�� �������� ����  : " + orange01.color);
		
		// ü�� Ŭ������ �⺻ �����ڸ� �̿��� ���� �ʱ�ȭ ���־���
		Cherry cherry01 = new Cherry();
		
		System.out.println("��� ������ ü���� �絵  : " + cherry01.sweet);
		System.out.println("��� ������ ü���� ����  : " + cherry01.color);
		
		// # Ŭ���� �迭 ����ϱ�
		
		// �� Ŭ���� �迭�� 100ũ��� �����ߴٴ� ���� �ν��Ͻ��� 100�� ������ ���� �ƴ϶�
		//	�ν��Ͻ��� �� �� �ִ� �迭 ���� 100�� ���� ���̴�
		Cherry[] cherrybox = new Cherry[100];
		
		for (int i = 0; i < cherrybox.length; ++ i) {
			// ��� �濡 �ٸ� �ν��Ͻ��� ä���� ���
			cherrybox[i] = new Cherry();
			
			System.out.printf("%d��° ü�� : %s\n", i, cherrybox[i]);
		}
		
		Snack snack01  = new Snack("�����۽�", "�����۽� ��������", "§��", 800);
		Snack snack02  = new Snack("������", "ġ�佺", "�ٺ�ť��", 750);
		Snack snack03 = new Snack("�Ե�", "ĭ��", "�⺻", 500);		
		// �����ڸ� ���� ������ Ŭ������ �ڵ����� ������ �⺻ �����ڰ� ����
		// Snack snack02  = new Snack();
		
		System.out.println("����1�� �̸� : " + snack01.name);
		System.out.println("����2�� ����ȸ�� : " + snack02.brand);
		System.out.println("����3�� Į�θ� : " + snack03.calorie + "kcal");
	}

}

class Orange {
	int sweet; // �絵
	String color;
	
	// �ڵ����� �����Ǵ� �⺻ �������� ���� ���
	// Orange() {}
}

class Cherry {
	double sweet; 
	String color;
	
	// CherryƲ������ �⺻ �����ڸ� ���� ����
	Cherry () {
		// �� �ν��Ͻ��� ȣ��Ǹ鼭 ���ÿ� ���� ���� ȣ��Ǵ� ���� �������̹Ƿ�
		// �����ڿ����� �ַ� �ν��Ͻ� ���� ���� �ʱ�ȭ�Ϸ��� �۾��� �ϰ� �ȴ�.
		
		// �����ڴ� �ַ� �⺻���� �����ϴ� ������ �Ѵ�
		sweet = 5.0;
		color = "������";
		
		
	}
}

class Snack {
	String brand;
	String name;
	String taste;
	int calorie;
	
	// �����ڵ� �����ε��� �����ϴ�
	Snack() {
		brand = "�⺻ �귣��";
		name = "�⺻ �̸�";
		taste = "�⺻��";
		calorie = -1;
	}
	
	// �����ڿ��� �ٸ� �����ڸ� ȣ���� ����� �� �ִ�
	Snack(String brand, String name) {
		this.brand = brand;
		this.name = name;
		this.taste = "�⺻��";
		this.calorie = -1;
		
//		this(brand, name, "�⺻��", -1);
		
//		this(); // this() : �� Ŭ������ �ٸ� �����ڸ� ȣ��
//		this.brand = brand;
//		this.name = name;
		
		// ���� �������� ��� ���� ������ ���� ª���� ����ϴ°� ���� 
	}
	
	// �ν��Ͻ��� ���ϴ� ���� �Ű������� ���޹޴� ������
	Snack(String brand, String name, String taste, int calorie){
		this.brand = brand;
		this.name = name;
		this.taste = taste;
		this.calorie = calorie;
		
	}
}