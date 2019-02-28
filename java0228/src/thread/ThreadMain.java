package thread;

public class ThreadMain {

	public static void main(String[] args) {
		SampleThread t1 = new SampleThread();
		SampleThread t2 = new SampleThread();

		//�Ϲ� �޼ҵ� ȣ��
		//t1.run();
		//t2.run();
		//run���� ���� ���� �ϳ��� ������ �ٽ� �ϳ��� �����ؼ� 20�� �ɷ�����
		
		//������ ����
		//t1.start();
		//t2.start();
		//start�� ���� ���� ���ÿ� �����ؼ� 10�� �ɸ� 
		
	/*	
		//������ Ŭ�����κ��� ��ӹ޴� �ν��Ͻ��� ����
		//��ӹ޴� Ŭ������ ����� �ν��Ͻ��� ���� �� ���� ����
		//Ŭ������ �޸� ������ ��� ����
		ThreadEx th1 = new ThreadEx();
		th1.start();
		
		//�Ȱ����Ÿ� anonymous class �̿�
		//�޸𸮸� ������ �� ������ ���� ���� �ν��Ͻ� ������ ����
		Thread th2 = new Thread() {
			public void run() {
				try {
					for(int i=0; i<20; i=i+1) {
						Thread.sleep(500);
						System.out.printf("AnonymousClass �̿�\n");
					}
				}catch(Exception e) {
					System.out.printf("%s\n", e.getMessage());
				}
			}
		};
		 th2.start();
		 
		 //Runnable �������̽��� �̿��� ������ ���� �� ����
		 // Runnable th3 = new Runnable() { �̰� ġ�� ���� Runnable�� ���콺 ��� add~Ŭ�� 
		 Runnable th3 = new Runnable() {

			@Override
			public void run() {
				try {
					for(int i=0; i<20; i=i+1) {
						Thread.sleep(500);
						System.out.printf("Runnale �������̽� �̿�\n");
					}
				}catch(Exception e) {
					System.out.printf("%s\n", e.getMessage());
				}
			}		 
		 }; 
		 //Runnable���� �ٷ� start�� �ȵ�
		 Thread th4 = new Thread(th3);
		 th4.start();
        //�̷��� �����
	*/
		Thread backgroundThread = new Thread() {
			public void run() {
				try {
					for(int i=0; i<10; i=i+1) {
						Thread.sleep(1000);
						System.out.printf("���� ������\n");
					}
				}catch(InterruptedException e) {
					//���ܰ� �߻����� �� �����带 ������ �� �ֵ��� return�� �ۼ�
					return;
					
				}
			}
		};
		
		//���� ������� ���� - �ٸ� �����尡 ���� ���� �ƴϸ� �ڵ� ����
		//start ȣ���ϱ� ���� ����
		//�¶��� ���ӿ��� ������ ���۵ ���� ���
		
		backgroundThread.setPriority(Thread.MAX_PRIORITY); 
		backgroundThread.setDaemon(true);
		backgroundThread.start();
		
		Thread foregroundThread = new Thread() {
			public void run() {
				try {
					for(int i=0; i<5; i=i+1) {
						Thread.sleep(1000);
						System.out.printf("���׶��� ������\n");
						if(i == 3) {
							//	backgroundThread��interrupt�� ������
							//�߻���Ű�� ����
							//0 1 2 3
							backgroundThread.interrupt();
						}
					}
				}catch(Exception e){
        			}
		    	}
		};
		//���󽺷��尡 �ƴϱ� ������ ������ ���� ��Ű�� �ʴ� �̻�
		//5�� ���� �۾��� ����
		//�켱���� ����
		foregroundThread.setPriority(Thread.MIN_PRIORITY); //�̰� �켱���� �����ϴ°� ������ְ�
		foregroundThread.start();

		/*
		Thread backgroundThread = new Thread() {
			public void run() {
				try {
					for(int i=0; i<10; i=i+1) {
						Thread.sleep(1000);
						System.out.printf("���� ������\n");
					}
				}catch(Exception e) {
					
				}
			}
		};
		//���� ������� ���� - �ٸ� �����尡 ���� ���� �ƴϸ� �ڵ� ����
		//start ȣ���ϱ� ���� ����
		//�¶��� ���ӿ��� ������ ���۵ ���� ���
		
		foregroundThread.setPriority(Thread.MAX_PRIORITY); //������ְ� �켱������ �׻� ���� �Ǵ°��� �ƴϴ� 
		backgroundThread.setDaemon(true);
		backgroundThread.start();
	*/
	}
}
