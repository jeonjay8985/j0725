package j0725;

import java.util.Scanner;

public class exam11 {

	public static void main(String[] args) {
		// 실습4 -04

        Scanner s1=new Scanner(System.in);
        
        System.out.print("두 개의 실수 : ");
        double d1=s1.nextDouble();
        double d2=s1.nextDouble();
        int n1, n2;
        n1=(int)d1;
        n2=(int)d2;
        System.out.printf("두 수를 정수로 변환: %d %d\n", n1, n2);
        System.out.printf("두 수의 합은 %.2f입니다\n", (float)(n1+n2));
        System.out.printf("두 수의 평균은 %.2f입니다\n", (n1+n2)/2.0); //(float)(n1+n2)/2 해도 됨!
		
        
        /*
	    System.out.print("두 개의 실수를 입력하세요 : ");
	    float num1=s1.nextFloat();
	    float num2=s1.nextFloat();
	   
	    
	    System.out.printf("입력받은 두 수를 int로 변환 : %d %d\n",(int)num1,(int)num2);
	    
	    float hap=(int)num1+(int)num2;
	    float ever=(int)((int)num1+(int)num2)/2;
	    
	    System.out.println("두 수의 합은"+hap+"입니다");
	    System.out.println("두 수의 평균은"+ever+"입니다");
*/
	}

}
