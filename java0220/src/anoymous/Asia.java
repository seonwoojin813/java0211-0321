package anoymous;

  //korea Ŭ������ ��ӹ��� Asia Ŭ����
public class Asia extends Korea implements Chiness {

	//Chiness interface�����
	//public class Asia extends Korea ���ٰ�
	//implements Chiness�� �� --->���� 
	//���콺�� �ƽþƿ� �����ٴ�� add~ ���� �װ� Ŭ��
	 
	//���� Ŭ������ �޼ҵ带 ������(Override) 
	@Override
	public void food() {
                   System.out.printf("���� Ŭ������ �޼ҵ� ������\n");		

	}

	@Override
	public void method() {
		System.out.printf("�������̽��� �޼ҵ� ����\n");	
		
	}

}
