package java0318;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//�ϳ��� ������ �Է� �޾Ƽ� �� �ڸ����� ���� ����ϴ� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("���� �Է�");
		int su = sc.nextInt();
		int sum = 0;
		//���� 0�� �� �� ���� 10���� ����� �������� ��Ӵ����ָ� �˴ϴ�.
		while (su != 0) {
			sum = sum + su % 10;
			su = su / 10;
		}
         System.out.printf("�հ�:%d\n", sum);
         
         sc.close();
	}

}
