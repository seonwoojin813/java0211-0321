package java0306;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventFrame extends Frame {
        //프레임 위에 배치될 컴포넌트
	    private Button btn1,  btn2;
        private Panel panel;
        
	    public ActionEventFrame() {
		setTitle("액션 이벤트 처리");
		setSize(300,  300);
		setLocation(20,20);
		
		panel = new Panel();
		
		btn1 = new Button("버튼1");
		panel.add(btn1);
		
		//버튼의 클릭 이벤트나 텍스트 필드에서 Enter 눌렀을 때를 처리할 수 있는
		//이벤트 리스너 객체 생성
		
		ActionListener action1 = new ActionListener() {
        //마우스 가져다대서 import누르고          뒤에는 add눌러
 		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.printf("버튼 1을 클릭했습니다.\n");
		//System.out.printf("조합키:%d\n", e.getModifiers());
		//CTRL키와 같이 눌렀을 때 만 메시지를 출력
		//CTRL 키와 다른 키를 같이 눌렀을 때도 메시지를 출력하도록 변경
		
		int r = e.getModifiers() &  128;
		System.out.printf("조합키:%d\n", r);
		if(r != 0) {
			System.out.printf("CTRL 키와 같이 눌렀습니다.\n");
		}
 		}
		};
		/*
		if(e.getModifiers() == 128) {
		System.out.printf("CTRL 키와 같이 눌렀습니다.\n");
		}
		
	    }
	    */
		
		//버튼과 이벤트 리스너 연결
		btn1.addActionListener(action1);
		
		btn2 = new Button("종료");
		panel.add(btn2);
		//프로그램 종료 : Ststem.exit(정수)
		//이 때 정수는 에러코드입니다. 0을 주면 정상 종료
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

