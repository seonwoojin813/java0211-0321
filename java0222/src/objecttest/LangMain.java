package objecttest;

import java.io.IOException;

public class LangMain {

	public static void main(String[] args) {
		// 100��° �Ǻ���ġ ������ ���� ã�ƿ��µ� �ɸ��� �ð��� ����
		
		int n1 = 1;
		int n2 = 1;
		int result = 1;
		long start = System.currentTimeMillis();
		for(int i=3; i<=100; i=i+1) {
			result = n1 + n2;
			n1= n2;
			n2 = result;
		}
	    long end = System.currentTimeMillis();
	    System.out.printf("�ɸ��ð�:%d\n",(end-start));
		System.out.printf("100��° �Ǻ���ġ ������ �� : %d\n", result);

		
		/*
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//r.exec("notepad"); -->�̷��� ���� ��Ʈ�е忡 ���콺 �����ٴ�� ����ó���ؾ���(surround~Ŭ��)
		*/
		
		
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("notepad C:\\Users\\503_08\\Documents\\0221.txt");
			//�ҷ��� �ּ� �����Ѵ��� �������õΰ��Ѵ��� �����̸�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
