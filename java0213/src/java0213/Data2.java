package java0213;

public class Data2 {

	public static void main(String[] args) {
		//shift�� int �� ������Ʋ ��Ʈ ������ �̴� ������
		//ù��° ��Ʈ�� �����ϰ� �о���ϴ�.
		//32�� �̻��� ���� �ʰ� 32�̻��� ���� % 32�� ��ŭ�� �о���ϴ�.
		System.out.printf("8<<2: %d\n", 8<<2);
		System.out.printf("8<<34: %d\n", 8<<34);
		System.out.printf("8>>2: %d\n", 8>>2);
		
		//��Ʈ �� ���� : &(and), |(or), ^(xor - Exclusive OR)
		//int�� �����͸� ������ bit ������ �����ؼ� ����� ������ �����ִ� ������
		//and: �� �� 1�� ���� 1 �� �̿��� ���� 0 -0�� and �ϸ� 0, ������ �̿�
		//or: �� �� 0�� ���� 0 �� �ܴ̿� ���� 1 - 0�� or �ϸ� ����, ���翡 �̿�, ���� ���ϱ�
		//xor: ������ 0 �ٸ��� 1 - �񱳿� �̿�
		System.out.printf("20&19: %d\n", 20 & 19);
		System.out.printf("20|19: %d\n", 20 | 19);
		System.out.printf("20^19: %d\n", 20 ^ 19);
		
	}

}
