package java0308;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileInfoMain {

	public static void main(String[] args) {
		// ���� ���� Ȯ��
		File f = new File("./");
		System.out.printf("%s\n", f.getAbsolutePath());
		//������ ���翩�� Ȯ��
		if(f.exists()) {
			//�������� Ȯ��
			System.out.printf("���� ũ��:%d\n", f.length());
			System.out.printf("������ ���� �ð�:%d\n", f.lastModified());
			Date date = new Date(f.lastModified());
			System.out.printf("�����������ð�:%s\n", date);
		}else {
			try {
				//������ ����
				f.createNewFile();
			}catch(IOException e) {
				e.printStackTrace();
			}
			System.out.printf("������ �����Ƿ� �ٿ�ε��մϴ�.\n");
		}
	}
}
