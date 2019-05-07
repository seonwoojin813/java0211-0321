package java0308;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamMain {

	public static void main(String[] args) {
		/*
		//파일에 기록을 하기 위한 변수
		FileOutputStream fos = null;
		try {
			      //파일 경로를 가지고 파일 출력 스트림을 만들기
			      //출력 스트림에서 뒤에 true를 대입하면 추가모드가 됩니다. --> 뒤에 이어붙이기
			       fos = new FileOutputStream("./sample.bin");
                   //파일에 바이트 단위로 기록 			    
			       fos.write('H');
			       fos.write("ello Stream".getBytes());
		}catch(Exception  e) {
			 System.out.printf("%s\n", e.getMessage());
			    e.printStackTrace();
			    
		}finally {
			try {
				fos.close();
			}catch(IOException e) {
				 System.out.printf("%s\n", e.getMessage());
				    e.printStackTrace();
			}
			
		}
*/
		
		FileInputStream fis = null;
		try {
			//sample.bin파일의 내용을 읽을 수 있는 스트림을 생성
			fis = new FileInputStream("./sample.bin");
			//바이트 단위로 읽어서 출력
			//한글이 있을 때는 바이트 단위로 읽어서 바로 출력하면 이상한 글자가 출력됨  
			// ¾?³???¼¼¿? ¼±¿??ø ??´?´?. --> 저장된 Hello Stream에 한글을 입력하고 저장하고 다시 출력하면 이렇게 나와
			//이럴 땐 while밑에 한글이 있을 때는 모아서 한번에 찍기
			/*
			while(true) {
				int result = fis.read();
				if(result == -1) {
					break;
				}
				 System.out.printf("%c", (char)result);
			}*/
			
			//한글이 있을 때는 모아서 한꺼번에 읽기
			byte [ ] b = new byte[fis.available()];  //.available읽을수 있는 크기
			fis.read(b);
			String hangul = new String(b);
			 System.out.printf("%s\n", hangul);
			
		}catch(Exception  e) {
			 System.out.printf("%s\n", e.getMessage());
			    e.printStackTrace();
			    
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				 System.out.printf("%s\n", e.getMessage());
				    e.printStackTrace();
			}
	}
 }
}