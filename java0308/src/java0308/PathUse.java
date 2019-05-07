package java0308;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PathUse {

	public static void main(String[] args) {
		
		//���� �۾� ���丮�� �ִ� Danna.mp3 ������
		//���� �۾� ���丮�� ���̾Ƴ�.mp3 ���Ϸ� ����
        
		/*
		//������ ���ϰ� ����� ������ ��θ� ����
	    Path from = Paths.get("./Donna.mp3");
	    Path to = Paths.get("./���̳���.mp3");
	    try {
	       Files.copy(from, to);
	       System.out.printf("���� ���� ����\n");
	    }catch(Exception e) {
	    	//���� �޽��� ���
	    	 System.out.printf("���� �޽���:%s\n",e.getMessage());
	    }finally {
	    	 System.out.printf("���� �߻� ���ο� ������� ������ ��\n");
	    }
	    */
	  
		
		//����� ������ ���� java.nio.file.Files Ŭ������ ����
		try {
	         Path path = Paths.get("./���̳���.mp3");
	         Files.deleteIfExists(path);
	         System.out.printf("���� ����\n");
	         }catch(Exception e) {
	           System.out.printf("���� �޽���:%s\n", e.getMessage());
	            }
	           
		
		
		/*
		//�ӽ� ������ ����
		try {
			//�ӽ������� ������ ���丮�� ����
		 Path path = Paths.get("./");
		 Files.createTempFile(path, "pre", "tep");
		 Thread.sleep(5000);//���ʸ��� Ȯ���ϱ� ���ؼ� �� ���ʿ����
		   System.out.printf("�ӽ� ���� ����� ����\n");
		   
		   //���� ��¥.dat ������ ���� - Calendar Ŭ���� �̿�
		   //���� ��¥�� ������ �ν��Ͻ��� ����
		   Calendar cal = new GregorianCalendar();
		   //������� ����
		   int year = cal.get(Calendar.YEAR);
		   int month = cal.get(Calendar.MONTH) +  1;
		   int day = cal.get(Calendar.DAY_OF_MONTH);
		   //������ ������� ������ �����̸� �����
		   //%2d: 2�ڸ� %02d: 2�ڸ��ε� ���ڸ� ���ڴ� �տ� 0�� �߰�
		   String today = String.format("%d-%02d-%02d.dat",  year,  month,  day);
		   System.out.printf("%s\n", today);
		   //���� ���ϸ��� ������ ������ ����
		   Path todayPath = Paths.get(today);
		   Files.createFile(todayPath);

		   
		}catch(Exception e) {
	           System.out.printf("���� �޽���:%s\n", e.getMessage());
	           e.printStackTrace();
                      }		
	      */
	         }	    
	}

