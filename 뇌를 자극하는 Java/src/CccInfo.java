
public class CccInfo {

	public static void main(String[] args) {
		Ccc obj1, obj2;
		obj1 = new Ccc("�����", "poorman", "zebi");
		obj2 = new Ccc("�����", "richman", "money", "02-000-0000", "Ÿ���縮��");

		printCccInfo(obj1);
		printCccInfo(obj2);
	}

	static void printCccInfo(Ccc obj) {
		System.out.println("�̸�:" + obj.name);
		System.out.println("���̵�:" + obj.id);
		System.out.println("�н�����:" + obj.password);
		System.out.println("��ȭ��ȣ:" + obj.phoneNo);
		System.out.println("�ּ�:" + obj.address);
		System.out.println();
	}

}
