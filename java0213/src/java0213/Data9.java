package java0213;

import java.util.Scanner;

public class Data9 {

	public static void main(String[] args) {
		// �ϳ��� ���� (int)�� �Է� �޾Ƽ� �����ϴ� ������ �ۼ�
		Scanner sc = new Scanner(System.in);
		System.out.printf("������ �Է��ϼ���");
		int score = sc.nextInt();
				//score�� 60�� �̻��̸� �հ��̶�� ��� - if�� �̿��ؼ� �ۼ�
	/*
		if(score >= 60) {
		System.out.printf("�հ�\n");
		
		}
*/
	//score�� 60�� �̻��̸� �հ� �׷��� ������ ���հ��̶�� ��� -if ���
	/*
		if (score >= 60){
		System.out.printf("�հ�\n");
	}	
		else {
			System.out.printf("���հ�\n");
		}
	}
	*/
	//90-100 �̸� ��, 80-90�̸��̸� �� 70-80�̸��̸� ��
		//60-70�̸��̸� �� 0-60�̸��̸� �� ��� ���
	
		if(score >= 90 && score <= 100) {
			System.out.printf("��\n");
		}
		else if(score >= 80 && score <= 90) {
			System.out.printf("��\n");
		}
		else if(score >= 70 && score <= 80) {
			System.out.printf("��\n");
		}
		else if(score >= 60 && score <= 70) {
			System.out.printf("��\n");
		}
		else if(score >= 0 && score < 60) {
			System.out.printf("��\n");
		}
		//if�� else if�� ���� �ִ� ��쿡�� else�� �������� ��Ȳ�߻��� ó���մϴ�.
		else{System.out.printf("�߸��� ������ �Է��ϼ̽��ϴ�.\n");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
