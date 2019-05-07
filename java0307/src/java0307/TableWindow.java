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
    
	//데이터를 추가 및 편집 할 수 있도록 벡터를 선언
	//컬럼 이름 들을 저장할 벡터 
	Vector<String>title;
	//데이터 하나 하나를 저장할 벡터
	Vector<Vector<String>>data;
	
	//데이터를 행과 열 단위호 출력할 테이블 변수
	JTable table;
	
	
	//삽입과 삭제를 위한 컴포넌트
	JLabel lblName, lblNation;
	JTextField txtName,  txtNation;
	JButton btnInsert, btnRemove;
	
	public TableWindow() {
                	  setTitle("테이블 사용");
                      setSize(500, 500);     		
                  	  setLocation(100, 100);
               		  setDefaultCloseOperation(EXIT_ON_CLOSE);
               		  
               		  title = new Vector<String>();
               		  //컬럼 이름 추가
               		  title.add("이름");
               		  title.add("국가");
               		  
               		  data = new Vector<Vector<String>>();
               		  Vector <String> imsi = new Vector<String>();
               		  imsi.add("손흥민");
               		  imsi.add("대한민국");
               		  data.add(imsi);
               		
               		  imsi = new Vector<String>();
               		  imsi.add("해리케인");
               		  imsi.add("잉글랜드");
               		  data.add(imsi);
               		  
               		  imsi = new Vector<String>();
               		  imsi.add("에릭센");
               		  imsi.add("덴마크");
               		  data.add(imsi);
               		  
               		  //테이블에 연결될 데이터 모델을 생성
               		  DefaultTableModel model = new DefaultTableModel(data, title);
               		  //테이블을 이용해서 테이블 생성
               		  table = new JTable(model);
               		  
               		  //테이블을 바로 추가 - 컬럼이름이 출력안됨
               		  //add(table);
               		  
               		  //JScrollPane 위에 부착해서 출력
               		  JScrollPane sp = new JScrollPane(table); 
               		  add(sp);
               		  
               		 JPanel panel = new JPanel();
               		 lblName = new JLabel("이름");
               		 panel.add(lblName);
               		 txtName = new JTextField(10);
               		 panel.add(txtName);
               		 lblNation = new JLabel("국가");
               		 panel.add(lblNation);
               		 txtNation = new JTextField(10);
               		 panel.add(txtNation);
               		 
               		 //예외처리 만들기 여기서하면 오류 그러면 밑에서 부터 읽어봐 내가 안만든 것  
               		 //찾아보니 널포인터 인셉션 발생
               		 //널포인터 인셉션이 나면 . 앞을 봐 예를 들어 btnInsert.addActionListener(action); 이게 문제인데 
               		 // btnInsert가 이거 밑에 만들어 졌기때문에 위에 있어서 오류 이럴때는 btnInsert = new JButton("삽입");
               		 // panel.add(btnInsert); btnRemove = new JButton("삭제"); panel.add(btnRemove); 이밑으로 가야해
               		 ActionListener action = new  ActionListener() {
 					@Override
 					public void actionPerformed(ActionEvent e) {
 					if(e.getSource() == btnInsert) {
 					//txtName과 txtNation에 입력한 문자열을 테이블에 추가
 						
 						
 				     	//	txtName과 txtNation의 문자열을 가져오기
 						String name = txtName.getText().trim(); //trim공백지우는거
 						String nation = txtNation.getText().trim();
 						
 						//입력한 문자열이 없으면 메시지 대화상자를 출력하고 리턴
 						if(name.length() < 1 || nation.length() < 1) {
 							JOptionPane.showMessageDialog(null, "이름이나 국가는 필수입력입니다.!!", "입력 오류", 
 									JOptionPane.ERROR_MESSAGE);
 							return;
 						}
 						
 						
 						//Confirm 대화상자 출력하기
 						int result = JOptionPane.showConfirmDialog(null, "정말로 삽입 하시겠습니까?", "입력 확인",
 								JOptionPane.YES_NO_OPTION);
 						
 						if(result == 0) {
 							//데이터 모델에 추가할 데이터 배열을 생성
 	 						String [] row = {name, nation};
 	 						
 	 						//데이터 모델 가져오기
 	 						DefaultTableModel model = (DefaultTableModel)table.getModel();
 	 				
 	 					//데이터 추가
 	 						model.addRow(row);
 	 						
 	 						txtName.setText("");
 	 						txtNation.setText("");
 	 						
 	 						JOptionPane.showMessageDialog(null,"삽입 성공!!", "메시지",
 	 								JOptionPane.INFORMATION_MESSAGE);
 						}
 						
 	
 						
 						/*
 						//데이터 모델에 추가할 데이터 배열을 생성
 						String [] row = {name, nation};
 						
 						//데이터 모델 가져오기
 						DefaultTableModel model = (DefaultTableModel)table.getModel();
 				
 						//데이터 추가
 						model.addRow(row);
 						//원본 데이터에 추가
 						Vector <String> imsi = new Vector<String>();
 						imsi.add(name);
 						imsi.add(nation);
 						//data.add(imsi);
 						*/
 						txtName.setText("");
 						txtNation.setText("");
 						
 					//System.out.printf("삽입 버튼을 눌렀습니다.\n");
 					}else if(e.getSource() == btnRemove ){
 					//테이블에서 선택한 행 번호를 가지고 행 번호에 해당하는 데이터를 삭제
 					//테이블에서 선택한 행 번호를 가져오기
 					int rowNum = table.getSelectedRow();
 					if( rowNum >= 0 && rowNum < data.size()) {
 					
 						int result = JOptionPane.showConfirmDialog(null,  "정말로 삭제하시겠습니까?", "삭제확인", 
 								JOptionPane.YES_NO_OPTION);
 						
 						
 					if(result == 0) {
 					//데이터 모델 가져오기
 					DefaultTableModel model = (DefaultTableModel)table.getModel();
 					//데이터 삭제
 					model.removeRow(rowNum);
 					//data에서도 삭제
 					//data.remove(rowNum);
 					}else {
 					return;
 					}
 					}else {
 					JOptionPane.showMessageDialog(null, "행을 선택하고 삭제를 누르세요!!", 
 					  "삭제오류", JOptionPane.ERROR_MESSAGE);
 						
 						
 						
 						
 						
 						
 						
 					//System.out.printf("선택하고 삭제를 누르세요!!!\n");
 					}
 						
 						
 			    	//System.out.printf("삭제 버튼을 눌렀습니다.\n");
 						
 					}				
 					}      			 
                	}; 
                    /*
                    여기 있으면 오류 
                	//이벤트 처리 리스너를 컴포넌트와 연결시켜야 합니다.
                   	btnInsert.addActionListener(action);
                   	btnRemove.addActionListener(action);
                	*/
                	
               		 btnInsert = new JButton("삽입");
               		 panel.add(btnInsert);
               		 btnRemove = new JButton("삭제");
               		 panel.add(btnRemove);
               	
               		 //여기로 와야해
               		 //이벤트 처리 리스너를 컴포넌트와 연결시켜야 합니다.
               		 btnInsert.addActionListener(action);
               		 btnRemove.addActionListener(action);
               		 
               		 //원래는 여기
               		 /* 
               		 //버튼의 클릭 이벤트 처리를 위한 객체
               		 ActionListener action = new  ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
					if(e.getSource() == btnInsert) {
					System.out.printf("삽입 버튼을 눌렀습니다.\n");
					}else if(e.getSource() == btnRemove ){
					System.out.printf("삭제 버튼을 눌렀습니다.\n");
					}				
					}      			 
               		};
             
               		 //이벤트 처리 리스너를 컴포넌트와 연결시켜야 합니다.
               		 btnInsert.addActionListener(action);
               		 btnRemove.addActionListener(action);
               		 */
               		 
               		 
               		 //패널을 하단에 배치
               		 add("South",  panel);
               		 setVisible(true);
           }
}
