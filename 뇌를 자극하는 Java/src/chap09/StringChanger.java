package chap09;

public class StringChanger {

	public static void main(String[] args) {

		String str1 = "���� �ڱ��ϴ� C";
		String str2 = str1.replace("C", "�ϵ����");
		String str3 = str2.concat(" �Թ�");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
