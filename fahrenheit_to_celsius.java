package com.tka1_27_Oct2025_Problem_Set;

import java.util.Scanner;

public class fahrenheit_to_celsius {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the tempreture in fahrenheit : ");
		
		double f = sc.nextDouble();
		
		double c = (f- 32) * 5 / 9;
		
		System.out.println("tempreture in Celsius : "+c);
		
		sc.close();
	}
}
