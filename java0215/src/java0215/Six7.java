package java0215;

public class Six7 {

	public static void main(String[] args) {
		/*
		int [] ar = {40, 70, 30, 65, 93, 48, 80};
		
		int max = 0;
		
		for(int temp : ar ) {
			if(max < temp) {
				max = temp;
			}
		}
		System.out.printf(" �ִ� �� : %d\n", max);
*/
		
	//�ּ� �� ���ϱ�	
    /*
		int min = 100;
		
		for(int temp : ar ) {
			if(min > temp) {
				min = temp;
			}
		}
		System.out.printf(" �ּ� �� : %d\n", min);
	}
	*/

		//2���� �迭�� �����͸� ���� �� �迭 
		int [] ar1 = {40, 70, 30, 65, 93, 48, 80};
		int [] ar2 = {51, 73};
		

		int [] merge = new int[ar1.length+ar2.length];
        //ù��° �迭�� ������ �ű��		
		for(int i = 0; i < ar1.length; i = i+1) {
			merge[i]= ar1[i];
		}
		//�ι�° �迭�� ������ �ű��
	           for (int i = 0 ; i<ar2.length; i = i+1) {   
		              merge[ar1.length+ i] = ar2[i];
	           }

	                  for (int e : merge) {
		                	 System.out.printf(" %d\t", e);
		                 
	                  }
                     }
            }