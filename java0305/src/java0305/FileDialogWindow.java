package java0305;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class FileDialogWindow extends Frame {
        public FileDialogWindow() {
        	this.setTitle("���� ��ȭ����");
        	setSize(300,300);
        	setLocation(20,20);
        	
        	//���� ��ȭ���� �����
        	FileDialog fd = new FileDialog(this, "���� ��ȭ����", FileDialog.LOAD);
        	fd.setVisible(true);
        	//������ ������ ���丮 ��ο� �����̸� ��������
        	String directory = fd.getDirectory();
        	String filename = fd.getFile();
        	
        	Panel p = new Panel();
        	//���̺� ���丮 ��ο� �����̸��� ���
        	Label label = new Label(directory + "\\" + filename);
        	p.add(label);
        	add(p);
        	
        	setVisible(true);
        	
        	
        	
        	
        }
	 
}
