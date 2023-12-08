package j0725;

import java.util.Scanner;

public class exam31 {

	public static void main(String[] args) {
		// 실습4-24 =>if/while문 사용
		
		Scanner s1=new Scanner(System.in);
		
		System.out.print("시작값 입력 : ");
		int start=s1.nextInt();
		System.out.print("끝값 입력 : ");
		int end=s1.nextInt();
		System.out.print("배수 : ");
		int plus=s1.nextInt();
		
		int i=start;
		int sum=0;
		
		while(i<=end) {
			if(i%plus==0) {
				sum=sum+i;
			}
			i++;
		}
		System.out.printf("%d부터 %d까지의 %d배수의 합계 ==>", start, end, plus);
		System.out.printf("%d", sum);
		
		/*
		while(i<=end) {
			i=i+plus;
			sum=sum+i-plus;
		}
		*/
		
		/*
		for(int i=start; i<=end; i=i+plus) {         
			sum=sum+i;
		}
	    
		
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합 : ", start, end, plus);
		System.out.printf("%d", sum);
         */
	}

}
