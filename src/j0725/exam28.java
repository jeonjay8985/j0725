package j0725;

import java.util.Scanner;

public class exam28 {

	public static void main(String[] args) {
		// 실습4-21
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요?");
		int count=s1.nextInt();
		int sum=0;//합계
		int realcount=0;//실제 더해진 갯수
		
		for(int i=1;i<=count;i++) {
			System.out.print("정수:");
			int num=s1.nextInt();
			sum=sum+num;
			if(sum>1000) {
				System.out.println("합계가 1,000을 넘었습니다.");
				System.out.println("마지막 값은 무시합니다.");
				sum=sum-num;
				break;
			}
			realcount++;
			
		}
		System.out.printf("합계는 %d입니다.\n",sum);
		System.out.printf("평균은 %.2f입니다.",(float)sum/realcount);
		
	
		/*
        Scanner s1=new Scanner(System.in);
		
		System.out.println("정수를 더합니다");
		System.out.println("몇 개를 더할까요?:" );
		int n=s1.nextInt();
		int sum=0;
		int i=1;
				
			for (i=1; i<=n; i++)
			{System.out.print("정수: ");
			int num=s1.nextInt();
			sum +=sum;
			if(sum>1000) {
				sum += num;
				System.out.println("마지막 값은 무시합니다");
				break;
			}
			System.out.printf("합계는 %d입니다 \n", sum);
			System.out.printf("평균은 %d입니다 \n", sum/(i-1));
		
			*/
		}

	}


