package java0221;

public class Main1 {

	public static void main(String[] args) {
		
		//int []br = null;
		//System.out.printf("%d\n",br.length);
		//NullPointerException Ȯ���ϴ¹�
		//���콺 ������ toogle breakpoint��� ������ Ȯ�� 
		//NullPointerException - ������ ������ null�� ����Ǿ� �ִµ�
		//.�� �̿��ؼ� ����� ȣ���� �� �߻��ϴ� ����
        // ������ ����� �ν��Ͻ� ������ �ִ��� Ȯ��		
		
		int a = 10;
		System.out.printf("a:%d\n", a);
		//������ϱ����� ���� ������ ����
		//�극��ũ ����Ʈ ��� ���� â �������� ����� Ŭ��
		//id�� ������ ������ ������ �����
		//id�� Hashcode��� �� 
		
		int[] ar = {100,200,300};
		System.out.printf("ar[0]:%d\n", ar[0]);
		// ArrayIndexOutOfBoundsException Ȯ���ϴ¹�
		//System.out.printf("ar[3]:%d\n", ar[3]);
		//�Ǽ��� 3�� ����־��� �̷���
        // �����Ͱ� 3���� 0-2�������� �����ϴµ� ������ �Ѿ���ϴ�.
		//�̷���� ArrayIndexOutOfBoundsException�Դϴ�.
		//�ε����� �����ؼ� �ذ��ؾ� �մϴ�.
	
		/*	
		String num1 = "176";
		String num2 = "2 3";
		int n1 = Integer.parseInt(num1);
		int n2 =  Integer.parseInt(num2);
		//NumberFormatException Ȯ��
	     */
		
		try {
		int r = 100/0;
		System.out.printf("r:%d\n", r);
          }catch(Exception e) {
        		System.out.printf("���ܰ� �߻��߽��ϴ�\n");
          }	    
        		System.out.printf("���������� ����\n");
       	//	System.out.printf("���������� ����\n");
		//�̹����� ���������� ��������ʾ�
		//try{
        // }
		//catch(Exception e){
		//System.out.printf("���ܰ��߻��մϴ�\n"); 
        //} ---->�̰� �־���� ���������� ����
        //���ܰ� �߻��� �޼ҵ� ������ ó���ϴ� ���(try, catch �� ���)
        //catch���� (Exception e) �� (����Ÿ��1 �Ű�����1) �κ��� �ٸ��� ���� ���������� ��� ����
      	
    }
 }