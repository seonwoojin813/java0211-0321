package java0318;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//하나의 정수를 입력 받아서 각 자릿수의 합을 출력하는 문제
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("정수 입력");
		int su = sc.nextInt();
		int sum = 0;
		//몫이 0이 될 때 까지 10으로 나누어서 나머지를 계속더해주면 됩니다.
		while (su != 0) {
			sum = sum + su % 10;
			su = su / 10;
		}
         System.out.printf("합계:%d\n", sum);
         
         sc.close();
	}

}
