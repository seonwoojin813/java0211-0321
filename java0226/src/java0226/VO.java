package java0226;

//��ȣ, ���̵�, ��й�ȣ, �̸�, ���̸� ���� �����ϴ� Ŭ����
public class VO implements Comparable{
	//public class VO ���� implements Comparable ���� ����
	//VO�� ���콺 ������ ��� addŬ�� 
	private int num;   
	 private String id;
	 private String pw;
	 private String name;
	 private int age;
	  
	 //������ �޼ҵ�
	 public VO() {
	        super();
      	}
  
	public VO(int num, String id, String pw, String name, int age) {
		super();
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	     }
	
    //������ �޼ҵ�
	public int getNum() {
	return num;
	}

	public void setNum(int num) {
	this.num = num;
	}

	public String getId() {
	return id;
	}

	public void setId(String id) {
	this.id = id;
	}

	public String getPw() {
	return pw;
	}

	public void setPw(String pw) {
	this.pw = pw;
	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public int getAge() {
	 return age;
	}

	public void setAge(int age) {
	this.age = age;
	}

	//������� ���� �޼ҵ�: ����� ���� Ȯ���ϱ� ���� �޼ҵ�
	//����ϴ� �żҵ忡 �ν��Ͻ� �̸��� �����ϸ� ȣ��Ǵ� �޼ҵ�
	@Override
	public String toString() {
		return "VO [num=" + num + ", id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}

	  //ũ�� �񱳸� ���� �޼ҵ�
	  //������ �����Ͱ� �� ũ�� ����� ����
	  //2���� �����Ͱ� �����ϸ� 0
	  //������ �����Ͱ� ������ ������ ����
	  //�����ļ� ���� - ���������� �ϰ��� �ϸ� ��ȣ�� �ݴ�� ����
	  //**���� �����ʹ� �E���� �̿��ϸ� �˴ϴ�
	  //**java������ compareTo
	
	  @Override
	  public int compareTo(Object o) {
	  //Object Ÿ���� �����͸� �����  ���� ������ �ڷ������� ����ȯ�ؼ� ���
	  //����� Ŭ������ VO�̹Ƿ� VOŸ������ �� ��ȯ 
		VO other = (VO)o;
		return this.name.compareTo(other.name); //�̸����� ��������
		//return other.name.compareTo(this.name);  // �̸����� ��������
		//�Ǳ�� ������ �� ������� �ϱ�� �����ʴ�
		//�ҽ��� ��ĥ �� ���� 
		
		//return this.age - other.age;   //���̷� ��������
		//return other.age - this.age;   //���̷� ��������
		
		//return this.age - other.age; �̰Ŷ� if(this.age > other.age){ ~ return  -1; }����� ����
		/*
		if(this.age > other.age) {
		return 1;
		}else if(this.age == other.age) {
		return  0;
	}else {
		return  -1;
	  }	*/				 
   }
}