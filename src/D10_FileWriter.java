import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class D10_FileWriter {

	// # java.io.File 
	//	- JAVA에서 파일을 다루는 클래스
	//	- 파일에 대한 정보를 담을 수 있다
	//	- 정보를 새로 담아서 해당 정보를 토대로 파일을 생성할 수 있다
	//	- 이미 존재하는 파일에서 정보를 그대로 불러올 수도 있다
	
	public static void main(String[] args) {
		// ※ 파일 시스템은 하드디스크(및 기타 저장장치)를 제어하는 것이다
		
		// # 파일 클래스로 디렉토리 생성하기
		File memoDir = new File("D:\\memo");
		
		// File.exists() : 해당 경로에 디렉토리 혹은 파일이 존재하는지 여부를 반환한다
		// File.mkdir() : 파일 객체의 경로에 새 디렉토리를 생성한다 
		System.out.println(memoDir.exists());
		
		if (!memoDir.exists()) {		
			memoDir.mkdir();
		}
		
		// # 파일 클래스로 새로운 파일 생성하기
		File testFile = new File("D:\\memo\\test1.txt");	
					
		// 여러 클래스를 다루다 보면 예외처리를 강제하는 메서드들이 있다.
		// 이처럼 강제로 처리해야하는 예외를 Checked Exception이라고 부른다. 
		try {
			testFile.createNewFile();
		} catch (IOException e) {				
			e.printStackTrace();
			System.out.println("createNewFile : 왠진 모르겠는데 IOException이 발생함");
		}			
		
		// # 파일에 내용 쓰기
		
		// # FileWriter 클래스
		//	- 파일에 내용을 추가하거나 덮어 쓸 수 있다
		try (FileWriter out = new FileWriter(testFile)){
			//FileWriter out = new FileWriter(testFile);
			
			// FileWriter.append() : 파일에 내용을 추가한다
			out.append("Hello, file! 1\n");
			out.append("Hello, file! 2\n");
			out.append("Hello, file! 3\n");			
			
			out.close(); // 다 쓰고난 OutputStream은 반드시 닫아줘야 한다
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
}









