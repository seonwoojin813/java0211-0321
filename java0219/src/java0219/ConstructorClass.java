package java0219;

public class ConstructorClass {
                //�׻� Ŭ������ ����� �⺻������ �����Ǵ� �����ڰ� �ֽ��ϴ�.
	/*
	           // �� �����ڴ� �ٸ� �����ڸ� ����� �ڵ����� �Ҹ�˴ϴ�.
	             public ConstructorClass() {
 	              	super();
	}
*/
	//��ȣ�� �̸��� ���� : ��ü ���������
	//������ ���� �����ϴ� ���� �ݱ���ϰ� getter�� setter�� �̿��ؼ�
	//������ �����ϴ� ���� ���� 
	private int num;
	private String name;
	
	//�Ű������� ���� ������ -default constructor
	public ConstructorClass() {
		System.out.printf("�Ű������� ���� ������\n");
		num = 1;
	}
	
	//�����ڴ� �����ε�(Overloading) - 
	//�żҵ� �̸��� ���� �Ű������� ������ �ڷ����� �ٸ����
	
	public ConstructorClass(int num, String name) {
		//�Ű������� ���� �ڽ��� �����ڸ� ȣ���մϴ�.
		//�Ϲ� ó�� �������� �տ� �־�� �մϴ�.
		this ();
		System.out.printf("�Ű������� �ִ� ������\n");
		this.num = num;
		this.name = name;
	}
	
	
	
	
		
	//������ �����ϱ� ���� ������ �޼ҵ�
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

