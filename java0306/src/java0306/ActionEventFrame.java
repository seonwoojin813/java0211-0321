package java0306;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventFrame extends Frame {
        //������ ���� ��ġ�� ������Ʈ
	    private Button btn1,  btn2;
        private Panel panel;
        
	    public ActionEventFrame() {
		setTitle("�׼� �̺�Ʈ ó��");
		setSize(300,  300);
		setLocation(20,20);
		
		panel = new Panel();
		
		btn1 = new Button("��ư1");
		panel.add(btn1);
		
		//��ư�� Ŭ�� �̺�Ʈ�� �ؽ�Ʈ �ʵ忡�� Enter ������ ���� ó���� �� �ִ�
		//�̺�Ʈ ������ ��ü ����
		
		ActionListener action1 = new ActionListener() {
        //���콺 �����ٴ뼭 import������          �ڿ��� add����
 		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.printf("��ư 1�� Ŭ���߽��ϴ�.\n");
		//System.out.printf("����Ű:%d\n", e.getModifiers());
		//CTRLŰ�� ���� ������ �� �� �޽����� ���
		//CTRL Ű�� �ٸ� Ű�� ���� ������ ���� �޽����� ����ϵ��� ����
		
		int r = e.getModifiers() &  128;
		System.out.printf("����Ű:%d\n", r);
		if(r != 0) {
			System.out.printf("CTRL Ű�� ���� �������ϴ�.\n");
		}
 		}
		};
		/*
		if(e.getModifiers() == 128) {
		System.out.printf("CTRL Ű�� ���� �������ϴ�.\n");
		}
		
	    }
	    */
		
		//��ư�� �̺�Ʈ ������ ����
		btn1.addActionListener(action1);
		
		btn2 = new Button("����");
		panel.add(btn2);
		//���α׷� ���� : Ststem.exit(����)
		//�� �� ������ �����ڵ��Դϴ�. 0�� �ָ� ���� ����
		ActionListener action2 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
		System.exit(0);
		}
		};
		btn2.addActionListener(action2);
			
		add(panel);
		
		setVisible(true);
	    }	 
        }

