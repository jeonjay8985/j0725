package j0725;

public class exam07 {

	public static void main(String[] args) {
		// 2차원 배열 ㅁㅁㅁㅁ
		//          ㅁㅁㅁㅁ
		//          ㅁㅁㅁㅁ
		
		int myArr[][]=new int[3][4];
		myArr[0][0]=10;
		myArr[0][1]=20;
		
		System.out.println(myArr.length+ " " +myArr[0].length);
		for(int i=0; i<myArr.length; i++) { //i<myArr.length; 행의길이 i<3;
		 for(int j=0; j<myArr[0].length; j++) { //myArr[0].length; 열의길이 j<4;
			 myArr[i][j]=(i*4+j+1)*10;
			 /*
			 myArr[i][j]=(j+1)*10;
			 System.out.printf("%3d", myArr[i][j]);
			 */
		 
		}
		 
		 
		  System.out.println();
		}
		
	}

}
