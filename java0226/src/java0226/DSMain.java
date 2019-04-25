package java0226;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Stack;

public class DSMain {

	    public static void main(String[] args) {
		//���ڿ��� ������ �� �ִ� ������ ����
		//Stack:LIFO(Last In First Out)
		Stack<String> stack = new Stack<String>();
		
		//������ ����
		stack.push("���α׷��� ���");
		stack.push("�ڷᱸ��");
		stack.push("�˰���");
		stack.push("����������");
		stack.push("�����ͺ��̽�");
		stack.push("Front-End");
		
		//������ ������ ����ϱ�
		String data = stack.pop();
		//���� �������� ������ Front-End�� ��µ˴ϴ�.
		System.out.printf("%s\n", data);
		
		for(String temp : stack) {
			System.out.printf("%s\n", temp);
		}
		System.out.printf("====================\n");
		//Queue - FIFO(First In First Out)
		//PriorityQueue�� �����͸� �������� ������ ť
		//PriorityQueue�� ����Ʈ�� �Դϴ�.
		//�����͸� �����ϰ� �ϳ��� poll�� ������� ��������
		//�Ѳ����� ����ϸ� ��� ������ �˼� �����ϴ�.
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("ũ����Ƽ�ƴ� ȣ����");
		queue.add("������ �޽�");
		queue.add("���̸���");
		queue.add("�� ���׹�");
		queue.add("���Ŀ� �ٶ�");
		
		//�����Ͳ�����
		data = queue.poll();
		System.out.printf("%s\n", data);
		for(String temp : queue) {
		System.out.printf("%s\n", temp);
		}
		
		//Deque : ���ʿ��� �����͸� �����ϰ� ������ �� �ִ� �ڷᱸ��
		//Deque�� �������̽��̰� �̸� ������ Ŭ������ ArrayDeque
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.addFirst("Encapsulation(ĸ��ȭ)");
		ad.addLast("Inheritance(���)");
		ad.addLast("Polymorphism(������)");
		System.out.printf("������ ������:%s\n", ad.getLast());
		System.out.printf("ù��° ������:%s\n", ad.getFirst());
	
	    }

        }
