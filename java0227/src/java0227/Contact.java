package java0227;

public class Contact {
	private int num;
	private String name;
	private String phone;
	//만역 Phone를 Moblie로 바꾸고 싶으면 일일히 다바꿔야해,,
	
	//매개변수가 없는 생성자 - default constructor
	public Contact() {
		super();
	}

	//매개변수가 있는 생성자
	public Contact(int num, String name, String phone) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
	}
	
	
	//접근메소드 getters and setters
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
    //디버깅을 위한 메소드 : 멤버의 모든 값을 확인하기 위한 메소드
	@Override
	public String toString() {
		return "MapContact [num=" + num + ", name=" + name + ", phone=" + phone + "]";
	}
		
	
		
	

}
