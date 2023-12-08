package j0725;

public class exam16 {

	public static void main(String[] args) {
		// 실습4-09
		int sum=0;
		int i=3;
		do{
			System.out.println(i);
			
			sum=sum+i;
			i+=3;
		}while( i<=100) ;
	System.out.println("sum : " + sum);

	}
}
