package java0221;

public class Main2 {

	public static void main(String[] args) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//Thread.sleep(3000); ---> try�ۿ� ������ ���� --> 2. �׷��� ���ٴ�� surround~���� �̷��� ���� ���� ����
		
		/*
		1. �� ����� ������
		try {
		Thread.sleep(3000);
		}
		catch(InterruptedException e) {}
		*/
           	
		
	try{	
		String str = "Hello World";
		//������  NumberFormatException�� �߻���Ŵ
		throw new  NumberFormatException();
		//String str = null;		
		//NullPointException �߻�
		//System.out.printf("%s\n", str.toUpperCase());
		//������ �����Ϸ��ٰ� ���ܹ߻� - NumberFormatException
		//int n1 = Integer.parseInt ("2_2");
       	}
	   //NullPointerExceptiondl �߻����� �� ȣ��Ǵ� ��
	/*
	catch(NullPointerException e | NumberFormatException e) {
		System.out.printf("�� ������ ���ܹ߻�\n");
	   }
	//NumberFormatException ó��
	  catch(NumberFormatException e) {
		System.out.printf("������ ��ȯ�� ���� ���ϴ� ���� �߻�\n");
	}*/
	/*
	//���� Ŭ������ ������ �������� ���� Ŭ���� Ÿ���� �ν��Ͻ� ������
	//������ �� �ֽ��ϴ�.
	//NumberFormatException Ŭ������ NullPointerException Ŭ������
	//���RuntimeException Ŭ������ ������ ������ ������ �����մϴ�.
	//Exception���� �����ص� ������ ����� ���ɴϴ�.
	catch(RuntimeException e ) {
		System.out.printf("%s\n", e.getMessage());
	}
	*/
	catch(Exception e ) {
	System.out.printf("%s\n", e.getMessage());
}

	
	//�ΰ��� ���ܸ� | �� ��� ó��
	/*catch(NullPointerException  | NumberFormatException e) {
		System.out.printf("%s\n", e.getMessage());
	}
	*/
	//finally�� ���� �߻� ���ο� ������� ����
	finally {
		System.out.printf("������ ����\n");
	}
	/*
	 while(true){
		}                          ---->����
	*/
	//return;                  ---->����
	
		System.out.printf("���α׷� ����\n");
	

}
}
