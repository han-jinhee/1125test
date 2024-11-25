package com.javaex.problem04;

public class CConverterApp {

	public static void main(String[] args) {
		CConverter cc1=new CConverter();
		double d1=cc1.dollertowon(1000000);
		System.out.println("백만원은"+d1+"달러입니다.");
		double d2=cc1.wontodoller(100);
		System.out.println("백달러는"+d2+"원입니다.");
	}

}
