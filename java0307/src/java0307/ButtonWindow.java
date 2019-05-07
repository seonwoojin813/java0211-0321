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
    //필요한 컴포넌트 변수들을 선언
	private JLabel lblGender,  lblLanguage;
	private JButton btnConfirm;
	private JRadioButton radioMan, radioWoman;
	private JCheckBox cbCPlus, cbJava, cbPython, cbJavaScript;
	
	public ButtonWindow() {
		//현재 자신의 윈도우 크기를 가져오기
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension screenSize = t.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;		
		
	
		setTitle("버튼 테스트");
		setSize(300,  300);
		setLocation((width-150)/2,  (height-150)/2);
		//종료버튼을 눌렀을 때 프로그램 종료를 하도록 해주는 옵션을 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		lblGender = new JLabel("성별");
		radioMan = new JRadioButton("남자");
		radioWoman = new JRadioButton("여자");
		radioMan.setSelected(true);
		//라디오 버튼을 그룹을 만들어야합니다.
		ButtonGroup group = new ButtonGroup();
		group.add(radioMan);
		group.add(radioWoman);
		
		panel.add(lblGender);
		panel.add(radioMan);
		panel.add(radioWoman);
		
		
		lblLanguage = new JLabel("프로그래밍언어");
		cbCPlus = new JCheckBox("C++");
		cbJava = new JCheckBox("Java");
		cbPython = new JCheckBox("Python");
		cbJavaScript = new JCheckBox("JavaScript");
		
		panel.add(lblLanguage);
		panel.add(cbCPlus);
		panel.add(cbJava);
		panel.add(cbPython);
		panel.add(cbJavaScript);
		
		btnConfirm = new JButton("확인");
		btnConfirm.setToolTipText("누르면 다음 화면으로 넘깁니다.");
		panel.add(btnConfirm);
		
		//버튼을 클릭하거나 텍스트 필드에서 Enter를 눌렀을 때의 이벤트 처리를
		//위한 인터페이스가 구현된 객체 생성
		
		 ActionListener action = new  ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.printf("버튼을 누름\n");
			
				//파일 대화상자를 생성
				JFileChooser fc = new JFileChooser("C:\\Users\\503_08>C:\\students\\java\\java0307");
				FileNameExtensionFilter filter = new FileNameExtensionFilter(" .jpg  |  .png",  "jpg",  "png");
				fc.setFileFilter(filter);
				//showOpenDialog 대신에 showSaveDialog를 호출하면 저장 대화상자
				fc.showOpenDialog(null);
				int result = fc.showOpenDialog(null);
				if(result == JFileChooser.APPROVE_OPTION) {
					//선택한 파일경로 출력
					System.out.printf("%s를 선택\n",fc.getSelectedFile().getAbsoluteFile());
				}
				
				
				//성별 선택과 프로그래밍 언어를 선택한 것을 출력
			}
			 
		 };
		this.btnConfirm.addActionListener(action);
		
		
		
		  
		add(panel);
		setVisible(true);
	}
	}
