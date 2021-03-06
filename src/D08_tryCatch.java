import java.util.InputMismatchException;
import java.util.Scanner;

public class D08_tryCatch {

	// 예외처리 
	//	- 우리가 에러라고 알고있던 빨간 글씨들을 예외(Exception)이라고 부른다
	//	- 모든 예외는 Exception클래스의 자식이다
	//	- 예외처리를 프로그래머가 직접 지정해주면 프로그램을 강제종료하는 대신
	//	    원하는 동작을 실행할 수 있다
	
	// try
	//	- 예외가 발생할 수 있는 코드를 try문 내부에 포함시킨다
	//	- 예외가 발생하지 않으면 정상 실행되고, 예외가 발생한다면 catch로 넘어간다
	
	// catch
	//	- try문 내부의 코드에서 예외가 발생하게 되면 그 즉시 try문을 중단하고 탈출한다
	//	- try문을 탈출한 후에는 알맞은 catch문으로 이동한다
	//	- catch에서는 발생한 예외의 정보를 매개변수처럼 전달받아 활용할 수 있다	
	
	// finally
	//	- try문의 예외 발생 여부와 관계없이 무조건 실행되는 영역
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {	
			
			try {				
				System.out.print("반드시 정수만 입력해주세요 >> ");				
				int num = sc.nextInt();
				
				// System.out.println("입력하신 숫자는 " + num + "입니다.");
				System.out.println("입력하신 숫자로 30을 나누면 " 
						+ 30 / num + "입니다.");					
			} catch (InputMismatchException e) {				
				// Exception.printStackTrace() : 원래의 에러메세지를 출력 
				e.printStackTrace();				
				System.err.println("내가 정수만 입력하라고 했을텐데?");
				sc.nextLine();				
			} catch (ArithmeticException e) {				
				System.err.println("0으로 나누시면 안됩니다.");
			} catch (Exception e) {
				System.err.println("Exception은 모든 예외를 처리할 수 있다");
			} finally {
				System.out.println("감사합니다.");
			}
			
		}
	}
	
}







