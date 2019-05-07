package java0308;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javax.swing.JOptionPane;

public class BufferedStreamMain {

	public static void main(String[] args) {
		/*
		PrintStream ps = null;
		FileOutputStream fos = null;
				try {
					//파일 출력 스트림을 생성
					fos = new FileOutputStream("./buffer.txt");
					//다른 출력 스트림을 이용해서 버퍼 스트림을 생성
					ps = new PrintStream(fos);
					
					ps.println("안녕하세요 선우진입니다.");
					ps.println("저는 26살입니다.");
					JOptionPane.showMessageDialog(null, "텍스트 저장 성공");
					
				}catch(Exception  e) {
					 System.out.printf("%s\n", e.getMessage());
					    e.printStackTrace();
					    
				}finally {
					//사용한 스트림 정리
				}
					try {
						fos.close();
						ps.close();
					}catch(Exception e) {
						 System.out.printf("%s\n", e.getMessage());
						    e.printStackTrace();
					}
          	*/
          	
		BufferedInputStream bis = null;
		FileInputStream fis = null;
				try {
					//파일 출력 스트림을 생성
					fis = new FileInputStream("./buffer.txt");
					//System.out.printf("%s\n", fis);
					//다른 출력 스트림을 이용해서 버퍼 스트림을 생성
					bis = new BufferedInputStream (fis);
					//System.out.printf("%s\n", bis);
					
					byte [ ] b = new byte[bis.available()];
					//System.out.printf("%s\n", b);
					
					bis.read(b);
					String str = new String(b);
			
					JOptionPane.showMessageDialog(null, str);
					
				}catch(Exception  e) {
					 System.out.printf("%s\n", e.getMessage());
					    e.printStackTrace();
					    
				}finally {
					//사용한 스트림 정리
				}
					try {
						fis.close();
						bis.close();
					}catch(Exception e) {
						 System.out.printf("%s\n", e.getMessage());
						    e.printStackTrace();
					}
            	}
     }
