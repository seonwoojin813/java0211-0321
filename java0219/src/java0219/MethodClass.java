package java0219;

public class MethodClass {
	//static �޼ҵ� - Ŭ���� �̸����� ȣ���� �� �ִ� �޼ҵ�
	//�ν��Ͻ� ������ ����� �� �����ϴ�.
	//this�� ���� �����Դϴ�.
	//	private int age;
	private int age = 49;
	// ���� �ְ� this
	private boolean gender;
	
	
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public static void staticMethod() {
		//�ν��Ͻ� ������ ȣ���ϸ� ����
		//age = 10;
		System.out.printf("static method\n");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//���� �տ� this�� ������ �޼ҵ� �ܺο������� ã�� this�� ������
	//�޼ҵ� �ȿ������� ã���ϴ�.
	public void thisTest() {
		int age = 47;
		System.out.printf("age:%d\n", age);
		System.out.printf("this.age:%d\n", this.age);
	}
	
	
	
	
              //return�� ���� ���ϱ� �޼ҵ�
	public void addNoReturn(int a, int b) {
		int result = a + b;
		System.out.printf("���� ���:%d\n", result);
		//return : �޼ҵ��� ������ �����ϰ� ȣ���� ������ �̵��ϴ� ��ɾ�
		return;
		//System.out.printf("����ȵǴ� ����\n');

	}
	//return �� �ִ� �޼ҵ�
	public int addReturn(int a, int b) {
		return a + b;
	}
	
	//��͸� �̿����� �ʰ� 1����  n ������ �հ�
	public int sumRecursion(int n) {
	int sum =0;
	for(int i =0; i<=n; i=i+1) {
		sum = sum + 1;
	}
	              return sum;
	}
	//��͸� �̿��ؼ� 1���� n������ �հ踦 �����ִ� �޼ҵ�
	public int sumNoRecursion(int n) {
		           if (n == 1) {
		        	   return 1;
		           }else {
		        	   return n + sumRecursion(n-1);
		           }
	}
                   //�Ǻ���ġ ���� - 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
	              //ó�� 2���� ���� 1
	             //3��° �� ���ʹ� ���� 2�� ���� ��
	            //�˻��� ���� �̿�Ǵ� �����Դϴ�
      public int fibonacci(int n) {
    	  if(n == 1 ||n == 2) {
    		  //if ������ �������� return�� ���� else�� �ʿ����
    		  return 1;
    	  }
    	  return fibonacci(n - 1) + fibonacci(n - 2);
      }
	
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
	}

