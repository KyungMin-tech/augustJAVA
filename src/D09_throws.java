
public class D09_throws {

	// throws 
	//	- ���� �޼��忡�� �߻��ϴ� ������ ó���� �޼��带 ȣ���� ������ �̷��
	
	// �� throws�� ���� �� �޼��尡 ���ܰ� �߻��� �� �ִ� �޼������� �˸���
	public static int div(int a, int b) throws ArithmeticException {
		return a / b;		
	} 
	
	public static void main(String[] args) {
		try {
			div(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ �ȵ˴ϴ�.");
		}
		
		System.out.println("���α׷��� ���� ���� �մϴ�.");
	}
}




