package java0214;

import java.util.Scanner;

public class Five8 {

	public static void main(String[] args) {
		// 소수(prime)판별하기
		// 소수는 1과 자기 자신으로만 나누어 지는 수
		/*
		 * Scanner sc = new Scanner(System.in); 
		 * System.out.printf("숫자입력:"); 
		 * int su =sc.nextInt(); 
		 * int i; 
		 * boolean flag = false;
		 * 
		 * for (i = 2; i < su/2; i=i+1){ 
		 * if(su % i == 0) { 
		 * flag = true; break; }
		 * 
		 * } if (flag == false) 
		 * { System.out.printf("소수");
		 * 
		 * } else {
		 *  System.out.printf("소수 아님"); }
		 */
		// 정수 1개를 입력받아서 소수판별
		Scanner sc = new Scanner(System.in);
		System.out.printf("숫자입력:");
		int su = sc.nextInt();
		// 소수는 2부터 자신의 절반까지의 숫자로 나누어 떨어지지 않으면 소수
		// 나누어 떨어지면 소수가 아님
		boolean flag = false;

		// 소수인지 확인
		for (int i = 2; i <= su / 2; i = i + 1) {
			if (su % i == 0) {
				flag = true;
				break;
			}
			//여기 안에 있으면 여러번 반복 출
		}
		//여기로 나가면 한번 출력
		// 확인된 결과를 출력
					if (flag == true) {
						System.out.printf("%d는(은)소수 아님\n", su);

					}

					else {
						System.out.printf("%d는(은)소수\n", su);
					}
					sc.close();

	}
}