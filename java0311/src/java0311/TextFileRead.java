package java0311;

import java.io.BufferedReader;
import java.io.FileReader;

//������ ���ڿ��� ���� ���� ����
//��Ʈ���� ������ �ٸ�
public class TextFileRead {

	public static void main(String[] args) {
		//try - resource ���� : close�� ȣ������ �ʾƵ� �ڵ� ȣ���
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\503_08\\Documents\\0308.txt"))){
			//BufferedReaderŬ������ readLines �޼ҵ�� �� ������ �о �����ϴ� �޼ҵ�
			//���� �����Ͱ� ������ null�� �����մϴ�.
			/*
			while(true) {
				String str = br.readLine();
				if(str == null) {
					break;
				}
				System.out.println(str);
			}
			*/
			//�о �����ؾ��ϴ� ���
			//���� �����͸� �߰��� StringBuilder ��ü�� ����
			StringBuilder sb = new StringBuilder();
			String contect = "";
			while(true) {
				String str = br.readLine();
				if(str == null) {
					break;
				}
				//���ڿ��� ��� �����ؼ� �۾��ϱ� ������ �޸� ȿ���� ������
				//content = content + str; ->�̰� ���� ������ ��
				
				//StringBuilder�� ���ڿ��� �߰� - ���� �۾��� ���� ����
				sb.append(str);
			}
			//System.out.printf("%s", content);
			
			//StringBuilder�� �����͸� String���� ��ȯ
			String content = sb.toString();
			System.out.printf("%s", content);
			
		}catch(Exception e) {
			//���ܰ� �߻����� �� ������ �ڵ�
			//���� �޽��� ���
			System.out.printf("%s\n", e.getMessage());
			//���ܸ� �������ϴ� �ڵ带 ���
			e.printStackTrace();
	}
}
}