
public class PersonInfo {

	public static void main(String[] args) {

		// Ŭ���� ����
		Person obj;

		// �Ű����� ���� ����Ʈ ������ ȣ���Ͽ� ��ü ����
		// person = new Person();

		// �Ű� ���� 1�� �ִ� ������ ȣ���ϸ� ��ü ����
		// person = new Person("ȫ�浿");

		// String �Ű� ���� int �Ű����� �ִ� ������ ȣ���ϸ� ��ü ����
		// person = new Person("ȫ�浿", 20);
		// int �Ű����� String �Ű� ���� �ִ� ������ ȣ���ϸ� ��ü ����
		obj = new Person(20, "ȫ�浿");

		// person.name = "Ridk";
		// person.age = 24;

		// �޼ҵ� ȣ��
		//person.showPerson();
		//System.out.println(person);
		obj.showPerson(obj);
		//obj.showPerson();
		//System.out.println(obj);
	}

}
