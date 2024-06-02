package basic;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		int l = 0, b= 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		l = sc.nextInt();
		
		System.out.println("Enter the breadth: ");
		b = sc.nextInt();
		
		int area = l*b;
		int perimeter = (2*(l+b));
		System.out.println("The area is: "+ area);
		System.out.println("The perimeter is: "+perimeter);
	}
}
