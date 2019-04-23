package java0213;

public class Data8 {

	public static void main(String[] args) {
	  int a = 5;
	  //a가 3보다 크면 크다라고 출력
	  //3보다 작을 때는 아무일도 하지 않음
	  //if 쓸때가 언제냐면 ~하면 ~해라 할때
	  /*
	  if(a > 3) {
		  System.out.printf("크다\n");
	  }
      */
	  
	
	  //a가 3보다 크다면 크다라고 출력하고 그렇지 않으면 작다라고 출력
	  /*
	  if(a > 3) {
		  System.out.printf("크다\n");
	        }
		  else {
				  System.out.printf("작다\n");
				  }
				  */
	
	  
	  //0-3까지이면 작은 수, 4-6까지이면 보통수, 그 이외는 큰 수라고 출력
         if(a>= 0 && a <=3) {
        	  System.out.printf("작은 수\n");
         }
        	  else if(a >= 4 &&a <= 6) {
         			  System.out.printf("보통 수\n");
        	  }
        	  else {
        		   System.out.printf("큰 수\n");
        	  }
        	  
	
	
	
	}
	
	

}
