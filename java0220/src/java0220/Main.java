package java0220;

public class Main {

	public static void main(String[] args) {
		//���� based�� Ŭ���� �̸��̰�
		//�ڿ� new Based()�� �����ڸ� ȣ���ϴ� �����Դϴ�.
		//Based Ŭ������ �����ڰ� ���ų� �Ű������� ���� �����ڰ� ������
		//�� ������ ������ ���� �ʽ��ϴ�.
		//�����ڸ� ������µ� �Ű������� ���� �����ڸ� ������ ������ ����
		//Based b = new Based();

		Derived d = new Derived();
		
		//���� Ŭ���� Ÿ���� �ν��Ͻ� ������ ����ȯ���� �ٷ� ���� ����
		Based b = new Derived();
		
		//���� Ŭ���� Ÿ���� ������ ������ ���� ������ ��ȯ�� �����ؼ� �����ؾ� ��
		// d = new Based(); -----> �̷��Դ� ����
		//d = (Derived)new Based(); //���� �߻� ---->(Derived) �̷��� ������ ��ȯ ������ϴµ� �̷��� �ᵵ ���� 
		
		d = (Derived)b; // ���� �߻����� ���� : ���� �ڷ����� Derived
		
		b = new Based();
		b.overrideMethod(); // Based Ŭ������ overrideMethod�� ȣ��˴ϴ�.
		b = new Derived();
		b.overrideMethod(); // derived Ŭ������ overrideMethod�� ȣ��˴ϴ�.
		
		
		
		
		
			
		
	}

}
