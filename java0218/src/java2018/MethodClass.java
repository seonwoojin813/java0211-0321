package java2018;

public class MethodClass {
              //Hello World��  3�� ����ϴ� �޼ҵ�
	    public  void disp() {
		for (int i=0;  i<3;  i=i+1) {
			System.out.printf("Hello World\n");		
		           }

	        }
	    
	    //���� �Ű������� 1�� ���� �޼ҵ�
	    public void argDisp(int cnt) {
	    	for (int i=0;  i<cnt;  i=i+1) {
				System.out.printf("Hello Argument Method\n");		
			           }
	    }

	    
	    
	    //���� 1���� ���ڿ��� 1���� ������ ���ڿ��� ������ŭ ����ϴ� �޼ҵ�
	    //���� �޼ҵ�� �̸��� ������ �Ű������� ������ �ٸ��ϴ�
	    //�̷���츦 Method Overloading �̶�� �մϴ�.
	    // public void twoDisp(String msg, int cnt) { -----> twoDisp�� argDisp�� ���ļ� ����
	    public void  argDisp(String msg, int cnt) {
	    	for (int i=0;  i<cnt;  i=i+1) {
				System.out.printf("%s\n", msg);		
			           }
	    }
	    
	    //�Ű����� ������ ������� ������ ���Թ޾Ƽ� �հ踦 ����ϴ� �޼ҵ�
	    public void varagsSum(int...ar) {
	    int sum = 0;
	    //... �� ���� �Ű������� �迭�� ���
	    //�迭�� �����͸� ��ȸ�ϸ鼭 sum�� �߰� : �հ豸�ϱ�
	                         for(int data : ar) {
	    	                     sum = sum + data; 
	                         }
	                                     System.out.printf("�հ� : %d\n" , sum);
	                                 }
	    //�Ű������� �ڷ����� value ���� ���
	    public void inc(int n) {
	    	n  = n + 1 ;
	    	
	    }
	    	//�Ű������� �ڷ����� reference ���� ���
	    	public void inc(int [] ar) {
		    	ar [0] = ar[0] + 1;
		    	   }

	    	public void selectionSort(int []ar) {
	              //���� ����
	    		 // ù��° ���� n-1��° �����ͱ���
	    		// �ڽ��� �ڿ� �ִ� ��� �����Ϳ� ���ؼ� ����
	    		 int size = ar.length;
	    		 for(int i=0; i<size-1; i=i+1) {
	    			 for(int j=i+1; j<size; j=j+1) {
	    				 if (ar[i] > ar[j]) {
	    				 //���� �����Ͱ� Ŭ �� ���� �����Ϳ� ��ü 
	    			       int temp =ar[i];
	    			       ar [i] = ar[j];
	    			       ar[j] = temp;
	    			 }
	    		 }
	    	}

	    	}

         }

