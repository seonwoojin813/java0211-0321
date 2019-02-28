package java0227;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		//Collections Ŭ������ static �޼ҵ带 �̿��ϸ�
		//List, Set, Map�� �۾��� ������ �� �ֽ��ϴ�.
		//reverse, shuffle, unmodifybleList ���� �޼ҵ尡 �ֽ��ϴ�.
		List<String> list = new ArrayList<String>();
		list.add("ũ����Ƽ�ƴ� ȣ����");
		list.add("������ �޽�");
		list.add("ų���� ������");
		list.add("�� ���׹�");
		list.add("�κ����� ���ݵ�����Ű");
		
		//Collections.reverse(list);
		//System.out.printf("%s\n", list);
	
		   //�����͸� �����ִ� �Լ� ȣ��
		   Collections.shuffle(list);
	       System.out.printf("%s\n", list);
         
	       //�б� ������ ����Ʈ �����
	       List<String> readOnlyList = Collections.unmodifiableList(list);
	       readOnlyList.add("���� ���");
	       // List<String> readOnlyList = Collections.unmodifiableList(list);
	       // readOnlyList.add("���� ���");
	       //�̰Ŵ� ������ �����̶� �߰��� �ȵ� final�̶�� �����ϸ��
	}

}
