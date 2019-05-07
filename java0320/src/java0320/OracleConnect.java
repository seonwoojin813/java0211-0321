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
		//드라이버 클래스 로드: 여기서 예외가 발생하면 드라이버를  build path에
		//추가하지 않았거나 드라이버 클래스 이름이 잘못됨
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			System.out.printf("드라이버이름이나 추가 여부를 확인하세요!!!\n");
			e.printStackTrace();
		}
		Connection con = null;
		//완성된 SQL을 실행하는 실행객체 변수
		Statement stmt = null;
		try {
			//데이터베이스 연결
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.100:1521/XEPDB1 ", "user06 ", "user06 ");
			//System.out.printf("데이터베이스 접속 성공\n");
			stmt = con.createStatement();
			/*
			//SQL실행(insert)
			int r = stmt.executeUpdate("delete from dept1 where deptno = 1");
			//int r = stmt.executeUpdate("insert into dept1(deptno, dname, loc) values(1, '회계', '목동')");
			//int r = stmt.executeUpdate("update dept1 set dname='영업', loc='종로' where deptno=1");
			//삽입의 경우는 r > 0이면 성공 그렇지 않으면 실패
			//삽입의 경우는 실패하면 예외가 발생합니다.
		if(r > 0) {
			//System.out.printf("삽입성공!!!\n");
			System.out.printf("삭제성공!!!\n");
		}else if(r == 0) {
			System.out.printf("조건에 맞는 데이터가 없습니다.\n");
		}
		*/
			//dept 테이블의 전체 데이터를 읽어오는 SQL을 실행
			ResultSet rs = stmt.executeQuery("select * from dept");
			
			//성공한 경우에는 deptno와 dname 그리고 loc를 하나의 변수에 저장
			
			//하나의 행을 저장할 목적으로 생성
		    //Map<String, Object> map = new HashMap<String, Object>();
			
			//테이블 전체의 데이터를 저장하기 위한 자료구조를 생성
			List<Dept> list = new ArrayList<Dept>();//list는 반복문 바깥에서 만들어
			
			//전체 데이터를 순회
			while(rs.next() == true) {
				
				/*
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString(3);
				//System.out.printf("번호:%d 부서명:%s 지역:%s\n", deptno, dname, loc);
				*/
				
				
				//Map을 이용해서 하나의 행을 저장
				/*
				map.put("deptno", rs.getInt("deptno"));
				map.put("dname", rs.getString("dname"));
				map.put("loc", rs.getString(3));
				System.out.printf("%s\n", map);
				*/
			
				/*
				//DTO(VO) 클래스를 이용해서 하나의 행을 표현
				//클래스 이름은 대문자로 시작 변수명은 소문자로 시작
				//어떤 클래스의 객채를 저장하기 위한 변수명은 
				//클래스 이름을 그대로 쓰고 첫글자만 소문자로 변경하는 것이 관례
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
			System.out.printf("접속 정보가 잘못되었습니다.\n");
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
