package java0212;

public class Data1 {

	public static void main(String[] args) {
		//0.1�� 1000�� ���ϸ� 100.0�� ���;� �ϴµ� �̻��� ����� ���
		//�Ҽ��� ��Ȯ�ϰ� ǥ���� �� ���� ��찡 ����� �����Դϴ�.
		//�Ǽ� ������ ���� �� �ؾ� �� ���� ������ ������ �� ������ �ϰ� �Ǽ��� ����
		double d = 0.1;
		  double sum = 0.0;
		  for(int i=0;  i<1000; i=i+1)   {
			  sum = sum + d;
		  }
		  System.out.println("�հ�:"   +  sum);
 
		  boolean pan = ( 20 - 18) == 2;
		  System.out.println(pan);
		  
		  int n = 2147483647;
		  //int �� ������ �� �ִ� ���ں��� �� ū ���ڸ� �����ҷ��� �ؼ�
		  //Overflow�� �߻��ؼ� ������ ����
		  int result = n + 1;
		  System.out.println("���: "   +  result);
		   n = -2147483648;
		  //���� ���� ���ں��� �� ���� ���ڸ� ���� : underflow
		    result = n - 1;
		   System.out.println("���: "   +  result);
	}

}
