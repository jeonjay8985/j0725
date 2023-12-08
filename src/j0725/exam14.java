package j0725;

import java.util.Scanner;

public class exam14 {

	public static void main(String[] args) {
		// 실습4-07
		
		Scanner s1=new Scanner(System.in);
		 int sum=0;
		
		for(int i=3; i<=100; i+=3) {
			System.out.println(i);
		    sum=sum+i;
		}
		System.out.println("sum : " + sum);
	}
		

	}


