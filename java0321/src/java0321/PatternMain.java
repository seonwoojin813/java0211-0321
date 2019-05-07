package java0321;

public class PatternMain {

	public static void main(String[] args) {
		//�����ڸ� 2�� ȣ�� : �ν��Ͻ��� 2��
		//Pattern p1 = new Pattern();
		//Pattern p2 = new Pattern();

          Pattern p1 = Pattern.getInstance();
          Pattern p2 = Pattern.getInstance();
		
        //������ ������ ���� �ٸ� �ν��Ͻ��� ����Ű�� ���� Ȯ��
		//�ؽ��ڵ带 ���
		System.out.printf("p1:%d\n", p1.hashCode());
		System.out.printf("p2:%d\n", p2.hashCode());
		
		//Runtime Ŭ������ �ν��Ͻ��� 2���̻� ���� �� ������
		//�̱��� �������� �������ؼ� �����մϴ�.
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		System.out.printf("r1:%d\n", r1.hashCode());
		System.out.printf("r2:%d\n", r2.hashCode());
		
	}

}
