package java0212;

public class Data8 {

	public static void main(String[] args) {
  System.out.println("안녕하세요. \n선우진입니다.");
  
  int age = 26;
  double height = 173.3;
  char gender = 'M';
  
  System.out.println("나이는"+ age);
  System.out.println("키는"+ height);
  System.out.println("성별은"+ gender);
  System.out.println("오늘은 "+  2+ " 일차" +" 수업이였습니다.");
  
  byte b3= 30;
  byte b5= 50;
  int result = b3+b5; 
  System.out.println(result);

  int x = 40;
  byte a = (byte)x;
  System.out.println("a:"+a);

  int y =700;
  byte z =(byte) y;
  System.out.println("y:"+ y);
 //실수를 정수로 강제 형 변환하면 소수가 없어지게 됩니다.
  double d = -3.14;
  //실수를 정수에 대입할려면 강제로 정수 데이터로 변경해야합니다.
  x =(int)d;
  System.out.println("x:" + x);
  
  
  
 	  
	}

}
