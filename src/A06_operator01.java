
public class A06_operator01 {
	
	// ������ (operator)
	//	- ���� (���)�� �� ���� ��
	//	- +, -, * ,/��	
	public static void main(String[] args) {
		
		// ��� ������
		int a = 8, b = 5;
		double c = 5.0;
		
		// ������ �켱������ �˰� �ִ���� ����ȴ� (���ϱ�, ������� ���� ����)
		System.out.println(a + b);
		System.out.println("a + b : " + (a + b));
		System.out.println("a - b : " + (a - b));
		System.out.println("a * b : " + a * b);
		// ���� ������ ������� �� ���´�
		System.out.println("a / b : " + a / b);		
		// ������ �Ǽ��� ������� ��Ȯ�� ����� �Ѵ�
		System.out.println("a / c : " + a / c);
		
		// % : ������ ����
		System.out.println("a % b : " + a % b);
		
		// Math.pow() : ���� �Լ�
		System.out.println(Math.pow(a, b));
		
		// ^ :  ������ �ƴϴ� (��Ʈ���� XOR) : ���������� ����Ҷ� ���ڰ� �ٸ��� 1 ������ 0
		System.out.println("a ^ b : " + (a ^ b));	
		
	}

}
