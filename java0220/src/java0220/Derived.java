 package java0220;

public class Derived extends Based {

	//����� �޴� Ŭ������ ���������� �����ϴ� ����
	
	/*
	private Based super;
	
	public Derived() {
	 	super = new Based(); //�� ������ super()�� ǥ���մϴ�.
	
	}
	//�̷��� ���� ���� 
	
	*/
	
	//�����ڸ� ���� ����� ù��° �߿� super()�� ���������� �����մϴ�.
	//super()�� ���� ȣ���ϴ� ������ �߰��ϸ� �������ϴ�.
	//���� Ŭ������ ������ ������ ���� �����ϰ� ���� Ŭ������ ������ ������
	// �����մϴ�.
    // ���� Ŭ������ �Ű������� ���� ������(Default constructor)�� ������ 
	//���� Ŭ������ �����ڸ� ���� ȣ���ؾ� �մϴ�.
	public Derived() {
		super(10);//���� Ŭ������ �����ڸ� ���� ȣ��
		System.out.printf("���� Ŭ������ ������\n");
		//super(10); �̷��� ������ ���� ���� *����
	  
	}
	public void subMethod() {
		System.out.printf("���� Ŭ�������� �����ϴ� �żҵ�\n");
      	}
	//�������̴� �� �޼ҵ�
	//�������̴� �� �޼ҵ��� ��ܿ� �������̵� �� �޼ҵ��� �ǹ���
	//@Override��� Annotation �� �߰� �� �� �ֽ��ϴ�. 
	@Override
	//public��  private�� �ٲٸ� �ȵ�
	public void overrideMethod() {
		// ���� Ŭ������ �޼ҵ� ȣ��
		super.overrideMethod(); //���� Ŭ������ ������� �ִ� �޼ҵ带 ȣ��
		//�������̵��� �ٺ����� ������ ���Ȯ���̹Ƿ� ����Ŭ������ �޼ҵ带
		//�������̴� ������ ������ �½��ϴ�.
		System.out.printf("���� Ŭ������ �ִ� �������̵� �żҵ�\n");
	

	}
}