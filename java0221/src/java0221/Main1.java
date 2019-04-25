package java0221;

public class Main1 {

	public static void main(String[] args) {
		
		//int []br = null;
		//System.out.printf("%d\n",br.length);
		//NullPointerException 확인하는법
		//마우스 오른쪽 toogle breakpoint찍고 더버깅 확인 
		//NullPointerException - 참조형 변수에 null이 저장되어 있는데
		//.을 이용해서 멤버를 호출할 때 발생하는 예외
        // 변수에 저장된 인스턴스 참조가 있는지 확인		
		
		int a = 10;
		System.out.printf("a:%d\n", a);
		//디버깅하기전에 런을 눌러서 보고
		//브레이크 포인트 찍고 위의 창 런눌러서 디버그 클릭
		//id가 있으면 참조형 없으면 밸류형
		//id는 Hashcode라고도 함 
		
		int[] ar = {100,200,300};
		System.out.printf("ar[0]:%d\n", ar[0]);
		// ArrayIndexOutOfBoundsException 확인하는법
		//System.out.printf("ar[3]:%d\n", ar[3]);
		//실수로 3을 집어넣었어 이럴땐
        // 데이터가 3개라서 0-2번까지만 존재하는데 범위를 넘어섰습니다.
		//이런경우 ArrayIndexOutOfBoundsException입니다.
		//인덱스를 수정해서 해결해야 합니다.
	
		/*	
		String num1 = "176";
		String num2 = "2 3";
		int n1 = Integer.parseInt(num1);
		int n2 =  Integer.parseInt(num2);
		//NumberFormatException 확인
	     */
		
		try {
		int r = 100/0;
		System.out.printf("r:%d\n", r);
          }catch(Exception e) {
        		System.out.printf("예외가 발생했습니다\n");
          }	    
        		System.out.printf("정상적으로 종료\n");
       	//	System.out.printf("정상적으로 종료\n");
		//이문장은 정상적으로 수행되지않아
		//try{
        // }
		//catch(Exception e){
		//System.out.printf("예외가발생합니다\n"); 
        //} ---->이걸 넣어줘야 정상적으로 실행
        //예외가 발생된 메소드 내에서 처리하는 방법(try, catch 절 사용)
        //catch에서 (Exception e) 이 (예외타입1 매개변수1) 부분은 다르게 쓰면 무제한으로 사용 가능
      	
    }
 }