package objectTest;

//번호와 이름을 저장하는 클래스
public class Data {
	              //객채지향에서 변수는 private으로
                private int num;
                private String name;
				
                //매개변수가 없는 생성자 - Default Constructor
                //source들어가서 generate constructor using filed 누르고 클릭한거 해제 object 맞는지도 확인하고 오케이
                public Data() {
					super();
				}
                
                //매개변수가 2개 있는 생성자
                //source들어가서 generate constructor using filed 누르고 클릭된거 확인 object 맞는지도 확인하고 오케이
				public Data(int num, String name) {
					super();
					this.num = num;
					this.name = name;
				}


				//변수에 접근할 수 있는 메소드 - 접근자 메소드
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
				
				//내용을 비교하는 equals 메소드
				public boolean equals(Data other) {
					return this.num == other.num;
				}
				
				//자기자신과 동일한 내용을 가진 데이터를 복제해주는 clone 메소드
                public Data clone() {
                	//새로운 인스턴스를 생성
                	Data other = new Data();
                	//세부 데이터를 복사
                	other.setNum(this.num);
                	other.setNum(this.num);
                	//만들어진 인스턴스를 리턴
                 return other;                
                }
}
