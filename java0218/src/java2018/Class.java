package java2018;

public class Class {

	public static void main(String[] args) {
		int a = 10;
		int[]ar = {100, 200,300};
		int b = a;
		int []  br = ar;
		 b = 20;
         br[0] = 20;		
         System.out.println(a);
         System.out.println(ar[0]);
	} 

}
