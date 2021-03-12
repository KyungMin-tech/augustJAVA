import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class D10_FileWriter {

	// # java.io.File 
	//	- JAVA���� ������ �ٷ�� Ŭ����
	//	- ���Ͽ� ���� ������ ���� �� �ִ�
	//	- ������ ���� ��Ƽ� �ش� ������ ���� ������ ������ �� �ִ�
	//	- �̹� �����ϴ� ���Ͽ��� ������ �״�� �ҷ��� ���� �ִ�
	
	public static void main(String[] args) {
		// �� ���� �ý����� �ϵ��ũ(�� ��Ÿ ������ġ)�� �����ϴ� ���̴�
		
		// # ���� Ŭ������ ���丮 �����ϱ�
		File memoDir = new File("D:\\memo");
		
		// File.exists() : �ش� ��ο� ���丮 Ȥ�� ������ �����ϴ��� ���θ� ��ȯ�Ѵ�
		// File.mkdir() : ���� ��ü�� ��ο� �� ���丮�� �����Ѵ� 
		System.out.println(memoDir.exists());
		
		if (!memoDir.exists()) {		
			memoDir.mkdir();
		}
		
		// # ���� Ŭ������ ���ο� ���� �����ϱ�
		File testFile = new File("D:\\memo\\test1.txt");	
					
		// ���� Ŭ������ �ٷ�� ���� ����ó���� �����ϴ� �޼������ �ִ�.
		// ��ó�� ������ ó���ؾ��ϴ� ���ܸ� Checked Exception�̶�� �θ���. 
		try {
			testFile.createNewFile();
		} catch (IOException e) {				
			e.printStackTrace();
			System.out.println("createNewFile : ���� �𸣰ڴµ� IOException�� �߻���");
		}			
		
		// # ���Ͽ� ���� ����
		
		// # FileWriter Ŭ����
		//	- ���Ͽ� ������ �߰��ϰų� ���� �� �� �ִ�
		try (FileWriter out = new FileWriter(testFile)){
			//FileWriter out = new FileWriter(testFile);
			
			// FileWriter.append() : ���Ͽ� ������ �߰��Ѵ�
			out.append("Hello, file! 1\n");
			out.append("Hello, file! 2\n");
			out.append("Hello, file! 3\n");			
			
			out.close(); // �� ���� OutputStream�� �ݵ�� �ݾ���� �Ѵ�
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
}









