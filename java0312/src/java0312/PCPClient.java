package java0312;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class PCPClient {

	public static void main(String[] args) {
		Socket socket = null;		
		try {
			//���� ��ǻ���� 9999�� ��Ʈ�� ����
			//127.0.0.1 �̰� �ڱ� ��ǻ�� - ȥ�� �ϰ� ���� �� 
			
			/*
			socket = new Socket("192.168.0.100", 9999);
			//�޽����� ����
			Scanner sc = new Scanner(System.in);
			System.out.printf("������ �޽���");
			String msg = sc.nextLine();
			*/
			Scanner sc = new Scanner(System.in);
		    while(true) {
		    	//���� ��ǻ���� 9999�� ��Ʈ�� ����
		    	socket = new Socket("192.168.0.102", 9999);
		    	System.out.printf("������ �޽���");
				String msg = sc.nextLine();
		    
			   PrintWriter pw = new PrintWriter(socket.getOutputStream());
			   pw.println(msg);
		       pw.flush();
			   pw.close();
			//�̰� ��� ������ �ִ� �� 
		    }
			//sc.close();
				}catch(Exception e) {
					//���ܳ��� ���
					System.out.printf("%s\n", e.getMessage());
					//���ܸ� ������
					e.printStackTrace();
				}finally {
					try {
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


