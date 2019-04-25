package interfacetest;

//koreaFood 인터페이스로 구현한 클래스
//인터페이스는 2개 이상 구현이 가능합니다.
//public class Menu implements KoreaFood에  , ChinessFood를 써
public class Menu implements KoreaFood, ChinessFood {

	@Override
	 public void bulgoki() {
	      System.out.printf("소고기에 국물이 있는 음식\n");

	}

	@Override
	public void jjajangmyeon() {
		System.out.printf("면과 춘장을 같이 볶은 음식\n");
		//public class Menu implements KoreaFood, ChinessFood 이렇게 치면 메뉴에 에러
		//메뉴에 마우스 대고 add~눌러 그럼 위에처럼 나와
	}

}
