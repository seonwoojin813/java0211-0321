package java0214;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		//������ �ڷ��� ���� final�� ������ �����͸� ������ �� ���� ����� �˴ϴ�.
		//������ �ȵ� 
		//1 2 3 4�� ǥ���ϰų� final�� �ٿ� ����� ����� 
		final int VETNAM = 1;
		final int CHINA = 2;
		final int JAPAN = 3;
		final int KOREA = 4;
		
		//�޴�(����)�� �Է¹ޱ� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.printf("�޴� �Է�(1-4):");
		int menu = sc.nextInt();
		
		//switch ���� ������ String �� ����
		switch(menu) {
		//case 1: ---->�̷��Ե� �����ְ�
		//case 1 ��� case VETNAM ���� ǥ���� ���ִ�.
 		case VETNAM:
			//break�� �����ϸ� break�� ������������ ó���� ���� �����մϴ�. ex) 1���� ġ�� �ұ����� ��¥���� ���� ����.
			System.out.printf("�ұ���\n");
			//break;
			break;
		//case 2:---->�̷��Ե� �����ְ�
		case CHINA:
			System.out.printf("��¥��\n");
			break;
		//case 3:---->�̷��Ե� �����ְ�
			case JAPAN:
			System.out.printf("�쵿\n");
			break;
		//case 4:---->�̷��Ե� �����ְ�
			case KOREA:
			System.out.printf("��ġ����\n");
			break;
		default:
			System.out.printf("�߸��� �޴��Դϴ�.\n");
			break;
		}
		
		sc.close();

	}

}
