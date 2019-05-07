package java0321;

//DTO(Data Transfer Object - Variable Object 라고도 함)
//여러 개의 데이터를 묶어서 하나로 표현하기 위한 클래스 
public class MyDEPT {
     private int deptno;
     private String dname;
     private String loc;
	
     
     public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "MyDEPT [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

     
}
