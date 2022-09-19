package com.java.day2;

import java.util.Scanner;

public class DisplayUnit {
	public static void main(String[] args) {
		
		System.out.println("Enter number 1, 10, 100, 1000");
		// New Scanner
		Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.println("ONCE");
			}
			else if(num == 10) {
				System.out.println("TENS");
			}
			else if(num == 100) {
				System.out.println("HUNDRED");
			}
			else if(num == 1000) {
				System.out.println("THOUSAND");
			}
			else
				System.out.println("Invalid Number!");
				
				
			}
}
