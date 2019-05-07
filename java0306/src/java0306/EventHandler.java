package java0306;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {
    // Ŭ���� ���� �� add������ ActionListener Ŭ���ؼ� �����
	//������ Ŭ�������� �޾ƿ� �����͸� ������ ����
	private Button btn1, btn2;
	
	//�� 2���� �����͸� �Ѱܹ��� ������
	//Source ->���׷����� ����Ʈ���� ��¡�ʵ彺 ������ �ؿ� ����
	public EventHandler(Button btn1, Button btn2) {
		super();
		this.btn1 = btn1;
		this.btn2 = btn2;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	    //�̺�Ʈ�� �߻��� ��ü�� Button Ÿ������ �� ��ȯ
		Button btn = (Button)e.getSource();
		if(btn == btn1) {
			System.out.printf("��ư1�� Ŭ���߽��ϴ�.\n");
		}else if(btn == btn2) {
			System.exit(0);
	}
	}
}
