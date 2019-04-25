package objecttest;

import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		// 년도와 월을 입력 받아서 입력한 월의 달력 만들기
		
		//년도와 월 입력받기
		
		Scanner sc = new Scanner(System.in);
		
	  System.out.printf("년도");
	  int year = sc.nextInt();
	  System.out.printf("월");
	  int month = sc.nextInt();
	  
	  //입력한 년도까지 지나온 날짜 수 더하기
	  int cnt = 0;
	  for(int i=1; i<year; i=i+1) {
		  //윤년인지 확인
		  if(i%4 == 0 && i%100!= 0 || i%400 == 0) {
			  //윤년이라서 366 더하기
              cnt = cnt+ 366; 			  
		  }
		  else {
			  //윤년이 아니라서 365 더하기
			  cnt = cnt + 365;  
		  }
		}
                	//  System.out.printf("%d\n", cnt % 7);
	  
	            //입력한 월까지 지나온 날수를 추가
	            //각 월의 날수를 배열에 저장해두면 반복문을 사용할 수 있음
	            //배열을 만들 때 처음부터 데이터를 저장하면 반복문 사용하는 것이 불편한
	            //경우가 있습니다.
	            //첫번째 데이터는 버리고 두번째 부터 데이터를 저장하는 것이 편리
	      int [] nalsu = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	            
	      //윤년이면 2월의 날수가 29가 되어야합니다
	      if(year %4 == 0 && year %100!= 0 || year %400 == 0) {
	    	  nalsu[2] = 29;
	    	 }
	      //입력한 월까지 지나온 날수를 더하기
	      for(int i=1; i<month; i=i+1) {
	    	  cnt = cnt + nalsu[i]; 
	      }
	 
	   // System.out.printf("%d\n", (cnt % 7+1));
	   //일요일부터 계산한 입력한 월의 1일의 요일
	      
	      // 배열의 일을 추가
	      //전부 0으로 초기화
	      int [] calender = new int[42];
	      int k = cnt % 7 + 1;
	      for(int i = 0; i<nalsu[month]; i=i+1) {
	    	  calender [k+i] = i+1;
	    	  //+1해주는 거 꼭 기억하기
	    	  // 다음날 이니까 
	      }
	      //달력 출력
	      System.out.printf("  일  월  화   수   목   금   토\n");
	      for (int i=0; i<calender.length; i=i+1) {
	     if (calender[i] == 0) {
	    	  System.out.printf("      ");
	     }
	     // System.out.printf("%d\n", calender[i]);
	     
	     //0이 아닐 때는 값을 출력
	     else {
	    	 System.out.printf(" %3d ", calender[i]);
	     }
	     if(i%7==6) {
	    	  System.out.printf("\n");   
	      }
	      sc.close();
	  
		}
	}
}
	
