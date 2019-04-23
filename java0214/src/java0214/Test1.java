package java0214;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*
		// 1. 하나의 정수를 입력받아서 정수의 값이 10보다 크거나 같다면 충분하다라는 메시지를 출력하고
		//5-9사이라면 주의하라라고 출력하고
		//0보다 작거나 같다면 주문을 하라고 출력
		
		Scanner sc = new Scanner(System.in);
		  System.out.printf("하나의 정수 입력");
		  int su = sc.nextInt();
		  if(su >=10) {
			  System.out.printf(" 충분하다\n ");
		  }else if (su >= 5&& su <=9) {
			  System.out.printf(" 주의하라\n ");
			   } else if (su <= 0) {
				   System.out.printf(" 주문을 하라 ");
			   }
  sc.close();

	*/
	/*
		//2.Hello TJOEN을 다섯번 출력하시오.
		for(int i=0; i<5; i=i+1) {
			System.out.printf("Hello TJOEN\n");
		}
		*/
		/*
		  *****
		  *****
		  *****
		  *****
		  *****
	         	for (int i=0; i<6; i=i+1) {
		    	  for (int j=0; j<6; j=j+1) {
		       System.out.printf("*");
		    	  }
		    	  System.out.printf("\n");
		  }		
		*/
		
		
		
		
		/*
		 ***
		 **
		 *
		 **
		 ***
		 */
		/*
		for (int i=0; i<5; i=i+1) {
			if (i<3) {
				for (int j =0; j<3-i; j=j+1) {
				   System.out.printf("*");
				} 
			} 
			else {
				for(int j=0; j<i-1; j=j+1) {
					System.out.printf("*");
				}
			}
			System.out.printf("\n");		
		}		
	*/
		/*
		//11번째 피보나치 수열의 값을 찾아보기
		//1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
		int n1 = 1;
		int n2 = 1;
		int result = 1;
                  for(int i = 3; i<=11; i=i+1) {
                	  result = n1+n2;
                	  n1=n2;
                	  n2=result;
                  }System.out.printf("11번째 피오나치수 %d\n", result);
                  */
      /*
	             1
	     2            3
	4                     5
6	  7   8   9  0   1    2

*/
  
		
		
		
 
}
}