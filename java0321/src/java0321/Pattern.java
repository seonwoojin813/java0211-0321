package java0321;

public class Pattern {
 //생성자를 private으로 생성해서 외부에서 new를 호출할 수 없도록 합니다.
	private Pattern() {
	//싱글 톤일때 여기다 적으면 딱한번만 수행됨
	}
	
	//자기 자신의 static 변수를 생성
	private static Pattern pattern;
	
	//인스턴스의 참조를 넘겨주는 static 메소드
	public static Pattern getInstance() {
		if(pattern == null) {
			pattern = new Pattern();
		}
		return pattern;
	}
	
}
