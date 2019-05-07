package java0311;

import java.io.OutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SevenApi {

	public static void main(String[] args) {
		//��Ʈ�� ���� ����
		
		//1.7������ �� �������� ��Ʈ�� �������� �ʾƵ� ��
		//finally�� ������� ���� ���̱� ����
		//���Ͽ� ���� ������ ����
		Path path = Paths.get("./seven.dat");
		
		//try �ȿ��� ��Ʈ���� �����ϸ� �� ��Ʈ���� ���� ���� �ʿ䰡 ����
		try(OutputStream os = Files.newOutputStream(path)) {
			//��Ʈ�� ����
			//��Ʈ�� ���
			os.write(97);
			os.flush();
		}catch(Exception e) {
			//���ܰ� �߻����� �� ������ �ڵ�
			//���� �޽��� ���
			System.out.printf("%s\n", e.getMessage());
			//���ܸ� �������ϴ� �ڵ带 ���
			e.printStackTrace();
		}finally {
			//��Ʈ�� �ݱ�
		}
				try(InputStream is = Files.newInputStream(path)) {
					//��Ʈ�� ����
					//��Ʈ�� ���
					int ch = is.read();
					System.out.printf("%c\n", ch);
				}catch(Exception e) {
					//���ܰ� �߻����� �� ������ �ڵ�
					//���� �޽��� ���
					System.out.printf("%s\n", e.getMessage());
					//���ܸ� �������ϴ� �ڵ带 ���
					e.printStackTrace();
	}
  }
}