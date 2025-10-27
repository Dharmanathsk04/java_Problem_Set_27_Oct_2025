package com.tka1_27_Oct2025_Problem_Set;

import java.util.Scanner;

public class Celcius_To_Faranheit {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter tempreture in celsius :");
		double c = sc.nextDouble();
		
		double f = (c * 9 / 5) + 32;
		
		System.out.println("Tempreture in fahrenheit : "+f);
		
		sc.close();
	}
}
