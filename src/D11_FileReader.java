import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D11_FileReader {
	
	public static void main(String[] args) {
		
		// # FileReader : 파일 내용을 읽을 때 사용하는 클래스
		// FileReader in = null;
		
		// try() 내부에 자동으로 닫아줄 인스턴스를 선언해서 사용할 수 있다
		// AutoCloseable, Closealble 인터페이스가 구현되어 있는 클래스만 try()에 사용할 수 있다
		// 클래스만 try()에 사용할 수 있다
		try (FileReader in = new FileReader("D:\\memo\\test1.txt")) {
			// in = new FileReader("F:\\memo\\test1.txt");
			
			// read() 
			//	- InputStream의 내용을 한 글자씩 읽는다
			//	- 제대로 문자를 읽는 경우 해당 문자의 코드가 반환된다
			//	- 파일의 끝에 도달하는 경우 -1이 반환된다
//			int ch;
//			while ((ch = in.read()) != -1) {
//				System.out.print((char) ch);
//			}
			
			// read(char[] cbuf)
			//	- char[]을 이용해 한번에 여러 문자씩 가져올 수도 있다			
			// 	- read()에 char[]을 전달하는 오버로딩은 
			//    이번에 몇글자를 읽었는지를 int타입으로 반환한다
			String content = "";
			char[] buff = new char[10];
			int len;
			while ((len = in.read(buff)) != -1) {
				// System.out.println("\n이번에 읽은 글자 개수 : " + len);
				// System.out.print(new String(buff, 0, len));
				content += new String(buff, 0, len);
			}		
			
			System.out.println("완성된 문자열 : \n" + content);			
			
			// in.close(); // 다 사용한 InputStream도 반드시 닫아줘야 한다
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} 
		
	}
	
}




