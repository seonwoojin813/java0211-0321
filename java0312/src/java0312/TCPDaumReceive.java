package java0312;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class TCPDaumReceive {

	public static void main(String[] args) {
		Socket socket = null;
		//소켓을 이용해서 문자열을 전송할 스트림 변수
		PrintWriter pw = null;
		//소켓을 이용해서 문자열을 읽을 스트림 변수
		BufferedReader br = null; 
		try {
			//www.daum.net의 주소 정보 만들기
			//try(InetAddress ia = InetAddress.getAllByName("www.daum.net"); )이건 안됨 { 여기 안에 쓰고 finally붙임
			InetAddress ia = InetAddress.getByName("www.daum.net");    
			//소켓 생성 - www.daum.net의 포트 번호는 80
			socket = new Socket(ia, 80);
			//문자열 전송을 위한 스트림을 생성
			pw = new PrintWriter(socket.getOutputStream());
			//메시지 전송
			pw.println("GET http://www.daum.net");
			pw.flush();
			
			
			//문자열을 읽기 위한 스트림을 생성
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//데이터 읽어서 출력하기
	      StringBuilder sb = new StringBuilder();
	      while(true) {
	    	  //한 줄 가져오기
	    	  String line = br.readLine();
	    	  //읽은 게 없으면 반복문 중단
	    	  if(line == null) {
	    		  break;
	    	  }
	    	  //읽은 내용을 sb에 추가
	    	  sb.append(line);
	      }
			String content =  sb.toString();
			System.out.printf("%s", content);
			
		}catch(Exception e) {
			//예외내용 출력
			System.out.printf("%s\n", e.getMessage());
			//예외를 역추적
			e.printStackTrace();
		}finally {
			try {
				//만든거에 반대로 close를 함
				br.close();
				pw.close();
				socket.close();//예외처리해야해
			}catch(Exception e) {
				//예외내용 출력
				System.out.printf("%s\n", e.getMessage());
				//예외를 역추적
				e.printStackTrace();		
		}
     	}
	    }
        }

