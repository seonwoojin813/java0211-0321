package thread;

public class AnagramTest {

	public static void main(String[] args) {
		String str = "EROS";
		int idx = 0;
		int size = str.length(); // 1 �̷��� ����
		while(true){
			try {
				Thread.sleep(1000);
				//���� �� ��ŭ ���ڸ� �������� ���� �ݺ��� 
				//for(int i=0; i<str.length(); i=i+1) { -> 2. str.length()�� size�� ����
				for(int i=0; i<size; i=i+1) {
					//idx�� 1ȸ������ 1�� �����ϱ� ������ ��ĭ�� �����ʿ���
					//�����ؼ� ���� �� ��ŭ�� ������
					//���� �� ��ŭ���� �������� ���ϱ� ������ ������ ���ڿ�
					//�����ϸ� ù��° ���� ���� �ٽ� ������
					//char ch = str.charAt((idx+i)%str.length()); -> 3. %str.length())�� size�� �ٲ�
					char ch = str.charAt((idx+i)%size);
					System.out.printf("%c", ch);
				}
				System.out.printf("\n");
				idx = idx + 1;
			}catch(Exception e) {}
		}

	}

}
