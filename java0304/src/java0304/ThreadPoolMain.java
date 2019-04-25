package java0304;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//������ Ŭ����
class ThreadExt extends Thread{
	public void run() {
		try {
			//3�ʴ��
			Thread.sleep(3000);
			//������ �̸� ���
			System.out.printf("%s\n", getName());
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
		}
	}
}

public class ThreadPoolMain {

	public static void main(String[] args) {
		/*
		//���� ��ǻ���� ���μ��� �ھ� �� Ȯ��
		System.out.printf("�ھ��:%d\n", Runtime.getRuntime().availableProcessors());
		
		//10���� �����带 �����ؼ� ��� ����
		for(int i=0; i<10; i=i+1) {
		ThreadExt th = new ThreadExt();
		th.start();
	}
*/
		//���ÿ� 4�������� �����常 ����ϴ� ������ Ǯ�� ����
		ExecutorService service = Executors.newFixedThreadPool(4);
		//������ 10���� �����ؼ� ������ Ǯ�� �߰�
		//���ÿ� 4���� ����
		for(int i=0; i<10; i=i+1) {
			ThreadExt th = new ThreadExt();
			service.submit(th);
		}
		//���� �۾��� ���� ó���ϰ� ����
		//service.shutdown();
		/*
		//7�� ���� ������� �۾��� �����ϰ� ����
		try {
			service.awaitTermination(7, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
		     System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}
		*/
		
		//������ Ǯ�� �����ִ� ��� �۾��� �����ϰ� ������ Ǯ�� ���� 
		service.shutdownNow();
		
		//������ Ǯ�� ����
		//shutdown(): ���� ������ Ǯ�� �ִ� ��� �۾��� �����ϰ� ����
		//awaitTermination(�ð�): �ð����� �۾��� ó���ϰ� ����
		//shutdownNow(): �ٷ�����
     }
}