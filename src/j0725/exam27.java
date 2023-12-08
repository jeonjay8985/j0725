package j0725;

import java.util.Scanner;

public class exam27 {

	public static void main(String[] args) {
		// 실습4-20
		
       Scanner s1=new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요?");
		int count=s1.nextInt();
		int sum=0;//합계
		int realcount=0;//실제 더해진 갯수
		
		for(int i=1;i<=count;i++) {
			System.out.print("정수(0으로 종료):");
			int num=s1.nextInt();
			sum=sum+num;
			if(num==0) {
				break;
			}
			realcount++;
		}
		System.out.printf("합계는 %d입니다.\n",sum);
		System.out.printf("평균은 %.2f입니다.",(float)sum/realcount);

		
		
		/*
        Scanner s1=new Scanner(System.in);
        System.out.println("정수를 더합니다");
		System.out.print("몇 개를 더할까요?:" );
		int n=s1.nextInt();
		int sum=0;
		int i=1;
		
		for(i=1; i<=n; i++) {
			System.out.print("정수(0으로 종료) : ");
			int num=s1.nextInt();
			if(num==0) {
				break;
			}
			sum += num;
		}
		System.out.printf("합계는 %d입니다\n", sum);
		System.out.printf("평균은  %d입니다\n", sum/(i-1));
        
        /*
		System.out.println("정수를 더합니다");
		System.out.println("몇 개를 더할까요?:" );
		int num=s1.nextInt();
		int sum=0;
		int i;  //int i를 바깥으로 빼줘야 for문 이외에서도 쓸 수 있음!!
		for(i=1; i<=num ; i++) {
			System.out.print("정수(0으로 종료) : ");
			int t=s1.nextInt();
			if (t==0) {
				break;
			}
			sum=sum+t; //sum+=t;
		}
		System.out.println("합계는 "+sum+"입니다");
		System.out.println("평균은 "+sum/(i-1)+"입니다"); //0입력시, 0으로 나누는 것까지 3번 카운트 되므로 i-1이 되어야 함!
        */
	}

}
