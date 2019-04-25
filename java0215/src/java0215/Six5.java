package java0215;

public class Six5 {

	public static void main(String[] args) {
		// 모든 행의 크기가 동일한 2차원 배열
		//사람 이름 20개를 묶어서 5개 그룹을 저장할 수 있는 배열을 생성 
          String [][] names = new String [5][20];
                      
          
          
          
          
          
          
          //행별로 열의 크기가 다른 2차원 배열 
          //학생들의 점수 (정수) 첫번째 그룹은 28개 두번째 그룹은 33개 
          //3번째 그룹은 31개를 저장할 수 있도록 배열을 생성하기
        /*
          int [][] scores = new int [3][];
         scores[0] = new int[28];
         scores[1] = new int[33];
         scores[2] = new int[31];
         /*
         System.out.printf("%d\n", scores.length);
         System.out.printf("%d\n", scores[0].length);
         //System.out.printf("%d\n", scores[0][0].length);
         //이건 안되
        */
        /*
         System.out.printf("%s\n", scores);
         System.out.printf("%s\n", scores[0]);  
         System.out.printf("%s\n", scores[0][0]);
          
          */
          
        
      //초기 데이터를 가지고 2차원 배열을 생성
         /*
          String [][] players = { { "호날두", "메시","루니"},
         {"제라드", "스콜스","램파드"},
         {"라모스", "반데이크", "바란"}};
         */
         
         //위의 데이터 전체를 출력
         /*
         for(int i=0; i<3; i= i+1) {
        	 for(int j =0; j<3; j=j+1) {
        		 System.out.printf("%10s", player[i][j]);
        	 }
        	 System.out.printf("\n");
         }
         */
         /*
         int rowSize = players.length;
         for(int i=0; i<rowsize; i= i+1) {
        	  int colSize = players[i].length;
        	 for(int j =0; j<rowsize; j=j+1) { 
        		 System.out.printf("%10s", players[i][j]);
        	 }
        	 System.out.printf("\n");
         }
         */
         
      //빠른 열거를 이용해서 출력   
      
         /*
         for(String [] imsi : players) {
        	 for(String temp : imsi) {
        		 System.out.printf("%10s", temp);
        	 } 
        	   System.out.printf("\n");
         }
         */
       
         
          
          
          
          
          /*
          String[][] players = { { "호날두","루니","박지성"},
        		  {"긱스", "캐릭", "스콜스"},
        		  {"에브라","퍼디난드","비디치", "네빌"},
        		  {"반데사르"}};
           for(String [] imsi :  players){
           for(String temp : imsi) {
           System.out.printf("%10s", temp);
           }
            System.out.printf("\n");
          }
          
          */
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
	}
}
