package java0212;

public class data7 {

	public static void main(String[] args) {

	int money = 45390;
	//10�� �ڸ����� �ݿø��ؼ� 45400�̶�� ���
	//�Ҽ� ù°�ڸ��� �ݿø� ���ڸ� �̵�
	double x = money / 100.0; //453.90
	
	int  y = (int)(x+0.5); // 454
	
	int kk = y * 100; //45400
	
	System.out.printf("%d", kk);
	

	}

}
