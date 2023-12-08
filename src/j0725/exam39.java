package j0725;

import java.util.Scanner;

public class exam39 {

	public static void main(String[] args) {
		// 실습4-31
		
		 Scanner s1 = new Scanner(System.in);
		 boolean run=true;
		 int num=0;
		 int score[]=null;  //학생수를 정하면 크기가 정해짐
		 while(true) {
			 System.out.println("--------------------------------------------");
			 System.out.println("1.학생수| 2.정수입력| 3.점수리스트| 4.분석| 5.종료");
			 System.out.println("--------------------------------------------");
			 System.out.print("선택> ");
			 int selNo=s1.nextInt();
			 if(selNo==1) {
				 System.out.print("학생수>");
				 num=s1.nextInt();
				 score=new int[num];
			 }else if(selNo==2) {
				 System.out.println("###정수입력###");
				 for(int i=0; i<score.length; i++) {
					 System.out.printf("score[%d]> ", i);
					 score[i]=s1.nextInt();
					 if(!(score[i]>0 && score[i]<=100)) {
						 System.out.println("잘못된 점수입니다"); //while(true){if:score[i]>0 && score[i]<=100┘break; +else:잘못된점수}
					 }
				 }
			 }else if(selNo==3) {
				 for(int i=0; i<score.length; i++) {
					 System.out.printf("score[%d]=%d\n" , i, score[i]);
				 } }else if(selNo==4) {
					int max=0;
					int sum=0;
					double avg=0;
					for(int i=0; i<score.length; i++) {
						max=(max<score[i])? score[i]:max;//
						  //if max<score[i]
						sum+=score[i];
					}
				 avg=(double)sum/num;
				 System.out.printf("최고점수 : %d\n", max);
				 System.out.printf("평균점수 : %.2f\n", avg);
			 }else if(selNo==5) {
				 run=false;
				 break;
			 }else {
				 System.out.println("잘못된 작업번호(1~5번만 가능)");
				 continue;
			 }
			
		} System.out.println("프로그램 종료");
		 
  }
		 

	}


