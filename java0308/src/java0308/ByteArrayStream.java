package java0308;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayStream {

	public static void main(String[] args) {
		String str = "HelloWorld";
		ByteArrayInputStream bais = null;
		
		   try {
			    //바이트 배열에서 읽을 수 있는 스트림 생성
			    bais = new ByteArrayInputStream(str.getBytes());
			  /*
			    //바이트 단위로 읽기
			while(true) {
				//한 바이트를 읽어서 result에 저장
				int result = bais.read();
				//읽은 데이터가 없으면 중단
				if(result == -1) {
					break;
			}
				    //읽은 데이터가 있으면 출력
				    //System.out.printf("%d\t", result); // 이건 숫자로 출력
				    System.out.printf("%c\t", (char) result); //문자로 출력하고 싶으면 형변환
		}
			         System.out.printf("\n");
			         */
			    
			    //byte 배열 단위로 읽기
			    //데이터를 읽을 바이트 배열이 있어야 합니다
			    while(true) {
			    	byte [] b = new byte [4];
			    	int len = bais.read(b);
			    	if(len <= 0) {
			    		break;
			    	}
			    	//잘못된거 i<b.length; -->  HelloWorld 라고 나오지만 d뒤에 공백 두칸이 생김(이미지 파일이였으면 화면 깨졌어)
			    	//10글자인데 4개 -> 4개 -> 2글자 + 2공백
			    	//읽은 개수 만큼만 읽어내야 합니다
			    	for(int i =0; i<len; i=i+1) {
			    		System.out.printf("%c", (char)b[i]);
			    	}
			    }
			    
		    }catch(Exception e) {
			    System.out.printf("%s\n", e.getMessage());
			    e.printStackTrace();
	     	}finally {
			     //사용한 스트림 정리
			try {
				    bais.close();
			}catch(IOException  e) {
				  System.out.printf("%s\n", e.getMessage());
				  e.printStackTrace();
			   }
		    }
   	     }
    }
