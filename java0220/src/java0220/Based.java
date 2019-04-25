package java0220;

//상위 클래스로 사용할 클래스
public class Based {
          //생성자를 만들지 않아도 아래 생성자가 있는 것으로 간주
	      //생성자를 만들면 이 생성자는 자동 소멸됩니다.
	      //public Based() {}
	
	           
	            public Based() {
		                         System.out.printf("매개변수가 없는 생성자\n");
	             }
                
	                 public Based (int a) {
		                                System.out.printf("매개변수가 있는 생성자\n");
		     }
	                      
	                 
	             public void superMethod() {
	            	 System.out.printf("상위 클래스에만 존재하는 메소드\n");
	             }
	             
	             public void overrideMethod() {
	            	 System.out.printf("상위 클래스에 있는 오버라이드 메소드\n");
	             }
	                 
	                 
	                 
	                 
	
}
