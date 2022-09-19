package com.java.day2;


public class PalindromeNumber {
	public static void main(String[] args) {
		int i = 101;
		int remain;
		int reverse = 0;
		int temp;
		temp = i;
		System.out.println("Original number is = 101");
		
		for(int num = i ; num>0 ;) {
			remain = num%10;
			reverse = reverse*10 + remain;
			num = num/10;
		}
		System.out.println("Reversed Number: "+reverse);
			if(temp == reverse) {
		System.out.println("Palindrome Number");
		}
			else {
		System.out.println("Not Palindrome Number");
		}		
			
	}
}
