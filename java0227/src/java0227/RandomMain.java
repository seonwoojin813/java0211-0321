package java0227;

import java.util.Random;
import java.util.StringTokenizer;

public class RandomMain {

	public static void main(String[] args) {
		/*
		//�ν��Ͻ��� ������ �� seed��ȣ�� �����ϸ� ������ �������� ���ڰ� ����
		//seed ��ȣ�� �������� ������ ���� ���� 
		Random r = new Random();
		
		//nextInt�� ���� ���� ������ ������ ���ڸ� ����  
		//System.out.printf("%d\n", r.nextInt());

		int [] ar = { 1, 2, 3, 4, 5, 6};
		int len = ar.length;
		int su = r.nextInt(len);	
		System.out.printf("%d\n", ar[su]);
		//System.out.printf("%d\n", ar[r.nextInt(ar.length)]);
		
		//nextInt(����)�� ������ ���� ���������� �����ϰ� ���ڸ� ����
		//System.out.printf("%d\n", r.nextInt(5));
	*/
	/*
	     //����, �Ķ�, ���, �ʷ� �װ��� ���� �ϳ��� �����ϰ� �������� �ۼ�
		
		Random r = new Random();
		String [] colors = {"����", "�Ķ�", "���", "�ʷ�"};
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}	
		System.out.printf("%s\n", colors[r.nextInt(colors.length)]);
		}
		*/
		StringTokenizer st = new StringTokenizer("���ع��� ��λ��� ������ �⵵��");
		//hasMoreTokens �� false�� ������ �� ���� �ݺ�
		//�����ͺ��̽����� �����͸� �����ͼ� �д� ����� �����ϱ� ������ �߿�
		while(st.hasMoreTokens()) {
			String e = st.nextToken();
			System.out.printf("%s\n", e);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
