package java0213;

public class Data3 {

	public static void main(String[] args) {
		System.out.printf("%b\n", true&&false); //false
		System.out.printf("%b\n", true||false); //true
		int x = 10;
		//&&�� ���� ������ ����� flase �̸� ���� ������ ���� �ʽ��ϴ�.
		boolean result = x>5 && ++x > 5;
		System.out.printf("x:%d\n", x); //x : 11
		result = x>20 && ++x >5;
		System.out.printf("x:%d\n", x); // x : 11

		int year = 2019;
		//year�� 2000�̻� ���� Ȯ��
		//result = ?; 
		result =  year >= 2000;
		System.out.printf("2000�̻�:%b\n", result);
		//year�� 4�� ���(����� �������� 0)���� Ȯ��
		//result= ?;
		result = year % 4 == 0;
		System.out.printf("4�� ��� ����:%b\n", result);
        //year�� 4�� ����̰� 100�� ����� �ƴ� ��츦 Ȯ��
		//result = ?;
		result = year % 4 == 0 && year % 100 != 0;
		System.out.printf("4�� ����̰� 100�� ����� �ƴ��� ����:%b\n", result);
		//year�� (4�� ����̰� 100 ����� �ƴ� ���) �Ǵ� 400�� ����� ��� Ȯ��
		//result =?;
		result = year % 4 == 0 && year %  100 != 0 || year % 400 ==0;
		System.out.printf("���� ����:%b\n", result);
		
		//1-100������ �����Ͱ� �ֽ��ϴ�.
		//3�� ����̰� 4�� ������� Ȯ��
		//3�� ����� Ȯ���ϰ� 4�� ������� Ȯ���ϴ� ���� ������  --- **��� �̰ų� �ϸ� 3�� ����� ����Ȯ�� �װ� Ʈ������ �޽����� Ȯ��
		//�ƴϸ� 4�� ����� Ȯ���ϰ� 3�� ����� Ȯ���ϴ� ���� ������ �Ǵ�?
		
	}

}
