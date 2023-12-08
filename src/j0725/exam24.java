package j0725;

import java.util.Scanner;

public class exam24 {

	public static void main(String[] args) {
		// 실습4-17
		
		Scanner s1=new Scanner(System.in);
		System.out.print("혜택등급을 입력하세요 : ");
		String grade=s1.next();
		switch(grade) {
			case "A":
				System.out.println("VVIP 혜택을 받으실 수 있습니다");
				break;
			case "B":
				System.out.println("VIP 혜택을 받으실 수 있습니다");
				break;
			case "C":
				System.out.println("우수회원 혜택을 받으실 수 있습니다");
				break;
			case "D":
				System.out.println("일반회원 혜택을 받으실 수 있습니다");
				break;
			default:
				System.out.println("혜택이 없습니다");

	  }
	}
}
