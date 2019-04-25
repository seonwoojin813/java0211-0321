package java0219;

public class Based {
    /*         
	private int a; //현재 클래스의 내부 메소드에서만 사용이 가능
                int b; //package는 동일 package 내에서는 public 다른 package 에서는 private
                protected int c; //현재 클래스의 내부 메소드와 상속받은 클래스의 내부 메소드에서만 사용가능
                public int d; //인스턴스도 사용 가능
*/
	public void superMethod() {
  	  System.out.printf("상위 클래스에만 존재하는 메소드\n");
    }
    public void commonMethod() {
  	  System.out.printf("상위 클래스에 존재하는 메소드\n");

    
    
    }
	
	
}
