package java0215;

public class Six4 {

	public static void main(String[] args) {
		//4���� ���� 30�� ������
		/*
		String [][] student = new String [4][30] ;
		
		*/
		//4���� ���� 1���� 29�� 2���� 38�� 3���� 35�� 4���� 28���̴� 
		//�̷��� ���� ū�Ÿ� �ڿ� ���� �ֱ�
		/*
		String [][] student = new String [4][38] ;
		*/
		
		/*
		String [][] a = new String [4][] ;
		//�л����� ������� �� �� �����
		a [0] = new String[29];
		a [1]  = new String[38];
		//�� ���� �л����� �ᵵ��
	 	
		*/
		
		
		//2�ܺ��� 9�ܱ��� �������� ����غ��ÿ�
		//���߿� �ٲٴ°� ����
		//���� �ٲ�°� ���߿�	
		/*
		for(int i =1; i<=9; i=i+1) {
			for (int j = 2; j<=9; j=j+1) {
				System.out.printf("%2d*%2d=%2d", j, i, i*j);
			}
			System.out.printf("\n");
		}
		*/
		
		
		//10�ܺ��� 19�� ������
		for (int i = 1; i<=9; i=i+1) {
			for (int j=10; j<=19; j=j+1){
			System.out.printf(" %2d*%2d = %2d", j,  i, j*i);
		}
		System.out.printf("\n");

		}
		
	}

}
