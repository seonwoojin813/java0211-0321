package java0304;

import java.util.concurrent.locks.ReentrantLock;

class RunEx implements Runnable{
	private int idx;
	private int tot;
	
	//��ȣ������ ���� Lock �ν��Ͻ��� ����
	private ReentrantLock lock = new ReentrantLock();
	
	//�����尡 ȣ���� �޼ҵ�
	private void sum() {
		try {
		for (int i = 1; i <= 1000; i = i + 1) {
			//unlock�� ������������ �ڵ�� ���ÿ� ������� ����
			lock.lock();
			idx = idx + 1; //�̰� ���൵ ��
			Thread.sleep(1);
			tot = tot + idx;//i�� idx�� ������
			lock.unlock();
		}
		 }catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.getMessage();
		}
	}
	
	
    //tot�� �Ѱ��ִ� �޼ҵ�
	public int getTot() {
		return tot;
	}
	
	public void run() {
		try {
		   sum();
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.getMessage();
		}
	}
}

public class LockMain {

	public static void main(String[] args) {
		RunEx ex = new RunEx();
		//������ ��ü�� ����ϴ� 2���� �����尡 ���ÿ� �۾��� �����ϸ�
		//���� ���� ������ ��Ÿ�� �� �ֽ��ϴ�.
		Thread th1 = new Thread(ex);
		th1.start();
		Thread th2 = new Thread(ex);
		th2.start();
		try {
			Thread.sleep(10000);
			System.out.printf("%d\n", ex.getTot());
		}catch(Exception e) {
        System.out.printf("%d\n", ex.getTot());
        e.getMessage();
	}
	}
}
