package java0214;

public class Five4 {

	public static void main(String[] args) {
		//while을 이용해서 0, 1, 2 출력
		//while을 이용해서 0, 2, 4 출력-----> 밑에 i*2하면됨
		int i = 0;
		while(i<3) {
			System.out.printf("i:%d\n", i);
			i = i + 1;
		}
	
	System.out.printf("=============================\n");
	
	
	//이전 while 와 동일한 기능을 하는 do~while 
	i = 0;
	do {
		System.out.printf("i:%d\n", i);
		i = i + 1;
	}while(i<3);
	
	
	
	
	
	
	
	}

}
