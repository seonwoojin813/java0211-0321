package java0214;

public class Five3 {

	public static void main(String[] args) {
		//Hello Java�� 3�� ���
		System.out.printf("Hello Java\n");
		System.out.printf("Hello Java\n");
		System.out.printf("Hello Java\n");
		
		System.out.printf("=========================\n");
		
		int i;
		//i�� 3���� ���� ���� ������ 1�� �����ϸ鼭 {}�� ������ ����
		//i<3�� �����ص� �Ǳ� ������ �����ع����� �������� �� Hello Java�� ��� ������
		for(i=0; i<3; i=i+1) {
			System.out.printf("Hello Java\n");
		}
		System.out.printf("=========================\n");
		
		//0���� 2���� �������: 0, 1, 2----->����� �׳� �ؿ� i��� ��
		//1,2,3�� ���--->�ؿ� i���ٰ� +1
		//0, 2, 4���� ����ϵ��� ���� --->i<5, i=i+2�ص� �ǰ� i<3, �ؿ� i*2�ص� ��
		for(i=0; i<3; i=i+1) {
			System.out.printf("i:%d\n", i*2);
	}
		
	}
}
