package objecttest;

import java.math.BigDecimal;

public class WrapperMain {

	public static void main(String[] args) {
		// Wrapper Class : value 형의 데이터를 Reference형으로 저장하기 위한 클래스
		double d = 10.8;
		Double refDouble = new Double(d);
		System.out.printf("d:%f\n", d);
		System.out.printf("refDouble:%f\n", d);

		
		//참조형의 데이터를 value형으로 변경
		double x = refDouble.doubleValue();
		System.out.printf("x:%f\n", x);
		
		
		//AutoBoxing 과 AutoUnBoxing : 바로 대입 가능
		refDouble = d;
		x = refDouble;
	
	
		//문자열을 숫자 데이터로 변환
		String str = "23.4";
		x = Double.parseDouble(str);
		System.out.printf("x:%f\n", x);
		
		//변환할 수 없는 데이터를 변환하면 NumberFormatException 발생
	/*
		str = "7d9jk.kdi";
		x = Double.parseDouble(str);
		System.out.printf("x:%f\n", x);
	}
*/
		
		//정밀한 데이터를 보관하기 위한 BigDecimal 클래스
		//import 눌러야해
		BigDecimal bigDecimal = new BigDecimal("82.9820192382312739112312312321");
		x = 82.9820192382312739112312312321;
		System.out.printf("x:%.16f\n", x);
		System.out.printf("bigDecimal:%s\n", bigDecimal);
                     }
                 }