package java0306;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingWindow extends JFrame {
   
	JLabel lbl;
    int idx;
    String [] image = {"C:\\Users\\503_08\\Pictures\\Saved Pictures\\11.jpg"};
	public SwingWindow() {
        	super("������ ������"); //new JFrame("������ ������") - ����Ŭ����
        	
        	setSize(300,300);
        	setLocation(100,100);
        	//���� ��ư�� ������ �� ���α׷��� ����ǵ��� ���ִ� ����
        	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        	
        	//�г��� ����
        	JPanel p = new JPanel();
        	p.setLayout(null);
        	
        	//�̹����� ���� ���̺� ���
        	ImageIcon image = new ImageIcon("C:\\Users\\503_08\\Pictures\\Saved Pictures\\11.jpg");
        	lbl = new JLabel(image);
        	//lbl = new JLabel("���̺�");
        	lbl.setSize(100, 30);
        	lbl.setLocation(260,  30);
        	
        	new Thread() {
        		public void run() {
        			try {
        				while(true) {
        					Thread.sleep(100);
        					idx = idx + 1;
        					//ImageIcon image = new ImageIcon(images[idx%images.length]);
        					//lbl.setIcon(image);
        					int x = lbl.getLocation().x;
        					int y = lbl.getLocation().y;
        					//��ġ ����
        					lbl.setLocation(x-5, y+3);
        				}
        			}catch(Exception e) {}
        		}
        	}.start();
        	
        	
        	p.add(lbl);
        	add(p);
        
        	//�ν��Ͻ� �ڽ��� ����Ű�� ������
        	this.setVisible(true);
        
        }
}

