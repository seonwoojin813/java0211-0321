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
	      
           //비밀번호라는 텍스트와 비밀번호 유효성 출력을 위한 레이블
           private Label lblPassword, lblDisplay;
           //비밀번호를 입력받기 위한 텍스트 필드
           private TextField password;
           
           //문자열을 중복없이 저장할 수 있는 자료구조
           Set<String> set = new HashSet<String>();
           
            public ItemEventFrame() {
        	setTitle("Item 이벤트 처리");
        	setSize(230,  300);
        	setLocation(20,20);
        	setResizable(true);
        	
        	Panel p = new Panel();
        	tf = new TextField(20);
        	p.add(tf);
        	//텍스트 필드의 ActionListener 처리
        	ActionListener action = new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
			/*	
            //텍스트 필드에 입력한 내용을 ch에 추가
            ch.add(tf.getText());
            //비어 있거나 중복된 데이터는 삽입되지 않도록 만들기
			*/
            
            //공백만으로 만들어진 경우는 추가하지 않고 빠져 나가기	
            if(tf.getText().trim().length() < 1) { //trim이 공백제거
            	return;
            }
            //데이터를 중복없이 저장
            //set.add(tf.getText()); -> 여기에 trim을 넣게 되면 공백제거
            set.add(tf.getText().trim());
            //이전 데이터를 삭제
            ch.removeAll();
            //Set의 데이터를 출력
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
        	checkAll = new Checkbox("모두 동의"); 
        	
        	ItemListener itemListener = new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
				//System.out.printf("%d\n", e.getStateChange());	
				//체크할 때
					if(e.getStateChange() == 1) {
						check1.setState(true);
						check2.setState(true);
						check3.setState(true);
					}
					//체크를 해제할 때
					else {
						check1.setState(false);
						check2.setState(false);
						check3.setState(false);
					 }
				}
        	};
        	//checkAll의 상태가 변경될 때 itemListener의 메소드 호출
            checkAll.addItemListener(itemListener);
        	
        	p.add(check1);
        	p.add(check2);
        	p.add(check3);
        	p.add(checkAll);
        	  	
   
        	lblPassword = new Label("비밀번호");
        	p.add(lblPassword);
        	
        	password = new TextField(20);
        	password.setEchoChar('●');
        	p.add(password);
        	
        	//텍스트 필드나 에어리어에 문자를 입력할 때 발생하는 이벤트를 처리
        	TextListener textListener = new TextListener() {
				@Override
				public void textValueChanged(TextEvent e) {
					// 입력한 내용 가져오기
					String p = password.getText();
					//p에서 대문자, 소문자, 숫자, 특수문자의 개수 세기
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
					//4개의 항목이 모두 1이상인지 확인
					if(dae>0 && so>0 && su>0 && etc>0) {
					  	lblDisplay.setText("강함");
			        	lblDisplay.setBackground(Color.red);
					}else {
					  	lblDisplay.setText("약함");
			        	lblDisplay.setBackground(Color.pink);
					}
				}
        		
        	};
        	password.addTextListener(textListener);
        	
        	lblDisplay = new Label("약함");
        	lblDisplay.setBackground(Color.BLUE);
        	p.add(lblDisplay);
        	
        	add(p);
        	
        	setVisible(true);
           }	 
       }
