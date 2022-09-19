package com.java.day2;
public class ReverseIntegerNumberForLoop {
		public static void main(String[] args) {
			int i = 456;
			int remain;
			int reverse = 0;
			System.out.println("Original Number is = 456");
			
			for (int num = i ; num>0 ;)
			{
				remain = num%10;
				reverse = reverse = reverse*10 + remain;
				num = num/10;
							
			}
			System.out.println("Reversed Number = "+reverse);
		}
}
