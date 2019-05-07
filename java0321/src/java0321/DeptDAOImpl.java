package java0321;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//DAO 클래스나 서버가 작업에 사용하는 클래스는 싱클톤 패턴을 이용해서 디자인
public class DeptDAOImpl implements DeptDAO {
      //생성자를 private으로 생성
	//여기 작성된 내용은 맨 처음 한번만 수행됩니다.
	private DeptDAOImpl() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			 System.out.printf("드라이버 로드:%s\n", e.getMessage());
		}
	}
	
	//자기자신의 자료형으로 static 변수를 선언
	private static DeptDAO deptDAO;
	
	//인스턴스를 생성해서 참조를 리턴하는 static 메소드를 구현
	public static DeptDAO getInstance() {
		if(deptDAO == null) {
			deptDAO = new DeptDAOImpl();
		}
		return deptDAO;
	}

	@Override
	public int insertMyDEPT(MyDEPT myDEPT) {
		//결과를 리턴할 변수를 음수로 초기화하는데
		//그 이유는 성공했을 때 양수가 리턴되기 때문에 음수로 리턴해야 실패를
		//구분할 수 있기 떄문입니다. 
		int result = -1;
		
		try(
				 //데이터베이스 연결
				Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.100:1521/XEPDB1 ", "user06 ", "user06 ");
				PreparedStatement pstmt = con.prepareStatement("insert into mydept(deptno, dname, loc) values(?,?,?)"); 
				//ORA 에러 나오면 여기보기
				){
			//sql의 ?에 실제 데이터를 바인딩
			pstmt.setInt(1, myDEPT.getDeptno());
			pstmt.setString(2,  myDEPT.getDname());
			pstmt.setString(3,  myDEPT.getLoc());
			
			//SQL을 실행하고 그 결과를 result에 저장
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			//어떤 작업을 하다가 예외가 발생했는지 확인하기 위해서 
			//예외 메시지 앞에 태그를 추가
			System.out.printf("삽입예외:%s\n", e.getMessage());
		}
		return result;
	}

		@Override
		public int updateMyDEPT(MyDEPT  myDEPT) {
			//결과를 리턴할 변수를 음수로 초기화하는데
			//그 이유는 성공했을 때 양수가 리턴되기 때문에 음수로 리턴해야 실패를
			//구분할 수 있기 떄문입니다. 
			int result = -1;
			
			try(
					 //데이터베이스 연결
					Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.100:1521/XEPDB1 ", "user06 ", "user06 ");
					PreparedStatement pstmt = con.prepareStatement("update mydept set dname=?, loc=? where deptno=?"); 
					//ORA 에러 나오면 여기보기
					){
				//sql의 ?에 실제 데이터를 바인딩
				pstmt.setString(1, myDEPT.getDname());
				pstmt.setString(2,  myDEPT.getLoc());
				pstmt.setInt(3,  myDEPT.getDeptno());
				
				//SQL을 실행하고 그 결과를 result에 저장
				result = pstmt.executeUpdate();
				
			}catch(Exception e) {
				//어떤 작업을 하다가 예외가 발생했는지 확인하기 위해서 
				//예외 메시지 앞에 태그를 추가
				System.out.printf("수정예외:%s\n", e.getMessage());
			}
			return result;
	}
		
		//삭제하는 메소드
		//일반적으로 테이블의 기본키를 매개변수로 받아서 삭제
		@Override
		public int deleteMyDEPT(int  deptno) {
			//결과를 리턴할 변수를 음수로 초기화하는데
			//그 이유는 성공했을 때 양수가 리턴되기 때문에 음수로 리턴해야 실패를
			//구분할 수 있기 떄문입니다. 
			int result = -1;			
			try(
					 //데이터베이스 연결
					Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.100:1521/XEPDB1 ", "user06 ", "user06 ");
					PreparedStatement pstmt = con.prepareStatement("delete from mydept where deptno=?"); 
					//ORA 에러 나오면 여기보기
					){
				//sql의 ?에 실제 데이터를 바인딩	
				pstmt.setInt(1, deptno);			
				//SQL을 실행하고 그 결과를 result에 저장
				result = pstmt.executeUpdate();
				
			}catch(Exception e) {
				//어떤 작업을 하다가 예외가 발생했는지 확인하기 위해서 
				//예외 메시지 앞에 태그를 추가
				System.out.printf("수정예외:%s\n", e.getMessage());
			}
			return result;
	}

		@Override
		public List<MyDEPT> listMyDEPT() {
			//List를 리턴할 때는 List의 인스턴스를 생성하고 리턴
			//실패하거나 읽은 데이터가 없을 때에는 List의 size가 0입니다.
			List<MyDEPT> list = new ArrayList<MyDEPT>();
			try(
					 //데이터베이스 연결
					Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.100:1521/XEPDB1 ", "user06 ", "user06 ");
					PreparedStatement pstmt = con.prepareStatement("select * from mydept"); 
					//ORA 에러 나오면 여기보기
					){	
				//sql의 ?에 실제 데이터를 바인딩
				//SQL을 실행하고 그 결과를 result에 저장
		       ResultSet rs =  pstmt.executeQuery();
		       //끝까지 데이터 읽기
		       while(rs.next()) {
		    	   MyDEPT myDEPT = new MyDEPT();
		    	   //컬럼은 대소문자로 구분안함
		    	   myDEPT.setDeptno(rs.getInt("deptno"));
		    	   myDEPT.setDname(rs.getString("dname"));
		    	   myDEPT.setLoc(rs.getString("loc"));
		    	   
		    	   list.add(myDEPT);
		       }
				
			}catch(Exception e) {
				//어떤 작업을 하다가 예외가 발생했는지 확인하기 위해서 
				//예외 메시지 앞에 태그를 추가
				System.out.printf("수정예외:%s\n", e.getMessage());
			}
			return list;
		}

		@Override
		public MyDEPT getMyDEPT(int deptno) {
			//하나를 리턴하는 메소드는 인스턴스를 생성하지 않은 상태로 리턴
			//성공했을 때는 NULL이 아닌 데이터를 리턴하도록 합니다.
			//데이터를 못찾은 경우에는 NULL을 리턴합니다.
			MyDEPT mydept = null;
			try(
					 //데이터베이스 연결
					Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.100:1521/XEPDB1 ", "user06 ", "user06 ");
					PreparedStatement pstmt = con.prepareStatement("select * from mydept where deptno = ?"); 
					//ORA 에러 나오면 여기보기
					){			
				//sql의 ?에 실제 데이터를 바인딩
				pstmt.setInt(1,  deptno);

				//SQL을 실행하고 그 결과를 result에 저장
               ResultSet rs = pstmt.executeQuery();
               
               if(rs.next()) {
            	   mydept = new MyDEPT();
            	   mydept.setDeptno(rs.getInt("deptno"));
            	   mydept.setDname(rs.getString("dname"));
            	   mydept.setLoc(rs.getString("loc")); 
               }			
			}catch(Exception e) {
				System.out.printf("목록가져오기:%s\n", e.getMessage());
			}		
			return mydept;
		}		
	}