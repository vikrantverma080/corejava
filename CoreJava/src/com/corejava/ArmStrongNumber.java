package com.corejava;

public class ArmStrongNumber {
	
	//Number is considered as Armstrong number if the total of its individual value is 
	//equal to the number. Ex - 371 = (3*3*3)+(7*7*7)+(1*1*1).
	public static void main(String[] args) {
		
		int armStrongNumber = 371, remainder=0, result=0;
		int temp=armStrongNumber;		
		
		while(temp!=0) {
		remainder=temp%10;
		result=result+(remainder*remainder*remainder);
		temp=temp/10;
		}
		if(result==armStrongNumber)
			System.out.println("Given number is Armstrong number.");
		else
			System.out.println("Given number is not Armstrong number.");
	}
}
