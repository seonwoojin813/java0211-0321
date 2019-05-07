package java0311;

import java.io.BufferedReader;
import java.io.FileReader;

//웹에서 문자열을 읽을 때도 동일
//스트림을 생성만 다름
public class TextFileRead {

	public static void main(String[] args) {
		//try - resource 구문 : close를 호출하지 않아도 자동 호출됨
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\503_08\\Documents\\0308.txt"))){
			//BufferedReader클래스의 readLines 메소드는 줄 단위로 읽어서 리턴하는 메소드
			//읽은 데이터가 없으면 null을 리턴합니다.
			/*
			while(true) {
				String str = br.readLine();
				if(str == null) {
					break;
				}
				System.out.println(str);
			}
			*/
			//읽어서 저장해야하는 경우
			//읽은 데이터를 추가할 StringBuilder 객체를 생성
			StringBuilder sb = new StringBuilder();
			String contect = "";
			while(true) {
				String str = br.readLine();
				if(str == null) {
					break;
				}
				//문자열을 계속 복사해서 작업하기 때문에 메모리 효율이 떨어짐
				//content = content + str; ->이거 제일 안좋은 예
				
				//StringBuilder에 문자열을 추가 - 복사 작업을 하지 않음
				sb.append(str);
			}
			//System.out.printf("%s", content);
			
			//StringBuilder의 데이터를 String으로 변환
			String content = sb.toString();
			System.out.printf("%s", content);
			
		}catch(Exception e) {
			//예외가 발생했을 때 수행할 코드
			//예외 메시지 출력
			System.out.printf("%s\n", e.getMessage());
			//예외를 역추적하는 코드를 출력
			e.printStackTrace();
	}
}
}