package java0305;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.List;

public class ButtonWindow extends Frame {
    //ȭ�鿡 ��ġ�� ������Ʈ ���� - ������ �� ���ɼ��� ���� ������ ��� ������
	//�����ϴ� ���� �����ϴ�.
	private Button btn1, btn2, btn3; 
	private Panel panel;
	boolean flag = true; // ���⿡ ������� (�޼ҵ� �ۿ��ٰ�) 
	//üũ�ڽ� 3��
	Checkbox check1,  check2,   check3;
	//������ư 3��
	Checkbox radio1,  radio2,  radio3;
	//Choice 1��
	Choice choice;
	//List 2��
	List list1;
	List list2;
	
	public ButtonWindow() {
		setTitle("��ư ������");
		setSize(300,300);
		setLocation(200,200);
		
		//�гΰ� ��ư�� ����
		panel = new Panel();
		btn1 = new Button("ĸ��ȭ");
		btn2 = new Button("��Ӽ�");
		btn3 = new Button("������");
		
		btn1.setForeground(Color.MAGENTA);
		btn2.setForeground(Color.PINK);
		btn3.setForeground(Color.CYAN);
		//setVisible �Ӽ��� �̿��ؼ� btn3�� ���̰� �Ⱥ��̰� �ϴ� ������ �ݺ�
		
		//boolean flag = true; ���⿡ �̰� ������ 	flag = !flag; �̰� ������ �׷��� ���ΰ�
		new Thread() {
			public void run() {
				try {
					while(true) {
						Thread.sleep(1000);
						flag = !flag;
						btn3.setVisible(flag);
					}
				}catch(Exception e) {}
			}
		}.start();
		
		//��ư�� �гο� �߰�
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		check1 = new Checkbox("���̾��");
		check2 = new Checkbox("ĸƾ �Ƹ޸�ī");
		check3 = new Checkbox("�丣");
		
		panel.add(check1);
		panel.add(check2);
		panel.add(check3);
		
		//���� ��ư�� CheckboxGroup���� ��� ����
		CheckboxGroup job = new CheckboxGroup(); 
		radio1 = new Checkbox("Archer",  job,  false);
		radio2 = new Checkbox("Fighter",  job,  true);
		radio3 = new Checkbox("Kinght",  job,  false);
		//������ �ʼ� ������ �ϵ��� �ϴ� ������Ʈ�̹Ƿ� �⺻������ �ϳ��� üũ
 		panel.add(radio1);
 		panel.add(radio2);
 		panel.add(radio3);
		
 		
 		//Choice - ComboBox
 		choice = new Choice();
 		choice.add("������Ƽ��");
 		choice.add("��ī�ϼ�");
 		choice.add("����ũ��");
 		
 		panel.add(choice);
 		//���� ��ư�� ������ �뵵
 		list1 = new List(3);
 		list1.add("Oracle");
 		list1.add("MySQL");
 		list1.add("MongoDB");
 		list1.add("MS-SQL");
 		list1.add("Tibero");
 		//���� ���� ���� ���� - üũ�ڽ��� ������ �뵵
 		
 		list2 = new List(3,true);
 		list2.add("ios");
 		list2.add("Android");
 		list1.add("Tizen");
 		list1.add("WebOs");
 		list1.add("Blackberry");
 		
 		panel.add(list1);
 		panel.add(list2);
 		
 		//�г��� �������� �߰�
		add(panel);
		
		setVisible(true);			
	}	
}
