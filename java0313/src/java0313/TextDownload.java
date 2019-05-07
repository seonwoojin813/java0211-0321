package java0313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//Thread 클래스를 이용해서 Thread를 생성
class TextThread extends Thread{
	public void run() {
		//연결을 반드시 해제해야하는 URLConnection 변수 생성
		HttpURLConnection con = null;
		//문자열을 읽어올 BufferedReader 변수 생성
		BufferedReader br = null;
		
		try {
			//1.URL은 해제 할 필요가 없는 클래스라서 try안에서 생성
			URL url = new URL("https://sports.news.naver.com/wfootball/index.nhn");
			//2.URL과 통신 할 수 있는 연결 객체 생성
			//URLConnection은 추상 클래스라서 사용할 클래스로 강제로 형 변환해서 사용
			con = (HttpURLConnection)url.openConnection();
			
			//3.연결 옵션 설정 : 메소드 전송방식, 연결 제한 시간, 캐시 사용 여부 등
			con.setConnectTimeout(30000); //연결 제한 시간은 30초
			con.setUseCaches(false);//캐시 사용을 하지 않음
			con.setRequestMethod("GET");//GET방식으로 전송
			
			//4.문자욜을 읽어올 스트림을 생성
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			//5.문자열을 읽어오기- 대용량의 문자열을 읽기
			//데이터를 읽어올때는 줄단위로 읽어오므로 편집 가능한 문자열 객체에
			//저장을 하는 것이 좋음
			//Stringbuilder는 항상 여분을 가지고 있음 
			StringBuilder sb = new StringBuilder();

			//크기를 알 수 없으므로 무한반복
			while(true) {
				//한 줄 읽기
				String line = br.readLine();
				//읽은 문자열이 없으면 반복문 종료
				if(line == null) {
					break;
				}
				//읽은 문자열이 있으면 sb에 문자열을 추가
				sb.append(line);
			}
			//문자열을 전부 저장했으면 여분의 공간이 필요없기 때문에 String으로 변환 
			String content = sb.toString();
			System.out.printf("%s", content);
			
			
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}finally {
			try {
			//나중에 만든 것을 먼저해	
			br.close();
			con.disconnect();
			}catch(IOException e) {
				System.out.printf("%s\n", e.getMessage());
				e.printStackTrace();
		}
	}
	}
}
public class TextDownload {

	public static void main(String[] args) {
		//스레드 인스턴스를 생성하고 스레드 시작
		Thread th = new TextThread();
		th.start();

	}

}
