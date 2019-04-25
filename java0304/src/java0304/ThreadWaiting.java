package java0304;

//�����带 ����� ���ؼ��� Thread  Ŭ������ Runnable �������̽� �̿�
//run �޼ҵ忡 ������� ������ ������ �ۼ�

//Thread Ŭ������ �̿��� ���� �ν��Ͻ��� ����� start()�� ȣ���ϸ� �����尡 ����

//Runnable �������̽��� �̿��� ��쿡�� �ν��Ͻ��� �����
//Thread Ŭ������ �����ڿ� �ν��Ͻ��� �����ؼ� Thread �ν��Ͻ��� ����� start()

class ThreadEx extends Thread{
	public void run() {
		try {
			for (int i=0; i<10; i=i+1) {
				Thread.sleep(500);
				System.out.printf("%d\n",  i);
			}
			
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			//�����带 ������ �� �ֵ���
			return;
		}
	}
}

public class ThreadWaiting {

	public static void main(String[] args) {
		ThreadEx th1 = new ThreadEx();
		th1.start();
		th1.suspend();
		//resume()�� ȣ�� �� �� ���� �Ͻ�����
		try {
			//3�ʵ��� ������ ����
			//th1.join(3000);
			Thread.sleep(3000);
			//th1 �����忡 InterruptedException�� �߻���ŵ�ϴ�.
			//th1.interrupt();
			//3�� ���� �����带 ����
			
			//suspend �� �����带 �ٽü���
			th1.resume();
			
			
		}catch(Exception e) {
			
		}

	}

}
