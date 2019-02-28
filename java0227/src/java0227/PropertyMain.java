package java0227;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyMain {

	public static void main(String[] args) {
		// 프로퍼티 저장을 위한 Properties 인스턴스를 생성
		Properties  prop = new Properties();
		prop.setProperty("name", "선우진");
		prop.setProperty("job", "학생");
		prop.setProperty("hometwon", "서울");
		
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
