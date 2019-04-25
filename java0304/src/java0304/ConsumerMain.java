package java0304;

import java.util.ArrayList;
import java.util.List;

//공유 변수와 메소드를 소유하는 클래스를 생성
class Product{
	//문자를 여러 개 저장할 수 있는 리스트를 선언
	private List<Character> list;
	//생성자
	public Product() {
		list = new ArrayList<Character>(); 
	}
	//생산자 메소드
	//public void put(char ch) {
	public synchronized void put(char ch) {  // synchronized를 쓰고 if(list.size() >  3) { wait();를 써 그리고 list.add(ch); 밑에 notify(); 써줘야해
		try {
			if(list.size() > 3) {
				wait();
			}
		list.add(ch);
		//wait 중인 스레드 중에서 하나를 깨워서 실행시킵니다.
				notify();
		}
		catch(Exception e) {}
		//wait 중인 스레드 중에서 하나를 깨워서 실행시킵니다.
		notify();//를 추가
		System.out.printf("창고에 제품 %c를 저장했습니다.\n", ch);
		try {
			Thread.sleep(1000);
			System.out.printf("입고 후 제품 개수는 %d 입니다.\n", list.size());
		}catch(Exception e) {}
	}
	
	//소비자 메소드
	//public void get() {  synchronized를 쓰고 if(list.size() < 1) { wait();를 써
	public synchronized void get() {
		try {
			//list에 데이터가 없다면 대기
			if(list.size() < 1) {
				wait();
			}
			//list에 데이터가 없는데 꺼낼려고 하면 예외가 발생합니다.
			//이 문제를 해결할려면 list에 데이터가 없을 때는 대기를 해야 합니다.
			//생산자가 list에 데이터를 삽입하면 꺼내는 작업을 수행해야 합니다.
		char ch = list.remove(0);
		System.out.printf("창고에 제품 %c를 꺼냈습니다.\n", ch);
			Thread.sleep(1000);
			System.out.printf("출고 후 제품 개수는 %d 입니다.\n", list.size());
		}catch(Exception e) {
			//예외 메세지 출력
       System.out.printf("%s\n",  e.getMessage());
      e.printStackTrace();
      //예외가 발생한 지점을 역 추적
	       	}
		}	 
}

//생산자 스레드 - 26번 리스트에 문자를 추가 
//put을 26번 하는 것 
class Producer extends Thread{
	private Product product;
	//외부로부터 product를 대입받아서 생성
	public Producer(Product product) {
		this.product = product;
	}
	
	public void run() {
		try {
			//A부터 Z까지 26개를 저장
			for(char ch = 'A'; ch <= 'Z'; ch = (char)(ch + 1)) {
				product.put(ch);
			}
		}catch(Exception e) {}
	}
}

//소비자 클래스 get을 26번 하는 것
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
