package java0214;

import java.util.Scanner;

public class Five2 {

	//�Է��ϴ� �����͸� ���� ��ſ� ���ڿ��� �����ϱ�
	//��Ʈ��, �߱�, �Ϻ�, �ѱ� ���� ���� 
	public static void main(String[] args) {
		//������ �ڷ��� ���� final�� ������ �����͸� ������ �� ���� ����� �˴ϴ�.
		//������ �ȵ� 
		//1 2 3 4�� ǥ���ϰų� final�� �ٿ� ����� ����� 
		final String VETNAM = "�ٳ�";
		final String CHINA = "����¡";
		final String JAPAN = "����";
		final String KOREA = "����";
		
		//�޴�(����)�� �Է¹ޱ� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.printf("���� ���� �Է�:");
		String menu = sc.nextLine();
		
		//switch ���� ������ String �� ����
		switch(menu) {
		//case 1: ---->�̷��Ե� �����ְ�
		//case 1: ��� case VETNAM: ���� ǥ���� ���ִ�.
 		case VETNAM :
			//break�� �����ϸ� break�� ������������ ó���� ���� �����մϴ�. ex) 1���� ġ�� �ұ����� ��¥���� ���� ����.
			System.out.printf("��Ʈ��\n");
			//break;
			break;
		//case 2:---->�̷��Ե� �����ְ�
		case CHINA:
			System.out.printf("�߱�\n");
			break;
		//case 3:---->�̷��Ե� �����ְ�
			case JAPAN:
			System.out.printf("�Ϻ�\n");
			break;
		//case 4:---->�̷��Ե� �����ְ�
			case KOREA:
			System.out.printf("�ѱ�\n");
			break;
		default:
			System.out.printf("�߸��� �����Դϴ�.\n");
			break;
		}
		
		sc.close();

	}

	}

