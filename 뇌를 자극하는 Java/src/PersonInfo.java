
public class PersonInfo {

	public static void main(String[] args) {

		// 클래스 변수
		Person obj;

		// 매개변수 없는 디폴트 생성자 호출하여 객체 생성
		// person = new Person();

		// 매개 변수 1개 있는 생성자 호출하며 객체 생성
		// person = new Person("홍길동");

		// String 매개 변수 int 매개변수 있는 생성자 호출하며 객체 생성
		// person = new Person("홍길동", 20);
		// int 매개변수 String 매개 변수 있는 생성자 호출하며 객체 생성
		obj = new Person(20, "홍길동");

		// person.name = "Ridk";
		// person.age = 24;

		// 메소드 호출
		//person.showPerson();
		//System.out.println(person);
		obj.showPerson(obj);
		//obj.showPerson();
		//System.out.println(obj);
	}

}
