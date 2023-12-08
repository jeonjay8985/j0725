package j0725;

import java.util.Scanner;

public class exam38 {

	public static void main(String[] args) {
		// 실습4-30
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("사람수 : ");
		int cnt=s1.nextInt();
		int score[]=new int[cnt]; //cnt가 10명이면 크기가 10이됨. 사람 수 만큼 배열크기 정해짐
		System.out.println("정수를 입력하세요");
		for(int i=0; i<score.length; i++) {
			System.out.printf("%d번의 점수 :",(i+1));
			 score[i]=s1.nextInt();
		}
		int sum=0;
		int max=0;
		int min=100;
		
		for(int i=0; i<score.length; i++) {
			sum=sum+score[i];
			if(max<score[i]) {
				max=score[i];
			}
			if(min>score[i]) {
				min=score[i];		
			}
		}
		System.out.printf("합계는 %d점 입니다\n", sum);
		System.out.printf("평균은 %.1f점 입니다\n", (float)(sum)/score.length);//sum이나 score이나 묶에서 계산해야 실수값이 나옴
		System.out.printf("최고점은 %d점 입니다\n", max);
		System.out.printf("최저점은 %d점 입니다", min);	

	}
}
