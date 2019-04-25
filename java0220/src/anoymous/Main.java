package anoymous;

public class Main {

	public static void main(String[] args) {
		// Asia 클래스의 인스턴스를 생성
		       Asia asia = new Asia();
		       //메소드 호출
		       asia.food();
		       asia.method();
		       // Chiness 오버라이딩하고 Main으로 와서 asia.method(); 써주기 
		       
		       
		       
		       //일반적으로 상속을 받아서 메소드를 재정의해서 사용해야 하는 경우
		       //1.클래스를 상속받아서 메소드를 재정의
		       //2.인스턴스를 생성해서 메소드를 호출
		       //anonymous 패키지를 만들고 그다음에  Korea클래스 만들고 Asia 클래스를 만들어서 Korea상속 받고 Main 만들어서 메소드호출
                   
		       
		       
		       // new Korea(); --->이렇게 쓰면 에러  (코리아가 추상클래스라서 인스턴스 할수없다)
		      // new Korea() {
		       
	          //}; ----->이렇게 써도 에러 이럴땐 코리아에 마우스 대고 기다리면 add~ 그거 눌러
		       new Korea() {
               @Override
				public void food() {
				System.out.printf("Anonymous class를 이용한 클래스 상속\n");
						}
		       }.food();;
               //이렇게 할 수도 있어
		       //위 처럼 변수에 저장하지 않고 바로 메소드를 호출하면
		       //메소드를 1번 밖에 호출하지 못합니다.
		       
		       Korea korea =new Korea() {
	               @Override
					public void food() {
					System.out.printf("Anonymous class를 이용한 클래스 상속\n");
							}
			       };
			       korea.food();
		       //변수에 내용을 저장하고 변수를 이용해서 메소드를 호출
		       // ; 을 조심 주의
		       
		       
		    //인터페이스를 구현한 anonymous class를 만들어서 해결
			      /*
			         new 클래스이름이나 인터페이스이름() {
			       
			    	   메소드 재정의
			       }.메소드이름();
			   */
	
			    new Chiness() {

					@Override
					public void method() {
						System.out.printf("Anonymous class를 이용한 인터페이스 구현\n");
						
					}			       
	                }.method();
		      	 
    }
}
