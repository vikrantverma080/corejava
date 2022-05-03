package com.corejava;

public class CheckPalindromeNumber {
	
	//Int remains same even after reversing.
	public static void main(String[] args) {
		int palindromeNumber=2442, reverse=0;
		int temp=palindromeNumber;
		while(temp!=0) {
		reverse=reverse*10+(temp%10);
		temp=temp/10;
		}
		if(reverse==palindromeNumber)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");
	}
}
