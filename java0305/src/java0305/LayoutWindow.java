package java0305;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.util.Random;

public class LayoutWindow extends Frame {
                public LayoutWindow() {
            	setTitle("���̾ƿ� ����");
            	setSize(200,200);
            	setLocation(10,10);
            	
            	Panel panel = new Panel();
            	/*
            	//5���� �������� �����ؼ� ��ġ
            	//�� ������ ������Ʈ�� ��ġ�ϱ� ���ٴ� panel�� ��ġ�ϴ� ��찡 �����ϴ�.
            	panel.setLayout(new BorderLayout());
            	Button btn1 = new Button("��ư1");
            	//BorderLayout������ ��ġ�� �������� ������ �߾ӿ� ��ġ
            	panel.add(btn1);
            	
            	Button btn2 = new Button("��ư2");
            	panel.add("West", btn2);
            	*/
            	
            	/*
            	panel.setLayout(new FlowLayout());
            	Button btn1 = new Button("��ư1");
            	panel.add(btn1);
            	Button btn2 = new Button("��ư2");
            	panel.add(btn2);
            	*/
            	
            	//��� ���� �̿��ؼ� ��ġ�ϴ� ���̾ƿ�
            	//3�� 2��
            	/*
            	panel.setLayout(new GridLayout(3,  2));
            	for(int i=0; i<6; i=i+1) {
            		Button btn1 = new Button("��ư1");
                	panel.add(btn1);
            	}
            	*/
            	
            	//���̾ƿ��� null�� ������ ���� ��ġ�� ���� ������ �־�� �մϴ�.
            	panel.setLayout(null);
            	Label label = new Label("@");
            	label.setSize(20,  20);
            	label.setLocation(60,  60);
            	panel.add(label);
            	
            	new Thread() {
            		int n = 10;
            		Random r = new Random();
            		public void run() {
            			try {
            				while(true) {
            					Thread.sleep(300);
            					int x = label.getX();
            					if(x > 170) {
            						n = -10;
            					}else if(x < 30) {
            						n = + 10;
            					}
            							label.setLocation(r.nextInt(160)+10, r.nextInt(160)+10);
            				}
            			}catch(Exception e) {}
            		}
            	}.start();
      
            	add(panel);
            	setVisible(true);
            }
            
	
}
