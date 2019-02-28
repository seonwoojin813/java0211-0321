package java0227;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapUse {

	public static void main(String[] args) {
		// ��ȣ(int), �̸�(String), ����(int)�� ��� ����
		
		//�ڷᱸ���� ����
		Map<String, Object> map = new HashMap<String, Object>();
		//������ ����
		map.put("num", 7);
		map.put("name", "�����");
		map.put("age", 28);

	    //�����͸� ������ ����ϱ�
		System.out.printf("%s\n", map.get("name"));
		//���� key�� �̿��ؼ� �����͸� �������� null
		System.out.printf("%s\n", map.get("address"));
		
		//������ �߰� - ���� key�̿�
		map.put("job", "�౸����");
		//������ ���� - �����ϴ� key�� ������ �߰��ϸ� ����
		map.put("num", 11);
		//������ ����
		map.remove("age");
		System.out.printf("%s\n", map);
		
		//���� ��� �����͸� �ϳ��� ���� ���
		//���� ��� Ű�� ���� ��������
		Set<String> keySet = map.keySet();
		//���� ���Ÿ� �̿��ؼ� keySet�� ��� �����͸� ����
		for(String key : keySet) {
		System.out.printf("%s:%s\n", key, map.get(key)); 	
	
         }

     }

 }




