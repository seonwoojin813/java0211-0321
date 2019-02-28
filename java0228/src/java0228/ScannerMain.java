package java0228;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		//키보드로부터 입력받는 스캐너 만들기
		Scanner sc = new Scanner(System.in);
        //문자열 입력받기
		System.out.printf("문자열 입력 : ");
        String str = sc.nextLine();
        System.out.printf("입력한 문자열:%s\n", str);
		
		//정수 1개를 입력받기
		System.out.printf("정수 입력: ");
		int n = sc.nextInt();
		System.out.printf("입력한 정수:%d\n", n);
		
		 //문자열 입력받기
		System.out.printf("문자열 입력 : ");
		//이전 입력에서 넘어온 Enter를 없애기 위해서 호출
		sc.nextLine();
        String str1 = sc.nextLine();
        System.out.printf("입력한 문자열:%s\n", str1);
        
 
        int su = 0;
        for(int i=0; i<str1.length(); i=i+1) {
        	char ch = str1.charAt(i);
        	if(ch >= '0' && ch <= '9'){
        	su = su* 10 + (str1.charAt(i)-48);//아스킷 코드는 48이 숫자 0이야
        }else {
        	break; //74k81 면 else break를 지워 이유는 74까지는 나오지만 k를 만나면 브레이크가 되버리기때문에
        	             //f43r888 을 만약 43을 출력하고 싶다면 if 문에 continue를 써
        }
       }
       System.out.printf("변환된 숫자:%d\n", su); 
		sc.close();
	}

}
