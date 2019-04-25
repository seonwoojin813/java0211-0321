package java0305;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;



public class EtcWindow extends Frame {
    Panel panel;
    TextField tf;
    TextArea ta;
    Scrollbar sb;
    
	public EtcWindow() {
            	
            	setSize(500,500);
            	setLocation(10,10);
            	setTitle("��Ÿ ������Ʈ");
            	
            	panel = new Panel();
            	
            	//�� ������ ������ ����
            	tf = new TextField(20);
            	tf.setEchoChar('*');
            	panel.add(tf);
                 
            	//�� �� �� �� ���� ������ ����
            	ta = new TextArea(10, 30);
            	panel.add(ta);
            	
            	sb = new Scrollbar();
            	panel.add(sb);
            	
            	for(int i=0; i<20; i=i+1) {
            		Button btn = new Button("��ư" + i);
            		panel.add(btn);
            	}	
            	
            	//add(panel);
            	
            	//�г��� ScrollPane ���� �����ϰ� ScrollPane�� �������� ����
            	ScrollPane sp = new ScrollPane();
            	sp.add(panel);
            	add(sp);
            	
            	setVisible(true);
            }
}
