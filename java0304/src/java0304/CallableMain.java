package java0304;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallThread implements Callable<Integer>{//<���Ϲ��� �ڷ���>{
	private int n;
	
	public CallThread(int n) {
		this.n = n;
	}
	
	public Integer call() {    //���Ϲ��� �ڷ��� call() {
		//1���� n ������ �հ踦 ���ؼ� �������ִ� �޼ҵ�
		int sum = 0;
		for(int i=1; i<=n; i=i+1) {
			sum = sum + i;
		}
		try {
			Thread.sleep(500);
		}catch(Exception e) {}
               return sum;		
			//return ������;	
}
}
public class CallableMain {

	public static void main(String[] args) {
		// 3���� �����带 ���ÿ� ������ �� �ִ� ������ Ǯ�� ����
		ExecutorService service = Executors.newFixedThreadPool(3);
		Future<Integer> f1 = 
			service.submit(new CallThread(100));
		Future<Integer> f2= 
				service.submit(new CallThread(150));
		Future<Integer> f3 = 
				service.submit(new CallThread(3000));
		Future<Integer> f4 = 
				service.submit(new CallThread(10));
		
		//������ ���� ����� ���
		try {
	    System.out.printf("f1:%d\n", f1.get());
	    System.out.printf("f2:%d\n", f2.get());
	    System.out.printf("f3:%d\n", f3.get());
	    System.out.printf("f4:%d\n", f4.get());

	}catch(Exception e) {
		System.out.printf("%s\n", e.getMessage());
		e.printStackTrace();
	}

}
}