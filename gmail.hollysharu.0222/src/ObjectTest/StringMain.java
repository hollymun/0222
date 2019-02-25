package ObjectTest;

public class StringMain {

	public static void main(String[] args) {
		//String 클래스는 변하지 않는 문자열을 저장하는 클래스 
		//작업을 할 때 원본을 복사해서 작업을 수행하고 결과를 리턴함 
		//+를 이용하면 다른 문자열이나 숫자를 붙여서 리턴함 
		
		String str="금요일";
		//해시코드 출력 : 저장된 데이터에 그대로 작업하는지 / 새로운 곳에 복사해서 작업하는지 비교 
		System.out.printf("해시코드1:%d\n", str.hashCode());
		str=str+"오후";
		System.out.printf("해시코드2:%d\n", str.hashCode());
		//복사해서 작업한 후 리턴한 결과이므로 위의 해시코드와 다르게 나옴 
		
		//StringBuilder 클래스는 변하는 문자열 저장에 사용하는 클래스
		//여분의 공간을 미리 확보한 뒤에 추가작업한 수 리턴함 
		StringBuilder sb=new StringBuilder("토요일");
		System.out.printf("해시코드3:%d\n", sb.hashCode());
		sb.append("식물원");
		System.out.printf("해시코드4:%d\n", sb.hashCode());
		
		

	}
}
