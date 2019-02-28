package java0228;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMain {

	public static void main(String[] args) {
		// 현재 날짜 및 시간을 갖는 Date 인스턴스 생성하기
		//java.utill선택하기
		Date today = new Date();
		//toString이 재정의 되어 있어서 바로 출력하면 저장된 데이터 확인이 가능
		System.out.printf("%s\n", today);
		
		//년월일을 직접 입력해서 생성 - Deprecated
		//년도는 1900년 이후의 지나온 년도 
		//월은 0부터 시작---*중요*
		//1994년 8월 13일
		//Date birth = new Date(1994,  8,  13);를 출력하면
		//Thu Sep 13 00:00:00 KST 3894이렇게 나와
		//그래서 1994를 94로 8을 7로 고쳐야해
		//월은 0부터 시작
		Date birth = new Date(94,  7,  13);
		System.out.printf("%s\n", birth);
		
		//현재 날짜 및 시간을 갖는 Calendar 인스턴스 생성
		Calendar now = Calendar.getInstance();
		Calendar cal = new GregorianCalendar();
		System.out.printf("%s\n", now);
		System.out.printf("%s\n", cal);
		
		
		//특정한 날짜 및 시간 만들기
		//1993년 3월 27일 13시 00분 00초 만들기
		cal.set(Calendar.YEAR, 1993);
		cal.set(Calendar.MONTH, 2);
		cal.set(Calendar.DAY_OF_MONTH, 27);
		cal.set(Calendar.HOUR, 13);
		
		//now에서 cal까지 지나온 날짜 수 계산
		long gap = now.getTimeInMillis()- cal.getTimeInMillis();
		gap = gap / 1000 / 86400;//1000은 밀리초 86400은24시간을 초로 계산한거     ***1초가 1000밀리초
		System.out.printf("은정이가 태어난지 %d일이 지났습니다\n", gap);
		
	}

}
