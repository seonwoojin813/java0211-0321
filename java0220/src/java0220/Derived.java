 package java0220;

public class Derived extends Based {

	//상속을 받는 클래스에 묵시적으로 존재하는 내용
	
	/*
	private Based super;
	
	public Derived() {
	 	super = new Based(); //이 구문은 super()로 표현합니다.
	
	}
	//이렇게 쓰면 에러 
	
	*/
	
	//생성자를 직접 만들면 첫번째 중에 super()가 묵시적으로 삽입합니다.
	//super()를 직접 호출하는 문장을 추가하면 없어집니다.
	//상위 클래스의 생성자 내용을 먼저 수행하고 하위 클래스의 생성자 내용을
	// 수행합니다.
    // 상위 클래스에 매개변수가 없는 생성자(Default constructor)가 없으면 
	//하위 클래스의 생성자를 직접 호출해야 합니다.
	public Derived() {
		super(10);//상위 클래스의 생성자를 직접 호출
		System.out.printf("하위 클래스의 생성자\n");
		//super(10); 이렇게 밑으로 가면 에러 *주의
	  
	}
	public void subMethod() {
		System.out.printf("하위 클래스에만 존재하는 매소드\n");
      	}
	//오버라이닝 된 메소드
	//오버라이닝 된 메소드의 상단에 오버라이딩 된 메소드라는 의미의
	//@Override라는 Annotation 을 추가 할 수 있습니다. 
	@Override
	//public을  private로 바꾸면 안됨
	public void overrideMethod() {
		// 상위 클래스의 메소드 호출
		super.overrideMethod(); //상위 클래스에 만들어져 있는 메소드를 호출
		//오버라이딩의 근본적인 목적이 기능확장이므로 상위클래스의 메소드를
		//오버라이닝 본연의 목적의 맞습니다.
		System.out.printf("하위 클래스에 있는 오버라이드 매소드\n");
	

	}
}
