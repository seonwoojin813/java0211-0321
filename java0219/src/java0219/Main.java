package java0219;

public class Main {

	public static void main(String[] args) {
	     /*
		//MethodClass�� Instance ����
		MethodClass instance = new MethodClass();
		//return �� ���� �޼ҵ� ȣ�� - ���⼭ �帧 �ߴ�
		 instance.addNoReturn(100, 200);
		 //return�� �ִ� �޼ҵ� ȣ��
		 int r = instance.addReturn(100, 200);
		 r = instance.addReturn(r, 900);
		 System.out.printf("���� ���:%d\n", r);
		   System.out.println("=================");
		 
		 System.out.printf("���� ���:%d\n", 
				                              instance.addReturn(instance.addReturn(1000, 30000), 109890));
		 //�޼ҵ� �ȿ��� �޼ҵ带 ȣǮ�ϱ� - ���������� ���� �ʴ� ���� �����ϴ�.
	System.out.printf("1000������ �� :%d\n",  instance.sumNoRecursion(1000));
	System.out.printf("1000������ �� :%d\n",  instance.sumRecursion(1000));
	   System.out.println("=================");
	
	   System.out.printf("10��° �Ǻ���ġ ������ �� :%d\n", 
			instance.fibonacci( 10));
	System.out.printf("11��° �Ǻ���ġ ������ �� :%d\n",  
			instance.fibonacci(11));
	//���� ������ ������ ���� recursion�� �� ������ ������
	//���� ������ �����ϴ� ��� �޸𸮰� ���������ų� ����ӵ��� �������ϴ�.

	//static �޼ҵ� ȣ���� ���� Ŭ���� �̸����� ȣ��
	MethodClass.staticMethod();
	instance.thisTest();
	System.out.println("=================");
	
	double r1 = Math.random();
	System.out.printf("r1:%f\n", r1);
	
	java.util.Random random = new java.util.Random();
	int r2 = random.nextInt();
	System.out.printf("r2:%d\n", r2);
	
*/
	/*
	//�ν��Ͻ� ����
	//�տ� ����� �̸��� Ŭ���� �̸��̰� new�ڿ� ����� �̸��� �������̸�
	ConstructorClass obj1 = new ConstructorClass();
           	//obj1.setNum(1);
	         obj1.setName("���̸�");
	         System.out.printf("obj1�� num:%d\n", obj1.getNum());
	
	ConstructorClass obj2 = new ConstructorClass();
	       //obj2.setNum(1);
	         obj2.setName("����");
	         System.out.printf("obj2�� num:%d\n", obj2.getNum());
	
	         ConstructorClass obj3 = new ConstructorClass(3, "����");
	         System.out.printf("obj3�� num:%d\n", obj3.getNum());
	*/
		/*
		Based b = new Based();
		//���� Ŭ���������� ���� Ŭ������ ����� ���� �����޽��ϴ�. 
		
		Derived d = new Derived();
		d.commonMethod();
		d.superMethod();
		d.subMethod();
		
		*/
	          
		     Based b = new Based();
		     //���� Ŭ���� Ÿ������ ������� ������ ������
		     //���� Ŭ���� Ÿ���� �ν��Ͻ��� ������ �� �ֽ��ϴ�.
              Based x = new Derived();    
              //���� ���ʲ��� ������ �θ� (�θ� ���ִ°� ����)(�������̵��ȰŴ� ������)
              //�ִ� ���� �޼ҵ� �ȳ���
                  x.commonMethod();
              
              //���� Ŭ���� Ÿ������ ������� ������ ������ ���� Ŭ���� Ÿ����
              //�ν��Ͻ� ������ ������ ���� �����ϴ�.
              //�̶��� ���� �� ��ȯ�� �ؼ� �����ؾ� �մϴ�.

              //������ �ƴ����� �����ϸ� ���� �߻�
              //������ �ڷ����� Based �̱� ������
              // Derived d = (Derived)new Based(); ---->����ȵ�
              
              //�ν��Ͻ��� ������ �� ����Ŭ���� Ÿ������ ���� ����
              //������ �ڷ������� �� ��ȯ�ص� ���ܰ� �߻����� �ʽ��ϴ�.
              Derived d = (Derived)x;
              //���� ���� ���� ������ �θ�
              //��� �ٳ��� Ŀ�� ���� ���� �޼ҵ�
	
	
	
	}

}

