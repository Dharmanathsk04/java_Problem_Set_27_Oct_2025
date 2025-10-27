package com.tka1_27_Oct2025_Problem_Set;

import java.util.Scanner;

public class Student_choice {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		String name = sc.next();
		
		System.out.println("Enter city :");
		String city = sc.next();
		
		System.out.println("Enter course: ");
		String course = sc.next();
		
		System.out.println("Enter marks for 3 subjects :");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		
		int total = m1+m2+m3;
		double per = total/3.0;
		
		String grade = (per >= 90) ? "+A" : (per >= 75) ? "A" : (per >= 60) ? "B" : (per >=45) ? "C" : "fail";
		
		System.out.println("\n name :"+name);
		System.out.println("city :"+city);
		System.out.println("course :"+course);
		System.out.println("total :"+total);
		System.out.println("percentage :"+per);
		System.out.println("grade :"+grade);
		
		sc.close();
				
	}
	
}






