package com.javaex.problem04;

public class CConverter {
  double m1;
  double m2;
  
  double dollertowon(double m1) {
	  this.m1=m1;
	  double mm=1385.81;
	  double c1=m1/mm;
	  
	  return c1;
  }
  double wontodoller(double m2) {
	  this.m2=m2;
	  double mm=1385.81;
	  double c2=m2*mm;
	  
	  return c2;
  }
	
}
