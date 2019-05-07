package java0311;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializableMain {

	public static void main(String[] args) {
	      try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./oos.dat"))){
             //oos.writeObject("�ȳ��ϼ��� Hello");
	    	  
	    	  //java.io.Serializable �������̽��� implements ���� ���� Ŭ������ ��ü�� 
	    	  //�����̳� ��Ʈ��ũ�� ���ؼ� ������ �� �����ϴ�.
	    	  
	    	  Item item = new Item(1, "���� û����", new Date(), 57000);
	    	  oos.writeObject(item);
	    	  Item item1 = new Item(2, "���� û�ұ�", new Date(), 53000);
	    	  oos.writeObject(item1);
	      }catch(Exception e) {
	    	  System.out.printf("%s\n", e.getMessage());
	    	  e.printStackTrace();
	      }
	      try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./oos.dat"))){
              //������ �ڷ������� �� ��ȯ�ؼ� ������ �˴ϴ�.
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