package java0311;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LogWriting {

	public static void main(String[] args) {
		//���ó�¥�� �ش��ϴ� �����̸� �����(2019-03-11.log - ������ �߰�) 
		
		//���� ��¥�� �����ϴ� Ŭ������ �ν��Ͻ��� �����
		Calendar today = new GregorianCalendar();
		
	    //�� �� ���� ����
		int year = today.get(Calendar.YEAR);
		//���� 0���� �����ϹǷ� 1���ϱ�
		int month = today.get(Calendar.MONTH) + 1;
		int day = today.get(Calendar.DAY_OF_MONTH);
		//�����̸��� ���� - String.format : printf �� ������ ����
		String filename = String.format("%4d-%02d-%02d.log", year, month, day);
		
		//�����̸��� ����
		try(PrintWriter pw = new PrintWriter(new FileWriter(filename, true))){
			pw.println("�α׸� ����մϴ�.\n");
			pw.println("������ ������ �� ���� �ϴµ�");
			pw.flush();
		}catch(Exception e) {
			//���ܰ� �߻����� �� ������ �ڵ�
			//���� �޽��� ���
			System.out.printf("%s\n", e.getMessage());
			//���ܸ� �������ϴ� �ڵ带 ���
			e.printStackTrace();
			
		}

	}

}
