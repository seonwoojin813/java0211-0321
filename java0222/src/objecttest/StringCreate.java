package objecttest;

public class StringCreate {

	public static void main(String[] args) {
		// String Ŭ������ ������ �ʴ� ���ڿ��� �����ϴ� Ŭ����
		//�۾��� �� �� ������ �����ؼ� �۾��� �����ϰ� ����� �����մϴ�.
		//+�� �̿��ϸ� �ٸ� ���ڿ��̳� ���ڸ� �ٿ��� �����մϴ�.
		
		String str = "������";
		//�ؽ��ڵ� ���
		System.out.printf("�ؽ��ڵ�:%d\n", str.hashCode());
		str = str + "�̸�";
		//�����ؼ� �۾��� �� ������ ����̹Ƿ� ���� �ؽ��ڵ�� �ٸ��� ����
		System.out.printf("�ؽ��ڵ�:%d\n", str.hashCode());

		
		
		
		//StringBuilder Ŭ������ ���ϴ� ���ڿ� ���忡 ����ϴ� Ŭ����
		//������ ������ �̸� Ȯ���صξ��ٰ� �ڱ� �ڽ����� �۾�
		StringBuilder sb = new StringBuilder("������");
		System.out.printf("�ؽ��ڵ�:%d\n", str.hashCode());
		sb.append("�̸�");
		System.out.printf("�ؽ��ڵ�:%d\n", str.hashCode());
		
	}

}
