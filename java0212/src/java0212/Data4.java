package java0212;

public class Data4 {

	public static void main(String[] args) {
		int a = 8;
		int b = 197;
		System.out.println(a);
		System.out.println(b);
		System.out.println("==========================");
		//다섯자리를 가지고 a를 출력하고 남는 자리는 0으로 채우기
		System.out.printf("%05d\n", a);
		System.out.printf("%05d\n", b);
		double d = 3.26566172;
		System.out.println(d);
		//소수 3째 자리까지 출력 - 4번째 자리에서 반올림
		System.out.printf("%.3f", d);
	}
}
