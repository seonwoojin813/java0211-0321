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
        	super("스윙의 윈도우"); //new JFrame("스윙의 윈도우") - 상위클래스
        	
        	setSize(300,300);
        	setLocation(100,100);
        	//종료 버튼을 눌렀을 때 프로그램이 종료되도록 해주는 설정
        	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        	
        	//패널을 생성
        	JPanel p = new JPanel();
        	p.setLayout(null);
        	
        	//이미지를 만들어서 레이블에 출력
        	ImageIcon image = new ImageIcon("C:\\Users\\503_08\\Pictures\\Saved Pictures\\11.jpg");
        	lbl = new JLabel(image);
        	//lbl = new JLabel("레이블");
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
        					//위치 조정
        					lbl.setLocation(x-5, y+3);
        				}
        			}catch(Exception e) {}
        		}
        	}.start();
        	
        	
        	p.add(lbl);
        	add(p);
        
        	//인스턴스 자신을 가리키는 포인터
        	this.setVisible(true);
        
        }
}

