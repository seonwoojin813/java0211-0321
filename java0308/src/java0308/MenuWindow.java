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
        	  setTitle("�޴� �׽�Ʈ");
        	  setSize(200,200);
        	  setLocation(100,100);
        	  setDefaultCloseOperation(EXIT_ON_CLOSE);
        	  
        	  //�г��� �����ؼ� �гο� ������Ʈ ��ġ
        	  JPanel p = new JPanel();
        	  
        	  label = new JLabel("�޴� �׽�Ʈ");
        	  p.add(label);
        	  
        	  //�г��� ���� �����쿡 �߰�
        	  add(p);
        	  
        	  //�޴��ٸ� ����
        	  JMenuBar menuBar = new  JMenuBar();
        	  
        	  //�޴��� ����
        	  JMenu menu = new JMenu("���� ����(M)"); 
        	  menu.setMnemonic('M');
        	  
        	  //�޴� �׸��� �����ؼ� �޴��� �߰�
        	  JMenuItem fore = new JMenuItem("���ڻ� ����(F)");
        	  fore.setMnemonic('F');
        	  //JMenuItem back = new JMenuItem("���� ����");
        	  JCheckBoxMenuItem back = new  JCheckBoxMenuItem("���� ����(B)");
        	  fore.setMnemonic('B');
        	  
        	  //�̺�Ʈ ó���� ���� ������ �ν��Ͻ� ����
        	  ActionListener action = new ActionListener() {
               @Override
				public void actionPerformed(ActionEvent e) {
				if(e.getSource() == fore) {
					//���� ��ȭ���ڸ� ����
					JColorChooser color = new	 JColorChooser();
					Color col = color.showDialog(null, "���ڻ� ����", label.getForeground());  //Color.CYAN);
					label.setForeground(col);
					//System.out.printf("���ڻ� ������ Ŭ��\n");
				}else if(e.getSource() == back) {
					JColorChooser color = new	 JColorChooser();
					Color col = color.showDialog(null, "���� ����", label.getBackground());  //Color.CYAN);
					//���̺��� ����� ��� ������ ������ �� ������ ����
					EtchedBorder border = new EtchedBorder();
					label.setBorder(border);
					
					//label.setBackground(col);
                    p.setBackground(col);
					//System.out.printf("���� ������ Ŭ��\n");	
				}	
				} 
        	    };
        	  
        	  //������Ʈ�� ������ ����
        	  fore.addActionListener(action);
              back.addActionListener(action);
        	  
        	  menu.add(fore);
        	  menu.add(back);
        	  
        	  //�޴��ٿ� �޴��� �߰�
        	  menuBar.add(menu);
        	  
        	  //�˾� �޴� �ν��Ͻ� ����
        	  JPopupMenu popupMenu = new JPopupMenu();
        	  JPopupMenu item1 = new JPopupMenu("ù��° �˾� �޴�");
        	  popupMenu.add(item1);
        	  JPopupMenu item2 = new JPopupMenu("�ι�° �˾� �޴�");
        	  popupMenu.add(item2);
        	  
        	  MouseListener mouseListener = new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
				
				}
                
				@Override
				public void mousePressed(MouseEvent e) {
					//���콺 ������ ��ư�� �������� ��������
					if(e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
					}
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					//���콺 ������ ��ư�� �������� ��������
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
        	  
        	  //�����쿡 ���콺 ������ ����
        	  addMouseListener( mouseListener);
        	  //�޴��ٸ� �����쿡 �߰�
        	  this.setJMenuBar(menuBar);
        	  
        	  
        	  setVisible(true);
          }
}
