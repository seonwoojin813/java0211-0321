package java0312;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		//Ŭ���̾�Ʈ�� ������ �ϱ� ���� ����
		ServerSocket ss = null;
		//Ŭ���̾�Ʈ�� �����͸� �ְ� �ޱ� ���� ���� - Ŭ���̾�Ʈ ���� ��ŭ �־�� �մϴ�.
		Socket socket = null;
		
		try {
			//�������� ����
			ss = new ServerSocket(9999);
			System.out.print("���� ��� ��...\n");
			while(true) {
				//Ŭ���̾�Ʈ ���� ��� - ���� �� �� ���� ���
				socket = ss.accept();
				//������ ������ ���
				System.out.printf("%s\n", socket);
				//Ŭ���̾�Ʈ�� ������ �����͸� ���
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String msg = br.readLine();
				System.out.printf("���۵� �޽���:%s\n", msg);
				br.close();
				socket.close();
			}
		}catch(Exception e) {
			//���ܳ��� ���
			System.out.printf("%s\n", e.getMessage());
			//���ܸ� ������
			e.printStackTrace();
		}finally {
			try {
				ss.close();
				socket.close();
				
			}catch(Exception e) {
				//���ܳ��� ���
				System.out.printf("%s\n", e.getMessage());
				//���ܸ� ������
				e.printStackTrace();
			}
			
		}

	}

}
