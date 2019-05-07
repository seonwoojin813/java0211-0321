package java0306;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRoutingFrame extends Frame {
	 //������ ���� ��ġ�� ������Ʈ
    private Button btn1,  btn2;
    private Panel panel;
    
    public EventRoutingFrame() {
	//Routing->� ��θ� �����ϴ°�
    setTitle("�׼� �̺�Ʈ �����");
	setSize(300,  300);
	setLocation(20,20);
	
	panel = new Panel();
	
	btn1 = new Button("��ư1");
	panel.add(btn1);
	
	btn2 = new Button("����");
	panel.add(btn2);
	/*	
	ActionListener action = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// �̺�Ʈ�� �߻��� ��ü�� Button Ÿ������ �� ��ȯ
			Button btn = (Button)e.getSource();
			if(btn == btn1) {
				System.out.printf("��ư1�� Ŭ���߽��ϴ�.\n");
			}else if(btn == btn2) {
				System.exit(0);
			}				
		}	
	};
	//�̺�Ʈ ����� - 2�� ��ü�� �̺�Ʈ�� action �ϳ��� ó��
	btn1.addActionListener(action);
	btn2.addActionListener(action);
	*/
	
	EventHandler eventHandler = new EventHandler(btn1, btn2);
	btn1.addActionListener(eventHandler);
	btn2.addActionListener(eventHandler);
	
	add(panel);
	
	setVisible(true);
    }	 
    }
	

