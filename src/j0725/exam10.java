package j0725;

import java.util.Scanner;

public class exam10 {

	public static void main(String[] args) {
		// 실습4 -03
		
        Scanner s1=new Scanner(System.in);
		
	    System.out.print("두 개의 실수를 입력하세요 : ");
	    Float num1=s1.nextFloat();
	    Float num2=s1.nextFloat();
	    
	    Float hap=num1+num2;
	    Float ever=(num1+num2)/2;
	    
	    System.out.println("두 수의 합은"+hap+"입니다");
	    System.out.println("두 수의 평균은"+ever+"입니다");
	    
		

	}

}
