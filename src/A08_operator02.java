
public class A08_operator02 {
	
	public static void main(String[] args) {
		
		// �� ����
		//	- �񱳿����� ����� �׻� ��/����(boolean)Ÿ���̴�		
		int a = 11, b = 11;
		
		System.out.println("a > b : " + (a > b));
		System.out.println("a < b : "+ (a < b));
		
		// ũ�ų� ���ٿ� �۰ų� ���ٴ� �ݵ�� �ε�ȣ(>, <)�� ���� ���;� �Ѵ�
		System.out.println("a >= b : " + (a >= b));
		System.out.println("a <= b : " + (a <= b));
		
		System.out.println("a == b : " + (a == b)); // ���� �� true
		System.out.println("a != b : " + (a != b)); // �ٸ� �� true
		
		// ���� ����
		//	&&(shift + 7) (and) : �� ���� �� ���� ��� true���� true 
		//	||(shift + \\) (or) : �� ���� �� ���� ��� �ϳ��� true�� true
		//	! (not) : true�� false��, false�� true�� �ٲ��
		System.out.println("--- AND ---");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		// �� AND������ ���� �񱳰� false��� ���� ������ �� �̻� üũ���� �ʴ´�
		
		System.out.println("--- OR ---");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		// �� OR������ ���� �񱳰� true��� ���� ������ �� �̻� üũ���� �ʴ´�
		
		System.out.println("--- NOT ---");
		System.out.println(! true);
		System.out.println(! false);
		
		a = 25;
		System.out.println("a�� 5 �� ����� �� �� : " + (a%5 == 0) );
		System.out.println("a�� 5 �� ����� �ƴ� �� �� : " + ! (a%5 == 0) );
		
		boolean hasBrother = false;
		
		System.out.println("�������� ������ �� : " + hasBrother);
		System.out.println("�������� ������ �� : " + !hasBrother);
				
	}

}