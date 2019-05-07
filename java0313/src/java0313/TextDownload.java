package java0313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//Thread Ŭ������ �̿��ؼ� Thread�� ����
class TextThread extends Thread{
	public void run() {
		//������ �ݵ�� �����ؾ��ϴ� URLConnection ���� ����
		HttpURLConnection con = null;
		//���ڿ��� �о�� BufferedReader ���� ����
		BufferedReader br = null;
		
		try {
			//1.URL�� ���� �� �ʿ䰡 ���� Ŭ������ try�ȿ��� ����
			URL url = new URL("https://sports.news.naver.com/wfootball/index.nhn");
			//2.URL�� ��� �� �� �ִ� ���� ��ü ����
			//URLConnection�� �߻� Ŭ������ ����� Ŭ������ ������ �� ��ȯ�ؼ� ���
			con = (HttpURLConnection)url.openConnection();
			
			//3.���� �ɼ� ���� : �޼ҵ� ���۹��, ���� ���� �ð�, ĳ�� ��� ���� ��
			con.setConnectTimeout(30000); //���� ���� �ð��� 30��
			con.setUseCaches(false);//ĳ�� ����� ���� ����
			con.setRequestMethod("GET");//GET������� ����
			
			//4.���ڿ��� �о�� ��Ʈ���� ����
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			//5.���ڿ��� �о����- ��뷮�� ���ڿ��� �б�
			//�����͸� �о�ö��� �ٴ����� �о���Ƿ� ���� ������ ���ڿ� ��ü��
			//������ �ϴ� ���� ����
			//Stringbuilder�� �׻� ������ ������ ���� 
			StringBuilder sb = new StringBuilder();

			//ũ�⸦ �� �� �����Ƿ� ���ѹݺ�
			while(true) {
				//�� �� �б�
				String line = br.readLine();
				//���� ���ڿ��� ������ �ݺ��� ����
				if(line == null) {
					break;
				}
				//���� ���ڿ��� ������ sb�� ���ڿ��� �߰�
				sb.append(line);
			}
			//���ڿ��� ���� ���������� ������ ������ �ʿ���� ������ String���� ��ȯ 
			String content = sb.toString();
			System.out.printf("%s", content);
			
			
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}finally {
			try {
			//���߿� ���� ���� ������	
			br.close();
			con.disconnect();
			}catch(IOException e) {
				System.out.printf("%s\n", e.getMessage());
				e.printStackTrace();
		}
	}
	}
}
public class TextDownload {

	public static void main(String[] args) {
		//������ �ν��Ͻ��� �����ϰ� ������ ����
		Thread th = new TextThread();
		th.start();

	}

}
