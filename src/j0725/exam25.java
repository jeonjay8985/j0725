package j0725;

import java.util.Scanner;

public class exam25 {

	public static void main(String[] args) {
		// 실습4-18
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다");
		
		System.out.println("단수는? : ");
		int n=s1.nextInt();
		for(int i=1; i<=n; i++) {
		   for(int j=1; j<=n-i+1; j++) {
			   System.out.print("*");
		}
		   System.out.println();
		
		/*
		for(int i=1; i<=num; i++) {
			for(int k=1; k<=num-i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
			*/
		} 

	}

}
