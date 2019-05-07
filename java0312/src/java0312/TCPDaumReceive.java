package java0312;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class TCPDaumReceive {

	public static void main(String[] args) {
		Socket socket = null;
		//������ �̿��ؼ� ���ڿ��� ������ ��Ʈ�� ����
		PrintWriter pw = null;
		//������ �̿��ؼ� ���ڿ��� ���� ��Ʈ�� ����
		BufferedReader br = null; 
		try {
			//www.daum.net�� �ּ� ���� �����
			//try(InetAddress ia = InetAddress.getAllByName("www.daum.net"); )�̰� �ȵ� { ���� �ȿ� ���� finally����
			InetAddress ia = InetAddress.getByName("www.daum.net");    
			//���� ���� - www.daum.net�� ��Ʈ ��ȣ�� 80
			socket = new Socket(ia, 80);
			//���ڿ� ������ ���� ��Ʈ���� ����
			pw = new PrintWriter(socket.getOutputStream());
			//�޽��� ����
			pw.println("GET http://www.daum.net");
			pw.flush();
			
			
			//���ڿ��� �б� ���� ��Ʈ���� ����
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//������ �о ����ϱ�
	      StringBuilder sb = new StringBuilder();
	      while(true) {
	    	  //�� �� ��������
	    	  String line = br.readLine();
	    	  //���� �� ������ �ݺ��� �ߴ�
	    	  if(line == null) {
	    		  break;
	    	  }
	    	  //���� ������ sb�� �߰�
	    	  sb.append(line);
	      }
			String content =  sb.toString();
			System.out.printf("%s", content);
			
		}catch(Exception e) {
			//���ܳ��� ���
			System.out.printf("%s\n", e.getMessage());
			//���ܸ� ������
			e.printStackTrace();
		}finally {
			try {
				//����ſ� �ݴ�� close�� ��
				br.close();
				pw.close();
				socket.close();//����ó���ؾ���
			}catch(Exception e) {
				//���ܳ��� ���
				System.out.printf("%s\n", e.getMessage());
				//���ܸ� ������
				e.printStackTrace();		
		}
     	}
	    }
        }

