package interfacetest;

public class Main {

	public static void main(String[] args) {
		// �������̽��� �߻�Ŭ���� ó�� �ν��Ͻ� ������ ���մϴ�.
        //  KoreaFood menu = new Koreafood(); �̰� ����
		
		//������ ������ ���� �������̽��� implements �� Ŭ������
		//�ν��Ͻ��� ������ ������ �� �ֽ��ϴ�.
		Menu menu = new Menu(); 
		//KoreaFood menu = new Menu(); 
		
		//�������̵� �� �޼ҵ�� ������ ������ ���� �ڷ����� �ƴϰ�
		//�ν��Ͻ��� ������ �� �ν��Ͻ��� �ڷ����� ������ ȣ���մϴ�.
		menu.bulgoki();
		//KoreaFood menu = new Menu(); ������ �̷��� �ϸ� �Ұ�⳪��
		menu.jjajangmyeon();
		//menu.�Է��ϸ� jjajangmyeon �ȳ��� ���� �̷� �� �ö󰡼�
		//KoreaFood menu = new Menu(); ----> korea ����� Menu �� �ٲ����
		//�ؿ� . �ڿ� jjajangmyeon �� ����
	}

}
