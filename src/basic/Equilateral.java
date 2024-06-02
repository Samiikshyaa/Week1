package basic;

import java.util.Scanner;

public class Equilateral {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0;
		System.out.println("Enter the three sides of the triangle: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a==b && b ==c && c==a) {
			System.out.println("The triangle is equilateral ");
		}else {
			System.out.println("The triangle is not equilateral ");
		}
		
		System.out.println("The size of Integer is "+ Integer.SIZE);
		System.out.println("The maximun value is "+ Integer.MAX_VALUE);
	}
}
