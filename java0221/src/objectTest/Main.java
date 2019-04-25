package objectTest;

public class Main {

	public static void main(String[] args) {
		// ��ȣ�� 1�̰� �̸��� ���̸��� Data �ν��Ͻ��� ����
		Data data1 = new Data();
		data1.setNum(1);
		data1.setName("���̸�");
		
		//��ȣ�� 2�̰� �̸��� ������ Data  �ν��Ͻ��� ����
		Data data2 = new Data(2, "����");
		
		//data3�� 1�� ���̸��� ����
		Data data3 = new Data(1, "���̸�");
		
		//����ϸ� false����
		//data1, data2, data3 �� ���� new�� �����߱� ������
		//���ο� �޸� ������ �Ҵ�޾ұ� ������ ����Ű�� �ִ� ������ ��� �ٸ��ϴ�.
		//==�� �����ϰ� �ִ� �����͸� ��
		System.out.printf("data1 == data2 : %b\n", data1 == data2);
		System.out.printf("data1 == data3 : %b\n", data1 == data3);
		
        
		Data data4 = data1;   //--->�̰� ���ٰ� ����   
		System.out.printf("data1 == data4 : %b\n", data1 == data4);
		//1���� 4���� ���� ������ 1���� �ٲ�� 4���� �ٲ�� 4���� �ٲ�� 1���� �ٲ�---����
		
		System.out.printf("data1 equals data2 : %b\n", data1.equals (data2));
		//data1�� data3�� ������ ����������� num�� ���� ���Ƽ� true
		System.out.printf("data1 equals data3 : %b\n", data1.equals (data3));
		
		//������ ����
		Data data5 = data1.clone();
		
		
		//������ ������ ���� ��� ������ ���� �����͸� �����ϸ�
		//�ٸ��ʿ� ������ �ݴϴ�.
		data4.setName("����");
		System.out.printf("%s\n", data1.getName());
		//������ �ؼ� �� ���� ���� �����ʹ� ���������� ���� �ٸ� ��ҿ�
		//�����͸� ������ �ִ� ���̿��� ��� ������ ������ �ٸ� �����Ϳ�
		//������ ���� �ʽ��ϴ�.
		data5.setNum(12);
		System.out.printf("%d\n", data1.getNum());
		
		
		//���ڿ��� ���ϼ��� Ȯ���� �� ==�� ����ϸ� �ȵǰ� eqauls�� �̿��ؾ� �մϴ�.
		String id = "swj123";
		String copy = new String("swj123");
		//System.out.println(id == copy); // ---> �̷��� �ϸ� false�� ���� �ֳ��ϸ� new String�̶�
		System.out.println(id.equals(copy)); // --->�̷��� true�� ���� ������ .equals �پ 
		System.out.println(id == "swj123");
	}

}
