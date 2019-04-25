package java0304;

//������ Ŭ����
class SumClass implements Runnable{
	//�ε����� �հ踦 ������ ����
	private int idx;
	private int sum;
	
	//idx ���� 10000�� �߰���Ű�鼭 sum�� �߰�
	private void add() {
	//private synchronized void add() {
		//synchronized�� ���̸� �� �޼ҵ��� ���� �߿��� 
		//�� �޼ҵ带 �ٽ� ȣ���� �� ������ �մϴ�.
		//�̷��� �ڽ��� �۾��ϴ� ���� �ٸ� �۾��� ���� �� �� ������ �ϴ� ����
		//Atomicity(���ڼ�)�� �����Ѵٰ� �ϱ⵵ �մϴ�.
		try {
			for(int i=0; i<10000; i=i+1) {
			    //�� ���������� this�� ����ϴ� �κ��� ���ÿ� ������ �� ������ �մϴ�.
				synchronized(this) {
				idx = idx + 1;
				Thread.sleep(1);
				sum = sum + idx;
				}
			}
		}catch(Exception e) {}
	}
	//sum�� ���� �����ϴ� �޼ҵ�
	public int getSum() {
		return sum;
	}
	//������� ����� �޼ҵ�
	public void run(){
		add();
	}
}

public class SynchronizedMethod {

	public static void main(String[] args) {
		SumClass sumClass = new SumClass();
		//2���� �����尡 sumClass�� �����ؼ� 2���� ������Ű�鼭 �հ踦 ���
		Thread th1 = new Thread(sumClass);
		th1.start();
		Thread th2 = new Thread(sumClass);
		th2.start();

		try {
			Thread.sleep(30000);
		    System.out.printf("�հ�:%d\n", sumClass.getSum());
		}catch(Exception e) {}
		
	}

}
