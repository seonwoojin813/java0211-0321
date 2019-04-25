package objecttest;

public class StringCreate {

	public static void main(String[] args) {
		// String 클래스는 변하지 않는 문자열을 저장하는 클래스
		//작업을 할 때 원본을 복사해서 작업을 수행하고 결과를 리턴합니다.
		//+를 이용하면 다른 문자열이나 숫자를 붙여서 리턴합니다.
		
		String str = "선우진";
		//해시코드 출력
		System.out.printf("해시코드:%d\n", str.hashCode());
		str = str + "이름";
		//복사해서 작업한 후 리턴한 결과이므로 위의 해시코드와 다르게 나옴
		System.out.printf("해시코드:%d\n", str.hashCode());

		
		
		
		//StringBuilder 클래스는 변하는 문자열 저장에 사용하는 클래스
		//여분의 공간을 미리 확보해두었다가 자기 자신한테 작업
		StringBuilder sb = new StringBuilder("선우진");
		System.out.printf("해시코드:%d\n", str.hashCode());
		sb.append("이름");
		System.out.printf("해시코드:%d\n", str.hashCode());
		
	}

}
