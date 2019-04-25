package java0215;

public class Six2 {

	public static void main(String[] args) {
		int [] ar= {30,70,20, 40};
		//int [] ar= {30,70,20};이렇게 되면
		
		//for (int i = 0; i<4; i=i+1 ) {
		//for (int i = 0; i<4; i=i+1 )----->4를 ar.leangth로 바꿔
		
		//만약 int  x= ar.length; 이렇게 되면
		// for (int i = 0; i<x; i=i+1 ) ------>4를 x로 고쳐 
		//System.out.printf("%d\n", ar[i]);
	    //}
		for (int i = 0; i<4; i=i+1 ) {
			System.out.printf("%d\n", ar[i]);
		}
		
		
		
		
		
		
		
	}

}
