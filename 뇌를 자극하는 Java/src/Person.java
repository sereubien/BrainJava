public class Person {

	String name;
	int age;

	// ������
	public Person() {

	}

	// �Ű����� 1�� �ִ� ������
	public Person(String name) {
		this.name = name;
	}

	// �Ű����� 2��(String, int) �ִ� ������
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("�̸�:" + name + " ����:" + age + " �Ű����� 2�� �ִ� ������ ȣ��");
	}

	// �Ű����� 2��(int, String) �ִ� ������

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		// System.out.println("Person(int age, String name)" + "2�� ȣ��");
		// System.out.println("����:" + age + " �̸�:" + name + " �Ű����� 2�� �ִ� ������ ȣ��");
	}

	public void showPerson(Person obj) {
		System.out.println("Person(int age, String name)" + "2�� ȣ��");
		System.out.println("�̸��� " + obj.name);
		System.out.println("���̴� " + obj.age);
		
		obj.name = "dnjdjdjj";
		obj.age = 27;
	}
}
