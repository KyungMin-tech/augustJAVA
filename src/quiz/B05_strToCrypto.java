package quiz;

import java.util.Scanner;
import java.util.Arrays;

public class B05_strToCrypto {
	
	// ����ڷκ��� ���ڿ��� �Է¹����� ��ȣ������ �������ִ� ���α׷��Դϴ�.
	
	// �����ڸ� ��ȣ������ ���� �����ϸ� �Է¹��� �����ڸ� 5��° ���� �����ڷ� 
	// ��ȯ�Ͽ� ��ȣ���� �����մϴ�.
		
	// "abcdefghijklmnopqrstuvwxyz"
		
	// ex> 	�� : ABCDE -> ��ȣ�� : FGHIJ
	//		�� : Hello, World! -> ��ȣ�� : Mjqqt, Btwqi!
	
	
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
		// # char[]�� ���ڿ��� ��ȯ�ϴ� ��� : new String(char[])
		System.out.println("your crypto is : " + new String(crypto));	
		
			
		
	}

}

//		Scanner sc = new Scanner(System.in);
//		System.out.println("���ڿ��� �Է� >> ");
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