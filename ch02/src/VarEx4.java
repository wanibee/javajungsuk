
public class VarEx4 {

	public static void main(String[] args) {
		// ���� ���� 
		boolean power = true;
		power = false;
		
		// byte Ÿ�� 
		// ���� : -128 ~ 127
		byte b = 127;
		
		int oct = 010; // 8����, 10������ 8
		int hex = 0x10; // 16����, 10������  16
		
		// integet�� �ִ��� 20�������̱� ������ 100���� ������ ���̻� L�� �ٿ���� �Ѵ�.
		//long l = 10_000_000_000;
		long l = 10_000_000_000L;
		
		// float �� double���� �۱� ������ foate -> double ������ ������ �߻����� �ʴ´�.
		float f = 3.14f;
		double d = 3.14f;
		
		// ��½ÿ��� ���̻簡 ��µ��� �ʴ´�.
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		
		char ch = 'A';
		System.out.println(ch);
		int i = 'A';
		System.out.println(i);
		
		String str = ""; // �� ���ڿ� (empty string)
		String str2 = "ABSC";
		String str3 = "123";
		String str4 = str2+str3;
		System.out.println(str4);
		System.out.println(""+7+7); //  
		 
	}

}
