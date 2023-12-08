package j0725;

import java.util.Scanner;

public class exam18 {

	public static void main(String[] args) {
		// 실습4-11
		
      Scanner s1=new Scanner(System.in);
		
      System.out.println("1부터 n까지의 합을 구합니다");
      System.out.println("n의 값: ");
      int n=s1.nextInt();
      int sum=0;
      for(int i=1; i<=n; i++) {
    	  if(i==n) {
    		  sum+=i;
    		  
    		  System.out.printf("%d=%d", i, sum);
    	  }else {
    		  System.out.printf("%d+", i);
    	  }
      }
      /*
      System.out.println("1부터 n까지의 합을 구합니다");
      System.out.println("n의 값: ");
          int n=s1.nextInt();
          int sum=0;
          
		for(int i=1; i<=n; i++) {
			System.out.println(i);
			sum+=i;
	  }System.out.println("합은 : " + sum);
	*/
	
	}
}
