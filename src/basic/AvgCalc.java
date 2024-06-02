package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvgCalc {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int total = 0, avg = 0, sum =0;
		
		System.out.println("Enter the size of total number ");
		total = sc.nextInt();
		
		System.out.println("Enter the numbers: ");
		
		for(int i = 0; i<total; i++) {
			numbers.add(sc.nextInt());
		}
		
		for(int number: numbers) {
			sum += number;
		}
		
		avg = sum / numbers.size();
		System.out.println("The average is: "+ avg);
		
	}
}
