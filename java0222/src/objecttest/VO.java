package objecttest;

//여러 개의 데이터를 하나로 묶어서 저장하기 위한 클래스
public class VO {
                      private int num; //글번호
                      private String title; //글제목
                      private String contents; //글내용
				
                      
                      //생성자 메소드
                      public VO() {
						super();
					}


					public VO(int num, String title, String contents) {
						super();
						this.num = num;
						this.title = title;
						this.contents = contents;
					}

                    //인스턴스 사이의 내용을 비교해주는 메소드 - equals
					public boolean equals(VO other) {
						//num이 같으면 같은 것으로 간주
						return this.num == other.num;
					}
					//인스턴스를 복제해주는 메소드 - clone
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
                    // source 클릭해서 Generate toString 클릭
					// 체크하고 ok누르면 나와
					
					
}			
                /*
					// 접근자 메소드 
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
					
					

