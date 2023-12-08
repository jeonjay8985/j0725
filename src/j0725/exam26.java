package j0725;

import java.util.Scanner;

public class exam26 {

	public static void main(String[] args) {
		// 실습4-19
		Scanner s1 = new Scanner(System.in);
		System.out.println("정숫값 : ");
		int num=s1.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.println(i+"의 제곱은 "+(i*i)+" 입니다");
			}
		
	}

}
