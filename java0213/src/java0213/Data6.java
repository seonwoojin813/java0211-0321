package java0213;

import java.util.Scanner;

public class Data6 {

	public static void main(String[] args) {
		// ���� �� ���� �Է¹޾Ƽ� ���
            Scanner sc = new Scanner(System.in);
            System.out.printf("������ �Է��ϼ���");
            int r = sc.nextInt();
            System.out.printf("r:%d\n", r);
            
            System.out.printf("�̸��� �Է��ϼ���:");
            //�ٸ� �Է��� �ް� ���ڿ��� �Է¹��� ���� nextLine�� �� �� �� �ҷ���� �մϴ�.
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("�̸�:%s\n", name);
            
            
	}

}
