package basic;

import java.util.Scanner;

public class Circle {
	static double pi = 3.14;
	
	public static void main(String[] args) {
		int r = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		r = sc.nextInt();
		
		double area = pi * (r * r);
		double perimeter = 2 * pi * r;
		System.out.println("The area of circle is: "+ area);
		System.out.println("The perimeter if the circle is: "+perimeter);	
		
	}
}
