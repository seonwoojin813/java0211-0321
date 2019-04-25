package java0215;

public class Six6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] ar = {40, 70, 30, 65, 93, 48, 87};
            //60점 이상인 데이터의 합계, 개수, 평균 (소수 2째 자리까지 출력) 
		 int sum = 0;  // 합계 저장
	     int cnt = 0;   // 개수 저장
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
