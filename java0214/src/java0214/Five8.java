package java0214;

import java.util.Scanner;

public class Five8 {

	public static void main(String[] args) {
		// �Ҽ�(prime)�Ǻ��ϱ�
		// �Ҽ��� 1�� �ڱ� �ڽ����θ� ������ ���� ��
		/*
		 * Scanner sc = new Scanner(System.in); 
		 * System.out.printf("�����Է�:"); 
		 * int su =sc.nextInt(); 
		 * int i; 
		 * boolean flag = false;
		 * 
		 * for (i = 2; i < su/2; i=i+1){ 
		 * if(su % i == 0) { 
		 * flag = true; break; }
		 * 
		 * } if (flag == false) 
		 * { System.out.printf("�Ҽ�");
		 * 
		 * } else {
		 *  System.out.printf("�Ҽ� �ƴ�"); }
		 */
		// ���� 1���� �Է¹޾Ƽ� �Ҽ��Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.printf("�����Է�:");
		int su = sc.nextInt();
		// �Ҽ��� 2���� �ڽ��� ���ݱ����� ���ڷ� ������ �������� ������ �Ҽ�
		// ������ �������� �Ҽ��� �ƴ�
		boolean flag = false;

		// �Ҽ����� Ȯ��
		for (int i = 2; i <= su / 2; i = i + 1) {
			if (su % i == 0) {
				flag = true;
				break;
			}
			//���� �ȿ� ������ ������ �ݺ� ��
		}
		//����� ������ �ѹ� ���
		// Ȯ�ε� ����� ���
					if (flag == true) {
						System.out.printf("%d��(��)�Ҽ� �ƴ�\n", su);

					}

					else {
						System.out.printf("%d��(��)�Ҽ�\n", su);
					}
					sc.close();

	}
}