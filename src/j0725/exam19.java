package j0725;

import java.util.Scanner;

public class exam19 {

	public static void main(String[] args) {
		// 실습4-12
		
		 Scanner s1 = new Scanner(System.in);
			
	        System.out.print("연봉을 입력하세요(만원) : ");
	        float salary=s1.nextFloat();
	        System.out.print("신용등급을 입력하세요(A~C) : ");
	        String grade=s1.next();
	        System.out.print("기존 고객 여부(yes,no) : ");
	        String customer=s1.next();
	        
	        if((salary>=50000000 || grade.equals("A")) && customer.equals("yes")) {
	        	System.out.print("카드발급조건 만족!!");
	        }else {
	        	System.out.print("카드발급조건을 만족하지 않습니다");
	        }
	        
	        /*
	        if((salary>50000000 || grade.equals("A")) ||(customer.equals("yes")) ) {
	        	System.out.print("카드발급조건 만족!!");
	        }else {
	        	System.out.print("카드발급조건을 만족하지 않습니다");
	        }*/
	        
	}
	


}




	



