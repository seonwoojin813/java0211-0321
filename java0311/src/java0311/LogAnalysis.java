package java0311;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class LogAnalysis {

	public static void main(String[] args) {
		//로그파일의 데이터를 줄 단위로 읽어서 출력하기
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\503_08\\Downloads\\log.txt"))){
			//라인 수 확인해서 출력
			int count = 0;
			//ip를 중복없이 저장하기 위한 클래스의 인스턴스
			Set<String> ipSet = new HashSet<String>();
			//합계를 저장할 변수를 생성
			int trafficSum = 0;
			while(true) {
				String log = br.readLine();
				if(log == null) {
					break;
				}
				//System.out.printf("%s\n", log);
				count = count + 1;
				
				//읽은 데이터를 공백을 기준으로 분할
				//문자열을 분할 할 때는 위치를 가지고 분할하는 subString이 있고
				//특정 문자열이나 패턴을 가지고 분할하는 split이 있습니다.
				
				String [] line = log.split(" ");
				//System.out.printf("%s\n", line[0]);
				ipSet.add(line[0]);
				//배열의 마지막 요소를 trafficSum에 더하기
				trafficSum = trafficSum + Integer.parseInt(line[line.length-1]);
			}
			//개수구하는거
			System.out.printf("라인 수 : %s\n", count);
			
			//중복을 제거하고 IP를 출력
			System.out.printf("%s\n", ipSet);
			
			//맨 마지막 요소가 트래픽인데 트래픽의 합계를 출력
			System.out.printf("트래픽 합계:%d\n", trafficSum);
		    //가장 트래픽을 많이 사용한 IP주소를 출력
			//한 번에 가장 많이 사용한 트래픽을 출력
			
			//그룹화해서 traffic의 합이 가장 많은 IP를 출력
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
