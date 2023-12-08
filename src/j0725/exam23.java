package j0725;

import java.util.Scanner;

public class exam23 {

	public static void main(String[] args) {
		// 실습4-16
		
		 Scanner s1 = new Scanner(System.in);
			
	        System.out.print("혜택 등급을 입력하세요 : ");
	        String grade=s1.next();
	        
	        if(grade.equals("A")) {
	        	System.out.print("VVIP혜택을 받으실 수 있습니다");
	        }else if(grade.equals("B")){
	        	System.out.print("VIP혜택을 받으실 수 있습니다");
	        }else if(grade.equals("C")){
	        	System.out.print("우수회원혜택을 받으실 수 있습니다");
	        }else if(grade.equals("D")){
	        	System.out.print("일반회원혜택을 받으실 수 있습니다");
	        }else {
	        	System.out.print("혜택이 없습니다");
	        }

	}

}
