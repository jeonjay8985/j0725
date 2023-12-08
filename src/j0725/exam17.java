package j0725;

import java.util.Scanner;

public class exam17 {

	public static void main(String[] args) {
		// 실습4-10
		Scanner s1=new Scanner(System.in);
		
		System.out.println("정숫값 x,y,z의 평균을 구합니다");
		System.out.println("x값: ");
		int num1=s1.nextInt();
		System.out.println("y값: ");
		int num2=s1.nextInt();
		System.out.println("z값: ");
		int num3=s1.nextInt();
		 
		int hap=(num1+num2+num3);
		System.out.println("x,y,z의 합계는 "+hap+"입니다");
		
		double ever=(double)((num1+num2+num3)/3);
		System.out.printf("(%d + %d +%d) 세 수의 평균은 %.2f입니다", num1, num2, num3, ever);
	

	}

}
