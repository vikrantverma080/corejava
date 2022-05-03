package com.corejava;

public class Fibonacci {
//Sum of two preceding numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144.
	public static void main(String[] args) {
		
		int fibo1=0, fibo2=1, sum=0;		
		for(int i=2;i<10;i++) {
		sum=fibo1+fibo2;
		System.out.print(" "+sum);
		fibo1=fibo2;
		fibo2=sum;
		}		
	}
}