package java0308;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamMain {

	public static void main(String[] args) {
		/*
		//���Ͽ� ����� �ϱ� ���� ����
		FileOutputStream fos = null;
		try {
			      //���� ��θ� ������ ���� ��� ��Ʈ���� �����
			      //��� ��Ʈ������ �ڿ� true�� �����ϸ� �߰���尡 �˴ϴ�. --> �ڿ� �̾���̱�
			       fos = new FileOutputStream("./sample.bin");
                   //���Ͽ� ����Ʈ ������ ��� 			    
			       fos.write('H');
			       fos.write("ello Stream".getBytes());
		}catch(Exception  e) {
			 System.out.printf("%s\n", e.getMessage());
			    e.printStackTrace();
			    
		}finally {
			try {
				fos.close();
			}catch(IOException e) {
				 System.out.printf("%s\n", e.getMessage());
				    e.printStackTrace();
			}
			
		}
*/
		
		FileInputStream fis = null;
		try {
			//sample.bin������ ������ ���� �� �ִ� ��Ʈ���� ����
			fis = new FileInputStream("./sample.bin");
			//����Ʈ ������ �о ���
			//�ѱ��� ���� ���� ����Ʈ ������ �о �ٷ� ����ϸ� �̻��� ���ڰ� ��µ�  
			// ��?��???������? ������??�� ??��?��?. --> ����� Hello Stream�� �ѱ��� �Է��ϰ� �����ϰ� �ٽ� ����ϸ� �̷��� ����
			//�̷� �� while�ؿ� �ѱ��� ���� ���� ��Ƽ� �ѹ��� ���
			/*
			while(true) {
				int result = fis.read();
				if(result == -1) {
					break;
				}
				 System.out.printf("%c", (char)result);
			}*/
			
			//�ѱ��� ���� ���� ��Ƽ� �Ѳ����� �б�
			byte [ ] b = new byte[fis.available()];  //.available������ �ִ� ũ��
			fis.read(b);
			String hangul = new String(b);
			 System.out.printf("%s\n", hangul);
			
		}catch(Exception  e) {
			 System.out.printf("%s\n", e.getMessage());
			    e.printStackTrace();
			    
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				 System.out.printf("%s\n", e.getMessage());
				    e.printStackTrace();
			}
	}
 }
}