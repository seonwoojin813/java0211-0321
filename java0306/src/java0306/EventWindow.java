package java0306;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventWindow extends Frame {
     Label lbl;
	public EventWindow() {
    	   setTitle("AWT 이벤트 처리");
    	   setSize(300,  300);
       	   setLocation(10,10);
       	  
       	   //컴포넌트를 마음대로 배치하기 위해서 레이아웃을 null로 설정
       	   setLayout(null);
       	   lbl = new Label("♨");
       	   lbl .setSize(50, 50);
       	   lbl.setLocation(10, 35);
       	   add(lbl);
       	   
       	   //마우스를 움직일 때 처리를 위한 리스너
       	  MouseMotionListener mouseMotionListener = new MouseMotionListener () {
           //버튼을 누르고 움직일 때 호출되는 메소드
		   @Override
			public void mouseDragged(MouseEvent e) {
			//마우스의 위치를 레이블의 위치로 설정
			int x = e.getX();
			int y = e.getY();
			lbl.setLocation(x-10,  y);
		    }

			@Override
			public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			}
       		};
       	    this.addMouseMotionListener(mouseMotionListener);
       	   
        	   
        /*
       	   //키보드 이벤트 처리를 위한 리스너
       	   KeyListener keyListener = new KeyListener() {
           //문자키를 눌렀을 때 호출되는 메소드
		   @Override
			public void keyPressed(KeyEvent e) {
			//System.out.printf("문자키를 누른경우\n");
		    int key = e.getKeyCode();
            int x = lbl.getX();
            int y = lbl.getY();
            if(key == KeyEvent.VK_UP) {
             y = y - 3;
            lbl.setLocation(x,y);
			}else if(key == KeyEvent.VK_DOWN ) {
				y = y + 3;
				 lbl.setLocation(x,y);
			}else if(key == KeyEvent.VK_LEFT) {
				  x = x - 3;
            	  lbl.setLocation(x,y);
			}else if(key == KeyEvent.VK_RIGHT) {
				  x = x + 3;
            	  lbl.setLocation(x,y);
           	}
			}
            //키보드를 누르면 호출되는 메소드 -> 문자키를 누르면 keyType으로 갑니다
			@Override
			public void keyReleased(KeyEvent e) {
				//System.out.printf("키를 누른경우\n");
				//모든 키에 대해서 반응 - 대소문자 구분 못함
				//System.out.printf("keyCode:%d\n", e.getKeyCode());
				//반응하지 않는 키도 있습니다 - 대소문자 구분함
				//System.out.printf("keyChar:%c\n", e.getKeyChar());
             
			}
			
            //키보드에서 손을 뗄 때 호출되는 메소드
			@Override
			public void keyTyped(KeyEvent e) {		
			}
      	   };
       	   this.addKeyListener(keyListener);
		*/
     
       	 
       	  KeyAdapter keyAdapter = new KeyAdapter() {
       		 //메소드 만큼 복사해야해
       		  @Override
  			public void keyPressed(KeyEvent e) {
  			//System.out.printf("문자키를 누른경우\n");
  		    int key = e.getKeyCode();
              int x = lbl.getX();
              int y = lbl.getY();
              if(key == KeyEvent.VK_UP) {
               y = y - 3;
              lbl.setLocation(x,y);
  			}else if(key == KeyEvent.VK_DOWN ) {
  				y = y + 3;
  				 lbl.setLocation(x,y);
  			}else if(key == KeyEvent.VK_LEFT) {
  				  x = x - 3;
              	  lbl.setLocation(x,y);
  			}else if(key == KeyEvent.VK_RIGHT) {
  				  x = x + 3;
              	  lbl.setLocation(x,y);
             	}
  			}
        		  
       	  };
       	  this.addKeyListener(keyAdapter);
       	  
       	  
       	  
       	  
       	  
          /*  
       	   //현재 프레임에 윈도우 이벤트 : WindowListener 를 처리
        	WindowListener windowListener = new WindowListener() {
             
       		//윈도우가 화면에 출력되었을 때
			@Override
			public void windowActivated(WindowEvent e) {
			
			}
            //종료 버튼을 눌렀을 때
			@Override
			public void windowClosed(WindowEvent e) {

			}
            //윈도우가 사라진 후  
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
            //윈도우가 아이콘화 되었을 때 
			@Override
			public void windowDeactivated(WindowEvent e) {
				
			}
            //윈도우가 원래대로 복원 되었을 때
			@Override
			public void windowDeiconified(WindowEvent e) {
				
			}
            //윈도우가 활성화 되었을 때
			@Override
			public void windowIconified(WindowEvent e) {
			
			}
            //윈도우가 비활성화 되었을 때
			@Override
			public void windowOpened(WindowEvent e) {
				
			}
       		
       	};
       	   //윈도우 이벤트를 처리해 줄 리스너를 연결
       	   this.addWindowListener(windowListener);
       	 */
       	   
       	  WindowAdapter windowAdapter = new WindowAdapter() {
       	  public void windowClosing(WindowEvent e) {
       	   System.exit(0);
       	   }
       	   };
       	   this.addWindowListener(windowAdapter);
       			   
       	   setVisible(true);
       }
}
