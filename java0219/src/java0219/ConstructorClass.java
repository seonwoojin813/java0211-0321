package java0219;

public class ConstructorClass {
                //항상 클래스를 만들면 기본적으로 제공되는 생성자가 있습니다.
	/*
	           // 이 생성자는 다른 생성자를 만들면 자동으로 소멸됩니다.
	             public ConstructorClass() {
 	              	super();
	}
*/
	//번호와 이름을 저장 : 객체 지향언어에서는
	//변수에 직접 접근하는 것을 금기시하고 getter와 setter를 이용해서
	//변수에 접근하는 것을 권장 
	private int num;
	private String name;
	
	//매개변수가 없는 생성자 -default constructor
	public ConstructorClass() {
		System.out.printf("매개변수가 없는 생성자\n");
		num = 1;
	}
	
	//생성자는 오버로딩(Overloading) - 
	//매소드 이름은 같고 매개변수의 개수와 자료형이 다른경우
	
	public ConstructorClass(int num, String name) {
		//매개변수가 없는 자신의 생성자를 호출합니다.
		//일반 처리 구문보다 앞에 있어야 합니다.
		this ();
		System.out.printf("매개변수가 있는 생성자\n");
		this.num = num;
		this.name = name;
	}
	
	
	
	
		
	//변수에 접근하기 위한 접근자 메소드
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
 	
}

