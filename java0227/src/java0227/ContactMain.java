package java0227;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ContactMain {

	public static void main(String[] args) {
		// Contact 클래스의 인스턴스 만들기
		//클래스의 변수가 1개인 경우 첫글자만 소문자로 변경해서
		//사용하는 경우가 있습니다.
		Contact contact = new Contact(1, "선우진", "01031687813");
		
         //구성요소를 하나씩 출력
		System.out.printf("번호:%s\n", contact.getNum());
		System.out.printf("이름:%s\n", contact.getName());
		System.out.printf("전화번호:%s\n", contact.getPhone()); // Phone를 Moblie로 바꿔줘야해
		
		
		//동일한 데이터를 Map을 이용해서 저장
		Map<String, Object> map = new HashMap<String, Object>();
		//출력하면 순서 아무렇게나와
		//	Map<String, Object> map = new HashMap<String, Object>();을 
	    //Map<String, Object> map = new LinkedHashMap<String, Object>();
		//으로 바꿔서 출력하면 저장한 순서로 저장
		
		//	Map<String, Object> map = new HashMap<String, Object>();을
		//	Map<String, Object> map = new TreeMap<String, Object>();
		//로 바꿔서 출력하면 sort해서 정렬
		
		//여러명이 할 때는 map을 잘안쓰지만 혼자할 때는 map을 쓴다  
		
		map.put("num", 1);
		map.put("name", "선우진");
		map.put("Phone", "01031687813");
		//Phone를 moblie로 바꾸고 출력하는 부분을 바꿀 필요없이 출력
		//map의 key가 변경되더라도 출력하는 부분을 수정할 필요가 없습니다.
		map.put("hometown", "korea");
		//새로 추가
		
		//key의 이름을 직접 입력하지 않고 출력
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.printf("%s:%s\n", key, map.get(key)); 	
		}
	}

}
