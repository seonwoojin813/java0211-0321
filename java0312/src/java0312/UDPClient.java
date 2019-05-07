package java0312;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {

	public static void main(String[] args) {
		//DatagramSocket 생성 - 보내는 쪽은 포트 번호를 설정 할 필요가 없습니다.
				DatagramSocket ds = null;
				try {
					//키보드로부터 입력받기 위한 인스턴스 생성
					Scanner sc = new Scanner(System.in);
					while(true) {
						System.out.printf("전송할 곳의 IP: ");
						String ip = sc.nextLine();
						System.out.printf("전송할 곳의 PORT: ");
						int port = sc.nextInt();
						sc.nextLine();
						System.out.printf("전송할 메시지: ");
						String msg = sc.nextLine();
						
						//소켓 생성
						ds = new DatagramSocket();
						//메시지를 보낼 곳의 IP만들기
						InetAddress send = InetAddress.getByName(ip);
					    //전송 할 Packet 만들기
						DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, send, port);
						
						//데이터 전송
						ds.send(dp);
						ds.close();

					}			
				}catch(Exception e) {
					System.out.printf("%s\n", e.getMessage());
					e.printStackTrace();
					}finally {
						try {
							ds.close();
						}catch(Exception e) {
							System.out.printf("%s\n", e.getMessage());
							e.printStackTrace();
						}
					}

				}

	}


