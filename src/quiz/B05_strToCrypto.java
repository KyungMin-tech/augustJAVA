package quiz;

import java.util.Scanner;
import java.util.Arrays;

public class B05_strToCrypto {
	
	// 사용자로부터 문자열을 입력받으면 암호문으로 변경해주는 프로그램입니다.
	
	// 영문자만 암호문으로 변경 가능하며 입력받은 영문자를 5번째 뒤의 영문자로 
	// 변환하여 암호문을 생성합니다.
		
	// "abcdefghijklmnopqrstuvwxyz"
		
	// ex> 	평문 : ABCDE -> 암호문 : FGHIJ
	//		평문 : Hello, World! -> 암호문 : Mjqqt, Btwqi!
	
	
	public static void main(String[] args) {		
		
		System.out.print("input plain text>");
		char[] plain = new Scanner(System.in).nextLine().toCharArray();
		
		char[] crypto = new char[plain.length];
		
		for (int i = 0; i < plain.length; ++ i) {
			
			if (plain[i] >= 'a' && plain[i] <= 'z') {
				
				crypto[i] = plain[i] + 5 > 'z' ? 
						(char)(plain[i] + 5 - 26) : (char)(plain[i] + 5);
				
			} else if (plain[i] >= 'A' && plain[i] <= 'Z') {
				
				crypto[i] = plain[i] + 5 > 'Z' ? 
						(char)(plain[i] + 5 - 26) : (char)(plain[i] + 5);
				
			} else {
				
				crypto[i] = plain[i];
				
			}		
			
		}
		// # char[]을 문자열로 변환하는 방법 : new String(char[])
		System.out.println("your crypto is : " + new String(crypto));	
		
			
		
	}

}

//		Scanner sc = new Scanner(System.in);
//		System.out.println("문자열을 입력 >> ");
//		
//		String alphabet = sc. nextLine();


// (char)('A' + 5)
//((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
// 65 ~ 90
// 97 ~ 122
//		int numOfAlphabet = 52;
//		int ch[] = new int[numOfAlphabet];
//		
//		char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
//		
//		String smallLetter = "abcdefghijklmnopqrstuvwxyz";
//		String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		
//		
//		
//		System.out.println((char)(charArray[0] + 5));