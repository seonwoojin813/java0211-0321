package java0226;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain {

	public static void main(String[] args) {
		//������ ������ �� �ִ� ArrayList ����
		ArrayList <Integer> al = new ArrayList <Integer>();
		//�̷��� ���� LinkedList <Integer> al = new LinkedList <Integer>(); �̷��� �� �� �־� �̰� �� ���� 
		//LinkedList <Integer> al = new LinkedList <Integer>();
		//������ 2�� �߰�
		al.add(10);
		al.add(30);
		//�۾��ϱ� ���� �ð��� ���
		//long start = System.currentTimeMillis();
		//al�� 2��° �ڸ��� �����͸� 10���� ����
		for(int i = 0; i<100000; i=i+1) {
			al.add(1, 20);
		}
		//�߰��� �����Ѱ�
		long start = System.currentTimeMillis();
		for(int i = 0; i<100000; i=i+1) {
			Integer integer= al.get(i);
		}
		
        //�۾� ������ �ð��� ���
		long end = System.currentTimeMillis();
		//�۾��� �ɸ� �ð� ���
		System.out.printf("�۾��� �ɸ� �ð�:%d\n", (end-start));
		//List�� ��� ������ ���
		for(Integer i : al) {
		System.out.printf("%d\n", i);	
		}
	}

}
