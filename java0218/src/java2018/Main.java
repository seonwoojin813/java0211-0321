package java2018;

public class Main {

	public static void main(String[] args) {
		/*
		//Sample 클래스의 인스턴스 만들기
		Sample obj = new Sample();
		//obj를 출력 - 클래스의 이름과 해시코드가 출력 됩니다.
		System.out.println(obj);
		
		/*
		int i;    //이것은 지역변수
		
		for( i = 0; i<10; i=i+1) {
			//for(int i = 0; i<10; i=i+1) 여기서 int 쓰면 안되 에러나
		
         		}
		          for(int j = 0; j<10; j=j+1) {

	               }
		                               int j = 1;
	//안에서 j는 못 만들지만 밖에서 j는 만들 수 있어
*/
		
	/*	
		obj.name = "아이린";
		//static이 붙지않은 변수는 인스턴스 별로 별도로 같습니다
		obj.schooLName = "SM";
		//static 변수는 하나만 만들어서 공유합니다.
		
		Sample ins = new  Sample();
		ins.name = "수지";
		ins.schooLName = "JYP";
	       System.out.println(obj.name);
		   System.out.println(ins.name);
		   
		   System.out.println(obj.schooLName);
		   System.out.println(ins.schooLName);
		   System.out.println(Sample.schooLName);
	
	       //final이 붙으면 수정을 할 수 없음.
		   //final이 붙은 변수의 이름은 전부 대문자로 해서 구분
		   final int TEN = 10;
	             //TEN= 20;
		   System.out.println(TEN);
            */	
	
	          // MethodClass 의 Instance 생성
	             MethodClass obj = new MethodClass();
	             //메소드 호출
	             obj.disp();
	             System.out.println("=================");
	             obj.disp();
     //매개변수가 있는 메소드를 호출할 때는 매개변수를 대입해서 호출해야 합니다.
	             obj.argDisp(2);
	             obj.argDisp("Hello OOP", 4);
	             System.out.println("=================");
	      //매개변수가 ... 으로 되어 있으면 매개변수 개수에 상관없이 대입 가능       
	      // printf에서 씀       
	      obj.varagsSum(10, 30);
	      obj.varagsSum(10, 30, 42);
	      obj.varagsSum(10, 30, 25, 89);
	      System.out.println("=================");
	   
	      
	      int a = 10;
	      int [] ar = {100,200,300};
	      //value 타입을 전달하므로 a의 값은 변경되지 않습니다
	      obj.inc(a); 
	      //reference 타입을 전달하므로 ar의 데이터가 변경되었을 수 있습니다.
	      obj.inc(ar);
	      System.out.printf("a:%d\n", a);
	      System.out.printf("ar[0]:%d\n", ar[0]);
	      System.out.println("=================");       
	      
	      int [] xr = {37, 87, 29, 65, 47};
	      for(int temp : xr) {
	    	  System.out.printf("%d\t",  temp);
	      }  
	    	  System.out.printf("\n");
	    	  //데이터 정렬
                  obj.selectionSort(xr);
                  for(int temp : xr) {
                	  System.out.printf("%d\t", temp);
                  }
	    	  
	      
	            
	}
                     }