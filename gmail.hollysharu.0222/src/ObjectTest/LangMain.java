package ObjectTest;

import java.io.IOException;

public class LangMain {

	public static void main(String[] args) {
		//100번째 피보나치 수열의 값을 찾아오는데 걸리는 시간을 측정 
		
		int n1=1;
		int n2=1;
		int result=1;
		//작업 시작할 때 시간을 구해서 변수에 저장 
		long start=System.currentTimeMillis();
		for(int i=3;i<=100000000;i=i+1) {
			result=n1+n2;
			n1=n2;
			n2=result;
		}
		//작업 끝났을 때 시간을 구해서 변수에 저장 
		long end=System.currentTimeMillis();
		//끝난 시간-시작한 시간 = 작업 소요시간 
		//System.out.printf("걸린 시간:%d\n", (end-start));
		
		//System.out.printf("100번째 피보나치 수열의 값:%d\n", result);
	
		Runtime r=Runtime.getRuntime();
		//r.exec("notepad");
		//예외처리 해줘야 쓸 수 있는 메소드라서 에러 
		try {
			//r.exec("notepad c:\\0213.txt");
			r.exec("ifconfig"); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
		
	}
}
