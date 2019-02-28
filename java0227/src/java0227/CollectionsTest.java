package java0227;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		//Collections 클래스의 static 메소드를 이용하면
		//List, Set, Map에 작업을 수행할 수 있습니다.
		//reverse, shuffle, unmodifybleList 등의 메소드가 있습니다.
		List<String> list = new ArrayList<String>();
		list.add("크리스티아누 호날두");
		list.add("리오넬 메시");
		list.add("킬리안 음바페");
		list.add("폴 포그바");
		list.add("로베르토 레반도프스키");
		
		//Collections.reverse(list);
		//System.out.printf("%s\n", list);
	
		   //데이터를 섞어주는 함수 호출
		   Collections.shuffle(list);
	       System.out.printf("%s\n", list);
         
	       //읽기 전용의 리스트 만들기
	       List<String> readOnlyList = Collections.unmodifiableList(list);
	       readOnlyList.add("웨인 루니");
	       // List<String> readOnlyList = Collections.unmodifiableList(list);
	       // readOnlyList.add("웨인 루니");
	       //이거는 끝나는 문장이라 추가가 안되 final이라고 생각하면되
	}

}
