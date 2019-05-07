package java0312;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {

	public static void main(String[] args) {
		//DatagramSocket ���� - ������ ���� ��Ʈ ��ȣ�� ���� �� �ʿ䰡 �����ϴ�.
				DatagramSocket ds = null;
				try {
					//Ű����κ��� �Է¹ޱ� ���� �ν��Ͻ� ����
					Scanner sc = new Scanner(System.in);
					while(true) {
						System.out.printf("������ ���� IP: ");
						String ip = sc.nextLine();
						System.out.printf("������ ���� PORT: ");
						int port = sc.nextInt();
						sc.nextLine();
						System.out.printf("������ �޽���: ");
						String msg = sc.nextLine();
						
						//���� ����
						ds = new DatagramSocket();
						//�޽����� ���� ���� IP�����
						InetAddress send = InetAddress.getByName(ip);
					    //���� �� Packet �����
						DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, send, port);
						
						//������ ����
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


