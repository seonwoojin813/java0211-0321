package poiymorphism;

public class Main {

	public static void main(String[] args) {
		    
		//Zerg zerg = new Zerg();
	    // zerg.attack();
		//����Ŭ������ ��ӹް��ϱ����� �ٲ۰ž�
		//�̴�� ����ϸ� attack���� ������ 
		//�׷��� ����Ŭ������ Starcraft���� public void attack()�� �־������
		    Starcraft star  = new Zerg();
		    star.attack();
		    
		    //Protoss protoss = new Protoss();
		    //protoss.offence(); �̿��µ� ���ϵǰ� attack���� �ٲ� 
		    // protoss.attack();
		    //����Ŭ������ ��ӹް��ϱ����� �ٲ۰ž�
		    //�̴�� ����ϸ� attack���� ������ 
			//�׷��� ����Ŭ������ Starcraft���� public void attack()�� �־������
		    star = new Protoss();
		    star.attack();
		   
		    
		    
		    
		    //Terran terran = new Terran();
		    // terran.����(); �̿��µ� ���ϵǰ� attack���� �ٲ� 
		    // terran.attack();
		    //����Ŭ������ ��ӹް��ϱ����� �ٲ۰ž�
		    //�̴�� ����ϸ� attack���� ������ 
			//�׷��� ����Ŭ������ Starcraft���� public void attack()�� �־������
		      star = new Terran();
		      star.attack();
		      
		      //Starcraft Ŭ������ ���� ����� ���ؼ� ���� Ŭ������ �ƴϰ�
		      //��Ӱ��踦 ����� ���ؼ� ������ Ŭ�����Դϴ�.
		      //�� Ŭ������ �ν��Ͻ��� ������ �ʿ䰡 �����ϴ�.
		      //�ν��Ͻ��� �������� ���ϵ��� �� ���� class �տ� abstract�� �߰��ؼ�
		      //�߻� Ŭ������ ����� �ָ� �˴ϴ�.
		      
		      //star = new Starcraft(); -----> Starcraft(��ӹޱ����ؼ� ���� ��)���� abstract�� ���� ����ϸ� ������ �׶� �̰� ��������
	}

}
