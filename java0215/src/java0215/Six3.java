package java0215;

public class Six3 {

	public static void main(String[] args) {
	    //�迭�� �����ϰ� ���߿� �����͸� ���� 
		String [] girlGroup = new String[5];
		
		girlGroup[0] = "�ҳ�ô�";
		girlGroup[1] = "���座��";
		girlGroup[2] = "Ʈ���̽�";
		girlGroup[3] = "AOA";
		girlGroup[4] = "����ģ��";
		
		//�迭�� ��� ���
		/*
		System.out.printf("%s\n", girlGroup[0]);
		System.out.printf("%s\n", girlGroup[1]);
		System.out.printf("%s\n", girlGroup[2]);
		System.out.printf("%s\n", girlGroup[3]);
		System.out.printf("%s\n", girlGroup[4]);
		*/
		//������ �����̳� ������ ������ ���� ������ �ݺ����� �̿��ؼ� �ۼ��ϸ�
		//�ڵ��� ���� ���� �ٰ� �ϳ��� �������� ó���� �� �ֱ� ������ ���������� ���� 
	
	
		
		//�迭�� ������ ������ ����� �����ϸ� �迭�� ������ ������ ����� �� ���� �����ؾ� ��
		/*
		int i =0;
		 while(i<5) {
			 System.out.printf("%s\n", girlGroup[i]);
			 i = i + 1;
		 }
		 */
		
		// �迭�� ������ ������ ����� ���� �������� �ʰ� . length�� �̿�
		//while(i<5){ �� while(i<girlGroup.length){ �� �ٲ㼭 ����
	/*
		int i =0;
		 while(i < girlGroup.length) {
			 System.out.printf("%s\n", girlGroup[i]);
			 i = i + 1;
		 }
		 */
		 //�ݺ��� �ȿ��� ������ �����͸� �����ϴ� ��쿡
		 //�� �����Ͱ� head�� ������ �����Ͷ�� ����� ������ �Űܳ��� ����ϴ� ���� �����ϴ�
		
	/*
		int i =0;
		//heap�� �����͸� ����� ������ �ű��
		//int size = girlGroup.length;     ------->�̰� heap���� �ű��
		int size = girlGroup.length;
		 while(i < girlGroup.length) {
			 System.out.printf("%s\n", girlGroup[i]);
			 i = i + 1;
		 }
		*/
	
		//���� ���Ÿ� �̿��� �迭�� ������ ���
		for(String temp : girlGroup) {
			System.out.printf("%s\n",temp);
		}
		
         //���� ����
		//[0],[1],�̷��Ŵ� ���� ���ڸ� ������ �Ҽ� �ٽ� ���Դٰ� �ٽ� ���｣ ���°Ű�
		//�÷����� ������ 1���� ������ ����:�÷��� �� �� �Ҽ����� �ٷ� ���｣ ���°Ű�
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
