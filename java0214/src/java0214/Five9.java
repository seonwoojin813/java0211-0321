package java0214;

public class Five9 {

	public static void main(String[] args) {
	
		int cnt = 1;
	 /*    for(int i=0; i<5; i=i+1) {
	    	 for(int j=0; j<5; j=j+1) {
	    		 System.out.printf("%3d", cnt);
	    		 cnt = cnt+ 1;
	    	 }
	    	 System.out.printf("\n");
	     }
*/
		
		/*
		for(int i =0; i<25; i=i+1);{
			 System.out.printf("%3d", cnt);
			 if(cnt%5==0) {
				 System.out.printf("\n");
			 }
			 cnt = cnt +1;
		}
		*/

	/*
	  *****
	  *****
	  *****
	  *****
	  *****
	  System.out.printf("*")�� System.out.printf("\n")�� �̿�
	  	for(int i=0; i<5; i=i+1) {
	for(int j=0; j<5; j=j+1) {
		 System.out.printf("*");
	}
	  System.out.printf("\n");
   } 
	 */
      /*
		for(int i=0; i<6; i=i+1) {
	for(int j=0; j<1*i; j=j+1) {
		 System.out.printf("*");
	}
	  System.out.printf("\n");
   }  
		/*
	 i                        j      �������
	 0	 *                   0-0      1*i(������ ����) �Ȱ����� �׸� 
     1   **                0-1       
     2  ***              0-2
     3  ****             0-3
     4  *****           0-4
		 */
	/*
 i         j 
0	 *    0-0  
1	 **   0-1  
2	 *** 0-2 
3	 **   0-1
4	 *     0-0
	*/
		for (int i =0; i<5; i= i+1 ){
	if (i <= 2) {
		for(int j =0; j<=1*i; j = j+1) {
			System.out.printf("*");
		}
	}
	else {
		for(int j =0; j<5- i; j = j+1) {
			System.out.printf("*");
	}
	}System.out.printf("\n");
	
	}
	}
}
	

