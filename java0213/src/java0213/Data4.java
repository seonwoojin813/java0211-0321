package java0213;

public class Data4 {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 5;
		//n1 �� n2 �� ū �� ã��
		int result = n1 >n2 ? n1 :n2;
		System.out.printf("result:%d\n", result);
		
		//������ F �Ǵ� M���� ����
		char gender = 'M';
		//gender�� M �̸� ���ڶ�� ����ϰ� F�̸� ���ڶ�� ���
		//���� ������ �̿��ؼ� �ذ�
		//String x = gender == 'M'? "����" : "����";
		
		//�ҹ��� m�� ���ڶ�� �������� ����
		String x = gender == 'M' || gender == 'm'? "����" : "����";
		// || (�Ǵ�)�̶� ���� �־ 
	    
		System.out.printf("����:%s\n", x);
		
		//���� ������ 0-100������ ���ڸ� �����ϰ�
		//60�̻��̸� �հ� �׷��� ������ ���հ��̶�� ���
		int score = 80;
				x = score >= 60?"�հ�" : "���հ�";
				System.out.printf("�հݿ���:%s\n", x);
		       
				//score�� 80�̻��̸� ��� 60�̻��̸� ���� �� ���ϴ� ������� ���
	           x = score >= 80?"���" :  (score >= 60?"����" : "����");
	        	   System.out.printf("���:%s\n", x);
	        	   //	x = score >= 60?"�հ�" : "���հ�"; - > 60�� 80���� �ٲٰ� �հ��� ����� �ٲ۵ڿ� ���հ� �κ��� �ٽ� �Ἥ �Է�
                 
	}

}
