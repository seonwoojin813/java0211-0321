package java0227;

import java.util.ArrayList;
import java.util.Comparator;

public class PrimeList {

	public static void main(String[] args) {
		//2부터 100까지 소수를 찾아서 ArrayList에 저장하고 내림차순으로 출력
		//소수는 2부터 자신의 절반이 되는 숫자까지 나누어 떨어지지 않으면 소수
		
		
		  //정수를 저장할 수 있는 ArrayList를 생성
		  ArrayList<Integer> primeList = new 	ArrayList<Integer>();
		  
		  //2부터 100까지
		  for(int i =2; i<=100; i=i+1) {
			  //나누어 떨어졌는지 확인하기 위한 변수
			  int flag = 0;
			  
			//2부터 자신의 절반까지
			  for(int j =2; j< i/2; j=j+1) {
				 if (i%j == 0) { // i%j == 0 이게 나누어 떨어진다.
                    flag = 1;
					 break;
                    //나누어 떨어지면 반복문 중단      
					 
					 //완전수는 브레이크말고 여기서 합계구해야하고
				 }
			  }
			  //나누어 떨어진 적이 없으면 소수 이므로 리스트에 추가
			  if(flag == 0) {
				  primeList.add(i);
				  //완전수 합계가 i랑 같냐하면 완전수나와
			  }
		  }
		  Comparator<Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			     }
			};
			
		  primeList.sort(comp);
		  System.out.printf("%s\n",  primeList);
		   
		   }
	}


