package java0219;

public class Main {

	public static void main(String[] args) {
	     /*
		//MethodClass의 Instance 생성
		MethodClass instance = new MethodClass();
		//return 이 없는 메소드 호출 - 여기서 흐름 중단
		 instance.addNoReturn(100, 200);
		 //return이 있는 메소드 호출
		 int r = instance.addReturn(100, 200);
		 r = instance.addReturn(r, 900);
		 System.out.printf("덧셈 결과:%d\n", r);
		   System.out.println("=================");
		 
		 System.out.printf("덧셈 결과:%d\n", 
				                              instance.addReturn(instance.addReturn(1000, 30000), 109890));
		 //메소드 안에서 메소드를 호풀하기 - 가능하지만 하지 않는 것이 좋습니다.
	System.out.printf("1000까지의 합 :%d\n",  instance.sumNoRecursion(1000));
	System.out.printf("1000까지의 합 :%d\n",  instance.sumRecursion(1000));
	   System.out.println("=================");
	
	   System.out.printf("10번째 피보나치 수열의 값 :%d\n", 
			instance.fibonacci( 10));
	System.out.printf("11번째 피보나치 수열의 값 :%d\n",  
			instance.fibonacci(11));
	//작은 연산을 수행할 때는 recursion이 별 문제가 없지만
	//많은 연산을 수행하는 경우 메모리가 부좃해지거나 연산속도가 느려집니다.

	//static 메소들 호출할 때는 클래스 이름으로 호출
	MethodClass.staticMethod();
	instance.thisTest();
	System.out.println("=================");
	
	double r1 = Math.random();
	System.out.printf("r1:%f\n", r1);
	
	java.util.Random random = new java.util.Random();
	int r2 = random.nextInt();
	System.out.printf("r2:%d\n", r2);
	
*/
	/*
	//인스턴스 생성
	//앞에 사용한 이름은 클래스 이름이고 new뒤에 사용한 이름은 생성자이름
	ConstructorClass obj1 = new ConstructorClass();
           	//obj1.setNum(1);
	         obj1.setName("아이린");
	         System.out.printf("obj1의 num:%d\n", obj1.getNum());
	
	ConstructorClass obj2 = new ConstructorClass();
	       //obj2.setNum(1);
	         obj2.setName("수지");
	         System.out.printf("obj2의 num:%d\n", obj2.getNum());
	
	         ConstructorClass obj3 = new ConstructorClass(3, "설현");
	         System.out.printf("obj3의 num:%d\n", obj3.getNum());
	*/
		/*
		Based b = new Based();
		//하위 클래스에서는 상위 클래스의 멤버를 전부 물려받습니다. 
		
		Derived d = new Derived();
		d.commonMethod();
		d.superMethod();
		d.subMethod();
		
		*/
	          
		     Based b = new Based();
		     //상위 클래스 타입으로 만들어진 참조형 변수에
		     //하위 클래스 타입의 인스턴스를 대입할 수 있습니다.
              Based x = new Derived();    
              //변수 왼쪽꺼를 가지고 부름 (부를 수있는건 왼쪽)(오버라이딩된거는 오른쪽)
              //애는 서브 메소드 안나와
                  x.commonMethod();
              
              //하위 클래스 타입으로 만들어진 참조형 변수에 상위 클래스 타입의
              //인스턴스 참조를 대입할 수는 없습니다.
              //이때는 강제 형 변환을 해서 대입해야 합니다.

              //에러는 아니지만 실행하면 예외 발생
              //원래의 자료형이 Based 이기 때문에
              // Derived d = (Derived)new Based(); ---->실행안되
              
              //인스턴스를 생성할 때 하위클래스 타입으로 만든 경우는
              //원래의 자료형으로 형 변환해도 예외가 발생하지 않습니다.
              Derived d = (Derived)x;
              //변수 왼쪽 꺼를 가지고 부름
              //얘는 다나와 커먼 서브 슈퍼 메소드
	
	
	
	}

}

