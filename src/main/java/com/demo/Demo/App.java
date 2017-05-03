package com.demo.Demo;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	App obj = new App();
    	System.out.println("Palindrome from App : "+obj.Palindrome());
    	
    }
    public int Palindrome(){

    	int r,sum=0,temp;    
//	 	Scanner s = new Scanner(System.in);
//	 	int n = s.nextInt();
    	int n=454;
	  
	  temp=n;    
	  while(n>0){    
	   r=n%10; 
	   sum=(sum*10)+r;    
	   n=n/10;    
	  }    
	  if(temp==sum) { 
		  System.out.println("SUM :"+sum);
	   return sum;  }	 
	  else    {
	   return 0;  
	  }
    }
}
