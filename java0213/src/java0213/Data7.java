package java0213;

import java.util.Scanner;

public class Data7 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("�Ž��� �� �Է�:");
          int money = sc.nextInt();
          System.out.printf("�Ž��� �� :%d\n", money);
         
          int man = money / 10000;
          int five = (money -man*10000)/5000; 
          //int five = (money %10000)/5000; ---> �̷��� �ᵵ ��.
          int	 thousand =(money%5000)/1000;
          System.out.printf("���� %d�� ��õ�� %d�� õ�� %d��",man, five, thousand);
    
          

	}

}
