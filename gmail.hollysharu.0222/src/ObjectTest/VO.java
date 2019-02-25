package ObjectTest;

//여러 개의 데이터를 하나로 묶어서 저장하기 위한 클래스 
public class VO {
//글번호(int) 제목(문자열) 작성자(문자열) 작성일(date / 문자열) 조회(int)
	

	private int num; //글번호 
	private String title; //제목
	private String content; //내용 
	
	//생성자 메소드	
	//매개변수가 없는 메소드 
	public VO() {
		super();
	}
	
	//매개변수가 있는 메소드 
	public VO(int num, String title, String content) {
		super();
		this.num=num;
		this.title=title;
		this.content=content;
	}

	//접근자 메소드 생성 
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	//인스턴스 내용을 비교해주는 메소드 - equals 
	public boolean equals(VO other) {
		return this.num==other.num;
	}
	
	//인스턴스를 복제해주는 메소드 - clone 
	//리턴타입 본인 
	public VO clone() {
		VO other=new VO();
		other.num=this.num;
		other.title=this.title;
		other.content=this.content;
		return other;
	}

	//디버깅을 위한 메소드 
	//[Source]-[Generate toString] 
	@Override
	public String toString() {
		return "VO [num=" + num + ", title=" + title + ", content=" + content + "]";
	}
	
	
	
}
