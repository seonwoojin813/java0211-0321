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
    	   setTitle("AWT �̺�Ʈ ó��");
    	   setSize(300,  300);
       	   setLocation(10,10);
       	  
       	   //������Ʈ�� ������� ��ġ�ϱ� ���ؼ� ���̾ƿ��� null�� ����
       	   setLayout(null);
       	   lbl = new Label("��");
       	   lbl .setSize(50, 50);
       	   lbl.setLocation(10, 35);
       	   add(lbl);
       	   
       	   //���콺�� ������ �� ó���� ���� ������
       	  MouseMotionListener mouseMotionListener = new MouseMotionListener () {
           //��ư�� ������ ������ �� ȣ��Ǵ� �޼ҵ�
		   @Override
			public void mouseDragged(MouseEvent e) {
			//���콺�� ��ġ�� ���̺��� ��ġ�� ����
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
       	   //Ű���� �̺�Ʈ ó���� ���� ������
       	   KeyListener keyListener = new KeyListener() {
           //����Ű�� ������ �� ȣ��Ǵ� �޼ҵ�
		   @Override
			public void keyPressed(KeyEvent e) {
			//System.out.printf("����Ű�� �������\n");
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
            //Ű���带 ������ ȣ��Ǵ� �޼ҵ� -> ����Ű�� ������ keyType���� ���ϴ�
			@Override
			public void keyReleased(KeyEvent e) {
				//System.out.printf("Ű�� �������\n");
				//��� Ű�� ���ؼ� ���� - ��ҹ��� ���� ����
				//System.out.printf("keyCode:%d\n", e.getKeyCode());
				//�������� �ʴ� Ű�� �ֽ��ϴ� - ��ҹ��� ������
				//System.out.printf("keyChar:%c\n", e.getKeyChar());
             
			}
			
            //Ű���忡�� ���� �� �� ȣ��Ǵ� �޼ҵ�
			@Override
			public void keyTyped(KeyEvent e) {		
			}
      	   };
       	   this.addKeyListener(keyListener);
		*/
     
       	 
       	  KeyAdapter keyAdapter = new KeyAdapter() {
       		 //�޼ҵ� ��ŭ �����ؾ���
       		  @Override
  			public void keyPressed(KeyEvent e) {
  			//System.out.printf("����Ű�� �������\n");
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
       	   //���� �����ӿ� ������ �̺�Ʈ : WindowListener �� ó��
        	WindowListener windowListener = new WindowListener() {
             
       		//�����찡 ȭ�鿡 ��µǾ��� ��
			@Override
			public void windowActivated(WindowEvent e) {
			
			}
            //���� ��ư�� ������ ��
			@Override
			public void windowClosed(WindowEvent e) {

			}
            //�����찡 ����� ��  
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
            //�����찡 ������ȭ �Ǿ��� �� 
			@Override
			public void windowDeactivated(WindowEvent e) {
				
			}
            //�����찡 ������� ���� �Ǿ��� ��
			@Override
			public void windowDeiconified(WindowEvent e) {
				
			}
            //�����찡 Ȱ��ȭ �Ǿ��� ��
			@Override
			public void windowIconified(WindowEvent e) {
			
			}
            //�����찡 ��Ȱ��ȭ �Ǿ��� ��
			@Override
			public void windowOpened(WindowEvent e) {
				
			}
       		
       	};
       	   //������ �̺�Ʈ�� ó���� �� �����ʸ� ����
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
