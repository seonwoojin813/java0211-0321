package java0227;

import java.util.HashMap;
import java.util.Map;

public class DoubleArray {

	public static void main(String[] args) {
		//프로축구의 각 팀의 선수명단
		String [] seoul = {"박주영", "하대성", "오스마르", "고요한"};
		String [] suwon = {"염기훈", "데얀"};
		String [] jeonbuk = {"이동국","이용"}; 
		//위 2개의 배열을 하나의 배열로 만들기  
		//배열안의 각 요소가 변경된 경우는 그대로 출력할수 있습니다.
		String [][] players  = {seoul,  suwon, jeonbuk};
		
		
		
		//팀이름과 선수 명단을 출력
		for(int i=0; i<players.length; i=i+1) {
			if(i == 0){
				System.out.printf("서울\n");
			}else {
				System.out.printf("수원\n");
			}
			//각 팀의 선수 명단 가져오기
			String [] player = players[i];
			//배열을 순회해서 출력
			for(String temp : player) {
				System.out.printf("\t%s\n", temp);
			}
		}
		System.out.printf("===============\n");
		System.out.printf("===============\n");
		//각 배열을 Map으로 저장
		Map<String, Object>map1 = new HashMap<String, Object>();
		//팀 이름을 team 이라는 키로 저장
		map1.put("team", "서울");
		//선수명단 배열을 player라는 키로 저장
		map1.put("player", seoul);
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("team", "수원");
		map2.put("player", suwon);
		
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("team", "전북");
		map3.put("player", jeonbuk);
		
		//Map의 배열을 생성
		//Map<String, Object> [] kleague = {map1, map2}; 이거를 밑에처럼 써도 상관없다
		Map [] kleague = {map1, map2, map3};
		
		for(Map map : kleague) {
	    //팀이름 출력
		System.out.printf("%s\n",map.get("team"));
		//Map에서 데이터를 가져와서 출력하지 않고 사용을 할 때는
		//원래의 자료형으로 형 변환해서 사용해야 합니다.
		//형 변환을 하지 않으면 Object 타입이 됩니다.
		String [ ] temp = (String  [ ])map.get("player");
		for(String imsi :  temp) {
		System.out.printf("\t%s\n", imsi);
		}
		}
	}

}
