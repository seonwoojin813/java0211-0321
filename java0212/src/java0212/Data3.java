package java0212;

public class Data3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		//a �� b �� ����ϰ� �ִ� �������� ��ġ Ȯ�� -2���� ���� �ٸ��Ƿ� �ٸ��ڵ�
         System.out.println("a:" + System.identityHashCode(a)); 
         System.out.println("b:" + System.identityHashCode(b));
         int c = 10;
         //a �� ������ ���� ����Ű�Ƿ� a �� ���� ���� ���ɴϴ�.
         System.out.println("c:" + System.identityHashCode(c)); 
         long d = 10;
         //���� ������ �ڷ����� �޶� �ٸ� ���� ���ɴϴ�.
         System.out.println("d:" + System.identityHashCode(d)); 
	}
}
