package objectTest;

//��ȣ�� �̸��� �����ϴ� Ŭ����
public class Data {
	              //��ä���⿡�� ������ private����
                private int num;
                private String name;
				
                //�Ű������� ���� ������ - Default Constructor
                //source���� generate constructor using filed ������ Ŭ���Ѱ� ���� object �´����� Ȯ���ϰ� ������
                public Data() {
					super();
				}
                
                //�Ű������� 2�� �ִ� ������
                //source���� generate constructor using filed ������ Ŭ���Ȱ� Ȯ�� object �´����� Ȯ���ϰ� ������
				public Data(int num, String name) {
					super();
					this.num = num;
					this.name = name;
				}


				//������ ������ �� �ִ� �޼ҵ� - ������ �޼ҵ�
                public int getNum() {
				       return num;
				}
				public void setNum(int num) {
					this.num = num;
				}
				public String getName() {
					return name;
				}
				public void setName(String name) {
					this.name = name;
				}
				
				//������ ���ϴ� equals �޼ҵ�
				public boolean equals(Data other) {
					return this.num == other.num;
				}
				
				//�ڱ��ڽŰ� ������ ������ ���� �����͸� �������ִ� clone �޼ҵ�
                public Data clone() {
                	//���ο� �ν��Ͻ��� ����
                	Data other = new Data();
                	//���� �����͸� ����
                	other.setNum(this.num);
                	other.setNum(this.num);
                	//������� �ν��Ͻ��� ����
                 return other;                
                }
}
