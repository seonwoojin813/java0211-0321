package java0213;

public class Data5 {

	public static void main(String[] args) {
		int coke = 1000;
		int cider = 800;
		//�̺κп� �ڵ带 �ۼ��ؼ� �ݶ�� ���̴ٸ� �����Ͻÿ�
		//2���� ���� ������ ����� �����͸� ��ȯ�ϱ� ���ؼ��� �ϳ��� �ӽú����� �� �ʿ�
		int cup = coke;
		coke = cider;
	    cider =cup;
	    System.out.printf("�ݶ��"+ coke + "�� ���̴ٴ�"+ cider +"��");
	}

}
