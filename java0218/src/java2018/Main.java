package java2018;

public class Main {

	public static void main(String[] args) {
		/*
		//Sample Ŭ������ �ν��Ͻ� �����
		Sample obj = new Sample();
		//obj�� ��� - Ŭ������ �̸��� �ؽ��ڵ尡 ��� �˴ϴ�.
		System.out.println(obj);
		
		/*
		int i;    //�̰��� ��������
		
		for( i = 0; i<10; i=i+1) {
			//for(int i = 0; i<10; i=i+1) ���⼭ int ���� �ȵ� ������
		
         		}
		          for(int j = 0; j<10; j=j+1) {

	               }
		                               int j = 1;
	//�ȿ��� j�� �� �������� �ۿ��� j�� ���� �� �־�
*/
		
	/*	
		obj.name = "���̸�";
		//static�� �������� ������ �ν��Ͻ� ���� ������ �����ϴ�
		obj.schooLName = "SM";
		//static ������ �ϳ��� ���� �����մϴ�.
		
		Sample ins = new  Sample();
		ins.name = "����";
		ins.schooLName = "JYP";
	       System.out.println(obj.name);
		   System.out.println(ins.name);
		   
		   System.out.println(obj.schooLName);
		   System.out.println(ins.schooLName);
		   System.out.println(Sample.schooLName);
	
	       //final�� ������ ������ �� �� ����.
		   //final�� ���� ������ �̸��� ���� �빮�ڷ� �ؼ� ����
		   final int TEN = 10;
	             //TEN= 20;
		   System.out.println(TEN);
            */	
	
	          // MethodClass �� Instance ����
	             MethodClass obj = new MethodClass();
	             //�޼ҵ� ȣ��
	             obj.disp();
	             System.out.println("=================");
	             obj.disp();
     //�Ű������� �ִ� �޼ҵ带 ȣ���� ���� �Ű������� �����ؼ� ȣ���ؾ� �մϴ�.
	             obj.argDisp(2);
	             obj.argDisp("Hello OOP", 4);
	             System.out.println("=================");
	      //�Ű������� ... ���� �Ǿ� ������ �Ű����� ������ ������� ���� ����       
	      // printf���� ��       
	      obj.varagsSum(10, 30);
	      obj.varagsSum(10, 30, 42);
	      obj.varagsSum(10, 30, 25, 89);
	      System.out.println("=================");
	   
	      
	      int a = 10;
	      int [] ar = {100,200,300};
	      //value Ÿ���� �����ϹǷ� a�� ���� ������� �ʽ��ϴ�
	      obj.inc(a); 
	      //reference Ÿ���� �����ϹǷ� ar�� �����Ͱ� ����Ǿ��� �� �ֽ��ϴ�.
	      obj.inc(ar);
	      System.out.printf("a:%d\n", a);
	      System.out.printf("ar[0]:%d\n", ar[0]);
	      System.out.println("=================");       
	      
	      int [] xr = {37, 87, 29, 65, 47};
	      for(int temp : xr) {
	    	  System.out.printf("%d\t",  temp);
	      }  
	    	  System.out.printf("\n");
	    	  //������ ����
                  obj.selectionSort(xr);
                  for(int temp : xr) {
                	  System.out.printf("%d\t", temp);
                  }
	    	  
	      
	            
	}
                     }