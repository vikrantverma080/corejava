package com.corejava;

public class CheckPalindromeString {
	
	//String remains same even after reversing
	public static void main(String[] args) {
		{
			String string = "MADAM", temp = "";
			for (int i=string.length()-1;i>=0;i--) {
				temp = temp + string.charAt(i);
			}
			if (string.equals(temp)) {
				System.out.println("The string " + string + " is palindrome.");
			} else {
				System.out.println("The string " + string + " is not palindrome.");
			}
		}

	}

}
