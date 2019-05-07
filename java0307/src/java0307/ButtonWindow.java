package java0307;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ButtonWindow extends JFrame {
    //�ʿ��� ������Ʈ �������� ����
	private JLabel lblGender,  lblLanguage;
	private JButton btnConfirm;
	private JRadioButton radioMan, radioWoman;
	private JCheckBox cbCPlus, cbJava, cbPython, cbJavaScript;
	
	public ButtonWindow() {
		//���� �ڽ��� ������ ũ�⸦ ��������
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension screenSize = t.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;		
		
	
		setTitle("��ư �׽�Ʈ");
		setSize(300,  300);
		setLocation((width-150)/2,  (height-150)/2);
		//�����ư�� ������ �� ���α׷� ���Ḧ �ϵ��� ���ִ� �ɼ��� ����
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		lblGender = new JLabel("����");
		radioMan = new JRadioButton("����");
		radioWoman = new JRadioButton("����");
		radioMan.setSelected(true);
		//���� ��ư�� �׷��� �������մϴ�.
		ButtonGroup group = new ButtonGroup();
		group.add(radioMan);
		group.add(radioWoman);
		
		panel.add(lblGender);
		panel.add(radioMan);
		panel.add(radioWoman);
		
		
		lblLanguage = new JLabel("���α׷��־��");
		cbCPlus = new JCheckBox("C++");
		cbJava = new JCheckBox("Java");
		cbPython = new JCheckBox("Python");
		cbJavaScript = new JCheckBox("JavaScript");
		
		panel.add(lblLanguage);
		panel.add(cbCPlus);
		panel.add(cbJava);
		panel.add(cbPython);
		panel.add(cbJavaScript);
		
		btnConfirm = new JButton("Ȯ��");
		btnConfirm.setToolTipText("������ ���� ȭ������ �ѱ�ϴ�.");
		panel.add(btnConfirm);
		
		//��ư�� Ŭ���ϰų� �ؽ�Ʈ �ʵ忡�� Enter�� ������ ���� �̺�Ʈ ó����
		//���� �������̽��� ������ ��ü ����
		
		 ActionListener action = new  ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.printf("��ư�� ����\n");
			
				//���� ��ȭ���ڸ� ����
				JFileChooser fc = new JFileChooser("C:\\Users\\503_08>C:\\students\\java\\java0307");
				FileNameExtensionFilter filter = new FileNameExtensionFilter(" .jpg  |  .png",  "jpg",  "png");
				fc.setFileFilter(filter);
				//showOpenDialog ��ſ� showSaveDialog�� ȣ���ϸ� ���� ��ȭ����
				fc.showOpenDialog(null);
				int result = fc.showOpenDialog(null);
				if(result == JFileChooser.APPROVE_OPTION) {
					//������ ���ϰ�� ���
					System.out.printf("%s�� ����\n",fc.getSelectedFile().getAbsoluteFile());
				}
				
				
				//���� ���ð� ���α׷��� �� ������ ���� ���
			}
			 
		 };
		this.btnConfirm.addActionListener(action);
		
		
		
		  
		add(panel);
		setVisible(true);
	}
	}
