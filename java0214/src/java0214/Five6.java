package java0214;

public class Five6 {

	public static void main(String[] args) {
		/*
		for(int i = 1; i<=10; i=i+1){
			//3�� ����� �Ǹ� �ݺ����� ���� : 2���� ��µ˴ϴ�.
			if(i % 3 == 0) {
				break;
			}
		System.out.printf("i:%d\n",i);
		
	}
		*/
	/*
		//continue�� �̹��� ���� �ϰ������
		//break�� �׸��ϰ� ���� �� ---->continue���� �� ���� ����ϰ� ��
		for(int i = 1; i<=10; i=i+1){
			//3�� ����� �Ǹ� �Ʒ� ������ �������� �ʰ� ���� �ݺ����� �Ѿ�ϴ�.
			if(i % 3 == 0) {
				continue;
			}
		System.out.printf("i:%d\n",i);
		
	}
	*/
	
		
		//�ݺ��� �ȿ� �ݺ����� �ִ� ��ø �ݺ���
		OUTER: for(int i = 0; i<3; i=i+1){
		System.out.printf("1:ù��° �ݺ���\n");
		for(int j = 0; j<3; j=j+1){
			System.out.printf("2:�ι�° �ݺ���\n");
			break OUTER;
			//break�� ���� ����� switch �� �ݺ����� ������ �ݴϴ�.
			//break �� continue �ڿ� ���̺��� ���̸� ���̺� �ش��ϴ�
			//����� ������ �ݴϴ�.
			//break;
			}
	
	
	
	}
	
	
	}
	
}
