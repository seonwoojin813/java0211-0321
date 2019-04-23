package java0214;

public class Five6 {

	public static void main(String[] args) {
		/*
		for(int i = 1; i<=10; i=i+1){
			//3의 배수가 되면 반복문을 종료 : 2번만 출력됩니다.
			if(i % 3 == 0) {
				break;
			}
		System.out.printf("i:%d\n",i);
		
	}
		*/
	/*
		//continue는 이번에 빼고 하고싶을때
		//break는 그만하고 싶을 때 ---->continue보다 더 많이 사용하게 됨
		for(int i = 1; i<=10; i=i+1){
			//3의 배수가 되면 아래 문장을 수행하지 않고 다음 반복으로 넘어갑니다.
			if(i % 3 == 0) {
				continue;
			}
		System.out.printf("i:%d\n",i);
		
	}
	*/
	
		
		//반복문 안에 반복문이 있는 중첩 반복문
		OUTER: for(int i = 0; i<3; i=i+1){
		System.out.printf("1:첫번째 반복문\n");
		for(int j = 0; j<3; j=j+1){
			System.out.printf("2:두번째 반복문\n");
			break OUTER;
			//break는 가장 가까운 switch 나 반복문에 영향을 줍니다.
			//break 나 continue 뒤에 레이블을 붙이면 레이블에 해당하는
			//제어문에 영향을 줍니다.
			//break;
			}
	
	
	
	}
	
	
	}
	
}
