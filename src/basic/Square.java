package basic;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		calculate();
	}
	static void calculate() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length: ");
		int length = sc.nextInt();
		

		
		double area = Math.pow(length, 2);
		int perimeter = (4 * length);
		
		
		System.out.println("The area is: "+ area);
		System.out.println("The perimeter is: "+ perimeter);
		
		
	}
}
