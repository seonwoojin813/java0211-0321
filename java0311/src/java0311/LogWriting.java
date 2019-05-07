package java0311;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LogWriting {

	public static void main(String[] args) {
		//오늘날짜에 해당하는 파일이름 만들기(2019-03-11.log - 있으면 추가) 
		
		//오늘 날짜를 저장하는 클래스의 인스턴스를 만들기
		Calendar today = new GregorianCalendar();
		
	    //년 월 일을 추출
		int year = today.get(Calendar.YEAR);
		//월은 0부터 시작하므로 1더하기
		int month = today.get(Calendar.MONTH) + 1;
		int day = today.get(Calendar.DAY_OF_MONTH);
		//파일이름을 생성 - String.format : printf 와 사용법은 동일
		String filename = String.format("%4d-%02d-%02d.log", year, month, day);
		
		//파일이름을 생성
		try(PrintWriter pw = new PrintWriter(new FileWriter(filename, true))){
			pw.println("로그를 기록합니다.\n");
			pw.println("오늘은 에러를 안 내야 하는데");
			pw.flush();
		}catch(Exception e) {
			//예외가 발생했을 때 수행할 코드
			//예외 메시지 출력
			System.out.printf("%s\n", e.getMessage());
			//예외를 역추적하는 코드를 출력
			e.printStackTrace();
			
		}

	}

}
