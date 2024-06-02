package basic;

import java.nio.file.ReadOnlyFileSystemException;
import java.util.Scanner;

public class Largest3 {
	public static void main(String[] args) {
		greatest();
	}
	static void greatest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		
		System.out.println("Enter the third number: ");
		int c = sc.nextInt();
		
		if (a>b && a>c) {
			System.out.println("The greatest is: "+a);
		}
		else if (b>a && b>c) {
			System.out.println("The greatest is: "+b);
		}
		else {
			System.out.println("The greatest is: "+c);
		}
	}
	
}
