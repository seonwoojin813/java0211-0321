package java0213;

public class Data1 {

	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		//��Ģ���� �� % ������ ������ ���� �ּ� int
		//byte������ ���������� ���� ����� ���� int ����
		//����� byte�� �����ϰ��� �ϸ� ���� �� ��ȯ�� �ؾ� �մϴ�.
		//ǥ�� ������ ū �����͸� ���� ������ �����ͷ� �� ��ȯ�ϸ� �����Ͱ�
		//�߸� ���� �� �ֽ��ϴ�. 
		byte b3 = (byte)(b1 + b2);
		System.out.printf("b3:%d\n", b3);

		//�������� �� �� �Ǽ��� ��� �����
		double d = (double)10/3;
		System.out.printf("d:%f\n", d);
		
		//���� �� ������ ������ ���鼭 10�� �ϱ�
		for(int i=0; i<15; i=i+1) {
			try {
				//1�� ���
				Thread.sleep(1000);
				int r = i % 6;//i=0���� ���� ������
				if(r == 0) {
					System.out.printf("����\n");
					}
				if(r == 1) {
					System.out.printf("����\n");
			}
				if(r == 2) {
					System.out.printf("ȭ\n");
			}
				if(r == 3) {
					System.out.printf("��\n");
			}
				if(r == 4) {
					System.out.printf("��\n");
			}
		}catch(Exception e) {}
	}

	}
}
