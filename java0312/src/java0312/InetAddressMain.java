package java0312;

import java.net.InetAddress;

public class InetAddressMain {

	public static void main(String[] args) {
		try {
			//�ڽ��� ��ǻ�� �ּ� ������ Ŭ��
			InetAddress local = InetAddress.getLocalHost();
		    System.out.printf("���� ����: %s\n", local);
		    
		    //www.daum.net�� �ּ� ������ ���
		    InetAddress daum = InetAddress.getByName("www.daum.net");
		    System.out.printf("������ �ּ� ����: %s\n", daum);
		    
		    //google�� �������� �ּҸ� ����մϴ�.
		    //�̷� ��� ��� �ּ� ������ Ȯ���ϰ��� �� ���� �迭�� �޾ƾ��մϴ�.
		    //www.google.com�� �ּ� ������ ���
		    InetAddress [] google  = InetAddress.getAllByName("www.google.com");
		    for(InetAddress addr : google) { //���� �����Ϸ���
		    System.out.printf("������ �ּ� ����: %s\n", addr);
		    }
		    //google�� �������� �ּҸ� ����մϴ�.
		    //�̷� ��� ��� �ּ� ������ Ȯ���ϰ��� �� ���� �迭�� �޾ƾ��մϴ�.
		    //www.google.com�� �ּ� ������ ���
		    InetAddress [] naver  = InetAddress.getAllByName("www.naver.com");
		    for(InetAddress addr : naver) { //���� �����Ϸ���
		    System.out.printf("���̹��� �ּ� ����: %s\n", addr);
		    }
		    
		    //IP�ּ� ������ ������ ���� ���� ����
		    //ȸ�� ������ �۾��� �� - �������� ���� �� �� �����ϱ�
			InetAddress ip = InetAddress.getByName("192.168.0.108");
		    System.out.printf("ip�� �̿��ϴ� ���: %s\n", ip);
		    
		    
		    
		    
		}catch(Exception e) {
			//���ܳ��� ���
			System.out.printf("%s\n", e.getMessage());
			//���ܸ� ������
			e.printStackTrace();
		}
	}
}
