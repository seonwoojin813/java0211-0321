package java0215;

public class Six4 {

	public static void main(String[] args) {
		//4개의 반이 30명씩 있으면
		/*
		String [][] student = new String [4][30] ;
		
		*/
		//4개의 반의 1반은 29명 2반은 38명 3반은 35명 4반은 28명이다 
		//이러면 제일 큰거를 뒤에 집어 넣기
		/*
		String [][] student = new String [4][38] ;
		*/
		
		/*
		String [][] a = new String [4][] ;
		//학생수는 비워놓고 반 만 써놓고
		a [0] = new String[29];
		a [1]  = new String[38];
		//각 반의 학생수를 써도되
	 	
		*/
		
		
		//2단부터 9단까지 구구단을 출력해보시오
		//나중에 바꾸는게 먼저
		//먼저 바뀌는게 나중에	
		/*
		for(int i =1; i<=9; i=i+1) {
			for (int j = 2; j<=9; j=j+1) {
				System.out.printf("%2d*%2d=%2d", j, i, i*j);
			}
			System.out.printf("\n");
		}
		*/
		
		
		//10단부터 19단 만들어보기
		for (int i = 1; i<=9; i=i+1) {
			for (int j=10; j<=19; j=j+1){
			System.out.printf(" %2d*%2d = %2d", j,  i, j*i);
		}
		System.out.printf("\n");

		}
		
	}

}
