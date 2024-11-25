package com.javaex.problem03;

public class Print {
   int num;
   boolean t1;
   double d1;
   String name;
   void print(int num){
	   this.num=num;
	   System.out.println(this.num);
   }
   void print(double num){
	   this.d1=num;
	   System.out.println(d1);
   }
   void print(boolean b1){
	   this.t1=b1;
	   System.out.println(t1);
   }
   void print(String str) {
	   this.name=str;
	   System.out.println(name);
   }
}
