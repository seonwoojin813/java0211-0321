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
    //화면에 배치될 컴포넌트 변수 - 조작을 할 가능성이 높기 때문에 멤버 변수로
	//생성하는 것이 좋습니다.
	private Button btn1, btn2, btn3; 
	private Panel panel;
	boolean flag = true; // 여기에 놓으면되 (메소드 밖에다가) 
	//체크박스 3개
	Checkbox check1,  check2,   check3;
	//라디오버튼 3개
	Checkbox radio1,  radio2,  radio3;
	//Choice 1개
	Choice choice;
	//List 2개
	List list1;
	List list2;
	
	public ButtonWindow() {
		setTitle("버튼 윈도우");
		setSize(300,300);
		setLocation(200,200);
		
		//패널과 버튼을 생성
		panel = new Panel();
		btn1 = new Button("캡슐화");
		btn2 = new Button("상속성");
		btn3 = new Button("다형성");
		
		btn1.setForeground(Color.MAGENTA);
		btn2.setForeground(Color.PINK);
		btn3.setForeground(Color.CYAN);
		//setVisible 속성을 이용해서 btn3을 보이고 안보이게 하는 동작을 반복
		
		//boolean flag = true; 여기에 이게 있으면 	flag = !flag; 이게 에러떠 그래서 위로가
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
		
		//버튼을 패널에 추가
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		check1 = new Checkbox("아이언맨");
		check2 = new Checkbox("캡틴 아메리카");
		check3 = new Checkbox("토르");
		
		panel.add(check1);
		panel.add(check2);
		panel.add(check3);
		
		//라디오 버튼을 CheckboxGroup으로 묶어서 생성
		CheckboxGroup job = new CheckboxGroup(); 
		radio1 = new Checkbox("Archer",  job,  false);
		radio2 = new Checkbox("Fighter",  job,  true);
		radio3 = new Checkbox("Kinght",  job,  false);
		//라디오는 필수 선택을 하도록 하는 컴포넌트이므로 기본적으로 하나는 체크
 		panel.add(radio1);
 		panel.add(radio2);
 		panel.add(radio3);
		
 		
 		//Choice - ComboBox
 		choice = new Choice();
 		choice.add("프리스티스");
 		choice.add("메카니션");
 		choice.add("파이크맨");
 		
 		panel.add(choice);
 		//라디오 버튼과 동일한 용도
 		list1 = new List(3);
 		list1.add("Oracle");
 		list1.add("MySQL");
 		list1.add("MongoDB");
 		list1.add("MS-SQL");
 		list1.add("Tibero");
 		//다중 선택 모드로 생성 - 체크박스와 동일한 용도
 		
 		list2 = new List(3,true);
 		list2.add("ios");
 		list2.add("Android");
 		list1.add("Tizen");
 		list1.add("WebOs");
 		list1.add("Blackberry");
 		
 		panel.add(list1);
 		panel.add(list2);
 		
 		//패널을 프레임의 추가
		add(panel);
		
		setVisible(true);			
	}	
}
