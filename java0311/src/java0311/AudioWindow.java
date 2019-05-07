package java0311;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

//������ Ŭ����
public class AudioWindow extends JFrame {

	public AudioWindow() {
		setTitle("ȿ���� ���");
		setLocation(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		JPanel p = new JPanel();
		
		JTextField txt = new JTextField(30);
		p.add(txt);
		
		JButton loadUrl = new JButton("ã�ƺ���");
		p.add(loadUrl);
		//��ư ������ �� ������ ����
		loadUrl.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// ���� ���� ��ȭ���ڸ� ���� ���
				JFileChooser fc = new JFileChooser();
				//Ȯ���� ���� ���͸� ����
				FileNameExtensionFilter filter = new FileNameExtensionFilter("���� ����", "wav", "mid");
			    fc.setFileFilter(filter);
			    //��ȭ���ڸ� ����ϰ� ���� ��ư�� ���� ����
			    int result = fc.showOpenDialog(null);
			    //Ȯ���� �����ٸ�
			    if(result == JFileChooser.APPROVE_OPTION) {
			    	//���� ��θ� �����ͼ� txt�� ���
			    	File f = fc.getSelectedFile();
			    	txt.setText(f.getAbsolutePath());
			    }
				
			}
		
		    });
			add(p);
			
			JButton play = new JButton("��");
			p.add(play);
			play.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					try {
					//���� ��θ� ������ File ��ü ����
					File f = new File(txt.getText());
					//������ ��θ� URL�� ����
					URL url = new URL("File:///"+ f.getAbsolutePath());
					//����� ����� ����
					AudioClip audioClip =Applet.newAudioClip(url);
					audioClip.play();
					}catch(Exception e1) {	
					}
				}	
			});
			//������Ʈ ũ�⿡ ���߾ �����찡 ����
			pack();
		    setVisible(true);
	}
}
