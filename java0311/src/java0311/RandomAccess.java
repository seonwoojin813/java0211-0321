package java0311;

import java.io.RandomAccessFile;

public class RandomAccess {

	public static void main(String[] args) {
		try (RandomAccessFile file = new RandomAccessFile("./raf.txt", "rw")){
			//���ڿ��� ����Ʈ �迭�� ��ȯ�ؼ� ���Ͽ� ���
			file.write("�ȳ��ϼ���".getBytes());
			//file.writeChars("Hello"); ���⿡ �ѱ��� ���� ���ڰ� ����, ����� ����
			//�б�
			//���� �����͸� �� ������ ������
			file.seek(0);
			byte [] b = new byte[1024];
			file.read(b);
			String str = new String(b);
			System.out.printf("%s\n", str);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
