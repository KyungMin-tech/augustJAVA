
public class C05_static {

	// static
	//	- ���� Ŭ������ ������ ��� �ν��Ͻ��� �������� ����ϴ� ������ �ǹ��Ѵ�
	//	- static�� Ŭ���� �� �ϳ��� ���� ���ϰ� �ȴ�
	//	- Ŭ���� �� �ϳ��̱� ������ �ν��Ͻ����� �ƴ� Ŭ�������� .�� ��� ������ �� �ִ�
	//	- static�� �ν��Ͻ��� �ϳ��� �������� �ʾ������� ����� �� �ִ�
	//	- �ν��Ͻ��� ���� ���� ���� ���ɼ��� �ֱ� ������ static���� ������ 
	// 	    �ν��Ͻ� �ڿ��� ������ �� ����
	
	// static ����
	//	- ��� �ν��Ͻ��� ���� ���� ���� �� �ۿ� ���� ����
	
	// static �޼���
	//	- �ν��Ͻ� ��� ������ ����� �� ���� ���� 
	//	- static ��� ������ ����� �� �ִ�
	//	- �ش� Ŭ������ �ν��Ͻ��� �ϳ��� ������ ����� �� �ִ�
	
	public static void main(String[] args) {
	
		// static�� �ν��Ͻ��� �������� �ʴ� �������� ����� �� �ִ�				
		Pear.info();
		
		new Pear(13, 2);
		new Pear(10, 1);
		new Pear(10, 1);
		new Pear(11, 1);
		new Pear(11, 1);
		new Pear(15, 1);
		
		TrumphCard spade10 = new TrumphCard("spade", 10);
		TrumphCard heart7 = new TrumphCard("heart", 7);
		TrumphCard clover8 = new TrumphCard("clover", 8);
		
		spade10.printCardInfo();
		heart7.printCardInfo();
		clover8.printCardInfo();
		
		// ��� �ν��Ͻ����� ���� ���� ���� �ֱ� ������ �ϳ��� �����ص� ��� ī���� ũ�Ⱑ ����ȴ�
		// System.out.println("-- heart7�� ī�� ũ�⸦ ���� --");
		// heart7.changeCardSize(50, 100);
		
		// Ŭ������ �ϳ��� static�ڿ��� �����Ҷ��� Ŭ���� �̸��� ����ϴ°��� ���� ����
		TrumphCard.changeCardSize(77, 154);
		
		spade10.printCardInfo();
		heart7.printCardInfo();
		clover8.printCardInfo();
	}
	
}

class Pear {
	int size;
	int grade;
	
	static String taste = "���";
	
	static int total_size = 0;
	static int total_grade = 0;
	static int pear_count = 0;
	
	static double avg_size = 0;
	static double avg_grade = 0;
	
	// �� �����ڰ� ����Ǵ� ������ ���ο� �谡 �߰��Ǵ� �����̴�.
	public Pear(int size, int grade) {
		this.size = size;
		this.grade = grade;
		
		System.out.println("���ο� �谡 �߰��Ǿ����ϴ�.");
		
		// ���ο� �谡 �߰� �� ������ static������ ����� ������ 
		++pear_count;
		total_size += size;
		total_grade += grade;
		
		avg_size = total_size / (double) pear_count;
		avg_grade = total_grade / (double) pear_count;
	
		System.out.println("��� ������ ���ŵǾ����ϴ�.");		
		info();
	}
	
	public static void changeTaste(String taste) {
		// static���������� this�� �������� �ʴ´�		
		Pear.taste = taste;
	}
	
	// static �޼���� �ν��Ͻ� ������ �������� ���� �������� ���� �� �ִ�
	// ������, �ν��Ͻ� ������ �͵��� ��� ����� �� ����
	public static void info() {
		System.out.printf("��� ��� : %f\n��� ũ�� : %f\n", 
				avg_grade, avg_size);
	}
}

// static ������ static �޼��带 ���� Ŭ������ �ϳ� �����غ����� (���� ����)
class TrumphCard {
	// ��� ī���� ����/�ʺ�/�׸����� �Ȱ��ƾ� �Ѵ�
	// �Ȱ��� ������ static ������ Ȱ���Ѵ�
	static int width = 100;
	static int height = 200;
	static String image = "D:\\cardgame\\assets\\image\\card01.jpg";
	
	// ī�帶�� �ٸ� ���ڿ� ������ �ν��Ͻ� ������ Ȱ���Ѵ�
	String shape;
	int number;
	
	public TrumphCard(String shape, int number) {
		this.shape = shape;
		this.number = number;
	}
	
	// ī���� ũ�⸦ �����ϴ� �޼���
	static void changeCardSize(int width, int height) {
		TrumphCard.width = width;
		TrumphCard.height = height;
	}
	
	// ī���� �׸��� �����ϴ� �޼���
	static void changeCardImage(String imgPath) {
		image = imgPath;
	}
	
	// �ν��Ͻ� �޼��忡���� static������ �ڿ��� ������ ����� �� �ִ�
	// �� �ν��Ͻ��� ���� ������ static�� �������� ���� ���� ����
	void printCardInfo() {
		System.out.printf("[%s/%d/%dpx/%dpx]\n", 
				this.shape, this.number, width, height);
	}
}























