package basic;

import java.util.Scanner;

public class OddEven4 {
	public static void main(String[] args) {
		oddeven();
	}
	static void oddeven() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		if (num%2==0) {
			System.out.println(num+ " is even number");
		}
		else {
			System.out.println(num+ " is odd number");
		}
	}
}
