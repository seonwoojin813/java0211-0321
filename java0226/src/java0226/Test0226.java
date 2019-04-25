package java0226;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test0226 {

	public static void main(String[] args) {
	   /*
		//정렬은 ArrayDeque가 좋아 //메모리 아끼려면 배열
	    //정수를 저장할 리스트를 생성
		  
		   ArrayList<Integer>lotto = new 	ArrayList<Integer>();
		   Scanner sc = new Scanner(System.in);
		
		    for(int i = 0; i < 6; i = i + 1) {
			System.out.printf("정수입력 - %d번째:", i+1);
			int su = sc.nextInt();
			//1부터 45까지가 아니라면
			if(su < 1 || su > 45 ) {
			//다시 입력	
			System.out.printf("1부터 45사이의 숫자만 입력하세요!\n");
			i = i - 1;
		    continue;
		    //무효처리해서 for문으로 돌아가
			}
			//중복 체크해서 이전에 입력된 값이면 다시 입력
			//이전에 입력된 모든 데이터와 비교해서 동일한 데이터가 있으면 중복
			//중복체크를 위한변수
			int j;
			//반복문은 j가 i가 되면 중단
			for(j=0; j<i; j=j+1) {
				//데이터가 중복되면 반복문을 종료
				if(su == lotto.get(j)) {
					break;
				}
			}
			//반복문이 끝까지 수행되지 않았다면 데이터가 중복
			if(i != j) {
				System.out.printf("이전과 동일한 데이터가 입력되었습니다.\n" + "다시 입력해 주세요.\n");
				i = i - 1;
				continue;
			
			//위에꺼랑 같아 - 밑은 flag쓴거 위는 flag안쓴거
		    /*int flag = 0;
			for(int j=0; j<i; j=j+1) {
				if(su == lotto.get(j)) {
					flag = 1;
					break;
				}
			 }
			//중복 체크
			if(flag == 1 ) {
				System.out.printf("이전과 동일한 데이터가 입력되었습니다.\n" + "다시 입력해 주세요.\n");
				i = i - 1;
				continue;
				*/
	/*
	}
	
			lotto.add(su);
		    }
		 
		    //데이터 정렬
		    Comparator<Integer> comp = new Comparator<Integer>(){

				@Override
				public int compare(Integer o1, Integer o2) {
					return o1 - o2;
				}
		    	
		    };
		    lotto.sort(comp);
		    
		    for(Integer temp : lotto) {
			System.out.printf("%d\t", temp);
		    }
		
		    sc.close();
	    */
		
		
	      	   //Set을 써서 만들어 보기
		       //정수를 저장할 Set을생성
		       Set<Integer>lotto = new TreeSet<Integer>();
			   Scanner sc = new Scanner(System.in);
			
			    while(lotto.size() !=  6) {
				System.out.printf("번호입력 : ");
				int su = sc.nextInt();
				//1부터 45까지가 아니라면
				if(su < 1 || su > 45 ) {
				//다시 입력	
				System.out.printf("1부터 45사이의 숫자만 입력하세요!\n");
			    continue;
				}
			    if(lotto.add(su)==false) {
				System.out.printf("중복된 번호입니다. \n");
			    }		
			    }
			    
			    for(Integer temp : lotto) {
				System.out.printf("%d\t", temp);
			    }
			
			    sc.close();
		        }
	            }


