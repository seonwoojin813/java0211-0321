package interfacetest;

//koreaFood �������̽��� ������ Ŭ����
//�������̽��� 2�� �̻� ������ �����մϴ�.
//public class Menu implements KoreaFood��  , ChinessFood�� ��
public class Menu implements KoreaFood, ChinessFood {

	@Override
	 public void bulgoki() {
	      System.out.printf("�Ұ��⿡ ������ �ִ� ����\n");

	}

	@Override
	public void jjajangmyeon() {
		System.out.printf("��� ������ ���� ���� ����\n");
		//public class Menu implements KoreaFood, ChinessFood �̷��� ġ�� �޴��� ����
		//�޴��� ���콺 ��� add~���� �׷� ����ó�� ����
	}

}