package java0311;

import java.io.FileReader;

public class CharaterFileStream {

	public static void main(String[] args) {
		/*
		try(FileWriter fw = new FileWriter("./filerwriter.txt", true)) {
			//데이터 기록
			fw.write("파일에 문자 단위로 기록합니다.\n");
			fw.write("flush를 호출하지 않으면 기록이 되지 않을 수도 있습니다.\n");
			System.out.printf("인코딩 방식:%s\n", fw.getEncoding());
		}catch(Exception e) {
			//예외가 발생했을 때 수행할 코드
			//예외 메시지 출력
			System.out.printf("%s\n", e.getMessage());
			//예외를 역추적하는 코드를 출력
			e.printStackTrace();
         }
         */
		
		try(FileReader fr = new FileReader("./filerwriter.txt")){
			//파일 내용을 전부 읽어서 출력하기
			while(true) {
				char [] buf = new char[10];
				int r = fr.read(buf);
				if(r <= 0) {
					break;
				}
				/*
			for(char ch : buf) {
				System.out.printf("%s", ch);
			}
			*/
			String msg = new String(buf);
			System.out.printf("%s", msg);
			}

		}catch(Exception e) {
			//예외가 발생했을 때 수행할 코드
			//예외 메시지 출력
			System.out.printf("%s\n", e.getMessage());
			//예외를 역추적하는 코드를 출력
			e.printStackTrace();
		}
	}
}
