package java0312;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class PCPClient {

	public static void main(String[] args) {
		Socket socket = null;		
		try {
			//로컬 컴퓨터의 9999번 포트의 연결
			//127.0.0.1 이게 자기 컴퓨터 - 혼자 하고 싶을 때 
			
			/*
			socket = new Socket("192.168.0.100", 9999);
			//메시지를 전송
			Scanner sc = new Scanner(System.in);
			System.out.printf("전송할 메시지");
			String msg = sc.nextLine();
			*/
			Scanner sc = new Scanner(System.in);
		    while(true) {
		    	//로컬 컴퓨터의 9999번 포트에 연결
		    	socket = new Socket("192.168.0.102", 9999);
		    	System.out.printf("전송할 메시지");
				String msg = sc.nextLine();
		    
			   PrintWriter pw = new PrintWriter(socket.getOutputStream());
			   pw.println(msg);
		       pw.flush();
			   pw.close();
			//이건 계속 보낼수 있는 것 
		    }
			//sc.close();
				}catch(Exception e) {
					//예외내용 출력
					System.out.printf("%s\n", e.getMessage());
					//예외를 역추적
					e.printStackTrace();
				}finally {
					try {
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


