package j0725;

import java.util.Arrays;
import java.util.Scanner;

public class exam36 {

	public static void main(String[] args) {
		// 실습4-29
		
		Scanner s1 = new Scanner(System.in);
		
		int[] numArr=new int[10];
		
		System.out.print("정수 10개 입력: ");
		for(int i=0; i<numArr.length; i++) {
			numArr[i]=s1.nextInt();
		}
		
		Arrays.sort(numArr);    //어레이즈.소트로 정렬
		
		for(int i=0; i<numArr.length; i++) {
			System.out.printf("%d ", numArr[i]);
		}
		
		
		/*
		int num[] = new int[10];
		for(int i=0; i<num.length; i++) {
			num[i]=s1.nextInt();
		}
		*/
		
		
		
				
		

	}

}
