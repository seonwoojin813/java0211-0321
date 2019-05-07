package java0308;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataStreamMain {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
      try {
    	  fos = new FileOutputStream("./data.dat");
    	 dos	 = new DataOutputStream(fos);
    	 dos.writeInt(30);
    	 dos.writeDouble(28.6);
      }catch(Exception e) {
    	  
      }finally {
    	  try {
    		 fos.close();
    		 dos.close();
    	  }catch(Exception e){
      }
	}
	}
}
