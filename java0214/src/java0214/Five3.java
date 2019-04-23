package java0214;

public class Five3 {

	public static void main(String[] args) {
		//Hello Java를 3번 출력
		System.out.printf("Hello Java\n");
		System.out.printf("Hello Java\n");
		System.out.printf("Hello Java\n");
		
		System.out.printf("=========================\n");
		
		int i;
		//i가 3보다 작지 않을 때까지 1씩 증가하면서 {}의 내용을 수행
		//i<3을 생략해도 되긴 하지만 생략해버리면 실행했을 때 Hello Java가 계속 찍힌다
		for(i=0; i<3; i=i+1) {
			System.out.printf("Hello Java\n");
		}
		System.out.printf("=========================\n");
		
		//0부터 2까지 순서대로: 0, 1, 2----->여기는 그냥 밑에 i라고 씀
		//1,2,3을 출력--->밑에 i에다가 +1
		//0, 2, 4르르 출력하도록 변경 --->i<5, i=i+2해도 되고 i<3, 밑에 i*2해도 됨
		for(i=0; i<3; i=i+1) {
			System.out.printf("i:%d\n", i*2);
	}
		
	}
}
