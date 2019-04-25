package anoymous;

  //korea 클래스를 상속받은 Asia 클래스
public class Asia extends Korea implements Chiness {

	//Chiness interface만들고
	//public class Asia extends Korea 에다가
	//implements Chiness를 써 --->에러 
	//마우스를 아시아에 가져다대면 add~ 나와 그거 클릭
	 
	//상위 클래스의 메소드를 재정의(Override) 
	@Override
	public void food() {
                   System.out.printf("상위 클래스의 메소드 재정의\n");		

	}

	@Override
	public void method() {
		System.out.printf("인터페이스의 메소드 구현\n");	
		
	}

}
