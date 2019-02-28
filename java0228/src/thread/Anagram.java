package thread;

public class Anagram {

	public static void main(String[] args) {
		String anagram = "EROS";
		int length =  anagram.length();
        for(int i=0; i<length; i=i+1) {
        	char ch = anagram.charAt(i);
        	System.out.printf("%c", ch);
        }
	}
        public void run() {
    		try {
    			for(int i=0; i<10; i=i+1) {
    				Thread.sleep(1000);
    				System.out.printf("i%d\n", i);
    			}
    		}catch(Exception  e) {
    			System.out.printf("%s\n", e.getMessage() );
    		}
	}

}
