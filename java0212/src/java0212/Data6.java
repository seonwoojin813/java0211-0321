package java0212;

public class Data6 {

	public static void main(String[] args) {
		int a = 10;
		a++;
		System.out.printf("a:%d\n", a); //11
		a--;
		System.out.printf("a:%d\n", a); //10
		
		System.out.printf("a:%d\n", a++); //10�� ����ϰ� a�� ���� 11�� ����
		System.out.printf("a:%d\n", a--);//a�� ���� 12�� ����� ���

		//���� ���߿� ++�� --�� ����ϸ� �ڵ��� ������(�б� ���� ����)�� �������ϴ�.
		//�̷� ������ ������ ������� �ʴ� ���� ���� 
        a = 10;
		int result = a++ + a++;
		System.out.printf("result:%d\n", result);

	}

}
