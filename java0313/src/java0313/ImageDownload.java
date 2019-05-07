package java0313;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JOptionPane;

class ImageThread extends Thread{
	//이미지 파일의 주소를 문자열로 저장
			String addr = "http://img.ezmember.co.kr/cache/board/2017/08/28/46f84d0e744b74325d61ea9273d5f7ad.jpg";
	public void run() {
		//파일명 부분만 잘라내기
		//문자열 분할
		//1.특정 기호나 패턴으로 분할: split 함수 이용 - 문자열 배열로 리턴
		//2.위치를 기준으로 분할 : substring 함수 이용  - 문자열로 리턴

			//lastIndexOf 와 substring을 이용해서 파일명만 추출
			int idx = addr.lastIndexOf('/');
			String filename = addr.substring(idx+1);
			//System.out.printf("%s\n", filename);
			
			//파일 경로를 생성
			String filepath = String.format("c:\\Temp\\%s", filename); //C드라이브에 Temp룰 생성해놔야해
			//File 객체 생성
			File f = new File(filepath);
			
			//파일이 존재하면 대화상자 출력하고 함수 종료
			if(f.exists() == true) {
				JOptionPane.showMessageDialog(null, "파일이 존재합니다.");
			     return;
			}
            //웹 주소와 연결하기 위한 객체 
			HttpURLConnection con = null;
			//데이터를 읽어오기 위한 스트림
			BufferedInputStream bis = null;
			//파일에 바이트 기록할 스트림
			PrintStream pw = null;
			 
			
			try {
				//다운로드 받을 주소 생성
				URL url = new URL(addr);
				//연결 객체 생성
				con = (HttpURLConnection)url.openConnection();
				//옵션을 설정
				con.setConnectTimeout(30000);
				con.setUseCaches(false);
				
				
				//읽기 위한 스트림 생성
				bis = new BufferedInputStream(con.getInputStream());
				//데이터를 기록하기 위한 스트림 생성
				pw = new PrintStream(filepath);
				
				//데이터 읽기
				while(true) {
					byte [ ] b = new byte[512]; //크기는 맘대로 적을 수 있어
					int r = bis.read(b);
					if(r <= 0) { //더이상 읽을 게 없음
						break;
					}
					//읽은 내용을 기록 - 배열의 모든 내용을 기록하면 안됨
					//배열에 읽은 만큼 기록해야합니다
                       pw.write(b, 0, r);
				}
				pw.flush();
		}catch(Exception e) {
			System.out.printf("1:%s\n", e.getMessage());
			e.printStackTrace();
		}finally {
			try {
			pw.close();
			bis.close();
			con.disconnect(); 
			
			}catch(Exception e) {
				System.out.printf("2:     %s\n", e.getMessage());
				e.printStackTrace();
		}
	  }
	}
}
public class ImageDownload {
	public static void main(String[] args) {
		//스레드 인스턴스를 생성하고 스레드 시작
				Thread th = new ImageThread();
				th.start();
	}
}
