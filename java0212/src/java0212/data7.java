package java0212;

public class data7 {

	public static void main(String[] args) {

	int money = 45390;
	//10의 자리에서 반올림해서 45400이라고 출력
	//소수 첫째자리로 반올림 숫자를 이동
	double x = money / 100.0; //453.90
	
	int  y = (int)(x+0.5); // 454
	
	int kk = y * 100; //45400
	
	System.out.printf("%d", kk);
	

	}

}
