package java0320;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OracleConnect {

	public static void main(String[] args) {
		//����̹� Ŭ���� �ε�: ���⼭ ���ܰ� �߻��ϸ� ����̹���  build path��
		//�߰����� �ʾҰų� ����̹� Ŭ���� �̸��� �߸���
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			System.out.printf("����̹��̸��̳� �߰� ���θ� Ȯ���ϼ���!!!\n");
			e.printStackTrace();
		}
		Connection con = null;
		//�ϼ��� SQL�� �����ϴ� ���ఴü ����
		Statement stmt = null;
		try {
			//�����ͺ��̽� ����
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.100:1521/XEPDB1 ", "user06 ", "user06 ");
			//System.out.printf("�����ͺ��̽� ���� ����\n");
			stmt = con.createStatement();
			/*
			//SQL����(insert)
			int r = stmt.executeUpdate("delete from dept1 where deptno = 1");
			//int r = stmt.executeUpdate("insert into dept1(deptno, dname, loc) values(1, 'ȸ��', '��')");
			//int r = stmt.executeUpdate("update dept1 set dname='����', loc='����' where deptno=1");
			//������ ���� r > 0�̸� ���� �׷��� ������ ����
			//������ ���� �����ϸ� ���ܰ� �߻��մϴ�.
		if(r > 0) {
			//System.out.printf("���Լ���!!!\n");
			System.out.printf("��������!!!\n");
		}else if(r == 0) {
			System.out.printf("���ǿ� �´� �����Ͱ� �����ϴ�.\n");
		}
		*/
			//dept ���̺��� ��ü �����͸� �о���� SQL�� ����
			ResultSet rs = stmt.executeQuery("select * from dept");
			
			//������ ��쿡�� deptno�� dname �׸��� loc�� �ϳ��� ������ ����
			
			//�ϳ��� ���� ������ �������� ����
		    //Map<String, Object> map = new HashMap<String, Object>();
			
			//���̺� ��ü�� �����͸� �����ϱ� ���� �ڷᱸ���� ����
			List<Dept> list = new ArrayList<Dept>();//list�� �ݺ��� �ٱ����� �����
			
			//��ü �����͸� ��ȸ
			while(rs.next() == true) {
				
				/*
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString(3);
				//System.out.printf("��ȣ:%d �μ���:%s ����:%s\n", deptno, dname, loc);
				*/
				
				
				//Map�� �̿��ؼ� �ϳ��� ���� ����
				/*
				map.put("deptno", rs.getInt("deptno"));
				map.put("dname", rs.getString("dname"));
				map.put("loc", rs.getString(3));
				System.out.printf("%s\n", map);
				*/
			
				/*
				//DTO(VO) Ŭ������ �̿��ؼ� �ϳ��� ���� ǥ��
				//Ŭ���� �̸��� �빮�ڷ� ���� �������� �ҹ��ڷ� ����
				//� Ŭ������ ��ä�� �����ϱ� ���� �������� 
				//Ŭ���� �̸��� �״�� ���� ù���ڸ� �ҹ��ڷ� �����ϴ� ���� ����
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString(3));
				System.out.printf("%s\n", dept);
				*/
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString(3));
				
				list.add(dept);
				
				
			}
			rs.close();
			
			for(Dept dept : list) {
				System.out.printf("%s\n", dept);
			}
			
		}catch(Exception e) {
			System.out.printf("���� ������ �߸��Ǿ����ϴ�.\n");
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
