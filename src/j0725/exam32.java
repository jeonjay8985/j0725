package j0725;

import java.util.Scanner;

public class exam32 {

	public static void main(String[] args) {
		// 실습4-25
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("임의의 정수를 입력하시오>> ");
		int n=s1.nextInt();
		
		for(int i=n; i>0; i--) {
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
		      System.out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			  System.out.println();
		}
		
		/*
	    for(int i=1; i<=n; i++) {
		    for(int k=1; k<=n-i+1; k++) {
			   System.out.print("*");
		}
		    System.out.println();
	    }
			
		  for(int i=1; i<=n; i++) {
			  for(int t=1; t<=i; t++)  {
				  System.out.print("*");
			  }
			  System.out.println();
		  }
		*/	  
		
	   }
	}

