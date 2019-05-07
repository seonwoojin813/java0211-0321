package java0321;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Controller {

	public static void main(String[] args) {
		//�����ͺ��̽� ���� �ڵ� �ۼ�
		
		//�����ͺ��̽� ���� ��ü
		//Connection con = null;
		
		//1.7 �����̻󿡼� try() �ȿ��� AutoCloseable �������̽��� ������
		//Ŭ������ �ν��Ͻ��� �����ϸ� close()�� ȣ������ �ʾƵ�
		//�ڵ����� close()�� ȣ���մϴ�.
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.100:1521/XEPDB1 ", "user06 ", "user06 "); //){
			PreparedStatement pstmt = con.prepareStatement("insert into mydept(deptno, dname, loc) values(?,?,?)"); ) {
			//����̹� Ŭ���� �ε� :  ������ �����ͺ��̽� ������ ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//con = DriverManager.getConnection("", "" ,"");
			
			//���� Ȯ���� ���ؼ� ���
			//System.out.printf("���� ����\n");
			
			//������ ���ε�
			pstmt.setInt(1, 90);
			pstmt.setString(2, "ȸ��");
			pstmt.setString(3, "����");
			
			//SQL����
			int result = pstmt.executeUpdate();
			
			//��� ���
			if(result > 0) {
				System.out.printf("������ ���� ����");
			}
			
			
			
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
		}
		/*
		finally {
			
		}
		*/
	}
}
