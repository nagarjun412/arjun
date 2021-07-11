package com.facebook;

import java.util.Scanner;

public class log {

	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter int");
	   int i=sc.nextInt();
	   int u=(int)Math.pow(2, i);
	   int sum=0;
	   if(u<10)
	   {
		   System.out.println(u);
	   }
	   else
	   {
		   while(u>0)
		   {
			   int r=u%10;
			   sum=sum+r;
			   u=u/10;
		   }
		   System.out.println(sum);
	   }
	   

	}

}
