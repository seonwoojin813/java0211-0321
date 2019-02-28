package java0227;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		//변수를 선언할 때 사용한 클래스나 인터페이스를 구현한 경우에는
		//변수를 아래처럼 상위 클래스나 인터페이스 타입으로 설정할 수 있습니다.
		Set<String> set = new TreeSet<String>();
		//Set<String> set = new HashSet<String>();은 그냥 해시코드 순으로 나오는데 어떻게 나올지는 몰라
		//Set<String> set = new HashSet<String>();을
		//Set<String> set = new LinkedHashSet<String>();으로 바꾸면 쓴 순서대로
		//Set<String> set = new HashSet<String>();을
		//Set<String> set = new TreeSet<String>();으로 바꾸면 sort해서 순서대로 나와
		//자료구조는 정말 중요해 공부해야해 
		
		set.add("Korea");
		set.add("Japan");
		set.add("Portugal");
		set.add("Spain");
		set.add("England");
		set.add("Korea");
		
		//모든 데이터를 접근
		for(String nation : set){
			System.out.printf("%s\n", nation);
		}
	}

}
