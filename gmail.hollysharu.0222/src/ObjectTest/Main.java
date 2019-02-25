package ObjectTest;

public class Main {

	public static void main(String[] args) {
		//매개변수가 있는 생성자 
		VO vo=new VO(1,"하루의 인사","애옹애옹");
		//toString 메소드는 '클래스이름@해시코드'를 문자열로 리턴해주는 메소드 
		System.out.printf("%s\n",vo.toString());
		//출력하는 메소드에 인스턴스 이름을 대입하면 안 적어도 알아서 toString 호출 
		System.out.printf("%s\n",vo);
		//해시코드는 굳이 필요하진 않지만 적어도 null은 아닌 것을 확인할 수 있음 
		//VO에서 toString을 오버라이딩 하면 해시코드 너머에 있는 값 출력해줌 
		
		
		
		
	}

}
