package java0304;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallThread implements Callable<Integer>{//<리턴받을 자료형>{
	private int n;
	
	public CallThread(int n) {
		this.n = n;
	}
	
	public Integer call() {    //리턴받을 자료형 call() {
		//1부터 n 까지의 합계를 구해서 리턴해주는 메소드
		int sum = 0;
		for(int i=1; i<=n; i=i+1) {
			sum = sum + i;
		}
		try {
			Thread.sleep(500);
		}catch(Exception e) {}
               return sum;		
			//return 데이터;	
}
}
public class CallableMain {

	public static void main(String[] args) {
		// 3개의 스레드를 동시에 실행할 수 있는 스레드 풀을 생성
		ExecutorService service = Executors.newFixedThreadPool(3);
		Future<Integer> f1 = 
			service.submit(new CallThread(100));
		Future<Integer> f2= 
				service.submit(new CallThread(150));
		Future<Integer> f3 = 
				service.submit(new CallThread(3000));
		Future<Integer> f4 = 
				service.submit(new CallThread(10));
		
		//스레드 수행 결과를 출력
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