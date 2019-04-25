package java0219;

public class MethodClass {
	//static 메소드 - 클래스 이름으로 호출할 수 있는 메소드
	//인스턴스 변수를 사용할 수 없습니다.
	//this가 없기 때문입니다.
	//	private int age;
	private int age = 49;
	// 값을 넣고 this
	private boolean gender;
	
	
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public static void staticMethod() {
		//인스턴스 변수를 호출하면 에러
		//age = 10;
		System.out.printf("static method\n");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//변수 앞에 this가 있으면 메소드 외부에서부터 찾고 this가 없으면
	//메소드 안에서부터 찾습니다.
	public void thisTest() {
		int age = 47;
		System.out.printf("age:%d\n", age);
		System.out.printf("this.age:%d\n", this.age);
	}
	
	
	
	
              //return이 없는 더하기 메소드
	public void addNoReturn(int a, int b) {
		int result = a + b;
		System.out.printf("덧셈 결과:%d\n", result);
		//return : 메소드의 수행을 종료하고 호출한 곳으로 이동하는 명령어
		return;
		//System.out.printf("실행안되는 문장\n');

	}
	//return 이 있는 메소드
	public int addReturn(int a, int b) {
		return a + b;
	}
	
	//재귀를 이용하지 않고 1부터  n 까지의 합계
	public int sumRecursion(int n) {
	int sum =0;
	for(int i =0; i<=n; i=i+1) {
		sum = sum + 1;
	}
	              return sum;
	}
	//재귀를 이용해서 1부터 n까지의 합계를 구해주는 메소드
	public int sumNoRecursion(int n) {
		           if (n == 1) {
		        	   return 1;
		           }else {
		        	   return n + sumRecursion(n-1);
		           }
	}
                   //피보나치 수열 - 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
	              //처음 2개의 항은 1
	             //3번째 항 부터는 이전 2개 항의 합
	            //검색에 많이 이용되는 수열입니다
      public int fibonacci(int n) {
    	  if(n == 1 ||n == 2) {
    		  //if 문장의 마지막이 return일 때는 else가 필요없음
    		  return 1;
    	  }
    	  return fibonacci(n - 1) + fibonacci(n - 2);
      }
	
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
	}

