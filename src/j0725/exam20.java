package j0725;

import java.util.Scanner;

public class exam20 {

	public static void main(String[] args) {
		// 실습4-13
		
		Scanner s1 = new Scanner(System.in);
		
		int sum=0;
		while(true) { //while의 무한루프는 트루!
			System.out.print("바코드 입력값: ");
		    String bar=s1.next();
		    if(bar.equals("q")) {
		    	System.out.printf("total : %d\n", sum);
		    	break;
		    }
		    sum=sum+Integer.parseInt(bar); //스트링 문자를 숫자로 바꿔줌
		}
		
		/*
		 String n;
		 int sum=0;
		 
		 for (int i=1;  ; i++) {
			 System.out.print("바코드 입력값 : ");
			 n=s1.next()	;
			 
			 if(n.equals("q")) {
				  System.out.print("total : " +sum);
				  break;
			  }
			 sum=sum+Integer.parseInt(n);   //문자를 숫자로 바꿔주는 코드
	   }*/
	}
}
