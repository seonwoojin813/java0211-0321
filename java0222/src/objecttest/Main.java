package objecttest;

public class Main {

	public static void main(String[] args) {
		// VO 클래스의 인스턴스 생성 : 매개변수가 있는 생성자를 호출
		VO vo = new VO(1,"게시판 테스트 제목","게시판 내용 테스트");
		//toStrin 메소드는 인스턴스의 내용을 문자열로 리턴해주는 메소드
		System.out.printf("%s\n", vo.toString());
		//출쳑하는 메소드의 인스턴스이름을 대입하면 toString을 호출
		System.out.printf("%s\n", vo);
		//두개 결과가 같아---toString을 안쓰고 인스턴스만 쓰고도 가능
		
		
		
		
		
		
	}

}
