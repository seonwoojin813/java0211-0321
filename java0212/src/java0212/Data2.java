package java0212;

public class Data2 {

	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		//int 보다 작은 크기의 데이터끼리 연산을 하면 int로 변경해서 연산을 수행합니다.
		//연산의 결과를 byte에는 저장할 수 없습니다.
		//byte result = b1 + b2;
		int result = b1 +b2;
		System.out.println(result);
		
		int x = 100;
		//표현범위의 큰 데이터는 작은 표현범위의 변수에 대입이 안됩니다.
		//이런경우 강제로 대입할려고 하면 int 를 byte로 변경을 시켜야 합니다.
		//데이터 손실에 유의해야 합니다.
		//byte b = x;
		
		//x를 byte로 변경해서 b에 대입
		byte b = (byte) x;
		System.out.println("b:" + b);
		//숫자의 값이 이상하게 될 수 있어서 같은 정수끼리 강제 형 변환은 잘 하지 않습니다.
		x = 700;
		b = (byte)x;
		System.out.println("b:" + b);
		//실수를 정수로 강제 형 변환하면 소수가 없어지게 됩니다.
		//byte는 127까지 밖에 안되는데 700이니까 음의 수로 돌다가 말도 안되는 수가 나와버림.
	    double d = 3.14;
	    //실수를 정수에 대입할려면 강제로 정수 데이터로 변경해야합니다.
	    x =(int)d;
	    System.out.println("x:" + x);
	    
	    int n1 = 15;
	    int n2 = 2;
	    //작은 표현범위 숫자 데이터를 큰 표현범위의 숫자 데이터로 변경하는 이유는
	    //원하는 결과를 얻기 위해서 입니다.
	    double r = (double)n1 / n2;
	    System.out.println("r:" + r);
	    
	    double su = 5.4;
	    //위의 숫자를 소수 첫째 자리에서 반올림해서 출력
	    //5.6 이면 6, 5.4이면 5로 출력 : 0.5를 더해서 소수를 버리면 됩니다.
	    int h =(int) (su+0.5);
	    System.out.println("h:" + h);
	    
	    su = 5.46;
	    //위의 숫자를 소수 두째 자리에서 반올림해서 출력
	    //5.46 이면 5.5, 5.44이면 5.4로 출력 : 0.5를 더해서 소수를 버리면 됩니다
	    //만약 셋째 자리에서 반올림이면 *100 넷째면 *1000
       su = su * 10;
       h = (int)(su + 0.5);
       su = h /10.0;
       System.out.println("su:" + su);
	}

}
