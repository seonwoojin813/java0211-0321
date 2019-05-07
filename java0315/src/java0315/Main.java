package java0315;

import java.util.ArrayList;
import java.util.Comparator;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//���̺� ������ �����͸� ������ �ڷᱸ���� ����
		List<Map<String, Object>> table = 
				new ArrayList<Map<String, Object>>();
				//�����͸� �����ؼ� ���� : �����ͺ��̽� �����̸� �ݺ����� �̿��ؼ� ����
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("num", 1);
		map.put("name", "����");
		map.put("phone", "010-9999-2222");
		map.put("birth", new Date(95, 8, 5));
		table.add(map);
		
		map = new HashMap<String, Object>();
		map.put("num", 2);
		map.put("name", "�ֶ�");
		map.put("phone", "010-3333-4444");
		map.put("birth", new Date(93, 3, 27));
		table.add(map);

		map = new HashMap<String, Object>();
		map.put("num", 3);
		map.put("name", "����");
		map.put("phone", "010-5555-6666");
		map.put("birth", new Date(87, 3, 25));
		table.add(map);
		
		map = new HashMap<String, Object>();
		map.put("num", 4);
		map.put("name", "ȭ��");
		map.put("phone", "010-7777-8888");
		map.put("birth", new Date(81, 12, 24));
		table.add(map);
	
		Comparator<Map<String, Object>> numAsc = new Comparator<Map<String, Object>>(){
      	@Override
			public int compare(Map<String, Object> o1, Map<String, Object> o2) {
				int num1 = (Integer)o1.get("num");
				int num2 = (Integer)o2.get("num");
				return num1 - num2;
			}
		};
			table.sort(numAsc);
				
			Comparator<Map<String, Object>> numDesc = new Comparator<Map<String, Object>>(){
		      	@Override
					public int compare(Map<String, Object> o1, Map<String, Object> o2) {
						int num1 = (Integer)o1.get("num");
						int num2 = (Integer)o2.get("num");
						return num2 - num1;
					}
				};
					table.sort(numDesc);
					
		Comparator<Map<String, Object>> nameAsc = new Comparator<Map<String, Object>>(){
	      	@Override
				public int compare(Map<String, Object> o1, Map<String, Object> o2) {
					String name1 = (String)o1.get("name");
					String name2 = (String)o2.get("name");
					return name1.compareTo(name2);
				}
			};
			table.sort(nameAsc);
			
				Comparator<Map<String, Object>> nameDesc = new Comparator<Map<String, Object>>(){
			      	@Override
						public int compare(Map<String, Object> o1, Map<String, Object> o2) {
							String name1 = (String)o1.get("name");
							String name2 = (String)o2.get("name");
							return name2.compareTo(name1);
						}
					};
							table.sort(numDesc);
				
							Comparator<Map<String, Object>> birthAsc = new Comparator<Map<String, Object>>(){
						      	@Override
									public int compare(Map<String, Object> o1, Map<String, Object> o2) {
										Date birth1 = (Date)o1.get("birth");
										Date birth2 = (Date)o2.get("birth");
										return birth1.compareTo(birth2);
									}
								};
								table.sort(birthAsc);
								
								Comparator<Map<String, Object>> birthDesc = new Comparator<Map<String, Object>>(){
							      	@Override
										public int compare(Map<String, Object> o1, Map<String, Object> o2) {
											Date birth1 = (Date)o1.get("birth");
											Date birth2 = (Date)o2.get("birth");
											return birth2.compareTo(birth1);
										}
									};
									table.sort(birthDesc);
					
					
		Scanner sc = new Scanner(System.in);
		final String  ��ȣ�������� = "1";
		final String  ��ȣ�������� = "2";
		final String  �̸��������� = "3";
		final String  �̸��������� = "4";
		final String  ���Ͽ������� = "5";
		final String  ���ϳ������� = "6";
		final String  ���� = "7";
		
		System.out.printf("���� �ɼ��� �����ϼ���!!\n");
		System.out.printf("1.��ȣ�������� 2.��ȣ�������� 3.�̸��������� 4. �̸��������� 5.���Ͽ������� 6.���ϳ�������\n");
		String menu = sc.nextLine();
		switch(menu) {
		case ��ȣ��������:
			table.sort(numAsc);
			break;
		case ��ȣ��������:
			table.sort(numDesc);
			break;
		case �̸���������:
			table.sort(nameAsc);
			break;
		case �̸���������:
			table.sort(nameDesc);
			break;
		case ���Ͽ�������:
			table.sort(birthAsc);
			break;
		case ���ϳ�������:
			table.sort(birthDesc);
			break;
		case ����:
			System.exit(0);
			break;
			default:
				System.out.printf("��ȣ�� 1-6������ ����");
				return;
		}
				
		//��� ���
		System.out.printf("��ȣ\t�̸�\t��ȭ��ȣ\t\t       ����\n"); //���� ĭ���߷���
		
		//������ ���
		for(Map<String, Object> imsi: table) {
			System.out.printf("%s\t%s\t%s\t%s\n", imsi.get("num"),
			imsi.get("name"), imsi.get("phone"), imsi.get("birth"));
		}		
	}
}
