package java0226;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  VO [] data = new VO[3];
		  VO vo = new VO(1, "swj123", "1234", "손흥민", 28);
          data[0] = vo;
          
          vo = new VO(2, "swj1234", "5678", "기성용", 32);
          data[1] = vo;
          
          vo = new VO(3, "swj", "9999", "선우진", 26);
          data[2] = vo;
          
          //배열의 데이터 확인
          for(VO temp : data){
        	  System.out.printf("%s\n", temp);
          }
          
          //배열의 데이터 정렬 - data의 구성요소 자료형인 VO 클래스가
          //Comparable 인터페이스를 implements 하지 않았으면 예외발생
          Arrays.sort(data);
          System.out.printf("=========정렬 후========\n");
          //배열의 데이터 확인
          for(VO temp : data) {
          System.out.printf("%s\n", temp);
          
	      }
	
           System.out.printf("=========정렬 후========\n");
        
        
           //VO 타입을 비교할 수있는 Comparator 인터페이스의
           //Anonymous Class -> Instance
           Comparator <VO> numAscComp = new Comparator<VO>() { //번호에 오름차순
           // Comparator <VO> numDescComp = new Comparator<VO>() //번호에 내림차순
           //return o2.getNum() - o1.getNum();
           //크기 비교할 때 사용하는 메소드
		    public int compare(VO o1 , VO o2) {
    	    return o1.getNum() - o2.getNum();
		    }
            };   
        
           Comparator <VO> numDescComp = new Comparator<VO>() { //번호에 오름차순
            // Comparator <VO> numDescComp = new Comparator<VO>() //번호에 내림차순
            //return o2.getNum() - o1.getNum();
            //크기 비교할 때 사용하는 메소드
     		public int compare(VO o1 , VO o2) {
            return o2.getNum() - o1.getNum();
     		 }
             };   
        
            //name의 오름차순 정렬을 할 수 있는 comparator
            Comparator<VO>nameAscComp = new Comparator<VO>() {
            @Override
			public int compare(VO o1, VO o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
			}
            };  
        
            //name의 내림차순 정렬을 할 수있는 comparator
        
            Comparator<VO>nameDescComp = new Comparator<VO>() {
 			@Override
 			public int compare(VO o1, VO o2) {
 			// TODO Auto-generated method stub
 			return o2.getName().compareTo(o1.getName());
 			}
            };
       
            //1번부터 4번까지 입력을 받기 위한 코드를 작성
            Scanner sc = new Scanner(System.in);
            System.out.printf("정렬할 조건을 선택(1-4)\n(1:번호오름차순 2:번호내림차순 3:번호오름차순 4:번호내림차순)");
            final int 번호오름차순 = 1;
            final int 번호내림차순 = 2;
            final int 이름오름차순 = 3;
            final int 이름내림차순 = 4;
            int input = sc.nextInt();
            Comparator <VO> comparator = numAscComp;
            switch(input) {
            case  1:
            	comparator = numAscComp;
            	break;
            case  2:
            	comparator = numDescComp;
            	break;
            case  3:
            	comparator = nameAscComp;
            	break;	
            case  4:
            	comparator = nameDescComp;
            	break;
             default:
            	System.out.printf("잘못된 메뉴 선택입니다\n");
              }
            //배열 정렬
            Arrays.sort(data,comparator);
            //배열의 데이터 확인
            for (VO temp : data) {
            	System.out.printf("%s\n", temp);
            }
            
             sc.close();
            
            /*   
            //비교할 수 있는 인스턴스를 대입해서 정렬
            Arrays.sort(data, numAscComp);
            for (VO temp : data) {
            System.out.printf("%s\n", temp);
            }
            */
             
             int [] ar = { 20, 30, 50, 10, 40,70, 60};
             //20이 몇번째에 있는지 검색
             //정렬되어 있지 않아서 이분검색을 제대로 수행할 수 없습니다.
             int pos = Arrays.binarySearch(ar, 20);
             System.out.printf("20:%d번째\n", pos);
             
             // 데이터 정렬             
             Arrays.sort(ar);
             //{10, 20, 30, 40, 50, 60, 70}
             pos = Arrays.binarySearch(ar, 20);
             System.out.printf("20:%d번째\n", pos);
           
	         }

             }