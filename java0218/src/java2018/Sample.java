package java2018;

public class Sample {
                    //private으로 설정한 멤버 변수
	               //이 변수는 이 클래스 안에 만들어지는 메소드 안에서만 사용가능
	                    private int num;
	                    //public으로 설정한 멤버 변수
	                    // 이 변수는 클래스 안에 만들어지는 메소드에서 사용이 가능하고
	                    //외부에서 인스턴스로도 접근이 가능합니다.
	                    public String  name;
	                    
	                    //static 변수 - 1개만 만들어서 공유하기 위한 변수
	                    //클래스 이름으로 접근가능하고 인스턴스를 통해서도 접근이 가능
	                    public static String schooLName;
}
