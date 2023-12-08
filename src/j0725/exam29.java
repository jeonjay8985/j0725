package j0725;

import java.util.Scanner;

public class exam29 {

	public static void main(String[] args) {
		// 실습4-22
		
        Scanner s1=new Scanner(System.in);
        /*
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요?");
		int count=s1.nextInt();
		int sum=0;//합계
		int realcount=0;//실제 더해진 갯수
		
		for(int i=1;i<=count;i++) {
			System.out.print("정수:");
			int num=s1.nextInt();
			if(num<0) {
				System.out.println("음수는 더하지 않습니다.");
			}else {
				sum=sum+num;
				realcount++;
			}
			
		}
		System.out.printf("합계는 %d입니다.\n",sum);
		System.out.printf("평균은 %.2f입니다.",(float)sum/realcount);
	}
*/
		 
		 
		 
		System.out.println("정수를 더합니다");
		System.out.print("몇 개를 더할까요?:" );
	    int n=s1.nextInt();
		int sum=0;
		int cnt=0;
		//int i=1;   //i는 마이너스도 카운트하기때문에 평균을 못냄
		
		for(int i=1; i<=n; i++)
		{
			System.out.print("정수 : ");
			int num=s1.nextInt();
			if(num<0) {
				System.out.println("음수는 더하지 않습니다");
			}else {
				cnt++;
				sum+=num; 
			}
			
		}
			System.out.printf("합계는 %d 입니다\n", sum );
			System.out.printf("평균은 %.2f 입니다", (float)sum/cnt );
		}
		
		
	}

	

