package java0321;

import java.util.List;

public class Controller1 {
 public static void main(String[] args) {
	 DeptDAO dao = DeptDAOImpl.getInstance();
	 
	 //추가할 데이터를 생성
	 MyDEPT myDEPT = new MyDEPT();
	 myDEPT.setDeptno(99);
	 myDEPT.setDname("대기");
	 myDEPT.setLoc("오락실");
	/* 
	 int result = dao.insertMyDEPT(myDEPT);
	 if(result == -1) {
         System.out.printf("삽입실패\n");
      }else {
         System.out.printf("삽입성공\n");
      }
      */
	/*
	 int result = dao.updateMyDEPT(myDEPT);
	 if(result == -1) {
         System.out.printf("수정실패\n");
      }else {
         System.out.printf("수정성공\n");
      }
      */
     	 /*
	 int result = dao.deleteMyDEPT(99);
	 if(result == -1) {
         System.out.printf("수정실패\n");
      }else {
         System.out.printf("수정성공\n");
      }
      */
	 //여러개의 데이터를 리턴하는 메소드는
	 //예외가 발생하거나 데이터가 없는 경우에 size가 0인 상태로 리턴
	 //List는 대부분 반복문을 돌려서 사용하는데 null을 리턴하게 되면
	 //반복문에서 예외가 발생하기 때문입니다.
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
