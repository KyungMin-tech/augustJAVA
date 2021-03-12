import java.util.InputMismatchException;
import java.util.Scanner;

public class D08_tryCatch {

	// ����ó�� 
	//	- �츮�� ������� �˰��ִ� ���� �۾����� ����(Exception)�̶�� �θ���
	//	- ��� ���ܴ� ExceptionŬ������ �ڽ��̴�
	//	- ����ó���� ���α׷��Ӱ� ���� �������ָ� ���α׷��� ���������ϴ� ���
	//	    ���ϴ� ������ ������ �� �ִ�
	
	// try
	//	- ���ܰ� �߻��� �� �ִ� �ڵ带 try�� ���ο� ���Խ�Ų��
	//	- ���ܰ� �߻����� ������ ���� ����ǰ�, ���ܰ� �߻��Ѵٸ� catch�� �Ѿ��
	
	// catch
	//	- try�� ������ �ڵ忡�� ���ܰ� �߻��ϰ� �Ǹ� �� ��� try���� �ߴ��ϰ� Ż���Ѵ�
	//	- try���� Ż���� �Ŀ��� �˸��� catch������ �̵��Ѵ�
	//	- catch������ �߻��� ������ ������ �Ű�����ó�� ���޹޾� Ȱ���� �� �ִ�	
	
	// finally
	//	- try���� ���� �߻� ���ο� ������� ������ ����Ǵ� ����
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {	
			
			try {				
				System.out.print("�ݵ�� ������ �Է����ּ��� >> ");				
				int num = sc.nextInt();
				
				// System.out.println("�Է��Ͻ� ���ڴ� " + num + "�Դϴ�.");
				System.out.println("�Է��Ͻ� ���ڷ� 30�� ������ " 
						+ 30 / num + "�Դϴ�.");					
			} catch (InputMismatchException e) {				
				// Exception.printStackTrace() : ������ �����޼����� ��� 
				e.printStackTrace();				
				System.err.println("���� ������ �Է��϶�� �����ٵ�?");
				sc.nextLine();				
			} catch (ArithmeticException e) {				
				System.err.println("0���� �����ø� �ȵ˴ϴ�.");
			} catch (Exception e) {
				System.err.println("Exception�� ��� ���ܸ� ó���� �� �ִ�");
			} finally {
				System.out.println("�����մϴ�.");
			}
			
		}
	}
	
}







