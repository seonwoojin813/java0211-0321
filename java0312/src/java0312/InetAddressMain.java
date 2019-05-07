package java0312;

import java.net.InetAddress;

public class InetAddressMain {

	public static void main(String[] args) {
		try {
			//자신의 컴퓨터 주소 정보를 클릭
			InetAddress local = InetAddress.getLocalHost();
		    System.out.printf("로컬 정보: %s\n", local);
		    
		    //www.daum.net의 주소 정보를 출력
		    InetAddress daum = InetAddress.getByName("www.daum.net");
		    System.out.printf("다음의 주소 정보: %s\n", daum);
		    
		    //google은 여러개의 주소를 사용합니다.
		    //이런 경우 모든 주소 정보를 확인하고자 할 때는 배열로 받아야합니다.
		    //www.google.com의 주소 정보를 출력
		    InetAddress [] google  = InetAddress.getAllByName("www.google.com");
		    for(InetAddress addr : google) { //빠른 열거하려고
		    System.out.printf("구글의 주소 정보: %s\n", addr);
		    }
		    //google은 여러개의 주소를 사용합니다.
		    //이런 경우 모든 주소 정보를 확인하고자 할 때는 배열로 받아야합니다.
		    //www.google.com의 주소 정보를 출력
		    InetAddress [] naver  = InetAddress.getAllByName("www.naver.com");
		    for(InetAddress addr : naver) { //빠른 열거하려고
		    System.out.printf("네이버의 주소 정보: %s\n", addr);
		    }
		    
		    //IP주소 정보를 가지고 직접 생성 가능
		    //회사 내에서 작업할 때 - 도메인을 사라고 할 수 없으니까
			InetAddress ip = InetAddress.getByName("192.168.0.108");
		    System.out.printf("ip를 이용하는 방법: %s\n", ip);
		    
		    
		    
		    
		}catch(Exception e) {
			//예외내용 출력
			System.out.printf("%s\n", e.getMessage());
			//예외를 역추적
			e.printStackTrace();
		}
	}
}
