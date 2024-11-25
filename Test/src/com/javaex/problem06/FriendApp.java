package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
     Friend[] f1=new Friend[3];
     
     Scanner in=new Scanner(System.in);
     System.out.println("친구를 3명 등록해 주세요.");
     String str=in.nextLine();
     String[] str1=str.split(" ");       
     
//     f1[0].name=str1[0];
//     f1[0].phonenum=str1[1];
//     f1[0].school=str1[2];
//     System.out.println(str1[0]+str1[1]+str1[2]);
      f1[0]=new Friend(str1[0],str1[1],str1[2]);
    		  
      str=in.nextLine();
      String[] str2=str.split(" ");       
     
//     f1[0].name=str2[0];
//     f1[0].phonenum=str2[1];
//     f1[0].school=str2[2];
     f1[1]=new Friend(str2[0],str2[1],str2[2]);
     
     str=in.nextLine();
     String[] str3=str.split(" ");       
     
//     f1[0].name=str3[0];
//     f1[0].phonenum=str3[1];
//     f1[0].school=str3[2];
     f1[2]=new Friend(str3[0],str3[1],str3[2]);
     
     for(int i=0;i<f1.length;i++) {
    	 System.out.println("이름:"+f1[i].name+" 핸드폰"+f1[i].phonenum+" 학교:"+f1[i].school);
     }
//     System.out.println(f1[0].name);
	}

}
