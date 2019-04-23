package thread;

public class AnagramTest {

	public static void main(String[] args) {
		String str = "EROS";
		int idx = 0;
		int size = str.length(); // 1 이렇게 쓰고
		while(true){
			try {
				Thread.sleep(1000);
				//글자 수 만큼 글자를 가져오기 위한 반복문 
				//for(int i=0; i<str.length(); i=i+1) { -> 2. str.length()를 size로 적어
				for(int i=0; i<size; i=i+1) {
					//idx가 1회전마다 1씩 증가하기 때문에 한칸씩 오른쪽에서
					//시작해서 글자 수 만큼을 가져옴
					//글자 수 만큼으로 나머지를 구하기 때문에 마지막 글자에
					//도달하면 첫번째 글자 부터 다시 가져옴
					//char ch = str.charAt((idx+i)%str.length()); -> 3. %str.length())를 size로 바꾸
					char ch = str.charAt((idx+i)%size);
					System.out.printf("%c", ch);
				}
				System.out.printf("\n");
				idx = idx + 1;
			}catch(Exception e) {}
		}

	}

}
