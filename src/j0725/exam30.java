package j0725;

import java.util.Scanner;

public class exam30 {

	public static void main(String[] args) {
		// 실습4-23
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("exit를 입력하면 종료합니다");
		//System.out.println(">>");
		
		while(true) {
	    	System.out.print(">>");
		    String text=s1.nextLine();
		    if(text.equals("exit")) {
		        System.out.println("종료합니다...");
		    	break;
		    }
		
		
		
		/*
		String word="";
		
		while(!word.equals("exit")){
			System.out.println(">>");
			word=s1.next();
		}
		
		System.out.println("종료합니다...");
*/
	    }
	}
}
