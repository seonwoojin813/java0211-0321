package java0321;

public class Pattern {
 //�����ڸ� private���� �����ؼ� �ܺο��� new�� ȣ���� �� ������ �մϴ�.
	private Pattern() {
	//�̱� ���϶� ����� ������ ���ѹ��� �����
	}
	
	//�ڱ� �ڽ��� static ������ ����
	private static Pattern pattern;
	
	//�ν��Ͻ��� ������ �Ѱ��ִ� static �޼ҵ�
	public static Pattern getInstance() {
		if(pattern == null) {
			pattern = new Pattern();
		}
		return pattern;
	}
	
}
