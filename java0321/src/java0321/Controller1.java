package java0321;

import java.util.List;

public class Controller1 {
 public static void main(String[] args) {
	 DeptDAO dao = DeptDAOImpl.getInstance();
	 
	 //�߰��� �����͸� ����
	 MyDEPT myDEPT = new MyDEPT();
	 myDEPT.setDeptno(99);
	 myDEPT.setDname("���");
	 myDEPT.setLoc("������");
	/* 
	 int result = dao.insertMyDEPT(myDEPT);
	 if(result == -1) {
         System.out.printf("���Խ���\n");
      }else {
         System.out.printf("���Լ���\n");
      }
      */
	/*
	 int result = dao.updateMyDEPT(myDEPT);
	 if(result == -1) {
         System.out.printf("��������\n");
      }else {
         System.out.printf("��������\n");
      }
      */
     	 /*
	 int result = dao.deleteMyDEPT(99);
	 if(result == -1) {
         System.out.printf("��������\n");
      }else {
         System.out.printf("��������\n");
      }
      */
	 //�������� �����͸� �����ϴ� �޼ҵ��
	 //���ܰ� �߻��ϰų� �����Ͱ� ���� ��쿡 size�� 0�� ���·� ����
	 //List�� ��κ� �ݺ����� ������ ����ϴµ� null�� �����ϰ� �Ǹ�
	 //�ݺ������� ���ܰ� �߻��ϱ� �����Դϴ�.
	/*
	 List<MyDEPT> list = dao.listMyDEPT();
	 for(MyDEPT myDEPT : list) {
		 System.out.printf("%s\n", myDEPT);
	 }
	 */
	 
	 MyDEPT mydept = dao.getMyDEPT(10);
	System.out.printf("%s\n", mydept);
 }
}
