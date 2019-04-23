package java0214;

import java.util.Scanner;

public class Five2 {

	//입력하는 데이터를 정수 대신에 문자열로 변경하기
	//베트남, 중국, 일본, 한국 으로 변경 
	public static void main(String[] args) {
		//변수의 자료형 앞의 final이 붙으면 데이터를 변경할 수 없는 상수가 됩니다.
		//변수는 안됨 
		//1 2 3 4로 표현하거나 final을 붙여 상수로 만들기 
		final String VETNAM = "다낭";
		final String CHINA = "베이징";
		final String JAPAN = "도쿄";
		final String KOREA = "서울";
		
		//메뉴(정수)를 입력받기 위한 구문
		Scanner sc = new Scanner(System.in);
		System.out.printf("나라 도시 입력:");
		String menu = sc.nextLine();
		
		//switch 에는 정수와 String 만 가능
		switch(menu) {
		//case 1: ---->이렇게도 쓸수있고
		//case 1: 대신 case VETNAM: 같이 표현할 수있다.
 		case VETNAM :
			//break를 생략하면 break를 만날때까지의 처리를 전부 수행합니다. ex) 1번을 치면 쌀국수랑 간짜장이 같이 나옴.
			System.out.printf("베트남\n");
			//break;
			break;
		//case 2:---->이렇게도 쓸수있고
		case CHINA:
			System.out.printf("중국\n");
			break;
		//case 3:---->이렇게도 쓸수있고
			case JAPAN:
			System.out.printf("일본\n");
			break;
		//case 4:---->이렇게도 쓸수있고
			case KOREA:
			System.out.printf("한국\n");
			break;
		default:
			System.out.printf("잘못된 나라입니다.\n");
			break;
		}
		
		sc.close();

	}

	}

