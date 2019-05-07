package java0318;

import java.util.Scanner;

public class Testsample {

	public static void main(String[] args) {
		  //입력받은 숫자의 합
	      // 1234 -> 1+2+3+4 =10
		Scanner sc = new Scanner(System.in);
		 int su = sc.nextInt();
		int sum = 0;
		while(su != 0) {
	         sum = sum + su%10;  
	         su=su/10;
	      }
		System.out.printf("결과 : %d\n",sum);		
	}
}
