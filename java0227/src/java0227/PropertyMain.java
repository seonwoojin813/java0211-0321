package java0227;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyMain {

	public static void main(String[] args) {
		// ������Ƽ ������ ���� Properties �ν��Ͻ��� ����
		Properties  prop = new Properties();
		prop.setProperty("name", "������");
		prop.setProperty("job", "�л�");
		prop.setProperty("hometwon", "����");
		
		try {
			prop.store(new FileOutputStream("C:\\Users\\503_08\\Documents\\java.txt"),  "Sunwoojin");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
