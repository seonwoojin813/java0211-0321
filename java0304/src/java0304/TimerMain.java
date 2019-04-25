package java0304;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

//TimerTask Ŭ������ ����
class TimerEx extends TimerTask{
	//Ÿ�̸ӷ� ������ ����
	public void run() {
		System.out.printf("���� �ڹٰ� ����ֽ��ϴ�.\n");
	}
}

public class TimerMain {

	public static void main(String[] args) {
		TimerEx ex = new TimerEx();
		Timer timer = new Timer();
		//10�� �Ŀ� ���� - 3�ʸ��� ��� ����
		//timer.schedule(ex, 10000, 3000);
		
		Calendar cal = new GregorianCalendar(2019,  2,  4,  17,  35,  00);
		Date d = new Date(cal.getTimeInMillis());
		timer.schedule(ex, d);

	}

}
