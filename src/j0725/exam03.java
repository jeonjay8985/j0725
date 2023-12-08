package j0725;

public class exam03 {

	public static void main(String[] args) {
		// 다중for문-구구단2
		
		 for(int i=1; i<=9; i++) {
			 for(int j=1; j<=9; j++) {
			   System.out.printf("%2d*%2d=%2d", i, j, (i*j));
			 }
			 System.out.println();
		 }

	}

}
