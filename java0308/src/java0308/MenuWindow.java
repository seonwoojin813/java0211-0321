package java0308;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EtchedBorder;

public class MenuWindow extends JFrame {
	
	JLabel label;
	
          public  MenuWindow() {
        	  setTitle("메뉴 테스트");
        	  setSize(200,200);
        	  setLocation(100,100);
        	  setDefaultCloseOperation(EXIT_ON_CLOSE);
        	  
        	  //패널을 생성해서 패널에 컴포넌트 배치
        	  JPanel p = new JPanel();
        	  
        	  label = new JLabel("메뉴 테스트");
        	  p.add(label);
        	  
        	  //패널을 현재 윈도우에 추가
        	  add(p);
        	  
        	  //메뉴바를 생성
        	  JMenuBar menuBar = new  JMenuBar();
        	  
        	  //메뉴를 생성
        	  JMenu menu = new JMenu("색상 변경(M)"); 
        	  menu.setMnemonic('M');
        	  
        	  //메뉴 항목을 생성해서 메뉴에 추가
        	  JMenuItem fore = new JMenuItem("글자색 변경(F)");
        	  fore.setMnemonic('F');
        	  //JMenuItem back = new JMenuItem("배경색 변경");
        	  JCheckBoxMenuItem back = new  JCheckBoxMenuItem("배경색 변경(B)");
        	  fore.setMnemonic('B');
        	  
        	  //이벤트 처리를 위한 리스너 인스턴스 생성
        	  ActionListener action = new ActionListener() {
               @Override
				public void actionPerformed(ActionEvent e) {
				if(e.getSource() == fore) {
					//색상 대화상자를 선택
					JColorChooser color = new	 JColorChooser();
					Color col = color.showDialog(null, "글자색 선택", label.getForeground());  //Color.CYAN);
					label.setForeground(col);
					//System.out.printf("글자색 변경을 클릭\n");
				}else if(e.getSource() == back) {
					JColorChooser color = new	 JColorChooser();
					Color col = color.showDialog(null, "배경색 선택", label.getBackground());  //Color.CYAN);
					//레이블은 배경이 없어서 보더를 설정한 후 배경색을 적용
					EtchedBorder border = new EtchedBorder();
					label.setBorder(border);
					
					//label.setBackground(col);
                    p.setBackground(col);
					//System.out.printf("배경색 변경을 클릭\n");	
				}	
				} 
        	    };
        	  
        	  //컴포넌트에 리스너 연결
        	  fore.addActionListener(action);
              back.addActionListener(action);
        	  
        	  menu.add(fore);
        	  menu.add(back);
        	  
        	  //메뉴바에 메뉴를 추가
        	  menuBar.add(menu);
        	  
        	  //팝업 메뉴 인스턴스 생성
        	  JPopupMenu popupMenu = new JPopupMenu();
        	  JPopupMenu item1 = new JPopupMenu("첫번째 팝업 메뉴");
        	  popupMenu.add(item1);
        	  JPopupMenu item2 = new JPopupMenu("두번째 팝업 메뉴");
        	  popupMenu.add(item2);
        	  
        	  MouseListener mouseListener = new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
				
				}
                
				@Override
				public void mousePressed(MouseEvent e) {
					//마우스 오른쪽 버튼을 눌렀는지 감지한후
					if(e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
					}
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					//마우스 오른쪽 버튼을 눌렀는지 감지한후
					if(e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
					}
                 
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					
					
				}
        	  };
        	  
        	  //윈도우에 마우스 리스너 연결
        	  addMouseListener( mouseListener);
        	  //메뉴바를 윈도우에 추가
        	  this.setJMenuBar(menuBar);
        	  
        	  
        	  setVisible(true);
          }
}
