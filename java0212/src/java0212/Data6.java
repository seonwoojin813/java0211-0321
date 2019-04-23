package java0212;

public class Data6 {

	public static void main(String[] args) {
		int a = 10;
		a++;
		System.out.printf("a:%d\n", a); //11
		a--;
		System.out.printf("a:%d\n", a); //10
		
		System.out.printf("a:%d\n", a++); //10을 출력하고 a의 값을 11로 만듬
		System.out.printf("a:%d\n", a--);//a의 값을 12로 만들고 출력

		//연산 도중에 ++나 --를 사용하면 코드의 가독성(읽기 쉬운 정도)가 떨어집니다.
		//이런 형태의 구문은 사용하지 않는 것을 권장 
        a = 10;
		int result = a++ + a++;
		System.out.printf("result:%d\n", result);

	}

}
