

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class MulticastSend {

	public static void main(String[] args) {
		MulticastSocket ms = null;
		try {
			ms = new MulticastSocket();
			//������ ���� �ּ� ����
           InetAddress ip = InetAddress.getByName("230.100.50.5");
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.printf("�޽��� :");
				String msg = sc.nextLine();
				DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.getBytes().length, ip, 3000);
				ms.send(dp);
			}
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
			}finally {
				try {				
					ms.close();
				}catch(Exception e) {
					System.out.printf("%s\n", e.getMessage());
					e.printStackTrace();
				}
			}
		}
	}

