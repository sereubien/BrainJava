public class Person {

	String name;
	int age;

	// 생성자
	public Person() {

	}

	// 매개변수 1개 있는 생성자
	public Person(String name) {
		this.name = name;
	}

	// 매개변수 2개(String, int) 있는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("이름:" + name + " 나이:" + age + " 매개변수 2개 있는 생성자 호출");
	}

	// 매개변수 2개(int, String) 있는 생성자

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		// System.out.println("Person(int age, String name)" + "2개 호출");
		// System.out.println("나이:" + age + " 이름:" + name + " 매개변수 2개 있는 생성자 호출");
	}

	public void showPerson(Person obj) {
		System.out.println("Person(int age, String name)" + "2개 호출");
		System.out.println("이름은 " + obj.name);
		System.out.println("나이는 " + obj.age);
		
		obj.name = "dnjdjdjj";
		obj.age = 27;
	}
}
