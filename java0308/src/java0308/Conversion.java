package java0308;

public class Conversion {

	public static void main(String[] args) {
		//������ �Է� �޾Ƽ� ������ ������ ���ڿ��� �����ϰ� ���ڿ��� ������ �����ϵ��� �ۼ�
		//������ ���ڿ��� �����ϴ� �޼ҵ峪 ���ڿ��� ������ �����ϴ� �޼ҵ� ����� �ȵ�
		
		//1234->"1234" charAt(), length(), ���ڿ� ���ϱ�� + �� �̿�
		//"1234"->1234
		//����� ���� ���� ������
		
		int su = 987625;
		String str =  " ";
		while(su != 0) {
		int nmg = su % 10;
		str = nmg + str;
		su = su / 10;
		}
      System.out.println(str);
      
      for(int i=0; i<str.length(); i=i+1) {
    	  //������ ���� ���ڶ� 48�� ������ �ڵ尡 �ɴϴ�.
    	  //���ڷ� ������ ���� 48�� ���־���մϴ�.
    	  char ch = str.charAt(i);
    	  su = su * 10 + (ch-48);
      }
      
      System.out.println(su);
	}
    
}
