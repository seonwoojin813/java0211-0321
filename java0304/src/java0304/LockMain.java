package java0304;

import java.util.concurrent.locks.ReentrantLock;

class RunEx implements Runnable{
	private int idx;
	private int tot;
	
	//상호배제를 위한 Lock 인스턴스를 생성
	private ReentrantLock lock = new ReentrantLock();
	
	//스레드가 호출할 메소드
	private void sum() {
		try {
		for (int i = 1; i <= 1000; i = i + 1) {
			//unlock을 만날때까지의 코드는 동시에 수행되지 않음
			lock.lock();
			idx = idx + 1; //이걸 써줘도 되
			Thread.sleep(1);
			tot = tot + idx;//i를 idx로 만들어도되
			lock.unlock();
		}
		 }catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.getMessage();
		}
	}
	
	
    //tot값 넘겨주는 메소드
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
		//동일한 객체를 사용하는 2개의 스레드가 동시에 작업을 수행하면
		//동시 수정 문제가 나타날 수 있습니다.
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
