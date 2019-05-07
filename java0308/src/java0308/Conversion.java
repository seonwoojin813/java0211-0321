package java0308;

public class Conversion {

	public static void main(String[] args) {
		//정수를 입력 받아서 동일한 내용의 문자열로 변경하고 문자열을 정수로 변경하도록 작성
		//정수를 문자열로 변경하는 메소드나 문자열을 정수로 변경하는 메소드 사용은 안됨
		
		//1234->"1234" charAt(), length(), 문자열 더하기는 + 만 이용
		//"1234"->1234
		//남기고 싶을 때는 나머지
		
		int su = 987625;
		String str =  " ";
		while(su != 0) {
		int nmg = su % 10;
		str = nmg + str;
		su = su / 10;
		}
      System.out.println(str);
      
      for(int i=0; i<str.length(); i=i+1) {
    	  //가져온 것은 문자라서 48이 더해진 코드가 옵니다.
    	  //숫자로 변경할 때는 48을 빼주어야합니다.
    	  char ch = str.charAt(i);
    	  su = su * 10 + (ch-48);
      }
      
      System.out.println(su);
	}
    
}
