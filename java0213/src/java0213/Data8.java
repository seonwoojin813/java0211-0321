package java0213;

public class Data8 {

	public static void main(String[] args) {
	  int a = 5;
	  //a�� 3���� ũ�� ũ�ٶ�� ���
	  //3���� ���� ���� �ƹ��ϵ� ���� ����
	  //if ������ �����ĸ� ~�ϸ� ~�ض� �Ҷ�
	  /*
	  if(a > 3) {
		  System.out.printf("ũ��\n");
	  }
      */
	  
	
	  //a�� 3���� ũ�ٸ� ũ�ٶ�� ����ϰ� �׷��� ������ �۴ٶ�� ���
	  /*
	  if(a > 3) {
		  System.out.printf("ũ��\n");
	        }
		  else {
				  System.out.printf("�۴�\n");
				  }
				  */
	
	  
	  //0-3�����̸� ���� ��, 4-6�����̸� �����, �� �ܴ̿� ū ����� ���
         if(a>= 0 && a <=3) {
        	  System.out.printf("���� ��\n");
         }
        	  else if(a >= 4 &&a <= 6) {
         			  System.out.printf("���� ��\n");
        	  }
        	  else {
        		   System.out.printf("ū ��\n");
        	  }
        	  
	
	
	
	}
	
	

}
