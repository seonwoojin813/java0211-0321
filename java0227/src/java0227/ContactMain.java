package java0227;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ContactMain {

	public static void main(String[] args) {
		// Contact Ŭ������ �ν��Ͻ� �����
		//Ŭ������ ������ 1���� ��� ù���ڸ� �ҹ��ڷ� �����ؼ�
		//����ϴ� ��찡 �ֽ��ϴ�.
		Contact contact = new Contact(1, "������", "01031687813");
		
         //������Ҹ� �ϳ��� ���
		System.out.printf("��ȣ:%s\n", contact.getNum());
		System.out.printf("�̸�:%s\n", contact.getName());
		System.out.printf("��ȭ��ȣ:%s\n", contact.getPhone()); // Phone�� Moblie�� �ٲ������
		
		
		//������ �����͸� Map�� �̿��ؼ� ����
		Map<String, Object> map = new HashMap<String, Object>();
		//����ϸ� ���� �ƹ����Գ���
		//	Map<String, Object> map = new HashMap<String, Object>();�� 
	    //Map<String, Object> map = new LinkedHashMap<String, Object>();
		//���� �ٲ㼭 ����ϸ� ������ ������ ����
		
		//	Map<String, Object> map = new HashMap<String, Object>();��
		//	Map<String, Object> map = new TreeMap<String, Object>();
		//�� �ٲ㼭 ����ϸ� sort�ؼ� ����
		
		//�������� �� ���� map�� �߾Ⱦ����� ȥ���� ���� map�� ����  
		
		map.put("num", 1);
		map.put("name", "������");
		map.put("Phone", "01031687813");
		//Phone�� moblie�� �ٲٰ� ����ϴ� �κ��� �ٲ� �ʿ���� ���
		//map�� key�� ����Ǵ��� ����ϴ� �κ��� ������ �ʿ䰡 �����ϴ�.
		map.put("hometown", "korea");
		//���� �߰�
		
		//key�� �̸��� ���� �Է����� �ʰ� ���
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.printf("%s:%s\n", key, map.get(key)); 	
		}
	}

}
