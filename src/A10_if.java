
public class A10_if {
	
	public static void main(String[] args) {
		
		// if��
		// 	- ()���� ������ true�� �� {}���� ������ �����Ѵ�
		//	- ()���� ������ false�� �� {}���� ������ �����Ѵ�
		
		// else if��
		//	- ���� if���� ������� �ʾҴٸ� if�� ó�� �˻��Ѵ�
		//	- else if�� ������ ��ø�ؼ� ����� �� �ִ�
		
		// else�� 
		//	- ���� if, else if�� ��� �ƴ϶�� {}���� ������ ������ �����Ѵ�
		//	- else���� �ִ� ���ǹ��� �ݵ�� �ѹ��� ����ȴ�
		
		int num = 9;
		
		if (num > 1000) {
			System.out.println("num�� 1000���� Ŭ ���� ������ �޼���");
		} else if (num > 100) {
			System.out.println("num�� 100���� Ŭ ���� ������ �޼���");
		} else if (num > 10) {
			System.out.println("num�� 10���� Ŭ ���� ������ �޼���");
		} else {
			System.out.println("���� ������ ��� �������� ���߽��ϴ�");
		}
		
//		char ch = '��';
//		
//		if(ch >= 'a' && ch <= 'z') {
//			System.out.println("ch�� ����ִ� ���� �ҹ����Դϴ�!");
//		} else if (ch >= 'A' && ch <= 'Z') {
//			System.out.println("ch�� ����ִ� ���� �빮���Դϴ�!");
//		} else if (ch >= '��' && ch <= '��') {
//			System.out.println("ch�� �� ~ ������ �����ϴ� �����Դϴ�");
//		}
//		
//		System.out.println("'��'�� �ڵ� �� : " + (int)'��');
//		System.out.println("'��'�� �ڵ� �� : " + (int)'��');
		// ctrl + / : ��ü �ּ�
		// ctrl + shift + / : �����ּ�
	
	}

}