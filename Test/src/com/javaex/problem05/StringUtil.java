package com.javaex.problem05;

public class StringUtil {
	
   String stringsum(String[] str) {
	   String strsum="";
	   for(String str1:str) {
		   strsum=strsum+str1+" ";
	   }
	   return strsum;
   }
	
}
