package poiymorphism;

              //상속받기 위해서 만든것 
              // 인스턴스를 생성할 수 없도록 abstract 키워드 추가 
         public abstract class Starcraft {
             //이 메소드는 실제 사용하기 위해서 만든 메소드가 아니고
        	 //오버라이딩을 하기 위해서 만든 메소드
        	 //이 메소드는 내용을 가질 필요가 없습니다.
        	 //이런 메소드는 결과형 앞에 abstract를 추가해서 추상 메소드로 만들 수
        	 //있습니다
        	 //추상메소드는 추상 클래스나 인터페이스에만 존재할 수 있습니다.
             //이 메소드는 하위 클래스에서 반드시 오버라이딩을 해야합니다.        
        	
        	 
        	 // public abstract void attack() {
        	 //통일되게 하려고 쓴거 
        	 public abstract void attack() ;
 
    	   
       
}
