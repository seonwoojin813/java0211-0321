package objecttest;

import java.io.IOException;

public class LangMain {

	public static void main(String[] args) {
		// 100번째 피보나치 수열의 값을 찾아오는데 걸리는 시간을 측정
		
		int n1 = 1;
		int n2 = 1;
		int result = 1;
		long start = System.currentTimeMillis();
		for(int i=3; i<=100; i=i+1) {
			result = n1 + n2;
			n1= n2;
			n2 = result;
		}
	    long end = System.currentTimeMillis();
	    System.out.printf("걸린시간:%d\n",(end-start));
		System.out.printf("100번째 피보나치 수열의 값 : %d\n", result);

		
		/*
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//r.exec("notepad"); -->이러면 에러 노트패드에 마우스 가져다대고 예외처리해야해(surround~클릭)
		*/
		
		
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("notepad C:\\Users\\503_08\\Documents\\0221.txt");
			//불러올 주소 복사한다음 역슬래시두개한다음 파일이름
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
