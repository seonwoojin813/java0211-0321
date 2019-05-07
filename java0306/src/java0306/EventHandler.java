package java0306;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {
    // 클래스 만들 때 add눌러서 ActionListener 클릭해서 만들기
	//윈도우 클래스에서 받아올 데이터를 저장할 변수
	private Button btn1, btn2;
	
	//위 2개의 데이터를 넘겨받을 생성자
	//Source ->제네레이터 컨스트럭터 유징필드스 누르면 밑에 나와
	public EventHandler(Button btn1, Button btn2) {
		super();
		this.btn1 = btn1;
		this.btn2 = btn2;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	    //이벤트가 발생한 객체를 Button 타입으로 형 변환
		Button btn = (Button)e.getSource();
		if(btn == btn1) {
			System.out.printf("버튼1을 클릭했습니다.\n");
		}else if(btn == btn2) {
			System.exit(0);
	}
	}
}
