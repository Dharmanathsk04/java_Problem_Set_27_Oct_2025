package com.tka1_27_Oct2025_Problem_Set;

import java.util.Scanner;

public class Bill_Amount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product name :");
		String name = sc.next();
		
		System.out.println("enter quality :");
		int ql = sc.nextInt();
		
		System.out.println("Enter price per item :");
		int price = sc.nextInt();
		
		int total = ql * price;
		
		double finalAmount;
		
		if(total > 1000) {
			
			finalAmount = total - (total * 0.05);
		}
		
		else {
			
			finalAmount = total;
		}
		
		System.out.println("\n product :"+name);
		System.out.println("total amount : "+total);
		System.out.println("final amount : "+finalAmount);
		
		sc.close();
	}
}
