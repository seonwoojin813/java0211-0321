package java0304;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//스레드 클래스
class ThreadExt extends Thread{
	public void run() {
		try {
			//3초대기
			Thread.sleep(3000);
			//스레드 이름 출력
			System.out.printf("%s\n", getName());
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
		}
	}
}

public class ThreadPoolMain {

	public static void main(String[] args) {
		/*
		//현재 컴퓨토의 프로세서 코어 수 확인
		System.out.printf("코어개수:%d\n", Runtime.getRuntime().availableProcessors());
		
		//10개의 스레드를 생성해서 모두 시작
		for(int i=0; i<10; i=i+1) {
		ThreadExt th = new ThreadExt();
		th.start();
	}
*/
		//동시에 4개까지의 스레드만 허용하는 스레드 풀을 생성
		ExecutorService service = Executors.newFixedThreadPool(4);
		//스레드 10개를 생성해서 스레드 풀에 추가
		//동시에 4개씩 수행
		for(int i=0; i<10; i=i+1) {
			ThreadExt th = new ThreadExt();
			service.submit(th);
		}
		//현재 작업은 전부 처리하고 종료
		//service.shutdown();
		/*
		//7초 동안 만들어진 작업을 수행하고 종료
		try {
			service.awaitTermination(7, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
		     System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}
		*/
		
		//스레드 풀에 남아있는 모든 작업을 중지하고 스레드 풀을 중지 
		service.shutdownNow();
		
		//스레드 풀의 중지
		//shutdown(): 현재 스레드 풀에 있는 모든 작업을 수행하고 중지
		//awaitTermination(시간): 시간동안 작업을 처리하고 중지
		//shutdownNow(): 바로중지
     }
}