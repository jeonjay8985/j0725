package j0725;

import java.util.Scanner;

public class exam22 {

	public static void main(String[] args) {
		// 실습4-15
		
		 Scanner s1 = new Scanner(System.in);
			
	      System.out.print("아이디 : ");
	      String id=s1.next();
	      System.out.print("패스워드 : ");
	      int pass=s1.nextInt();
	      
	      if(id.equals("java")) {
	    	  if(pass==12345) {
	    		  System.out.println("로그인 성공");
	    	  }else {
	    		  System.out.println("패스워드가 틀림");
	    	  }
	      }else {
	    	  System.out.println("아이디가 존재하지 않음");
	      }
	      
	      
	      /*
	      if(id.equals("java") && pw==12345) {
	    	  System.out.println("로그인 성공");
	      }else if(!id.equals("java") && pw==12345)  {
	    	  System.out.println("아이디 존재하지 않음");
	      }else if(id.equals("java") && !(pw==12345))  {
	    	  System.out.println("패스워드가 틀림");

	   }*/
	}
}
