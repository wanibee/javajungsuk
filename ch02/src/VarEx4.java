
public class VarEx4 {

	public static void main(String[] args) {
		// 논리형 변수 
		boolean power = true;
		power = false;
		
		// byte 타입 
		// 범위 : -128 ~ 127
		byte b = 127;
		
		int oct = 010; // 8진수, 10진수로 8
		int hex = 0x10; // 16진수, 10진수로  16
		
		// integet의 최댓값은 20억정도이기 때문에 100억을 쓰려면 접미사 L을 붙여줘야 한다.
		//long l = 10_000_000_000;
		long l = 10_000_000_000L;
		
		// float 가 double보다 작기 때문에 foate -> double 에서는 에러가 발생하지 않는다.
		float f = 3.14f;
		double d = 3.14f;
		
		// 출력시에는 접미사가 출력되지 않는다.
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		
		char ch = 'A';
		System.out.println(ch);
		int i = 'A';
		System.out.println(i);
		
		String str = ""; // 빈 문자열 (empty string)
		String str2 = "ABSC";
		String str3 = "123";
		String str4 = str2+str3;
		System.out.println(str4);
		System.out.println(""+7+7); //  
		 
	}

}
