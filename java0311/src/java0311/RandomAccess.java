package java0311;

import java.io.RandomAccessFile;

public class RandomAccess {

	public static void main(String[] args) {
		try (RandomAccessFile file = new RandomAccessFile("./raf.txt", "rw")){
			//문자열을 바이트 배열로 변환해서 파일에 기록
			file.write("안녕하세요".getBytes());
			//file.writeChars("Hello"); 여기에 한글을 쓰면 글자가 깨져, 영어는 괜춘
			//읽기
			//파일 포인터를 맨 앞으로 보내기
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
