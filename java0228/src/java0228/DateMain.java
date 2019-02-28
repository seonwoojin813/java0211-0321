package java0228;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMain {

	public static void main(String[] args) {
		// ���� ��¥ �� �ð��� ���� Date �ν��Ͻ� �����ϱ�
		//java.utill�����ϱ�
		Date today = new Date();
		//toString�� ������ �Ǿ� �־ �ٷ� ����ϸ� ����� ������ Ȯ���� ����
		System.out.printf("%s\n", today);
		
		//������� ���� �Է��ؼ� ���� - Deprecated
		//�⵵�� 1900�� ������ ������ �⵵ 
		//���� 0���� ����---*�߿�*
		//1994�� 8�� 13��
		//Date birth = new Date(1994,  8,  13);�� ����ϸ�
		//Thu Sep 13 00:00:00 KST 3894�̷��� ����
		//�׷��� 1994�� 94�� 8�� 7�� ���ľ���
		//���� 0���� ����
		Date birth = new Date(94,  7,  13);
		System.out.printf("%s\n", birth);
		
		//���� ��¥ �� �ð��� ���� Calendar �ν��Ͻ� ����
		Calendar now = Calendar.getInstance();
		Calendar cal = new GregorianCalendar();
		System.out.printf("%s\n", now);
		System.out.printf("%s\n", cal);
		
		
		//Ư���� ��¥ �� �ð� �����
		//1993�� 3�� 27�� 13�� 00�� 00�� �����
		cal.set(Calendar.YEAR, 1993);
		cal.set(Calendar.MONTH, 2);
		cal.set(Calendar.DAY_OF_MONTH, 27);
		cal.set(Calendar.HOUR, 13);
		
		//now���� cal���� ������ ��¥ �� ���
		long gap = now.getTimeInMillis()- cal.getTimeInMillis();
		gap = gap / 1000 / 86400;//1000�� �и��� 86400��24�ð��� �ʷ� ����Ѱ�     ***1�ʰ� 1000�и���
		System.out.printf("�����̰� �¾�� %d���� �������ϴ�\n", gap);
		
	}

}
