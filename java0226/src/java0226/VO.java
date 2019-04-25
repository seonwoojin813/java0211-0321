package java0226;

//번호, 아이디, 비밀번호, 이름, 나이를 같이 저장하는 클래스
public class VO implements Comparable{
	//public class VO 에서 implements Comparable 쓰면 에러
	//VO에 마우스 가져다 대고 add클릭 
	private int num;   
	 private String id;
	 private String pw;
	 private String name;
	 private int age;
	  
	 //생성자 메소드
	 public VO() {
	        super();
      	}
  
	public VO(int num, String id, String pw, String name, int age) {
		super();
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	     }
	
    //접근자 메소드
	public int getNum() {
	return num;
	}

	public void setNum(int num) {
	this.num = num;
	}

	public String getId() {
	return id;
	}

	public void setId(String id) {
	this.id = id;
	}

	public String getPw() {
	return pw;
	}

	public void setPw(String pw) {
	this.pw = pw;
	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public int getAge() {
	 return age;
	}

	public void setAge(int age) {
	this.age = age;
	}

	//디버깅을 위한 메소드: 멤버의 값을 확인하기 편리한 메소드
	//출력하는 매소드에 인스턴스 이름만 대입하면 호출되는 메소드
	@Override
	public String toString() {
		return "VO [num=" + num + ", id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}

	  //크기 비교를 위한 메소드
	  //앞쪽의 데이터가 더 크면 양수를 리턴
	  //2개의 데이터가 동일하면 0
	  //앞쪽의 데이터가 작으면 음수를 리턴
	  //오름파순 정렬 - 내림차순을 하고자 하면 부호를 반대로 리턴
	  //**숫자 데이터는 뺼셈을 이용하면 됩니다
	  //**java에서는 compareTo
	
	  @Override
	  public int compareTo(Object o) {
	  //Object 타입의 테이터를 사용할  때는 원래의 자료형으로 형변환해서 사용
	  //여기는 클래스가 VO이므로 VO타입으로 형 변환 
		VO other = (VO)o;
		return this.name.compareTo(other.name); //이름으로 오름차순
		//return other.name.compareTo(this.name);  // 이름으로 내림차순
		//되기는 하지만 이 방법으로 하기는 쉽지않다
		//소스는 고칠 수 없어 
		
		//return this.age - other.age;   //나이로 오름차순
		//return other.age - this.age;   //나이로 내림차순
		
		//return this.age - other.age; 이거랑 if(this.age > other.age){ ~ return  -1; }결과가 같아
		/*
		if(this.age > other.age) {
		return 1;
		}else if(this.age == other.age) {
		return  0;
	}else {
		return  -1;
	  }	*/				 
   }
}