package java0319;

import java.util.Scanner;

public class Moonja {

	public static void main(String[] args) {
		// 문자의 진행 순서는 맨 오른쪽 아래에서 위쪽으로 'A'부터 차례대로 채워나가는 방법으로 아래 표와 같이 왼쪽 위까지 채워 넣는다. 
        //'Z' 다음에는 다시 'A'부터 반복된다.
    Scanner input = new Scanner (System.in);
     int n = input.nextInt();
     char [][] ar = new char [n][n];
     int num = 0;
     for(int i=0; i<n; i++) {
    	 for(int j=0; j<n; j++) {
    		 ar[n-1-j][n-1-i] = (char)('A'+num++); 
    	 }
     }
        System.out.printf("%c", ar);

    
    
    
     }	
	}


