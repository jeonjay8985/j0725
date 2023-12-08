package j0725;

import java.util.Scanner;

public class exam13 {

	public static void main(String[] args) {
		// 실습4-06
		Scanner s1=new Scanner(System.in);
		
		System.out.println("금액 하나를 입력(천원 단위 이상) >> ");
		int fee=s1.nextInt();
		
		System.out.println("입력한 금액 : " +fee);
		
		int oman =0;
		int man =0;
		int ocheon =0;
		int cheon =0;
		
	    oman=fee/50000;
	    man=fee%50000/10000;
	    ocheon=fee%50000%10000/5000;
	    cheon=fee%50000%10000%5000/1000;
	    
	    System.out.println("오만원권 :  " +oman+ "개");
	    System.out.println("만원권 :  " +man+ "개");
	    System.out.println("오천원권 :  " +ocheon+ "개");
	    System.out.println("천원권 :  " +cheon+ "개");		
	

	}

}
