package java0226;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test0226 {

	public static void main(String[] args) {
	   /*
		//������ ArrayDeque�� ���� //�޸� �Ƴ����� �迭
	    //������ ������ ����Ʈ�� ����
		  
		   ArrayList<Integer>lotto = new 	ArrayList<Integer>();
		   Scanner sc = new Scanner(System.in);
		
		    for(int i = 0; i < 6; i = i + 1) {
			System.out.printf("�����Է� - %d��°:", i+1);
			int su = sc.nextInt();
			//1���� 45������ �ƴ϶��
			if(su < 1 || su > 45 ) {
			//�ٽ� �Է�	
			System.out.printf("1���� 45������ ���ڸ� �Է��ϼ���!\n");
			i = i - 1;
		    continue;
		    //��ȿó���ؼ� for������ ���ư�
			}
			//�ߺ� üũ�ؼ� ������ �Էµ� ���̸� �ٽ� �Է�
			//������ �Էµ� ��� �����Ϳ� ���ؼ� ������ �����Ͱ� ������ �ߺ�
			//�ߺ�üũ�� ���Ѻ���
			int j;
			//�ݺ����� j�� i�� �Ǹ� �ߴ�
			for(j=0; j<i; j=j+1) {
				//�����Ͱ� �ߺ��Ǹ� �ݺ����� ����
				if(su == lotto.get(j)) {
					break;
				}
			}
			//�ݺ����� ������ ������� �ʾҴٸ� �����Ͱ� �ߺ�
			if(i != j) {
				System.out.printf("������ ������ �����Ͱ� �ԷµǾ����ϴ�.\n" + "�ٽ� �Է��� �ּ���.\n");
				i = i - 1;
				continue;
			
			//�������� ���� - ���� flag���� ���� flag�Ⱦ���
		    /*int flag = 0;
			for(int j=0; j<i; j=j+1) {
				if(su == lotto.get(j)) {
					flag = 1;
					break;
				}
			 }
			//�ߺ� üũ
			if(flag == 1 ) {
				System.out.printf("������ ������ �����Ͱ� �ԷµǾ����ϴ�.\n" + "�ٽ� �Է��� �ּ���.\n");
				i = i - 1;
				continue;
				*/
	/*
	}
	
			lotto.add(su);
		    }
		 
		    //������ ����
		    Comparator<Integer> comp = new Comparator<Integer>(){

				@Override
				public int compare(Integer o1, Integer o2) {
					return o1 - o2;
				}
		    	
		    };
		    lotto.sort(comp);
		    
		    for(Integer temp : lotto) {
			System.out.printf("%d\t", temp);
		    }
		
		    sc.close();
	    */
		
		
	      	   //Set�� �Ἥ ����� ����
		       //������ ������ Set������
		       Set<Integer>lotto = new TreeSet<Integer>();
			   Scanner sc = new Scanner(System.in);
			
			    while(lotto.size() !=  6) {
				System.out.printf("��ȣ�Է� : ");
				int su = sc.nextInt();
				//1���� 45������ �ƴ϶��
				if(su < 1 || su > 45 ) {
				//�ٽ� �Է�	
				System.out.printf("1���� 45������ ���ڸ� �Է��ϼ���!\n");
			    continue;
				}
			    if(lotto.add(su)==false) {
				System.out.printf("�ߺ��� ��ȣ�Դϴ�. \n");
			    }		
			    }
			    
			    for(Integer temp : lotto) {
				System.out.printf("%d\t", temp);
			    }
			
			    sc.close();
		        }
	            }


