package java0312;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

	public static void main(String[] args) {
		//DatagramSocket ���� - �޴� ���� ��Ʈ ��ȣ�� ����
		DatagramSocket ds = null;
		try {
			//���� ����
			ds = new DatagramSocket(7777);
			while(true){
			//�����͸� ������ �迭 ����
			byte [] b = new byte[256];
			//UDP �����͸� ���۹޾Ƽ� �����ϱ� ���� DatagramPacket ����
			DatagramPacket dp = new DatagramPacket(b, b.length);
			//������ ������ ���� �� ���۹ޱ�
			ds.receive(dp);
			//������ ��ǻ���� �ּ� ���� ���
			System.out.printf("������ ��:%s\n", dp.getAddress());
			//���۹��� �����͸� �о ���
			String msg = new String(b).trim();
			System.out.printf("���۹��� �޽���: %s\n", msg);
		}
			/*
			while(true) {
				//������ ������ ���� �� ���۹ޱ�
				ds.receive(dp);
				//������ ��ǻ���� �ּ� ���� ���
				System.out.printf("������ ��:%s\n", dp.getAddress());
				//���۹��� �����͸� �о ���
				String msg = new String(b).trim();
				System.out.printf("���۹��� �޽���: %s\n", msg);
			}
			*/
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
