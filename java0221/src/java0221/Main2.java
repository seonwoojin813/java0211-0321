package java0221;

public class Main2 {

	public static void main(String[] args) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//Thread.sleep(3000); ---> try밖에 있으면 에러 --> 2. 그러면 갖다대고 surround~눌러 이러면 위의 구문 생성
		
		/*
		1. 이 방법도 있지만
		try {
		Thread.sleep(3000);
		}
		catch(InterruptedException e) {}
		*/
           	
		
	try{	
		String str = "Hello World";
		//강제로  NumberFormatException을 발생시킴
		throw new  NumberFormatException();
		//String str = null;		
		//NullPointException 발생
		//System.out.printf("%s\n", str.toUpperCase());
		//정수로 변경하려다가 예외발생 - NumberFormatException
		//int n1 = Integer.parseInt ("2_2");
       	}
	   //NullPointerExceptiondl 발생했을 때 호출되는 블럭
	/*
	catch(NullPointerException e | NumberFormatException e) {
		System.out.printf("널 포인터 예외발생\n");
	   }
	//NumberFormatException 처리
	  catch(NumberFormatException e) {
		System.out.printf("정수로 변환을 하지 못하는 에외 발생\n");
	}*/
	/*
	//상위 클래스의 참조형 변수에는 하위 클래스 타입의 인스턴스 참조를
	//대입할 수 있습니다.
	//NumberFormatException 클래스와 NullPointerException 클래스는
	//모두RuntimeException 클래스의 참조형 변수에 대입이 가능합니다.
	//Exception으로 수정해도 동일한 결과가 나옵니다.
	catch(RuntimeException e ) {
		System.out.printf("%s\n", e.getMessage());
	}
	*/
	catch(Exception e ) {
	System.out.printf("%s\n", e.getMessage());
}

	
	//두개의 예외를 | 로 묶어서 처리
	/*catch(NullPointerException  | NumberFormatException e) {
		System.out.printf("%s\n", e.getMessage());
	}
	*/
	//finally는 예외 발생 여부에 상관없이 수행
	finally {
		System.out.printf("무조건 수행\n");
	}
	/*
	 while(true){
		}                          ---->에러
	*/
	//return;                  ---->에러
	
		System.out.printf("프로그램 종료\n");
	

}
}
