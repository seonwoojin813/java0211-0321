package java0226;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  VO [] data = new VO[3];
		  VO vo = new VO(1, "swj123", "1234", "�����", 28);
          data[0] = vo;
          
          vo = new VO(2, "swj1234", "5678", "�⼺��", 32);
          data[1] = vo;
          
          vo = new VO(3, "swj", "9999", "������", 26);
          data[2] = vo;
          
          //�迭�� ������ Ȯ��
          for(VO temp : data){
        	  System.out.printf("%s\n", temp);
          }
          
          //�迭�� ������ ���� - data�� ������� �ڷ����� VO Ŭ������
          //Comparable �������̽��� implements ���� �ʾ����� ���ܹ߻�
          Arrays.sort(data);
          System.out.printf("=========���� ��========\n");
          //�迭�� ������ Ȯ��
          for(VO temp : data) {
          System.out.printf("%s\n", temp);
          
	      }
	
           System.out.printf("=========���� ��========\n");
        
        
           //VO Ÿ���� ���� ���ִ� Comparator �������̽���
           //Anonymous Class -> Instance
           Comparator <VO> numAscComp = new Comparator<VO>() { //��ȣ�� ��������
           // Comparator <VO> numDescComp = new Comparator<VO>() //��ȣ�� ��������
           //return o2.getNum() - o1.getNum();
           //ũ�� ���� �� ����ϴ� �޼ҵ�
		    public int compare(VO o1 , VO o2) {
    	    return o1.getNum() - o2.getNum();
		    }
            };   
        
           Comparator <VO> numDescComp = new Comparator<VO>() { //��ȣ�� ��������
            // Comparator <VO> numDescComp = new Comparator<VO>() //��ȣ�� ��������
            //return o2.getNum() - o1.getNum();
            //ũ�� ���� �� ����ϴ� �޼ҵ�
     		public int compare(VO o1 , VO o2) {
            return o2.getNum() - o1.getNum();
     		 }
             };   
        
            //name�� �������� ������ �� �� �ִ� comparator
            Comparator<VO>nameAscComp = new Comparator<VO>() {
            @Override
			public int compare(VO o1, VO o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
			}
            };  
        
            //name�� �������� ������ �� ���ִ� comparator
        
            Comparator<VO>nameDescComp = new Comparator<VO>() {
 			@Override
 			public int compare(VO o1, VO o2) {
 			// TODO Auto-generated method stub
 			return o2.getName().compareTo(o1.getName());
 			}
            };
       
            //1������ 4������ �Է��� �ޱ� ���� �ڵ带 �ۼ�
            Scanner sc = new Scanner(System.in);
            System.out.printf("������ ������ ����(1-4)\n(1:��ȣ�������� 2:��ȣ�������� 3:��ȣ�������� 4:��ȣ��������)");
            final int ��ȣ�������� = 1;
            final int ��ȣ�������� = 2;
            final int �̸��������� = 3;
            final int �̸��������� = 4;
            int input = sc.nextInt();
            Comparator <VO> comparator = numAscComp;
            switch(input) {
            case  1:
            	comparator = numAscComp;
            	break;
            case  2:
            	comparator = numDescComp;
            	break;
            case  3:
            	comparator = nameAscComp;
            	break;	
            case  4:
            	comparator = nameDescComp;
            	break;
             default:
            	System.out.printf("�߸��� �޴� �����Դϴ�\n");
              }
            //�迭 ����
            Arrays.sort(data,comparator);
            //�迭�� ������ Ȯ��
            for (VO temp : data) {
            	System.out.printf("%s\n", temp);
            }
            
             sc.close();
            
            /*   
            //���� �� �ִ� �ν��Ͻ��� �����ؼ� ����
            Arrays.sort(data, numAscComp);
            for (VO temp : data) {
            System.out.printf("%s\n", temp);
            }
            */
             
             int [] ar = { 20, 30, 50, 10, 40,70, 60};
             //20�� ���°�� �ִ��� �˻�
             //���ĵǾ� ���� �ʾƼ� �̺а˻��� ����� ������ �� �����ϴ�.
             int pos = Arrays.binarySearch(ar, 20);
             System.out.printf("20:%d��°\n", pos);
             
             // ������ ����             
             Arrays.sort(ar);
             //{10, 20, 30, 40, 50, 60, 70}
             pos = Arrays.binarySearch(ar, 20);
             System.out.printf("20:%d��°\n", pos);
           
	         }

             }