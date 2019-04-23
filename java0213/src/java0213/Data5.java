package java0213;

public class Data5 {

	public static void main(String[] args) {
		int coke = 1000;
		int cider = 800;
		//이부분에 코드를 작성해서 콜라와 사이다를 변경하시오
		//2개의 저장 공간에 저장된 데이터를 교환하기 위해서는 하나의 임시변수가 더 필요
		int cup = coke;
		coke = cider;
	    cider =cup;
	    System.out.printf("콜라는"+ coke + "원 사이다는"+ cider +"원");
	}

}
