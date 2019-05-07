package java0312;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		//클라이언트와 연결을 하기 위한 소켓
		ServerSocket ss = null;
		//클라이언트와 데이터를 주고 받기 위한 소켓 - 클라이언트 개수 만큼 있어야 합니다.
		Socket socket = null;
		
		try {
			//서버소켓 생성
			ss = new ServerSocket(9999);
			System.out.print("서버 대기 중...\n");
			while(true) {
				//클라이언트 접속 대기 - 접속 할 때 까지 대기
				socket = ss.accept();
				//접속자 정보를 출력
				System.out.printf("%s\n", socket);
				//클라이언트가 전송할 데이터를 출력
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String msg = br.readLine();
				System.out.printf("전송된 메시지:%s\n", msg);
				br.close();
				socket.close();
			}
		}catch(Exception e) {
			//예외내용 출력
			System.out.printf("%s\n", e.getMessage());
			//예외를 역추적
			e.printStackTrace();
		}finally {
			try {
				ss.close();
				socket.close();
				
			}catch(Exception e) {
				//예외내용 출력
				System.out.printf("%s\n", e.getMessage());
				//예외를 역추적
				e.printStackTrace();
			}
			
		}

	}

}
