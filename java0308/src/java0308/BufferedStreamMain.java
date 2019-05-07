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
					//���� ��� ��Ʈ���� ����
					fos = new FileOutputStream("./buffer.txt");
					//�ٸ� ��� ��Ʈ���� �̿��ؼ� ���� ��Ʈ���� ����
					ps = new PrintStream(fos);
					
					ps.println("�ȳ��ϼ��� �������Դϴ�.");
					ps.println("���� 26���Դϴ�.");
					JOptionPane.showMessageDialog(null, "�ؽ�Ʈ ���� ����");
					
				}catch(Exception  e) {
					 System.out.printf("%s\n", e.getMessage());
					    e.printStackTrace();
					    
				}finally {
					//����� ��Ʈ�� ����
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
					//���� ��� ��Ʈ���� ����
					fis = new FileInputStream("./buffer.txt");
					//System.out.printf("%s\n", fis);
					//�ٸ� ��� ��Ʈ���� �̿��ؼ� ���� ��Ʈ���� ����
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
					//����� ��Ʈ�� ����
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
