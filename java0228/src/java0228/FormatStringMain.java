package java0228;

import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatStringMain {

	public static void main(String[] args) {
		//Calendar �ν��Ͻ��� �̿��� Date �ν��Ͻ� ����
		Calendar cal = Calendar.getInstance();
		Date today  = new Date(cal.getTimeInMillis());
		
		
		//��¥������ ����
        SimpleDateFormat sdf =
        		new SimpleDateFormat("G YYYY-MM-dd hh:mm:ss (EEEE)");
        
        //��¥�� ���ڿ��� ��ȯ
        String formatString = sdf.format(today);
        System.out.printf("%s\n", formatString);
        
        double number = 67821.78549;
        //���� ���ڴ� \67,821.79�� ����ϱ�
        //���� ������ ����
        DecimalFormat df = new DecimalFormat("\u00A4 #,###.00");
        formatString =df.format(number);
        System.out.printf("%s\n", formatString);
        
        //ChoiceFormat�� �Ǽ� �迭�� ���ڿ� �迭�� �̿��ؼ� ����
        //��� �迭 ���� ���� ������ �ش��ϴ� ���ڿ��� �����ϴ� Ŭ����
        double [] score = {0,60,70,80,90};
        String [] grade = {"��", "��", "��", "��", "��"};
        
        double [ ] jumsu = {98,87,26,56,99,76,87};
        //ChoiceFormat �ν��Ͻ� ����
        ChoiceFormat cf = new ChoiceFormat(score, grade);
        for(double temp : jumsu) {
        	  System.out.printf("%s\n", cf.format(temp));
        }
        
       //���� ���ڿ� ����
        String msg = "�̸�:{0} ����:{1}";
        Object [] p1 = {"������", "26"};
        Object [] p2 = {"������", "27"};
        
        System.out.printf("%s\n", MessageFormat.format(msg, p1));
        System.out.printf("%s\n", MessageFormat.format(msg, p2));
        
        
        
        
        
	}

}
