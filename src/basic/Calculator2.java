package basic;

import java.util.Scanner;

public class Calculator2 {
	public static void main(String[] args) {
		calc();
	}
	
	
		static void calc() {
			Scanner sc = new Scanner(System.in);
			
			int choice = 0;
			char flag = 'y';
			int diff = 0;
			
			do {
			System.out.println("1. Sum");
			System.out.println("2. Product");
			System.out.println("3. Difference");
			System.out.println("4. Quotient");
			System.out.println("5. Remainder");
			System.out.println("6. Quit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			System.out.println("Enter the numbers: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			
			if (a!=0 || b!=0) {
				switch (choice) {
				case 1:
					int sum = a+b;
					System.out.println("The sum is: "+ sum);
					break;
					
				case 2:
					int  p = a*b;
					System.out.println("The product is: "+ p);
					break;
					
				case 3:
					if(b>a) {
						diff = b-a;
					}
					else {
						diff = a-b;
					}
					System.out.println("The difference is: "+ diff);
					break;
					
				case 4:
					int q = a/b;
					System.out.println("The quotient is: "+ q);
					break;
				case 5:
					int r = a%b;
					System.out.println("The remainder is: "+ r);
					break;
				case 6:
					System.out.println("Bye");
					break;
				}
			}
			System.out.println("Do you want to continue? [y/n]");
			flag  = sc.next().charAt(0);
		
		} while(String.valueOf(flag).equalsIgnoreCase("Y"));
	}
	}
