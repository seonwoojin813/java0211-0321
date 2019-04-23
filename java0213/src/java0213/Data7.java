package java0213;

import java.util.Scanner;

public class Data7 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("거스름 돈 입력:");
          int money = sc.nextInt();
          System.out.printf("거스름 돈 :%d\n", money);
         
          int man = money / 10000;
          int five = (money -man*10000)/5000; 
          //int five = (money %10000)/5000; ---> 이렇게 써도 됨.
          int	 thousand =(money%5000)/1000;
          System.out.printf("만원 %d장 오천원 %d장 천원 %d장",man, five, thousand);
    
          

	}

}
