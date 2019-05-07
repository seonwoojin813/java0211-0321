package java0307;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class LoginWindow extends JFrame {
        private JLabel lblMsg, lblId, lblPassword;
        private JTextField txtId;
        private JPasswordField txtPassword;
        private JButton btnLogin,  btnRegister;
        
	public LoginWindow() {
        	 setTitle("�α��� ȭ��");
             setSize(250, 200);     		
        	 setLocation(100, 100);
     		 setDefaultCloseOperation(EXIT_ON_CLOSE);
     		
     		 JPanel mainPanel = new JPanel();
     		
     		 lblMsg = new JLabel("���̵�� ��й�ȣ�� �Է��ϼ���");
     		 //���� ����
     		 EtchedBorder eBorder = new EtchedBorder();
     		 lblMsg.setBorder(eBorder);
     		 mainPanel.add(lblMsg);
     		 
     		 //���̵� �Է� �κ�
     		 lblId = new JLabel("   ���̵�   ");
     		 txtId = new JTextField(15);
     		 mainPanel.add(lblId);
     		 mainPanel.add(txtId);
     		 
     		 //��й�ȣ �Էºκ�
     		 lblPassword = new JLabel("��й�ȣ");
     		 txtPassword = new JPasswordField(15);
     		 mainPanel.add(lblPassword);
     		 mainPanel.add(txtPassword);
     		 
     		 //��ư��ġ
     		 btnLogin = new JButton("   �α���   ");
     		 btnRegister = new JButton("ȸ������");
     		 
     		 //��ư�� Ŭ�� �̺�Ʈ ó���� ���� ��ü
     		 ActionListener action = new  ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
				     if(e.getSource() == btnLogin) {
				    	// System.out.printf("�α��� ��ư�� �������ϴ�.\n");
				    	 
				    	 //�Է��� ���� ��������
				    	 String id = txtId.getText();
				    	 char  []  password = txtPassword.getPassword();
				    	 //���ڹ迭�� ������ String ����
				    	 //���� ���ϼ��� Ȯ���� �� �迭�� ��� ��Ҹ� �ϳ��� ��
				    	 //String�� equals �޼ҵ带 �̿��� �� �־ �� 
				    	 String pw = new String(password);
				    	 
				    	 
				    	 //id�� �¿� ������ �����ϰ� ��� �빮�ڷ� ����
				    	 id = id.trim().toUpperCase();//UpperCase()�빮�ڷ� �ٲ��ִ� -����ϱ�
				    	 if(id.length()  <  1) {
				    		 lblMsg.setText("      ���̵�� �ʼ� �Է��Դϴ�.     ");
				    		 lblMsg.setBackground(Color.red);
				    		 //��ȿ�� �˻翡 �ɸ��� �� �̻� �������� �ʰ� �ߴ�
				    		 return;
				    	 }else if(password.length  <  1) {
				    		 //��й�ȣ�� �迭�̴ϱ� �׳� length
				    		 lblMsg.setText("      ��й�ȣ�� �ʼ� �Է��Դϴ�.     ");
				    		 lblMsg.setBackground(Color.red);
				    	 }
				    	 
				    	 //id�� ROOT�̸� ��й�ȣ üũ
				    	 //ROOT�� �ƴϸ� ���� ���̵��� ��� 
				    	 if(id.equals("ROOT") == false) {
				    		 lblMsg.setText("      �������� �ʴ� ���̵��Դϴ�.     ");
				    		 lblMsg.setBackground(Color.red);
				    	 }else if(!pw.equals("1234")) {
				    		 lblMsg.setText("      �߸��� ��й�ȣ �Դϴ�.     ");
				    		 lblMsg.setBackground(Color.red);
				    	 }else {
				    		 lblMsg.setText("      �α��ο� �����ϼ̽��ϴ�.     ");
				    		 lblMsg.setBackground(Color.green);
				    	 }
				    	 
				    	 
				    	 // System.out.printf("�Է��� ���̵�:s\n",  id);
				    	 //System.out.printf("�Է��� ��й�ȣ:s\n",  password);
				    	 //�迭�� ToString�� ������ �ȵǾ��ִ�
				    	 
				         }else if(e.getSource() == btnRegister) {
				    	 //System.out.printf("ȸ������ ��ư�� �������ϴ�.\n");
				    	 //setVisible(false); �ڽ��� ������ �ʰ� �ϱ�
				    	 
				    	 //���ο� ������ ���
				    	 new ButtonWindow();
				     }
					
				} 			 
     		 };
     		 //2�� ������Ʈ�� �̺���Ʈ�� �ϳ��� ��ü�� ó���ϴ� �� : �̺�Ʈ ����� 
     		 btnLogin.addActionListener(action);
     		 btnRegister.addActionListener(action);
     		 
     		 
     		 
     		 mainPanel.add(btnLogin);
     		 mainPanel.add(btnRegister);
     		 
     		 setResizable(false);
     		 
     		 
     		 add(mainPanel);
     		setVisible(true);	
         }
}
