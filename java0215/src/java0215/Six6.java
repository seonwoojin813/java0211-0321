package java0215;

public class Six6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] ar = {40, 70, 30, 65, 93, 48, 87};
            //60�� �̻��� �������� �հ�, ����, ��� (�Ҽ� 2° �ڸ����� ���) 
		 int sum = 0;  // �հ� ����
	     int cnt = 0;   // ���� ����
		for (int x : ar) {
			if(x>=60) {
				sum= sum+x;
				cnt = cnt+1;	
			}
		}
		double avg = (double)sum/cnt; 
		System.out.printf("%d\n",sum);
		 System.out.printf("%d\n",cnt);
		 System.out.printf("%.2f\n",avg);
	}

}
