package java0313;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JOptionPane;

class ImageThread extends Thread{
	//�̹��� ������ �ּҸ� ���ڿ��� ����
			String addr = "http://img.ezmember.co.kr/cache/board/2017/08/28/46f84d0e744b74325d61ea9273d5f7ad.jpg";
	public void run() {
		//���ϸ� �κи� �߶󳻱�
		//���ڿ� ����
		//1.Ư�� ��ȣ�� �������� ����: split �Լ� �̿� - ���ڿ� �迭�� ����
		//2.��ġ�� �������� ���� : substring �Լ� �̿�  - ���ڿ��� ����

			//lastIndexOf �� substring�� �̿��ؼ� ���ϸ� ����
			int idx = addr.lastIndexOf('/');
			String filename = addr.substring(idx+1);
			//System.out.printf("%s\n", filename);
			
			//���� ��θ� ����
			String filepath = String.format("c:\\Temp\\%s", filename); //C����̺꿡 Temp�� �����س�����
			//File ��ü ����
			File f = new File(filepath);
			
			//������ �����ϸ� ��ȭ���� ����ϰ� �Լ� ����
			if(f.exists() == true) {
				JOptionPane.showMessageDialog(null, "������ �����մϴ�.");
			     return;
			}
            //�� �ּҿ� �����ϱ� ���� ��ü 
			HttpURLConnection con = null;
			//�����͸� �о���� ���� ��Ʈ��
			BufferedInputStream bis = null;
			//���Ͽ� ����Ʈ ����� ��Ʈ��
			PrintStream pw = null;
			 
			
			try {
				//�ٿ�ε� ���� �ּ� ����
				URL url = new URL(addr);
				//���� ��ü ����
				con = (HttpURLConnection)url.openConnection();
				//�ɼ��� ����
				con.setConnectTimeout(30000);
				con.setUseCaches(false);
				
				
				//�б� ���� ��Ʈ�� ����
				bis = new BufferedInputStream(con.getInputStream());
				//�����͸� ����ϱ� ���� ��Ʈ�� ����
				pw = new PrintStream(filepath);
				
				//������ �б�
				while(true) {
					byte [ ] b = new byte[512]; //ũ��� ����� ���� �� �־�
					int r = bis.read(b);
					if(r <= 0) { //���̻� ���� �� ����
						break;
					}
					//���� ������ ��� - �迭�� ��� ������ ����ϸ� �ȵ�
					//�迭�� ���� ��ŭ ����ؾ��մϴ�
                       pw.write(b, 0, r);
				}
				pw.flush();
		}catch(Exception e) {
			System.out.printf("1:%s\n", e.getMessage());
			e.printStackTrace();
		}finally {
			try {
			pw.close();
			bis.close();
			con.disconnect(); 
			
			}catch(Exception e) {
				System.out.printf("2:     %s\n", e.getMessage());
				e.printStackTrace();
		}
	  }
	}
}
public class ImageDownload {
	public static void main(String[] args) {
		//������ �ν��Ͻ��� �����ϰ� ������ ����
				Thread th = new ImageThread();
				th.start();
	}
}
