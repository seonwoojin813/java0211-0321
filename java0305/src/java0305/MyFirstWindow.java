package java0305;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class MyFirstWindow extends Frame {
	String [ ] title = {"������", "������", "������"};
	Color [] colors = {Color.BLACK, Color.BLUE, Color.ORANGE};
	int i = 0;
	int j = 0; //Colors ���� ����� j ����
	public MyFirstWindow() {
		//Ÿ��Ʋ�� ũ�� �� ��ǥ ����
		this.setTitle("���� ù��° ������");
		this.setSize(300,  200);
		this.setLocation(100,100);
		//������ ����
         
	    final Panel p = new Panel();
		//p.setBackground(Color.DARK_GRAY);
		p.setBackground(new Color(255,255,0)); //���� ��ť��Ʈ���� ������
		//Anonymous Class������ �����ϰ� �ִ� �޼ҵ��� ���������� ����� �� ����
		new Thread() {
			public void run() {
				try {
					while(true) {
						Thread.sleep(1000);
						j = j + 1;
						p.setBackground(colors[j%3]);
					}
				}catch(Exception e) {}
					}
				}.start();
			//���� �ٲٱ�
		
		add(p);
		
		this.setVisible(true);
		//�����Ű�� â�� �����µ� x(�ݱ��ϸ� �ȴ���) �ֿܼ� ���� �׸��ư ��������
		//�����带 �����ϰ� �ٷ� ����
		new Thread() {
			public void run() {
				try {
					//���� �ݺ��ؼ� �������� Ÿ��Ʋ�� title �迭�� ������ ����
					while(true){
						i = i + 1;
						Thread.sleep(500);
						setTitle(title[i%3]);
				}
			}catch(Exception e) {}
		}
	}.start();
}
}