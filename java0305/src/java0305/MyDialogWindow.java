package java0305;

import java.awt.Dialog;
import java.awt.Frame;

public class MyDialogWindow extends Frame {
          public MyDialogWindow() {
        	  setTitle("��ȭ���� ������");
        	  setSize(400,400);
        	  setLocation(100,100);
        	  //��ȭ���� ����
        	  //��ȭ���ڴ� �׻� �θ� �����츦 ������ ������
        	  //�������̳� �ٸ� ��ȭ������ ������ ������ ����
        	  //Dialog d = new Dialog(this);�� â�� ������ �� ������
        	  //�ι�° �Ű������� true�� �����ϸ� ��޷λ���
        	  //����� ȭ�鿡 ��µǸ� ������� ������ ������� ����� ������ �ʴ� ��ȭ����
        	  Dialog d = new Dialog(this, true); // �̰ɷ� �����Ű�� â�� �ȿ����� - ���
        	  d.setSize(200, 200);
        	  d.setVisible(true);
        	
        	  
        	  setVisible(true); //���� setLocation(100,100); �ؿ� �־��µ� �ؿ� �ּ��� �� ���� �ö󰡸� ��޸����� ������� ����� ������ �ʱ� ������
        	  //true�� ��� false�̸� ��޸��� 
        	  
        	  /*
        	  //��ȭ���� ����
        	  //��ȭ���ڴ� �׻� �θ� �����츦 ������ ������
        	  //�������̳� �ٸ� ��ȭ������ ������ ������ ����
        	  //Dialog d = new Dialog(this);�� â�� ������ �� ������
        	  //�ι�° �Ű������� true�� �����ϸ� ��޷λ���
        	  //����� ȭ�鿡 ��µǸ� ������� ������ ������� ����� ������ �ʴ� ��ȭ����
        	  Dialog d = new Dialog(this, true); // �̰ɷ� �����Ű�� â�� �ȿ����� - ���
        	  d.setSize(200, 200);
        	  d.setVisible(true);
          */
        	  
          }
}
