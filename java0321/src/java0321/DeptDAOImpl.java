package java0321;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//DAO Ŭ������ ������ �۾��� ����ϴ� Ŭ������ ��Ŭ�� ������ �̿��ؼ� ������
public class DeptDAOImpl implements DeptDAO {
      //�����ڸ� private���� ����
	//���� �ۼ��� ������ �� ó�� �ѹ��� ����˴ϴ�.
	private DeptDAOImpl() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			 System.out.printf("����̹� �ε�:%s\n", e.getMessage());
		}
	}
	
	//�ڱ��ڽ��� �ڷ������� static ������ ����
	private static DeptDAO deptDAO;
	
	//�ν��Ͻ��� �����ؼ� ������ �����ϴ� static �޼ҵ带 ����
	public static DeptDAO getInstance() {
		if(deptDAO == null) {
			deptDAO = new DeptDAOImpl();
		}
		return deptDAO;
	}

	@Override
	public int insertMyDEPT(MyDEPT myDEPT) {
		//����� ������ ������ ������ �ʱ�ȭ�ϴµ�
		//�� ������ �������� �� ����� ���ϵǱ� ������ ������ �����ؾ� ���и�
		//������ �� �ֱ� �����Դϴ�. 
		int result = -1;
		
		try(
				 //�����ͺ��̽� ����
				Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.100:1521/XEPDB1 ", "user06 ", "user06 ");
				PreparedStatement pstmt = con.prepareStatement("insert into mydept(deptno, dname, loc) values(?,?,?)"); 
				//ORA ���� ������ ���⺸��
				){
			//sql�� ?�� ���� �����͸� ���ε�
			pstmt.setInt(1, myDEPT.getDeptno());
			pstmt.setString(2,  myDEPT.getDname());
			pstmt.setString(3,  myDEPT.getLoc());
			
			//SQL�� �����ϰ� �� ����� result�� ����
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			//� �۾��� �ϴٰ� ���ܰ� �߻��ߴ��� Ȯ���ϱ� ���ؼ� 
			//���� �޽��� �տ� �±׸� �߰�
			System.out.printf("���Կ���:%s\n", e.getMessage());
		}
		return result;
	}

		@Override
		public int updateMyDEPT(MyDEPT  myDEPT) {
			//����� ������ ������ ������ �ʱ�ȭ�ϴµ�
			//�� ������ �������� �� ����� ���ϵǱ� ������ ������ �����ؾ� ���и�
			//������ �� �ֱ� �����Դϴ�. 
			int result = -1;
			
			try(
					 //�����ͺ��̽� ����
					Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.100:1521/XEPDB1 ", "user06 ", "user06 ");
					PreparedStatement pstmt = con.prepareStatement("update mydept set dname=?, loc=? where deptno=?"); 
					//ORA ���� ������ ���⺸��
					){
				//sql�� ?�� ���� �����͸� ���ε�
				pstmt.setString(1, myDEPT.getDname());
				pstmt.setString(2,  myDEPT.getLoc());
				pstmt.setInt(3,  myDEPT.getDeptno());
				
				//SQL�� �����ϰ� �� ����� result�� ����
				result = pstmt.executeUpdate();
				
			}catch(Exception e) {
				//� �۾��� �ϴٰ� ���ܰ� �߻��ߴ��� Ȯ���ϱ� ���ؼ� 
				//���� �޽��� �տ� �±׸� �߰�
				System.out.printf("��������:%s\n", e.getMessage());
			}
			return result;
	}
		
		//�����ϴ� �޼ҵ�
		//�Ϲ������� ���̺��� �⺻Ű�� �Ű������� �޾Ƽ� ����
		@Override
		public int deleteMyDEPT(int  deptno) {
			//����� ������ ������ ������ �ʱ�ȭ�ϴµ�
			//�� ������ �������� �� ����� ���ϵǱ� ������ ������ �����ؾ� ���и�
			//������ �� �ֱ� �����Դϴ�. 
			int result = -1;			
			try(
					 //�����ͺ��̽� ����
					Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.100:1521/XEPDB1 ", "user06 ", "user06 ");
					PreparedStatement pstmt = con.prepareStatement("delete from mydept where deptno=?"); 
					//ORA ���� ������ ���⺸��
					){
				//sql�� ?�� ���� �����͸� ���ε�	
				pstmt.setInt(1, deptno);			
				//SQL�� �����ϰ� �� ����� result�� ����
				result = pstmt.executeUpdate();
				
			}catch(Exception e) {
				//� �۾��� �ϴٰ� ���ܰ� �߻��ߴ��� Ȯ���ϱ� ���ؼ� 
				//���� �޽��� �տ� �±׸� �߰�
				System.out.printf("��������:%s\n", e.getMessage());
			}
			return result;
	}

		@Override
		public List<MyDEPT> listMyDEPT() {
			//List�� ������ ���� List�� �ν��Ͻ��� �����ϰ� ����
			//�����ϰų� ���� �����Ͱ� ���� ������ List�� size�� 0�Դϴ�.
			List<MyDEPT> list = new ArrayList<MyDEPT>();
			try(
					 //�����ͺ��̽� ����
					Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.100:1521/XEPDB1 ", "user06 ", "user06 ");
					PreparedStatement pstmt = con.prepareStatement("select * from mydept"); 
					//ORA ���� ������ ���⺸��
					){	
				//sql�� ?�� ���� �����͸� ���ε�
				//SQL�� �����ϰ� �� ����� result�� ����
		       ResultSet rs =  pstmt.executeQuery();
		       //������ ������ �б�
		       while(rs.next()) {
		    	   MyDEPT myDEPT = new MyDEPT();
		    	   //�÷��� ��ҹ��ڷ� ���о���
		    	   myDEPT.setDeptno(rs.getInt("deptno"));
		    	   myDEPT.setDname(rs.getString("dname"));
		    	   myDEPT.setLoc(rs.getString("loc"));
		    	   
		    	   list.add(myDEPT);
		       }
				
			}catch(Exception e) {
				//� �۾��� �ϴٰ� ���ܰ� �߻��ߴ��� Ȯ���ϱ� ���ؼ� 
				//���� �޽��� �տ� �±׸� �߰�
				System.out.printf("��������:%s\n", e.getMessage());
			}
			return list;
		}

		@Override
		public MyDEPT getMyDEPT(int deptno) {
			//�ϳ��� �����ϴ� �޼ҵ�� �ν��Ͻ��� �������� ���� ���·� ����
			//�������� ���� NULL�� �ƴ� �����͸� �����ϵ��� �մϴ�.
			//�����͸� ��ã�� ��쿡�� NULL�� �����մϴ�.
			MyDEPT mydept = null;
			try(
					 //�����ͺ��̽� ����
					Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.100:1521/XEPDB1 ", "user06 ", "user06 ");
					PreparedStatement pstmt = con.prepareStatement("select * from mydept where deptno = ?"); 
					//ORA ���� ������ ���⺸��
					){			
				//sql�� ?�� ���� �����͸� ���ε�
				pstmt.setInt(1,  deptno);

				//SQL�� �����ϰ� �� ����� result�� ����
               ResultSet rs = pstmt.executeQuery();
               
               if(rs.next()) {
            	   mydept = new MyDEPT();
            	   mydept.setDeptno(rs.getInt("deptno"));
            	   mydept.setDname(rs.getString("dname"));
            	   mydept.setLoc(rs.getString("loc")); 
               }			
			}catch(Exception e) {
				System.out.printf("��ϰ�������:%s\n", e.getMessage());
			}		
			return mydept;
		}		
	}