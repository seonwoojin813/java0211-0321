package java0228;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		//Ű����κ��� �Է¹޴� ��ĳ�� �����
		Scanner sc = new Scanner(System.in);
        //���ڿ� �Է¹ޱ�
		System.out.printf("���ڿ� �Է� : ");
        String str = sc.nextLine();
        System.out.printf("�Է��� ���ڿ�:%s\n", str);
		
		//���� 1���� �Է¹ޱ�
		System.out.printf("���� �Է�: ");
		int n = sc.nextInt();
		System.out.printf("�Է��� ����:%d\n", n);
		
		 //���ڿ� �Է¹ޱ�
		System.out.printf("���ڿ� �Է� : ");
		//���� �Է¿��� �Ѿ�� Enter�� ���ֱ� ���ؼ� ȣ��
		sc.nextLine();
        String str1 = sc.nextLine();
        System.out.printf("�Է��� ���ڿ�:%s\n", str1);
        
 
        int su = 0;
        for(int i=0; i<str1.length(); i=i+1) {
        	char ch = str1.charAt(i);
        	if(ch >= '0' && ch <= '9'){
        	su = su* 10 + (str1.charAt(i)-48);//�ƽ�Ŷ �ڵ�� 48�� ���� 0�̾�
        }else {
        	break; //74k81 �� else break�� ���� ������ 74������ �������� k�� ������ �극��ũ�� �ǹ����⶧����
        	             //f43r888 �� ���� 43�� ����ϰ� �ʹٸ� if ���� continue�� ��
        }
       }
       System.out.printf("��ȯ�� ����:%d\n", su); 
		sc.close();
	}

}
