package objecttest;

import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		// �⵵�� ���� �Է� �޾Ƽ� �Է��� ���� �޷� �����
		
		//�⵵�� �� �Է¹ޱ�
		
		Scanner sc = new Scanner(System.in);
		
	  System.out.printf("�⵵");
	  int year = sc.nextInt();
	  System.out.printf("��");
	  int month = sc.nextInt();
	  
	  //�Է��� �⵵���� ������ ��¥ �� ���ϱ�
	  int cnt = 0;
	  for(int i=1; i<year; i=i+1) {
		  //�������� Ȯ��
		  if(i%4 == 0 && i%100!= 0 || i%400 == 0) {
			  //�����̶� 366 ���ϱ�
              cnt = cnt+ 366; 			  
		  }
		  else {
			  //������ �ƴ϶� 365 ���ϱ�
			  cnt = cnt + 365;  
		  }
		}
                	//  System.out.printf("%d\n", cnt % 7);
	  
	            //�Է��� ������ ������ ������ �߰�
	            //�� ���� ������ �迭�� �����صθ� �ݺ����� ����� �� ����
	            //�迭�� ���� �� ó������ �����͸� �����ϸ� �ݺ��� ����ϴ� ���� ������
	            //��찡 �ֽ��ϴ�.
	            //ù��° �����ʹ� ������ �ι�° ���� �����͸� �����ϴ� ���� ��
	      int [] nalsu = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	            
	      //�����̸� 2���� ������ 29�� �Ǿ���մϴ�
	      if(year %4 == 0 && year %100!= 0 || year %400 == 0) {
	    	  nalsu[2] = 29;
	    	 }
	      //�Է��� ������ ������ ������ ���ϱ�
	      for(int i=1; i<month; i=i+1) {
	    	  cnt = cnt + nalsu[i]; 
	      }
	 
	   // System.out.printf("%d\n", (cnt % 7+1));
	   //�Ͽ��Ϻ��� ����� �Է��� ���� 1���� ����
	      
	      // �迭�� ���� �߰�
	      //���� 0���� �ʱ�ȭ
	      int [] calender = new int[42];
	      int k = cnt % 7 + 1;
	      for(int i = 0; i<nalsu[month]; i=i+1) {
	    	  calender [k+i] = i+1;
	    	  //+1���ִ� �� �� ����ϱ�
	    	  // ������ �̴ϱ� 
	      }
	      //�޷� ���
	      System.out.printf("  ��  ��  ȭ   ��   ��   ��   ��\n");
	      for (int i=0; i<calender.length; i=i+1) {
	     if (calender[i] == 0) {
	    	  System.out.printf("      ");
	     }
	     // System.out.printf("%d\n", calender[i]);
	     
	     //0�� �ƴ� ���� ���� ���
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
	
