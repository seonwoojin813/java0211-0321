package java0319;

import java.util.Scanner;

public class Moonja {

	public static void main(String[] args) {
		// ������ ���� ������ �� ������ �Ʒ����� �������� 'A'���� ���ʴ�� ä�������� ������� �Ʒ� ǥ�� ���� ���� ������ ä�� �ִ´�. 
        //'Z' �������� �ٽ� 'A'���� �ݺ��ȴ�.
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


