package java0227;

import java.util.Random;
import java.util.StringTokenizer;

public class RandomMain {

	public static void main(String[] args) {
		/*
		//인스턴스를 생성할 때 seed번호를 대입하면 일정한 패턴으로 숫자가 생성
		//seed 번호를 대입하지 않으면 정말 랜덤 
		Random r = new Random();
		
		//nextInt는 정수 범위 내에서 랜덤한 숫자를 리턴  
		//System.out.printf("%d\n", r.nextInt());

		int [] ar = { 1, 2, 3, 4, 5, 6};
		int len = ar.length;
		int su = r.nextInt(len);	
		System.out.printf("%d\n", ar[su]);
		//System.out.printf("%d\n", ar[r.nextInt(ar.length)]);
		
		//nextInt(정수)는 정수로 나눈 나머지에서 랜덤하게 숫자를 리턴
		//System.out.printf("%d\n", r.nextInt(5));
	*/
	/*
	     //빨강, 파랑, 노랑, 초록 네가지 중의 하나가 랜덤하게 나오도록 작성
		
		Random r = new Random();
		String [] colors = {"빨강", "파랑", "노랑", "초록"};
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}	
		System.out.printf("%s\n", colors[r.nextInt(colors.length)]);
		}
		*/
		StringTokenizer st = new StringTokenizer("동해물과 백두산이 마르고 닳도록");
		//hasMoreTokens 가 false를 리터할 때 까지 반복
		//데이터베이스에서 데아터를 가져와서 읽는 방법과 동일하기 때문에 중요
		while(st.hasMoreTokens()) {
			String e = st.nextToken();
			System.out.printf("%s\n", e);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
