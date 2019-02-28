package thread;

public class ThreadMain {

	public static void main(String[] args) {
		SampleThread t1 = new SampleThread();
		SampleThread t2 = new SampleThread();

		//일반 메소드 호출
		//t1.run();
		//t2.run();
		//run으로 했을 때는 하나가 끝나고 다시 하나가 시작해서 20초 걸렸지만
		
		//스레드 시작
		//t1.start();
		//t2.start();
		//start로 했을 때는 동시에 시작해서 10초 걸림 
		
	/*	
		//스레드 클래스로부터 상속받는 인스턴스를 생성
		//상속받는 클래스를 만들면 인스턴스를 여러 개 생성 가능
		//클래스가 메모리 영역에 계속 존재
		ThreadEx th1 = new ThreadEx();
		th1.start();
		
		//똑같은거를 anonymous class 이용
		//메모리를 절약할 수 있지만 여러 개의 인스턴스 생성을 못함
		Thread th2 = new Thread() {
			public void run() {
				try {
					for(int i=0; i<20; i=i+1) {
						Thread.sleep(500);
						System.out.printf("AnonymousClass 이용\n");
					}
				}catch(Exception e) {
					System.out.printf("%s\n", e.getMessage());
				}
			}
		};
		 th2.start();
		 
		 //Runnable 인터페이스를 이용한 스레드 생성 및 시작
		 // Runnable th3 = new Runnable() { 이거 치면 에러 Runnable에 마우스 대고 add~클릭 
		 Runnable th3 = new Runnable() {

			@Override
			public void run() {
				try {
					for(int i=0; i<20; i=i+1) {
						Thread.sleep(500);
						System.out.printf("Runnale 인터페이스 이용\n");
					}
				}catch(Exception e) {
					System.out.printf("%s\n", e.getMessage());
				}
			}		 
		 }; 
		 //Runnable에는 바로 start가 안되
		 Thread th4 = new Thread(th3);
		 th4.start();
        //이렇게 써야해
	*/
		Thread backgroundThread = new Thread() {
			public void run() {
				try {
					for(int i=0; i<10; i=i+1) {
						Thread.sleep(1000);
						System.out.printf("데몬 스레드\n");
					}
				}catch(InterruptedException e) {
					//예외가 발생했을 때 스레드를 종료할 수 있도록 return을 작성
					return;
					
				}
			}
		};
		
		//데몬 스레드로 생성 - 다른 스레드가 동작 중이 아니면 자동 중지
		//start 호출하기 전에 설정
		//온라인 게임에서 데이터 전송등에 많이 사용
		
		backgroundThread.setPriority(Thread.MAX_PRIORITY); 
		backgroundThread.setDaemon(true);
		backgroundThread.start();
		
		Thread foregroundThread = new Thread() {
			public void run() {
				try {
					for(int i=0; i<5; i=i+1) {
						Thread.sleep(1000);
						System.out.printf("포그라운드 스레드\n");
						if(i == 3) {
							//	backgroundThread에interrupt을 강제로
							//발생시키는 구문
							//0 1 2 3
							backgroundThread.interrupt();
						}
					}
				}catch(Exception e){
        			}
		    	}
		};
		//데몬스레드가 아니기 때문에 강제로 중지 시키지 않는 이상
		//5초 동안 작업을 수행
		//우선순위 변경
		foregroundThread.setPriority(Thread.MIN_PRIORITY); //이게 우선순위 변경하는거 여기써주고
		foregroundThread.start();

		/*
		Thread backgroundThread = new Thread() {
			public void run() {
				try {
					for(int i=0; i<10; i=i+1) {
						Thread.sleep(1000);
						System.out.printf("데몬 스레드\n");
					}
				}catch(Exception e) {
					
				}
			}
		};
		//데몬 스레드로 생성 - 다른 스레드가 동작 중이 아니면 자동 중지
		//start 호출하기 전에 설정
		//온라인 게임에서 데이터 전송등에 많이 사용
		
		foregroundThread.setPriority(Thread.MAX_PRIORITY); //여기써주고 우선순위가 항상 먼저 되는것은 아니다 
		backgroundThread.setDaemon(true);
		backgroundThread.start();
	*/
	}
}
