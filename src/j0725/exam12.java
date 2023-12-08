package j0725;

import java.util.Scanner;

public class exam12 {

	public static void main(String[] args) {
		// 실습4-05
		Scanner s1=new Scanner(System.in);
		
		System.out.print("임의의 달을 입력: ");
		int mon=s1.nextInt();
		
		if(mon<6 && mon>=1) {
			System.out.print(mon+ "월은 상반기입니다");
		}else if (mon<=12 && mon>=6 ){
			System.out.print(mon+ "월은 하반기입니다");
			
		}
		

	}

}
