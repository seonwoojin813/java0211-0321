package java0305;

public class Amazone {

	public static void main(String[] args) {
		int [] ar = {10, 30, 27, 34, 41};
		//28에서 가장 가까운 수
        //차의 최소값을 저장할 변수 - 값의 범위를 모를 때는 배열의 첫번째 데이터로 초기화
		int min = ar[0];
		//차의 최소값을 갖는 데이터를 저장할 변수
        int data = ar[0];
        
        //배열의 데이터 전체 순회
        for(int temp : ar) {
        	//28과의 차이를 구합니다.
        	int cha = 28 - temp;
        	//차가 음수이면 양수로 변경
        	if(cha < 0) {
        		cha = cha* -1;
        		
        	}
        	
        	//최소 값을 구할 때는 기존 최소값과 데이터를 비교해서
        	//데이터가 기존 최소값보다 작으면 최소값에 데이터를 대입
        	if(min > cha) {
        		min = cha;
        		//차가 최소가 될 때의 데이터를 data에 대입
        		data = temp;
        	}
        }
        
        System.out.printf("28에서 가장 가까운 데이터 : %d\n",  data);
	}

}
