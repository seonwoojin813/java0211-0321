package java0227;

import java.util.HashMap;
import java.util.Map;

public class DoubleArray {

	public static void main(String[] args) {
		//�����౸�� �� ���� �������
		String [] seoul = {"���ֿ�", "�ϴ뼺", "��������", "�����"};
		String [] suwon = {"������", "����"};
		String [] jeonbuk = {"�̵���","�̿�"}; 
		//�� 2���� �迭�� �ϳ��� �迭�� �����  
		//�迭���� �� ��Ұ� ����� ���� �״�� ����Ҽ� �ֽ��ϴ�.
		String [][] players  = {seoul,  suwon, jeonbuk};
		
		
		
		//���̸��� ���� ����� ���
		for(int i=0; i<players.length; i=i+1) {
			if(i == 0){
				System.out.printf("����\n");
			}else {
				System.out.printf("����\n");
			}
			//�� ���� ���� ��� ��������
			String [] player = players[i];
			//�迭�� ��ȸ�ؼ� ���
			for(String temp : player) {
				System.out.printf("\t%s\n", temp);
			}
		}
		System.out.printf("===============\n");
		System.out.printf("===============\n");
		//�� �迭�� Map���� ����
		Map<String, Object>map1 = new HashMap<String, Object>();
		//�� �̸��� team �̶�� Ű�� ����
		map1.put("team", "����");
		//������� �迭�� player��� Ű�� ����
		map1.put("player", seoul);
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("team", "����");
		map2.put("player", suwon);
		
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("team", "����");
		map3.put("player", jeonbuk);
		
		//Map�� �迭�� ����
		//Map<String, Object> [] kleague = {map1, map2}; �̰Ÿ� �ؿ�ó�� �ᵵ �������
		Map [] kleague = {map1, map2, map3};
		
		for(Map map : kleague) {
	    //���̸� ���
		System.out.printf("%s\n",map.get("team"));
		//Map���� �����͸� �����ͼ� ������� �ʰ� ����� �� ����
		//������ �ڷ������� �� ��ȯ�ؼ� ����ؾ� �մϴ�.
		//�� ��ȯ�� ���� ������ Object Ÿ���� �˴ϴ�.
		String [ ] temp = (String  [ ])map.get("player");
		for(String imsi :  temp) {
		System.out.printf("\t%s\n", imsi);
		}
		}
	}

}
