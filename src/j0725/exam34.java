package j0725;

import java.util.Scanner;

public class exam34 {

	public static void main(String[] args) {
		// 실습4-27
		
		 Scanner s1 = new Scanner(System.in);
		
		 int[] numArr=new int[5];
		 System.out.print("양수 5개를 입력하세여 : ");
		 for(int i=0; i<numArr.length; i++) {
		 numArr[i]=s1.nextInt();
		 }
		 int max=0;
		 for(int i=0; i<numArr.length; i++) {
			 if(max< numArr[i]) {
				 max=numArr[i];
			 }
		 }
		 System.out.printf("입력된 수 중 가장 큰 수는 %d\n", max);
		
		 
		 /*
	      System.out.print("양수 5개를 입력하세여 : ");
	      int num1=s1.nextInt();
	      int num2=s1.nextInt();
	      int num3=s1.nextInt();
	      int num4=s1.nextInt();
	      int num5=s1.nextInt();
	     
	      if (num1>num2 && num1>num3 && num1>num4 && num1>num5) {
	    	  System.out.println("입력 된 수에서 가장 큰수는 "+num1);
	      }else if(num2>num1 && num2>num3 && num2>num4 && num2>num5) {
	    	  System.out.println("입력 된 수에서 가장 큰수는 "+num2);
	      }else if(num3>num1 && num3>num2 && num3>num4 && num3>num5) {
	    	  System.out.println("입력 된 수에서 가장 큰수는 "+num3);
	      }else if(num4>num1 && num4>num2 && num4>num3 && num4>num5) {
	    	  System.out.println("입력 된 수에서 가장 큰수는 "+num4);
	      }else {
	    	  System.out.println("입력 된 수에서 가장 큰수는 "+num5);
	      }
            */
	}

}
