package java0213;

import java.util.Scanner;

public class Data6 {

	public static void main(String[] args) {
		// 정수 한 개를 입력받아서 출력
            Scanner sc = new Scanner(System.in);
            System.out.printf("점수를 입력하세요");
            int r = sc.nextInt();
            System.out.printf("r:%d\n", r);
            
            System.out.printf("이름을 입력하세요:");
            //다른 입력을 받고 문자열을 입력받을 때는 nextLine을 한 번 더 불러줘야 합니다.
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("이름:%s\n", name);
            
            
	}

}
