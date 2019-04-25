package java0226;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Stack;

public class DSMain {

	    public static void main(String[] args) {
		//문자열을 저장할 수 있는 스택을 생성
		//Stack:LIFO(Last In First Out)
		Stack<String> stack = new Stack<String>();
		
		//데이터 저장
		stack.push("프로그래밍 언어");
		stack.push("자료구조");
		stack.push("알고리즘");
		stack.push("디자인패턴");
		stack.push("데이터베이스");
		stack.push("Front-End");
		
		//데이터 꺼내서 출력하기
		String data = stack.pop();
		//가장 마지막에 삽입한 Front-End가 출력됩니다.
		System.out.printf("%s\n", data);
		
		for(String temp : stack) {
			System.out.printf("%s\n", temp);
		}
		System.out.printf("====================\n");
		//Queue - FIFO(First In First Out)
		//PriorityQueue는 데이터를 오름차순 정렬한 큐
		//PriorityQueue가 이진트리 입니다.
		//데이터를 저장하고 하나씩 poll을 순서대로 나오지만
		//한꺼번에 출력하면 출력 순서를 알수 없습니다.
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("크리스티아누 호날두");
		queue.add("리오널 메시");
		queue.add("네이마르");
		queue.add("폴 포그바");
		queue.add("라파엘 바란");
		
		//데이터꺼내기
		data = queue.poll();
		System.out.printf("%s\n", data);
		for(String temp : queue) {
		System.out.printf("%s\n", temp);
		}
		
		//Deque : 양쪽에서 데이터를 삽입하고 삭제할 수 있는 자료구조
		//Deque는 인터페이스이고 이를 구현한 클래스가 ArrayDeque
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.addFirst("Encapsulation(캡슐화)");
		ad.addLast("Inheritance(상속)");
		ad.addLast("Polymorphism(다형성)");
		System.out.printf("마지막 데이터:%s\n", ad.getLast());
		System.out.printf("첫번째 데이터:%s\n", ad.getFirst());
	
	    }

        }
