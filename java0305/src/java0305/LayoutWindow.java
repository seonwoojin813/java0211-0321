package java0305;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.util.Random;

public class LayoutWindow extends Frame {
                public LayoutWindow() {
            	setTitle("레이아웃 연습");
            	setSize(200,200);
            	setLocation(10,10);
            	
            	Panel panel = new Panel();
            	/*
            	//5개의 영역으로 분할해서 배치
            	//각 영역에 컴포넌트를 배치하기 보다는 panel을 배치하는 경우가 많습니다.
            	panel.setLayout(new BorderLayout());
            	Button btn1 = new Button("버튼1");
            	//BorderLayout에서는 위치를 설정하지 않으면 중앙에 위치
            	panel.add(btn1);
            	
            	Button btn2 = new Button("버튼2");
            	panel.add("West", btn2);
            	*/
            	
            	/*
            	panel.setLayout(new FlowLayout());
            	Button btn1 = new Button("버튼1");
            	panel.add(btn1);
            	Button btn2 = new Button("버튼2");
            	panel.add(btn2);
            	*/
            	
            	//행과 열을 이용해서 배치하는 레이아웃
            	//3행 2열
            	/*
            	panel.setLayout(new GridLayout(3,  2));
            	for(int i=0; i<6; i=i+1) {
            		Button btn1 = new Button("버튼1");
                	panel.add(btn1);
            	}
            	*/
            	
            	//레이아웃에 null을 설정한 경우는 위치를 직접 설정해 주어야 합니다.
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
