package j0725;

import java.util.Scanner;

public class exam33 {

	public static void main(String[] args) {
		// 실습4-26
		
		Scanner s1=new Scanner(System.in);
		
		int balance=0;
		boolean run=true;
		
		while(run) {
			System.out.println("------------------------------------------------");
		    System.out.println("1.예금 |\t2.출금 |\t3.잔고 |\t4.종료");
	 	    System.out.println("------------------------------------------------");
	 	   System.out.print("선택 > ");
	 	   int sell=s1.nextInt();
	 	   switch(sell) {
	 	   case 1:
	 		   System.out.print("예금 > ");
	 		   balance += s1.nextInt();   //예금이니까 더하기
	 		   break;
	 		   
	 	   case 2:
	 		   System.out.print("출금 > ");
	 		   balance -= s1.nextInt();    //출금이니까 빼기
	 		   break;
	 		   
	 	   case 3:
	 		  System.out.print("잔고 > ");
	 		  System.out.printf("%d\n", balance);    //잔고는 그냥 보여만 줌
	 		  break;
	 		  
	 	   case 4:
	 		   run=false; //여기서의 break; 스위치문을 빠져나가는 브레이크문 
	 		   break;
	 	     }
		  }
		System.out.println("프로그램 종료");
    	}
	
	}


