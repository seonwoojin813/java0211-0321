package java0311;

import java.io.FileReader;

public class CharaterFileStream {

	public static void main(String[] args) {
		/*
		try(FileWriter fw = new FileWriter("./filerwriter.txt", true)) {
			//������ ���
			fw.write("���Ͽ� ���� ������ ����մϴ�.\n");
			fw.write("flush�� ȣ������ ������ ����� ���� ���� ���� �ֽ��ϴ�.\n");
			System.out.printf("���ڵ� ���:%s\n", fw.getEncoding());
		}catch(Exception e) {
			//���ܰ� �߻����� �� ������ �ڵ�
			//���� �޽��� ���
			System.out.printf("%s\n", e.getMessage());
			//���ܸ� �������ϴ� �ڵ带 ���
			e.printStackTrace();
         }
         */
		
		try(FileReader fr = new FileReader("./filerwriter.txt")){
			//���� ������ ���� �о ����ϱ�
			while(true) {
				char [] buf = new char[10];
				int r = fr.read(buf);
				if(r <= 0) {
					break;
				}
				/*
			for(char ch : buf) {
				System.out.printf("%s", ch);
			}
			*/
			String msg = new String(buf);
			System.out.printf("%s", msg);
			}

		}catch(Exception e) {
			//���ܰ� �߻����� �� ������ �ڵ�
			//���� �޽��� ���
			System.out.printf("%s\n", e.getMessage());
			//���ܸ� �������ϴ� �ڵ带 ���
			e.printStackTrace();
		}
	}
}
