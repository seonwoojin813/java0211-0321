package java0305;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class MyFirstWindow extends Frame {
	String [ ] title = {"윈도우", "도우윈", "우윈도"};
	Color [] colors = {Color.BLACK, Color.BLUE, Color.ORANGE};
	int i = 0;
	int j = 0; //Colors 위에 만들고 j 만듬
	public MyFirstWindow() {
		//타이틀과 크기 및 좌표 설정
		this.setTitle("나의 첫번째 윈도우");
		this.setSize(300,  200);
		this.setLocation(100,100);
		//보기모드 설정
         
	    final Panel p = new Panel();
		//p.setBackground(Color.DARK_GRAY);
		p.setBackground(new Color(255,255,0)); //직접 도큐먼트보고 만들어본거
		//Anonymous Class에서는 포함하고 있는 메소드의 지역변수를 사용할 수 없음
		new Thread() {
			public void run() {
				try {
					while(true) {
						Thread.sleep(1000);
						j = j + 1;
						p.setBackground(colors[j%3]);
					}
				}catch(Exception e) {}
					}
				}.start();
			//배경색 바꾸기
		
		add(p);
		
		this.setVisible(true);
		//실행시키면 창이 나오는데 x(닫기하면 안닫혀) 콘솔에 빨간 네모버튼 눌러야해
		//스레드를 생성하고 바로 시작
		new Thread() {
			public void run() {
				try {
					//무한 반복해서 프레임의 타이틀을 title 배열의 값으로 설정
					while(true){
						i = i + 1;
						Thread.sleep(500);
						setTitle(title[i%3]);
				}
			}catch(Exception e) {}
		}
	}.start();
}
}