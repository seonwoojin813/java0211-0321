package java0227;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		//������ ������ �� ����� Ŭ������ �������̽��� ������ ��쿡��
		//������ �Ʒ�ó�� ���� Ŭ������ �������̽� Ÿ������ ������ �� �ֽ��ϴ�.
		Set<String> set = new TreeSet<String>();
		//Set<String> set = new HashSet<String>();�� �׳� �ؽ��ڵ� ������ �����µ� ��� �������� ����
		//Set<String> set = new HashSet<String>();��
		//Set<String> set = new LinkedHashSet<String>();���� �ٲٸ� �� �������
		//Set<String> set = new HashSet<String>();��
		//Set<String> set = new TreeSet<String>();���� �ٲٸ� sort�ؼ� ������� ����
		//�ڷᱸ���� ���� �߿��� �����ؾ��� 
		
		set.add("Korea");
		set.add("Japan");
		set.add("Portugal");
		set.add("Spain");
		set.add("England");
		set.add("Korea");
		
		//��� �����͸� ����
		for(String nation : set){
			System.out.printf("%s\n", nation);
		}
	}

}
