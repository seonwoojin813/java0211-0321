package objecttest;

//���� ���� �����͸� �ϳ��� ��� �����ϱ� ���� Ŭ����
public class VO {
                      private int num; //�۹�ȣ
                      private String title; //������
                      private String contents; //�۳���
				
                      
                      //������ �޼ҵ�
                      public VO() {
						super();
					}


					public VO(int num, String title, String contents) {
						super();
						this.num = num;
						this.title = title;
						this.contents = contents;
					}

                    //�ν��Ͻ� ������ ������ �����ִ� �޼ҵ� - equals
					public boolean equals(VO other) {
						//num�� ������ ���� ������ ����
						return this.num == other.num;
					}
					//�ν��Ͻ��� �������ִ� �޼ҵ� - clone
					public VO clone() {
						VO other = new VO();
						other.num = this.num;
						other.title = this.title;
						other.contents = this.contents;
						return other;
						}


					@Override
					public String toString() {
						return "VO [num=" + num + ", title=" + title + ", contents=" + contents + "]";
					}			
                    // source Ŭ���ؼ� Generate toString Ŭ��
					// üũ�ϰ� ok������ ����
					
					
}			
                /*
					// ������ �޼ҵ� 
					public int getNum() {
						return num;
					}


					public void setNum(int num) {
						this.num = num;
					}


					public String getTitle() {
						return title;
					}


					public void setTitle(String title) {
						this.title = title;
					}


					public String getContents() {
						return contents;
					}


					public void setContents(String contents) {
						this.contents = contents;
					}

*/	
					
					

