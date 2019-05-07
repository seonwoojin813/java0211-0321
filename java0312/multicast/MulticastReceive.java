
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastReceive {

	public static void main(String[] args) {
		//Multicast ���� ����
		MulticastSocket ms = null;
		try {
			//��Ƽ ĳ��Ʈ ���ϻ���
			ms = new MulticastSocket(3000);
			//��Ƽ ĳ��Ʈ �ּ� ����
			ms.joinGroup(InetAddress.getByName("230.100.50.5"));
			while(true) {
				byte [] b = new byte[1024];
				DatagramPacket dp = new DatagramPacket(b, b.length);
				ms.receive(dp);
				String msg = new String(b).trim();
				System.out.printf("%s:%s\n",dp.getAddress(), msg);
			}
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
			}finally {
				try {
				}catch(Exception e) {
					System.out.printf("%s\n", e.getMessage());
					e.printStackTrace();
				}
			}
	}
}
