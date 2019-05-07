package java0308;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayStream {

	public static void main(String[] args) {
		String str = "HelloWorld";
		ByteArrayInputStream bais = null;
		
		   try {
			    //����Ʈ �迭���� ���� �� �ִ� ��Ʈ�� ����
			    bais = new ByteArrayInputStream(str.getBytes());
			  /*
			    //����Ʈ ������ �б�
			while(true) {
				//�� ����Ʈ�� �о result�� ����
				int result = bais.read();
				//���� �����Ͱ� ������ �ߴ�
				if(result == -1) {
					break;
			}
				    //���� �����Ͱ� ������ ���
				    //System.out.printf("%d\t", result); // �̰� ���ڷ� ���
				    System.out.printf("%c\t", (char) result); //���ڷ� ����ϰ� ������ ����ȯ
		}
			         System.out.printf("\n");
			         */
			    
			    //byte �迭 ������ �б�
			    //�����͸� ���� ����Ʈ �迭�� �־�� �մϴ�
			    while(true) {
			    	byte [] b = new byte [4];
			    	int len = bais.read(b);
			    	if(len <= 0) {
			    		break;
			    	}
			    	//�߸��Ȱ� i<b.length; -->  HelloWorld ��� �������� d�ڿ� ���� ��ĭ�� ����(�̹��� �����̿����� ȭ�� ������)
			    	//10�����ε� 4�� -> 4�� -> 2���� + 2����
			    	//���� ���� ��ŭ�� �о�� �մϴ�
			    	for(int i =0; i<len; i=i+1) {
			    		System.out.printf("%c", (char)b[i]);
			    	}
			    }
			    
		    }catch(Exception e) {
			    System.out.printf("%s\n", e.getMessage());
			    e.printStackTrace();
	     	}finally {
			     //����� ��Ʈ�� ����
			try {
				    bais.close();
			}catch(IOException  e) {
				  System.out.printf("%s\n", e.getMessage());
				  e.printStackTrace();
			   }
		    }
   	     }
    }
