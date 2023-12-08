package j0725;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		// 1차원 배열 ㅁㅁㅁㅁㅁ
		
		Scanner s1=new Scanner(System.in);
		
		int score[]=new int[5];
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1) + "번째 점수 : ");
			score[i]=s1.nextInt();
		}
		for(int i=0; i<score.length; i++)
		{
			System.out.printf("score[%d] ; %d\n", i, score[i]);
		}
	}

}
