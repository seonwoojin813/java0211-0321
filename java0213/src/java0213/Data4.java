package java0213;

public class Data4 {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 5;
		//n1 과 n2 중 큰 수 찾기
		int result = n1 >n2 ? n1 :n2;
		System.out.printf("result:%d\n", result);
		
		//성별은 F 또는 M으로 저장
		char gender = 'M';
		//gender가 M 이면 남자라고 출력하고 F이면 여자라고 출력
		//삼항 연산자 이용해서 해결
		//String x = gender == 'M'? "남자" : "여자";
		
		//소문자 m도 남자라고 나오도록 변경
		String x = gender == 'M' || gender == 'm'? "남자" : "여자";
		// || (또는)이란 말을 주어서 
	    
		System.out.printf("성별:%s\n", x);
		
		//정수 변수에 0-100까지의 숫자를 저장하고
		//60이상이면 합격 그렇지 않으면 불합격이라고 출력
		int score = 80;
				x = score >= 60?"합격" : "불합격";
				System.out.printf("합격여부:%s\n", x);
		       
				//score가 80이상이면 우수 60이상이면 보통 그 이하는 저조라고 출력
	           x = score >= 80?"우수" :  (score >= 60?"보통" : "저조");
	        	   System.out.printf("등급:%s\n", x);
	        	   //	x = score >= 60?"합격" : "불합격"; - > 60을 80으로 바꾸고 합격을 우수로 바꾼뒤에 불합격 부분을 다시 써서 입력
                 
	}

}
