package java0213;

public class Data1 {

	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		//사칙연산 과 % 연산을 수행할 때는 최소 int
		//byte끼리의 연산이지만 실제 수행될 때는 int 연산
		//결과를 byte에 대입하고자 하면 강제 형 변환을 해야 합니다.
		//표현 범위를 큰 데이터를 작은 범위의 데이터로 형 변환하면 데이터가
		//잘못 나올 수 있습니다. 
		byte b3 = (byte)(b1 + b2);
		System.out.printf("b3:%d\n", b3);

		//나눗셈을 할 때 실수로 결과 만들기
		double d = (double)10/3;
		System.out.printf("d:%f\n", d);
		
		//켜짐 과 꺼짐을 번갈아 가면서 10번 하기
		for(int i=0; i<15; i=i+1) {
			try {
				//1초 대기
				Thread.sleep(1000);
				int r = i % 6;//i=0으로 나눈 나머지
				if(r == 0) {
					System.out.printf("켜짐\n");
					}
				if(r == 1) {
					System.out.printf("꺼짐\n");
			}
				if(r == 2) {
					System.out.printf("화\n");
			}
				if(r == 3) {
					System.out.printf("월\n");
			}
				if(r == 4) {
					System.out.printf("일\n");
			}
		}catch(Exception e) {}
	}

	}
}
