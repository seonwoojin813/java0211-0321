package java0306;

import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.util.HashSet;
import java.util.Set;

public class ItemEventFrame extends Frame {
           private TextField tf;
           private Choice ch;
           private Checkbox check1, check2, check3, checkAll;
	      
           //��й�ȣ��� �ؽ�Ʈ�� ��й�ȣ ��ȿ�� ����� ���� ���̺�
           private Label lblPassword, lblDisplay;
           //��й�ȣ�� �Է¹ޱ� ���� �ؽ�Ʈ �ʵ�
           private TextField password;
           
           //���ڿ��� �ߺ����� ������ �� �ִ� �ڷᱸ��
           Set<String> set = new HashSet<String>();
           
            public ItemEventFrame() {
        	setTitle("Item �̺�Ʈ ó��");
        	setSize(230,  300);
        	setLocation(20,20);
        	setResizable(true);
        	
        	Panel p = new Panel();
        	tf = new TextField(20);
        	p.add(tf);
        	//�ؽ�Ʈ �ʵ��� ActionListener ó��
        	ActionListener action = new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
			/*	
            //�ؽ�Ʈ �ʵ忡 �Է��� ������ ch�� �߰�
            ch.add(tf.getText());
            //��� �ְų� �ߺ��� �����ʹ� ���Ե��� �ʵ��� �����
			*/
            
            //���鸸���� ������� ���� �߰����� �ʰ� ���� ������	
            if(tf.getText().trim().length() < 1) { //trim�� ��������
            	return;
            }
            //�����͸� �ߺ����� ����
            //set.add(tf.getText()); -> ���⿡ trim�� �ְ� �Ǹ� ��������
            set.add(tf.getText().trim());
            //���� �����͸� ����
            ch.removeAll();
            //Set�� �����͸� ���
            for(String data : set) {
            ch.add(data);
            }
           	tf.setText("");
            		
		    }		
        	};
        	tf.addActionListener(action);
      
        	
        	ch = new Choice();
        	p.add(ch);
        	
        	check1 = new Checkbox("1"); 
        	check2 = new Checkbox("2"); 
        	check3 = new Checkbox("3"); 
        	checkAll = new Checkbox("��� ����"); 
        	
        	ItemListener itemListener = new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
				//System.out.printf("%d\n", e.getStateChange());	
				//üũ�� ��
					if(e.getStateChange() == 1) {
						check1.setState(true);
						check2.setState(true);
						check3.setState(true);
					}
					//üũ�� ������ ��
					else {
						check1.setState(false);
						check2.setState(false);
						check3.setState(false);
					 }
				}
        	};
        	//checkAll�� ���°� ����� �� itemListener�� �޼ҵ� ȣ��
            checkAll.addItemListener(itemListener);
        	
        	p.add(check1);
        	p.add(check2);
        	p.add(check3);
        	p.add(checkAll);
        	  	
   
        	lblPassword = new Label("��й�ȣ");
        	p.add(lblPassword);
        	
        	password = new TextField(20);
        	password.setEchoChar('��');
        	p.add(password);
        	
        	//�ؽ�Ʈ �ʵ峪 ���� ���ڸ� �Է��� �� �߻��ϴ� �̺�Ʈ�� ó��
        	TextListener textListener = new TextListener() {
				@Override
				public void textValueChanged(TextEvent e) {
					// �Է��� ���� ��������
					String p = password.getText();
					//p���� �빮��, �ҹ���, ����, Ư�������� ���� ����
					int dae = 0;
					int so = 0;
					int su = 0;
					int etc = 0;
					
					int size = p.length();
					for(int i=0; i<size; i=i+1) {
						char ch = p.charAt(i);
						if(ch >= 'A' && ch< 'Z') {
							dae = dae + 1;
						}else if(ch >= 'a' && ch <= 'z') {
							so =so + 1;
						}else if(ch >= '0' && ch <= '9') {
							su = su + 1;
						}else {
							etc = etc + 1;
						}
					}
					//4���� �׸��� ��� 1�̻����� Ȯ��
					if(dae>0 && so>0 && su>0 && etc>0) {
					  	lblDisplay.setText("����");
			        	lblDisplay.setBackground(Color.red);
					}else {
					  	lblDisplay.setText("����");
			        	lblDisplay.setBackground(Color.pink);
					}
				}
        		
        	};
        	password.addTextListener(textListener);
        	
        	lblDisplay = new Label("����");
        	lblDisplay.setBackground(Color.BLUE);
        	p.add(lblDisplay);
        	
        	add(p);
        	
        	setVisible(true);
           }	 
       }
