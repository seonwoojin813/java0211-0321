package java0212;

public class Data3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		//a 와 b 가 사용하고 있는 데이터의 위치 확인 -2개의 값이 다르므로 다른코드
         System.out.println("a:" + System.identityHashCode(a)); 
         System.out.println("b:" + System.identityHashCode(b));
         int c = 10;
         //a 와 동일한 값을 가리키므로 a 와 같은 값이 나옵니다.
         System.out.println("c:" + System.identityHashCode(c)); 
         long d = 10;
         //값은 같지만 자료형이 달라서 다른 값이 나옵니다.
         System.out.println("d:" + System.identityHashCode(d)); 
	}
}
