package java0219;

//Based Ŭ�����κ��� ��ӹ��� Derived Ŭ����
public class Derived extends Based {
          public void subMethod() {
        	  System.out.printf("���� Ŭ�������� �����ϴ� �޼ҵ�\n");
          }
          //���� Ŭ������ �����ϴ� commonMethod()
          //�� ������ ����� �޼ҵ带 ���� ����
          //���� Ŭ������ ������ ������ �޼ҵ带 ���� Ŭ��������
          //�ٽ� ����� ���� Method Overriding(������)��� �մϴ�.
          public void commonMethod() {
        	  System.out.printf("���� Ŭ�������� �ٽ� ������ �޼ҵ�\n");

          
          
          }  
} 

