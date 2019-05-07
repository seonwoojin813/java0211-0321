package java0311;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializableMain {

	public static void main(String[] args) {
	      try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./oos.dat"))){
             //oos.writeObject("안녕하세요 Hello");
	    	  
	    	  //java.io.Serializable 인터페이스를 implements 하지 않은 클래스의 객체는 
	    	  //파일이나 네트워크를 통해서 전송할 수 없습니다.
	    	  
	    	  Item item = new Item(1, "공기 청정기", new Date(), 57000);
	    	  oos.writeObject(item);
	    	  Item item1 = new Item(2, "전기 청소기", new Date(), 53000);
	    	  oos.writeObject(item1);
	      }catch(Exception e) {
	    	  System.out.printf("%s\n", e.getMessage());
	    	  e.printStackTrace();
	      }
	      try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./oos.dat"))){
              //원래의 자료형으로 형 변환해서 읽으면 됩니다.
	    	  //String msg = (String)ois.readObject();
              //System.out.printf("%s\n", msg);
	    	  
	    	  Item item = (Item)ois.readObject();
	    	  System.out.printf("%s\n", item);
	    	  Item item1 = (Item)ois.readObject();
	    	  System.out.printf("%s\n", item1);
	    	  
	      }catch(Exception e) {
	    	  System.out.printf("%s\n", e.getMessage());
	    	  e.printStackTrace();
	}
	}
}