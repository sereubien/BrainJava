package chap09;

public class StringExample1 {

	public static void main(String[] args) {

		String str = "�ڹ� Ŀ��";
		int len = str.length();

		for (int cnt = 0; cnt < len; cnt++) {
			char ch = str.charAt(cnt);
			System.out.println(ch);
		}

		String str1 = new String("Hello Java");
		String str2 = new String("Hello Java");
		String str3 = new String("Hello Java");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		if (str1.equals(str2)) // == �ٸ���
			System.out.println("����");
		else
			System.out.println("�ٸ���");
	}

}
