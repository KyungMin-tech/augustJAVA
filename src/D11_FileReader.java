import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D11_FileReader {
	
	public static void main(String[] args) {
		
		// # FileReader : ���� ������ ���� �� ����ϴ� Ŭ����
		// FileReader in = null;
		
		// try() ���ο� �ڵ����� �ݾ��� �ν��Ͻ��� �����ؼ� ����� �� �ִ�
		// AutoCloseable, Closealble �������̽��� �����Ǿ� �ִ� Ŭ������ try()�� ����� �� �ִ�
		// Ŭ������ try()�� ����� �� �ִ�
		try (FileReader in = new FileReader("D:\\memo\\test1.txt")) {
			// in = new FileReader("F:\\memo\\test1.txt");
			
			// read() 
			//	- InputStream�� ������ �� ���ھ� �д´�
			//	- ����� ���ڸ� �д� ��� �ش� ������ �ڵ尡 ��ȯ�ȴ�
			//	- ������ ���� �����ϴ� ��� -1�� ��ȯ�ȴ�
//			int ch;
//			while ((ch = in.read()) != -1) {
//				System.out.print((char) ch);
//			}
			
			// read(char[] cbuf)
			//	- char[]�� �̿��� �ѹ��� ���� ���ھ� ������ ���� �ִ�			
			// 	- read()�� char[]�� �����ϴ� �����ε��� 
			//    �̹��� ����ڸ� �о������� intŸ������ ��ȯ�Ѵ�
			String content = "";
			char[] buff = new char[10];
			int len;
			while ((len = in.read(buff)) != -1) {
				// System.out.println("\n�̹��� ���� ���� ���� : " + len);
				// System.out.print(new String(buff, 0, len));
				content += new String(buff, 0, len);
			}		
			
			System.out.println("�ϼ��� ���ڿ� : \n" + content);			
			
			// in.close(); // �� ����� InputStream�� �ݵ�� �ݾ���� �Ѵ�
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} 
		
	}
	
}




