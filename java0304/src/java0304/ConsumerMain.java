package java0304;

import java.util.ArrayList;
import java.util.List;

//���� ������ �޼ҵ带 �����ϴ� Ŭ������ ����
class Product{
	//���ڸ� ���� �� ������ �� �ִ� ����Ʈ�� ����
	private List<Character> list;
	//������
	public Product() {
		list = new ArrayList<Character>(); 
	}
	//������ �޼ҵ�
	//public void put(char ch) {
	public synchronized void put(char ch) {  // synchronized�� ���� if(list.size() >  3) { wait();�� �� �׸��� list.add(ch); �ؿ� notify(); �������
		try {
			if(list.size() > 3) {
				wait();
			}
		list.add(ch);
		//wait ���� ������ �߿��� �ϳ��� ������ �����ŵ�ϴ�.
				notify();
		}
		catch(Exception e) {}
		//wait ���� ������ �߿��� �ϳ��� ������ �����ŵ�ϴ�.
		notify();//�� �߰�
		System.out.printf("â�� ��ǰ %c�� �����߽��ϴ�.\n", ch);
		try {
			Thread.sleep(1000);
			System.out.printf("�԰� �� ��ǰ ������ %d �Դϴ�.\n", list.size());
		}catch(Exception e) {}
	}
	
	//�Һ��� �޼ҵ�
	//public void get() {  synchronized�� ���� if(list.size() < 1) { wait();�� ��
	public synchronized void get() {
		try {
			//list�� �����Ͱ� ���ٸ� ���
			if(list.size() < 1) {
				wait();
			}
			//list�� �����Ͱ� ���µ� �������� �ϸ� ���ܰ� �߻��մϴ�.
			//�� ������ �ذ��ҷ��� list�� �����Ͱ� ���� ���� ��⸦ �ؾ� �մϴ�.
			//�����ڰ� list�� �����͸� �����ϸ� ������ �۾��� �����ؾ� �մϴ�.
		char ch = list.remove(0);
		System.out.printf("â�� ��ǰ %c�� ���½��ϴ�.\n", ch);
			Thread.sleep(1000);
			System.out.printf("��� �� ��ǰ ������ %d �Դϴ�.\n", list.size());
		}catch(Exception e) {
			//���� �޼��� ���
       System.out.printf("%s\n",  e.getMessage());
      e.printStackTrace();
      //���ܰ� �߻��� ������ �� ����
	       	}
		}	 
}

//������ ������ - 26�� ����Ʈ�� ���ڸ� �߰� 
//put�� 26�� �ϴ� �� 
class Producer extends Thread{
	private Product product;
	//�ܺηκ��� product�� ���Թ޾Ƽ� ����
	public Producer(Product product) {
		this.product = product;
	}
	
	public void run() {
		try {
			//A���� Z���� 26���� ����
			for(char ch = 'A'; ch <= 'Z'; ch = (char)(ch + 1)) {
				product.put(ch);
			}
		}catch(Exception e) {}
	}
}

//�Һ��� Ŭ���� get�� 26�� �ϴ� ��
class Customer extends Thread{
	private Product product;
	
	public Customer(Product product) {
		this.product = product;
	}
	
	public void run() {
		try {
			for(int i=0; i<26; i=i+1) {
				product.get();
			}
		}catch(Exception e) {}
	}
}

public class ConsumerMain {

	public static void main(String[] args) {
		Product product = new Product();
		Producer producer = new Producer(product);
		Customer customer = new Customer(product);
		producer.start();
		customer.start();

	}

}
