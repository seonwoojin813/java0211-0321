package java0307;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class ListWindow extends JFrame {
    //����Ʈ 2���� ��ư 1��
	private JList leftList, rightList;
	private JButton btn;
	
	//List�� ����� �迭 ����� 
	String []  players = {"����", "����", "ȣ�����", "�Ǳ�", "��Ƽ"};
	
	public  ListWindow() {
		 setTitle("��� �ű��");
         setSize(300, 300);     		
   	     setLocation(100, 100);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		 //���̾ƿ� ����
		 //FlowLayout�� ������� ���°� ��ġ paneló��
		 setLayout(new FlowLayout());
		 
		 leftList = new JList(players);
		 //���� ���� ���� ����
		 leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		 add(leftList);
		 
		 btn = new JButton(">>");
		 add(btn);
		 ActionListener action = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//leftList���� ������ �׸��� �ε��� ��������
				int [] idx = leftList.getSelectedIndices();
				for(int x : idx) {
					System.out.printf("%d\n", x);
				}
				//�迭�� ������ List ����
				List <String> list = new ArrayList<String>();
				for(String imsi : players) {
					list.add(imsi);
				}
				System.out.printf("%s\n", list);
				
				//list���� idx�� �ִ� �����͵��� ����
				//������� ������ �ε����� �����͸� ���� ���� ����
				//�տ������� ����� ������ �ε����� ������ �˴ϴ�.
				//�ݺ��� �ȿ� list.size()�� �ݺ��� �ȿ� ������ �ȵ˴ϴ�.
				//�����Ͱ� �������� ������ �����Ͱ� ������ ���մϴ�.
				
				for(int i=0; i<idx.length; i=i+1) {
					//�迭���� �ε��� ��°�� �ش��ϴ� �����͸� �����ͼ� ����
					list.remove(idx[idx.length-i-1]);
				}
				
				System.out.printf("%s\n", list);
				
			}
		 };
		 btn.addActionListener(action);
		 
		 rightList = new JList();
		 add(rightList);
		 
		 setVisible(true);
	}
}
