package java0305;

import java.awt.Dialog;
import java.awt.Frame;

public class MyDialogWindow extends Frame {
          public MyDialogWindow() {
        	  setTitle("대화상자 윈도우");
        	  setSize(400,400);
        	  setLocation(100,100);
        	  //대화상자 생성
        	  //대화상자는 항상 부모 윈도우를 가지고 생성됨
        	  //프레임이나 다른 대화상자의 참조를 가지고 생성
        	  //Dialog d = new Dialog(this);는 창을 움직일 수 있지만
        	  //두번째 매개변수에 true를 대입하면 모달로생성
        	  //모달은 화면에 출력되면 사라지기 전까지 제어권을 절대로 뺏기지 않는 대화상자
        	  Dialog d = new Dialog(this, true); // 이걸로 실행시키면 창이 안움직여 - 모달
        	  d.setSize(200, 200);
        	  d.setVisible(true);
        	
        	  
        	  setVisible(true); //원래 setLocation(100,100); 밑에 있었는데 밑에 주석이 이 위로 올라가면 모달만나와 제어권을 절대로 뺏기지 않기 때문에
        	  //true면 모달 false이면 모달리스 
        	  
        	  /*
        	  //대화상자 생성
        	  //대화상자는 항상 부모 윈도우를 가지고 생성됨
        	  //프레임이나 다른 대화상자의 참조를 가지고 생성
        	  //Dialog d = new Dialog(this);는 창을 움직일 수 있지만
        	  //두번째 매개변수에 true를 대입하면 모달로생성
        	  //모달은 화면에 출력되면 사라지기 전까지 제어권을 절대로 뺏기지 않는 대화상자
        	  Dialog d = new Dialog(this, true); // 이걸로 실행시키면 창이 안움직여 - 모달
        	  d.setSize(200, 200);
        	  d.setVisible(true);
          */
        	  
          }
}
