package java0321;

import java.util.List;

//�۾��� ������ Ŭ������ �޼ҵ� ������ ������ �������̽�
//Ŭ���̾�Ʈ�� PM�� ��ȭ�� �� ���
public interface DeptDAO { 
        //�����͸� �����ϴ� �޼ҵ�
        //�Ű������� �ǵ����̸� ���ų� 1���� ����� ���� �����ϴ�.
	    //�̸��� � �۾��� �����ϴ��� �� �� �ֵ��� ���ִ� ���� �����ϴ�.
	    //����Ÿ���� �۾��� ����� Ȯ���� �� �ֵ��� ���ִ� ���� �����ϴ�.
	    //insert, delete, update �� ����Ÿ���� int
	
	//public ����Ÿ�� insertMyDEPT(int deptno, String dname, String loc); -->�̰Ÿ� ������ �ϳ��� ���� �� ����
	public int insertMyDEPT(MyDEPT  myDEPT);
	
	//mydept ���̺��� �����͸� �����ϴ� �޼ҵ�
	//�����ϴ� �޼ҵ�� ����� �����ϴ� �޼ҵ�� ����
	public int updateMyDEPT(MyDEPT myDEPT);
	
	
	//�����͸� �����ϴ� �޼ҵ�
	public int deleteMyDEPT(int deptno);
	
	//���Ǿ��� ���̺��� ��� �����͸� �������� �޼ҵ�
	//�������� �����͸� ��ȸ�� ���� ����Ÿ���� List
	//�Ű������� where ���� �����Ǵ� ����
	public List <MyDEPT> listMyDEPT(); 
	
	
	//���̺��� �⺻Ű�� ������ �ϳ��� �����͸� ã�ƿ��� �޼ҵ�  - �󼼺���, ������ ������ �� �� �⺻������ �������� �޼ҵ�
	public MyDEPT getMyDEPT(int deptno);
	
	
	
}
