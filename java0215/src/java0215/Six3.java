package java0215;

public class Six3 {

	public static void main(String[] args) {
	    //배열을 생성하고 나중에 데이터를 대입 
		String [] girlGroup = new String[5];
		
		girlGroup[0] = "소녀시대";
		girlGroup[1] = "레드벨벳";
		girlGroup[2] = "트와이스";
		girlGroup[3] = "AOA";
		girlGroup[4] = "여자친구";
		
		//배열의 요소 출력
		/*
		System.out.printf("%s\n", girlGroup[0]);
		System.out.printf("%s\n", girlGroup[1]);
		System.out.printf("%s\n", girlGroup[2]);
		System.out.printf("%s\n", girlGroup[3]);
		System.out.printf("%s\n", girlGroup[4]);
		*/
		//동일한 문장이나 일정한 패턴을 갖는 문장을 반복문을 이용해서 작성하면
		//코드의 라인 수도 줄고 하나의 문장으로 처리할 수 있기 때문에 유지보수에 유리 
	
	
		
		//배열의 데이터 개수를 상수로 설정하면 배열의 데이터 개수가 변경될 때 같이 수정해야 함
		/*
		int i =0;
		 while(i<5) {
			 System.out.printf("%s\n", girlGroup[i]);
			 i = i + 1;
		 }
		 */
		
		// 배열의 데이토 개수를 상수로 직접 설정하지 않고 . length를 이용
		//while(i<5){ 를 while(i<girlGroup.length){ 로 바꿔서 쓰기
	/*
		int i =0;
		 while(i < girlGroup.length) {
			 System.out.printf("%s\n", girlGroup[i]);
			 i = i + 1;
		 }
		 */
		 //반복문 안에서 동일한 데이터를 접근하는 경우에
		 //이 데이터가 head에 생성된 데이터라면 가까운 곳으로 옮겨놓고 사용하는 것이 좋습니다
		
	/*
		int i =0;
		//heap의 데이터를 가까운 곳으로 옮기기
		//int size = girlGroup.length;     ------->이게 heap으로 옮긴거
		int size = girlGroup.length;
		 while(i < girlGroup.length) {
			 System.out.printf("%s\n", girlGroup[i]);
			 i = i + 1;
		 }
		*/
	
		//빠른 열거를 이용한 배열의 데이터 출력
		for(String temp : girlGroup) {
			System.out.printf("%s\n",temp);
		}
		
         //제일 빨라
		//[0],[1],이런거는 예를 들자면 집에서 뚝섬 다시 집왔다가 다시 서울숲 가는거고
		//컬렉션의 데이터 1개를 저장할 변수:컬렉션 은 집 뚝섬에서 바로 서울숲 가는거고
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
