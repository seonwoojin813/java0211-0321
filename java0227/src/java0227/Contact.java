package java0227;

public class Contact {
	private int num;
	private String name;
	private String phone;
	//���� Phone�� Moblie�� �ٲٰ� ������ ������ �ٹٲ����,,
	
	//�Ű������� ���� ������ - default constructor
	public Contact() {
		super();
	}

	//�Ű������� �ִ� ������
	public Contact(int num, String name, String phone) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
	}
	
	
	//���ٸ޼ҵ� getters and setters
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
	
    //������� ���� �޼ҵ� : ����� ��� ���� Ȯ���ϱ� ���� �޼ҵ�
	@Override
	public String toString() {
		return "MapContact [num=" + num + ", name=" + name + ", phone=" + phone + "]";
	}
		
	
		
	

}
