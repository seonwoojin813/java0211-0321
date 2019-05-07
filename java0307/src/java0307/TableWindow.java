package java0307;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TableWindow extends JFrame {
    
	//�����͸� �߰� �� ���� �� �� �ֵ��� ���͸� ����
	//�÷� �̸� ���� ������ ���� 
	Vector<String>title;
	//������ �ϳ� �ϳ��� ������ ����
	Vector<Vector<String>>data;
	
	//�����͸� ��� �� ����ȣ ����� ���̺� ����
	JTable table;
	
	
	//���԰� ������ ���� ������Ʈ
	JLabel lblName, lblNation;
	JTextField txtName,  txtNation;
	JButton btnInsert, btnRemove;
	
	public TableWindow() {
                	  setTitle("���̺� ���");
                      setSize(500, 500);     		
                  	  setLocation(100, 100);
               		  setDefaultCloseOperation(EXIT_ON_CLOSE);
               		  
               		  title = new Vector<String>();
               		  //�÷� �̸� �߰�
               		  title.add("�̸�");
               		  title.add("����");
               		  
               		  data = new Vector<Vector<String>>();
               		  Vector <String> imsi = new Vector<String>();
               		  imsi.add("�����");
               		  imsi.add("���ѹα�");
               		  data.add(imsi);
               		
               		  imsi = new Vector<String>();
               		  imsi.add("�ظ�����");
               		  imsi.add("�ױ۷���");
               		  data.add(imsi);
               		  
               		  imsi = new Vector<String>();
               		  imsi.add("������");
               		  imsi.add("����ũ");
               		  data.add(imsi);
               		  
               		  //���̺� ����� ������ ���� ����
               		  DefaultTableModel model = new DefaultTableModel(data, title);
               		  //���̺��� �̿��ؼ� ���̺� ����
               		  table = new JTable(model);
               		  
               		  //���̺��� �ٷ� �߰� - �÷��̸��� ��¾ȵ�
               		  //add(table);
               		  
               		  //JScrollPane ���� �����ؼ� ���
               		  JScrollPane sp = new JScrollPane(table); 
               		  add(sp);
               		  
               		 JPanel panel = new JPanel();
               		 lblName = new JLabel("�̸�");
               		 panel.add(lblName);
               		 txtName = new JTextField(10);
               		 panel.add(txtName);
               		 lblNation = new JLabel("����");
               		 panel.add(lblNation);
               		 txtNation = new JTextField(10);
               		 panel.add(txtNation);
               		 
               		 //����ó�� ����� ���⼭�ϸ� ���� �׷��� �ؿ��� ���� �о�� ���� �ȸ��� ��  
               		 //ã�ƺ��� �������� �μ��� �߻�
               		 //�������� �μ����� ���� . ���� �� ���� ��� btnInsert.addActionListener(action); �̰� �����ε� 
               		 // btnInsert�� �̰� �ؿ� ����� ���⶧���� ���� �־ ���� �̷����� btnInsert = new JButton("����");
               		 // panel.add(btnInsert); btnRemove = new JButton("����"); panel.add(btnRemove); �̹����� ������
               		 ActionListener action = new  ActionListener() {
 					@Override
 					public void actionPerformed(ActionEvent e) {
 					if(e.getSource() == btnInsert) {
 					//txtName�� txtNation�� �Է��� ���ڿ��� ���̺� �߰�
 						
 						
 				     	//	txtName�� txtNation�� ���ڿ��� ��������
 						String name = txtName.getText().trim(); //trim��������°�
 						String nation = txtNation.getText().trim();
 						
 						//�Է��� ���ڿ��� ������ �޽��� ��ȭ���ڸ� ����ϰ� ����
 						if(name.length() < 1 || nation.length() < 1) {
 							JOptionPane.showMessageDialog(null, "�̸��̳� ������ �ʼ��Է��Դϴ�.!!", "�Է� ����", 
 									JOptionPane.ERROR_MESSAGE);
 							return;
 						}
 						
 						
 						//Confirm ��ȭ���� ����ϱ�
 						int result = JOptionPane.showConfirmDialog(null, "������ ���� �Ͻðڽ��ϱ�?", "�Է� Ȯ��",
 								JOptionPane.YES_NO_OPTION);
 						
 						if(result == 0) {
 							//������ �𵨿� �߰��� ������ �迭�� ����
 	 						String [] row = {name, nation};
 	 						
 	 						//������ �� ��������
 	 						DefaultTableModel model = (DefaultTableModel)table.getModel();
 	 				
 	 					//������ �߰�
 	 						model.addRow(row);
 	 						
 	 						txtName.setText("");
 	 						txtNation.setText("");
 	 						
 	 						JOptionPane.showMessageDialog(null,"���� ����!!", "�޽���",
 	 								JOptionPane.INFORMATION_MESSAGE);
 						}
 						
 	
 						
 						/*
 						//������ �𵨿� �߰��� ������ �迭�� ����
 						String [] row = {name, nation};
 						
 						//������ �� ��������
 						DefaultTableModel model = (DefaultTableModel)table.getModel();
 				
 						//������ �߰�
 						model.addRow(row);
 						//���� �����Ϳ� �߰�
 						Vector <String> imsi = new Vector<String>();
 						imsi.add(name);
 						imsi.add(nation);
 						//data.add(imsi);
 						*/
 						txtName.setText("");
 						txtNation.setText("");
 						
 					//System.out.printf("���� ��ư�� �������ϴ�.\n");
 					}else if(e.getSource() == btnRemove ){
 					//���̺��� ������ �� ��ȣ�� ������ �� ��ȣ�� �ش��ϴ� �����͸� ����
 					//���̺��� ������ �� ��ȣ�� ��������
 					int rowNum = table.getSelectedRow();
 					if( rowNum >= 0 && rowNum < data.size()) {
 					
 						int result = JOptionPane.showConfirmDialog(null,  "������ �����Ͻðڽ��ϱ�?", "����Ȯ��", 
 								JOptionPane.YES_NO_OPTION);
 						
 						
 					if(result == 0) {
 					//������ �� ��������
 					DefaultTableModel model = (DefaultTableModel)table.getModel();
 					//������ ����
 					model.removeRow(rowNum);
 					//data������ ����
 					//data.remove(rowNum);
 					}else {
 					return;
 					}
 					}else {
 					JOptionPane.showMessageDialog(null, "���� �����ϰ� ������ ��������!!", 
 					  "��������", JOptionPane.ERROR_MESSAGE);
 						
 						
 						
 						
 						
 						
 						
 					//System.out.printf("�����ϰ� ������ ��������!!!\n");
 					}
 						
 						
 			    	//System.out.printf("���� ��ư�� �������ϴ�.\n");
 						
 					}				
 					}      			 
                	}; 
                    /*
                    ���� ������ ���� 
                	//�̺�Ʈ ó�� �����ʸ� ������Ʈ�� ������Ѿ� �մϴ�.
                   	btnInsert.addActionListener(action);
                   	btnRemove.addActionListener(action);
                	*/
                	
               		 btnInsert = new JButton("����");
               		 panel.add(btnInsert);
               		 btnRemove = new JButton("����");
               		 panel.add(btnRemove);
               	
               		 //����� �;���
               		 //�̺�Ʈ ó�� �����ʸ� ������Ʈ�� ������Ѿ� �մϴ�.
               		 btnInsert.addActionListener(action);
               		 btnRemove.addActionListener(action);
               		 
               		 //������ ����
               		 /* 
               		 //��ư�� Ŭ�� �̺�Ʈ ó���� ���� ��ü
               		 ActionListener action = new  ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
					if(e.getSource() == btnInsert) {
					System.out.printf("���� ��ư�� �������ϴ�.\n");
					}else if(e.getSource() == btnRemove ){
					System.out.printf("���� ��ư�� �������ϴ�.\n");
					}				
					}      			 
               		};
             
               		 //�̺�Ʈ ó�� �����ʸ� ������Ʈ�� ������Ѿ� �մϴ�.
               		 btnInsert.addActionListener(action);
               		 btnRemove.addActionListener(action);
               		 */
               		 
               		 
               		 //�г��� �ϴܿ� ��ġ
               		 add("South",  panel);
               		 setVisible(true);
           }
}
