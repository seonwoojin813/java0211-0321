package innerclass;

public class OuterClass {
         //���� Ŭ����
	     class InnerClass{
        	   public void innerMethod() {
        		   System.out.printf("�̳� Ŭ������ �޼ҵ�\n");
        	   }
           }
           
	     //static ����� ������ �ִ� ��쿡�� static inner class�� �����ؼ�
	     //�ϳ��� �����ǵ��� ���־�� �մϴ�.
             static class StaticInnerClass{
            	 //class�տ� static �ٿ�����
        	   public static int n;
                   
             }
             
             public void method() {
            	 //�޼ҵ� �ȿ��� ������� ���� Ŭ����
            	 //Local�� �ڱ� ���� �������� ����Ҽ�����
             class LocalInnerClass{
          	    public void innerMethod() {
          		   System.out.println("�̳� Ŭ������ �޼ҵ�\n");
          	   }
             }

}
            //  LocalInnerClass c = new LocalInnerClass(); --->�̷��� ġ�� ���� 
            
             
}