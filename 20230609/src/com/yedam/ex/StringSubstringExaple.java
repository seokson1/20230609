package com.yedam.ex;

public class StringSubstringExaple {
	public static void main(String[] args) {
		
		String ssn = "920310-1674828";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}
