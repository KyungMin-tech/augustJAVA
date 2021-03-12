 
public class C01_OOP {
	
	// # ��ü���� ���α׷��� (OOP: Object Oriented Programming)
	//	- ������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ� ���ǿ� �����ϴ� ��ü�μ� 
	//	     ���̵��� �����ϴ�  ���
	//	- ���� �������� ��� ��ü�� ������ �Լ��� ǥ���Ϸ��� ���α׷��� ���
	
	// # ��ü  (Object)
	//	- ���� �����ϴ� ��� ������ ��ü��� �θ���
	//	- �繰, ����, �˰����� ���..
	
	// ex: ���
	//	- ����, ũ��, ���, �������� ����
	
	// ex: �ð�
	//	- �׵θ� ����, ��ħ ����/����/���, ��ħ ����/����/��� , ��ħ ����/����/���
	
	// ex: �Һ���
	// 	- �ΰ�, ����, ����, ���°��ɿ���, ���� ������ ��
	
	public static void main(String[] args) {
		
		
		// �ϳ��� ���� �� �ִ� ������
		int apple_color;
		int apple_size;
		String aplle_shape = "���׶� ���";
		
		// �Ȱ��� Ʋ(Ŭ����)�� �������� ����� ������ ������ �� �ִ� 
		Apple apple01 = new Apple();
		Apple apple02 = new Apple();
		
		
		// �̶� Ŭ������ �� ��ü�� '�ν��Ͻ�(instance)'��� �θ���
		
		// ������ �ν��Ͻ����� ���� �ٸ� ���������� ���Ѵ�
		apple01.color = "������";
		apple02.color = "�ʷϻ�";		
		
		System.out.println("���01 : " + apple01);
		System.out.println("���02 : " + apple02);
		
		// �޼��带 ���� �ش� ��ü�� ��ȭ �Ǵ� ������ �����ϰ� ����� �� �ִ�
		System.out.println("�Ա� �� ��� 1�� Į�θ�" + apple01.calorie);		
		apple01.eat(3);		
		System.out.println("���� �� ��� 1�� Į�θ�" + apple01.calorie);
	}

}

// Ŭ���� �̸��� �빮�ڷ� �����ؾ��Ѵ�(����)
// Apple Ŭ������ ����� ���� ū Ʋ�̶�� �� �� �ִ�
// Ŭ������ �����ϴ� �������� ������ �����ϴ� ����� �ϳ��� ����
class Apple {
	
		
	// Ŭ���� ������ ������ (��� ����, ����, �ʵ�, �ν��Ͻ� ����)
	//	- �ν��Ͻ��� ���� ���¸� �����ϴ� �뵵�� ����Ѵ�
	// 	- �ν��Ͻ����� �ٸ� ���� ���� �� �ִ� ������
	//	  (������� �ٸ� ���� ���� �� �ִ� ����)
	String color;
	String shape;
	String madein;
	int size;
	int calorie;
	
	// Ŭ���� ������ �޼���
	//	- �ν��Ͻ��� ���¸� ��ȭ��Ű�� �뵵�� ����Ѵ�
	//	- ��ȭ, ����, ��ɵ��� ǥ���ϱ� ���� ����Ѵ�
	
	// ex: ����� �Դ´�
	//	- ���, ũ��, ���� Į�θ�, ũ�� ���� ����
	
	// static
	//	- ��� �ν��Ͻ����� ������ ��
	// 	- �ν��Ͻ����� �ٸ� ���� ���Ѵٸ� static�� �����ؾ� �Ѵ�	
	public void eat(int mouth) {
		calorie = calorie - mouth * 50;
	}
	
	// ex: ����� ������
	//	- ����� ���Կ� ����� �������� ������
	
	// ex: ����� �����
	//	- ����� ���� ���� �Ǵ� ���������� ���Ѵ�
	
}

class Clock {
	String sidecolor;
	
	String secondColor;
	int secondSize;
	String secondShape;
	
	String minuteColor;
	int minuteSize;
	String minuteShape;
	
	String hourColor;
	int hourSize;
	String hourShape;	
}

class Tumbler {
	String logo;
	String color;
	String material;
	boolean keepWarm;	
}