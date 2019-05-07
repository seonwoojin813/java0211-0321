package java0311;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class LogAnalysis {

	public static void main(String[] args) {
		//�α������� �����͸� �� ������ �о ����ϱ�
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\503_08\\Downloads\\log.txt"))){
			//���� �� Ȯ���ؼ� ���
			int count = 0;
			//ip�� �ߺ����� �����ϱ� ���� Ŭ������ �ν��Ͻ�
			Set<String> ipSet = new HashSet<String>();
			//�հ踦 ������ ������ ����
			int trafficSum = 0;
			while(true) {
				String log = br.readLine();
				if(log == null) {
					break;
				}
				//System.out.printf("%s\n", log);
				count = count + 1;
				
				//���� �����͸� ������ �������� ����
				//���ڿ��� ���� �� ���� ��ġ�� ������ �����ϴ� subString�� �ְ�
				//Ư�� ���ڿ��̳� ������ ������ �����ϴ� split�� �ֽ��ϴ�.
				
				String [] line = log.split(" ");
				//System.out.printf("%s\n", line[0]);
				ipSet.add(line[0]);
				//�迭�� ������ ��Ҹ� trafficSum�� ���ϱ�
				trafficSum = trafficSum + Integer.parseInt(line[line.length-1]);
			}
			//�������ϴ°�
			System.out.printf("���� �� : %s\n", count);
			
			//�ߺ��� �����ϰ� IP�� ���
			System.out.printf("%s\n", ipSet);
			
			//�� ������ ��Ұ� Ʈ�����ε� Ʈ������ �հ踦 ���
			System.out.printf("Ʈ���� �հ�:%d\n", trafficSum);
		    //���� Ʈ������ ���� ����� IP�ּҸ� ���
			//�� ���� ���� ���� ����� Ʈ������ ���
			
			//�׷�ȭ�ؼ� traffic�� ���� ���� ���� IP�� ���
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
