package chap09;

public class StringIndexer {

	public static void main(String[] args) {

		String str1 = "Java Programming";
		int index = str1.lastIndexOf("a");
		if (index < 0)
			System.out.println("�˻� ����� �����ϴ�.");
		else
			System.out.println(index + "�ε����� ��ġ�ϰ� �ֽ��ϴ�.");
	}

}
