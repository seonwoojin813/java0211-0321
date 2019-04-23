package java0213;

public class Data3 {

	public static void main(String[] args) {
		System.out.printf("%b\n", true&&false); //false
		System.out.printf("%b\n", true||false); //true
		int x = 10;
		//&&는 앞쪽 연산의 결과가 flase 이면 뒤의 연산을 하지 않습니다.
		boolean result = x>5 && ++x > 5;
		System.out.printf("x:%d\n", x); //x : 11
		result = x>20 && ++x >5;
		System.out.printf("x:%d\n", x); // x : 11

		int year = 2019;
		//year가 2000이상 인지 확인
		//result = ?; 
		result =  year >= 2000;
		System.out.printf("2000이상:%b\n", result);
		//year가 4의 배수(나누어서 나머지가 0)인지 확인
		//result= ?;
		result = year % 4 == 0;
		System.out.printf("4의 배수 여부:%b\n", result);
        //year가 4의 배수이고 100의 배수가 아닌 경우를 확인
		//result = ?;
		result = year % 4 == 0 && year % 100 != 0;
		System.out.printf("4의 배수이고 100의 배수가 아닌지 여부:%b\n", result);
		//year가 (4의 배수이고 100 배수가 아닌 경우) 또는 400의 배수인 경우 확인
		//result =?;
		result = year % 4 == 0 && year %  100 != 0 || year % 400 ==0;
		System.out.printf("윤년 여부:%b\n", result);
		
		//1-100까지의 데이터가 있습니다.
		//3의 배수이고 4의 배수인지 확인
		//3의 배수를 확인하고 4의 배수인지 확인하는 것이 좋은지  --- **배수 이거나 하면 3의 배수를 먼저확인 그게 트루인지 펄스인지 확인
		//아니면 4의 배수를 확인하고 3의 배수를 확인하는 것이 좋은지 판단?
		
	}

}
