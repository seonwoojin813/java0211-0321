package anoymous;

public class Main {

	public static void main(String[] args) {
		// Asia Ŭ������ �ν��Ͻ��� ����
		       Asia asia = new Asia();
		       //�޼ҵ� ȣ��
		       asia.food();
		       asia.method();
		       // Chiness �������̵��ϰ� Main���� �ͼ� asia.method(); ���ֱ� 
		       
		       
		       
		       //�Ϲ������� ����� �޾Ƽ� �޼ҵ带 �������ؼ� ����ؾ� �ϴ� ���
		       //1.Ŭ������ ��ӹ޾Ƽ� �޼ҵ带 ������
		       //2.�ν��Ͻ��� �����ؼ� �޼ҵ带 ȣ��
		       //anonymous ��Ű���� ����� �״�����  KoreaŬ���� ����� Asia Ŭ������ ���� Korea��� �ް� Main ���� �޼ҵ�ȣ��
                   
		       
		       
		       // new Korea(); --->�̷��� ���� ����  (�ڸ��ư� �߻�Ŭ������ �ν��Ͻ� �Ҽ�����)
		      // new Korea() {
		       
	          //}; ----->�̷��� �ᵵ ���� �̷��� �ڸ��ƿ� ���콺 ��� ��ٸ��� add~ �װ� ����
		       new Korea() {
               @Override
				public void food() {
				System.out.printf("Anonymous class�� �̿��� Ŭ���� ���\n");
						}
		       }.food();;
               //�̷��� �� ���� �־�
		       //�� ó�� ������ �������� �ʰ� �ٷ� �޼ҵ带 ȣ���ϸ�
		       //�޼ҵ带 1�� �ۿ� ȣ������ ���մϴ�.
		       
		       Korea korea =new Korea() {
	               @Override
					public void food() {
					System.out.printf("Anonymous class�� �̿��� Ŭ���� ���\n");
							}
			       };
			       korea.food();
		       //������ ������ �����ϰ� ������ �̿��ؼ� �޼ҵ带 ȣ��
		       // ; �� ���� ����
		       
		       
		    //�������̽��� ������ anonymous class�� ���� �ذ�
			      /*
			         new Ŭ�����̸��̳� �������̽��̸�() {
			       
			    	   �޼ҵ� ������
			       }.�޼ҵ��̸�();
			   */
	
			    new Chiness() {

					@Override
					public void method() {
						System.out.printf("Anonymous class�� �̿��� �������̽� ����\n");
						
					}			       
	                }.method();
		      	 
    }
}
