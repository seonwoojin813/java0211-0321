package java0321;

//DTO(Data Transfer Object - Variable Object ��� ��)
//���� ���� �����͸� ��� �ϳ��� ǥ���ϱ� ���� Ŭ���� 
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
