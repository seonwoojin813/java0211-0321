package poiymorphism;

public class Main {

	public static void main(String[] args) {
		    
		//Zerg zerg = new Zerg();
	    // zerg.attack();
		//상위클래스에 상속받게하기위해 바꾼거야
		//이대로 출력하면 attack에서 에러나 
		//그래서 상위클래스인 Starcraft에서 public void attack()를 넣어줘야해
		    Starcraft star  = new Zerg();
		    star.attack();
		    
		    //Protoss protoss = new Protoss();
		    //protoss.offence(); 이였는데 통일되게 attack으로 바꿔 
		    // protoss.attack();
		    //상위클래스에 상속받게하기위해 바꾼거야
		    //이대로 출력하면 attack에서 에러나 
			//그래서 상위클래스인 Starcraft에서 public void attack()를 넣어줘야해
		    star = new Protoss();
		    star.attack();
		   
		    
		    
		    
		    //Terran terran = new Terran();
		    // terran.공격(); 이였는데 통일되게 attack으로 바꿔 
		    // terran.attack();
		    //상위클래스에 상속받게하기위해 바꾼거야
		    //이대로 출력하면 attack에서 에러나 
			//그래서 상위클래스인 Starcraft에서 public void attack()를 넣어줘야해
		      star = new Terran();
		      star.attack();
		      
		      //Starcraft 클래스는 실제 사용을 위해서 만든 클래스가 아니고
		      //상속관계를 만들기 위해서 생성한 클래스입니다.
		      //이 클래스는 인스턴스를 생성할 필요가 없습니다.
		      //인스턴스를 생성하지 못하도록 할 때는 class 앞에 abstract를 추가해서
		      //추상 클래스로 만들어 주면 됩니다.
		      
		      //star = new Starcraft(); -----> Starcraft(상속받기위해서 만든 것)에서 abstract를 쓰고 출력하면 에러나 그때 이거 지워야해
	}

}
