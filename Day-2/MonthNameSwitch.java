package com.java.day2;

import java.util.Scanner;

public class MonthNameSwitch {

	public static void main(String[] args) {
		System.out.println("Enter a Number to get a Month Name");
		Scanner sc = new Scanner(System.in);
		int MonthName = sc.nextInt();
		
		switch(MonthName) {
	
			case 1:
				System.out.println("January");
				break;
				
			case 2:
				System.out.println("Febuary");
				break;
				
			case 3:
				System.out.println("March");
				break;
			
			case 4:
				System.out.println("April");
				break;
				
			case 5:
				System.out.println("May");
				break;
				
			case 6:
				System.out.println("June");
				break;
				
			case 7:
				System.out.println("July");
				break;
				
			case 8:
				System.out.println("August");
				break;
				
			case 9:
				System.out.println("September");
				break;
				
			case 10:
				System.out.println("Octuber");
				break;
				
			case 11:
				System.out.println("November");
				break;
				
			case 12:
				System.out.println("December");
				break;
				
			default:
				System.out.println("Invalid Number");
			
		}
		

	}

}
