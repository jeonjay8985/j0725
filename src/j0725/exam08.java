package j0725;

import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {
		// 실습4 -01
		Scanner s1=new Scanner(System.in);
		System.out.println("첫번째 수 : ");
		int num1=s1.nextInt();
		System.out.println("두번째 수 : ");
		int num2=s1.nextInt();
		System.out.println("세번째 수 : ");
		int num3=s1.nextInt();
		
		int hap=num1+num2+num3;
		double ever=(double)(num1+num2+num3)/3;
	
		System.out.printf("%d + %d +%d = %d\n", num1, num2, num3, num1+num2+num3);
		System.out.printf("(%d + %d +%d) 세 수의 평균: %.2f", num1, num2, num3, ever);
		
		
	}

}
