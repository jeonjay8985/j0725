package j0725;

public class exam05 {

	public static void main(String[] args) {
		// do while문-구구단
		
		int i=1;
		do {
			int j=1;
			do {
				System.out.printf("%2d*%2d=%2d\n", i, j, i*j);
			    j++;	
			}while (j<=9);
			
			System.out.println(i);
			i++;
		}while(i<=9);

	}

}
