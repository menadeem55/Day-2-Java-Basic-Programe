package com.java.day2;
	public class ReverseIntegerNumber {
	public static void main(String[] args) {
		int num = 123;
		int remain;
		int reverse = 0;
		System.out.println("Original Number is 123");
		
			while(num>0) {
			remain = num%10;
			reverse = reverse*10 + remain;
			num = num/10;
			}
		System.out.println("Reversed Number is "+reverse);
		
					
	}
}
