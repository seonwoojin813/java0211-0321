package objecttest;

import java.math.BigDecimal;

public class WrapperMain {

	public static void main(String[] args) {
		// Wrapper Class : value ���� �����͸� Reference������ �����ϱ� ���� Ŭ����
		double d = 10.8;
		Double refDouble = new Double(d);
		System.out.printf("d:%f\n", d);
		System.out.printf("refDouble:%f\n", d);

		
		//�������� �����͸� value������ ����
		double x = refDouble.doubleValue();
		System.out.printf("x:%f\n", x);
		
		
		//AutoBoxing �� AutoUnBoxing : �ٷ� ���� ����
		refDouble = d;
		x = refDouble;
	
	
		//���ڿ��� ���� �����ͷ� ��ȯ
		String str = "23.4";
		x = Double.parseDouble(str);
		System.out.printf("x:%f\n", x);
		
		//��ȯ�� �� ���� �����͸� ��ȯ�ϸ� NumberFormatException �߻�
	/*
		str = "7d9jk.kdi";
		x = Double.parseDouble(str);
		System.out.printf("x:%f\n", x);
	}
*/
		
		//������ �����͸� �����ϱ� ���� BigDecimal Ŭ����
		//import ��������
		BigDecimal bigDecimal = new BigDecimal("82.9820192382312739112312312321");
		x = 82.9820192382312739112312312321;
		System.out.printf("x:%.16f\n", x);
		System.out.printf("bigDecimal:%s\n", bigDecimal);
                     }
                 }