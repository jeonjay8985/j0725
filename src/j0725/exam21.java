package j0725;

import java.util.Scanner;

public class exam21 {

	public static void main(String[] args) {
		// 실습4-14
		
		 Scanner s1 = new Scanner(System.in);

	      System.out.print("연도를 입력하세요 : ");
	      int year=s1.nextInt();
	      
	      if(year%4==0 && !(year%100==0) || year%400==0) {
	    	  System.out.println(year+ "년은 윤년입니다");
	      }

	}

}
