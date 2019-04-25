package java0215;

public class Six {

	public static void main(String[] args) {
		// 배열을 선언한 후 나중에 메모리 할당하기
		int [ ] ar1 =  null;
		//배열의 이름만 만든 경우(참조형 변수를 선언만 한 경우)
		//.을 이용해서 다른 멤버를 호출하면 NULLPointerException이 발생합니다.
		// NULLPointerException은 참조형 변수가 데이터를 생성하지 않은 상태에서 이용
		//System.out.printf("데이터 개수:%d\n", ar1.length);
		
		ar1 = new int[3];
		//위처럼 배열을 만들게 되면 각 요소는 전부 0 또는 0.0, false, null로 채워집니다.
		
		//배열을 선언하면서 크기를 설정
		int [] ar2 = new int[4];
		
		//초기 데이터를 가지고 있는 경우 배열에 초기데이터를 대입해서 바로 생성
		String [] nation = {"대한민국","뉴질랜드","중국","영국"};
		
		//배열이름.length를 하게되면 배열의 데이터 개수가 리턴됩니다.
		System.out.printf("배열의 데이터 개수:%d\n", nation.length);
		
		//배열의 요소를 접근할 때는 배열이름[인덱스]
		//인덱스는 0부터 length-1까지 입니다.
		//2번째 요소 출력
		System.out.printf("배열의 2번째 요소:%s\n", nation[1]);
		
		//배열의 다섯번째 요소를 출력
		//배열에는 데이터가 4개만 존재합니다.
		//없는 인덱스에 접근하는 것이 됩니다.
		//이런 경우에는 ArranIndexOutOfBoundsException이 발생합니다.
		//System.out.printf("데이터 개수:%d\n", nation[4]);
		
		//배열의 데이터를 변경하고자 하면 배열 요소에 데이터를 대입하면 됩니다.
		nation[2] = "독일";
		
		//배열의 데이터를 삭제하고 싶으면 - 배열이름에 nulll을 대입하면 됩니다.
		ar2 = null;
		
		
	}

}
