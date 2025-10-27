package com.tka1_27_Oct2025_Problem_Set;

import java.util.Scanner;

public class Apple_mango_choice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		
		int num = sc.nextInt();
		
		if(num % 3 == 0 && num % 5 == 0) {
			
			System.out.println("mango and Apple");
		}
		
		else if(num % 3 == 0) {
			
			System.out.println("mango");
		}
		
		else if(num % 5 == 0) {
			
			System.out.println("Apple");
		}
		
		else {
			
			System.out.println(num);
		}
		
		sc.close();
	}
}
