package java0212;

public class Data8 {

	public static void main(String[] args) {
  System.out.println("�ȳ��ϼ���. \n�������Դϴ�.");
  
  int age = 26;
  double height = 173.3;
  char gender = 'M';
  
  System.out.println("���̴�"+ age);
  System.out.println("Ű��"+ height);
  System.out.println("������"+ gender);
  System.out.println("������ "+  2+ " ����" +" �����̿����ϴ�.");
  
  byte b3= 30;
  byte b5= 50;
  int result = b3+b5; 
  System.out.println(result);

  int x = 40;
  byte a = (byte)x;
  System.out.println("a:"+a);

  int y =700;
  byte z =(byte) y;
  System.out.println("y:"+ y);
 //�Ǽ��� ������ ���� �� ��ȯ�ϸ� �Ҽ��� �������� �˴ϴ�.
  double d = -3.14;
  //�Ǽ��� ������ �����ҷ��� ������ ���� �����ͷ� �����ؾ��մϴ�.
  x =(int)d;
  System.out.println("x:" + x);
  
  
  
 	  
	}

}
